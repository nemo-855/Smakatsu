package com.nemo.androidui.top

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.nemo.shareddata.model.Plan
import com.nemo.shareddata.model.PlanType
import com.nemo.sharedext.percentageToADay
import kotlinx.datetime.LocalDateTime
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun TopScreen(modifier: Modifier = Modifier) {
    TopScreenContent(modifier = modifier)
}

private val diametor = 280f.dp

@Composable
fun TopScreenContent(modifier: Modifier) {
    PieChartWithCursor(
        chartSize = 280.dp,
        uiModel = TopUiModel.PieChartUiModel(
            currentTime = LocalDateTime(2023, 4, 15, 12, 0, 0),
            plans = listOf(
                Plan(LocalDateTime(2022, 4, 18, 0, 0), LocalDateTime(2022, 4, 18, 9, 0), PlanType.Sleeping),
                Plan(LocalDateTime(2022, 4, 18, 9, 0), LocalDateTime(2022, 4, 18, 10, 0), PlanType.Living),
                Plan(LocalDateTime(2022, 4, 18, 10, 0), LocalDateTime(2022, 4, 18, 18, 0), PlanType.Working),
                Plan(LocalDateTime(2022, 4, 18, 18, 0), LocalDateTime(2022, 4, 18, 20, 0), PlanType.Playing),
                Plan(LocalDateTime(2022, 4, 18, 20, 0), LocalDateTime(2022, 4, 18, 20, 30), PlanType.Living),
                Plan(LocalDateTime(2022, 4, 18, 20, 30), LocalDateTime(2022, 4, 18, 22, 0), PlanType.Working),
                Plan(LocalDateTime(2022, 4, 18, 22, 0), LocalDateTime(2022, 4, 18, 23, 59), PlanType.Undefined)
            )
        )
    )
}

@Composable
private fun PieChartWithCursor(
    modifier: Modifier = Modifier,
    chartSize: Dp,
    uiModel: TopUiModel.PieChartUiModel
) {
    val radius = with(LocalDensity.current) { diametor.toPx() / 2 }
    val percentageOfCurrentTimeToADay = uiModel.currentTime.percentageToADay() * 360

    Canvas(modifier = modifier.size(chartSize)) {
        uiModel.plans.forEach { plan ->
            val startAngle = plan.startTime.percentageToADay() * 360 - 270f
            val endAngle = plan.endTime.percentageToADay() * 360 - 270f
            this.drawArc(
                brush = SolidColor(
                    when (plan.type) {
                        PlanType.Working -> Color(0xFF66BB6A)
                        PlanType.Sleeping -> Color(0xFFBDBDBD)
                        PlanType.Living -> Color(0xFFFFA726)
                        PlanType.Playing -> Color(0xFFEF5350)
                        PlanType.Relaxing -> Color(0xFF42A5F5)
                        PlanType.Others -> Color(0xFF8D6E63)
                        PlanType.Undefined -> Color(0xFFFFFFFF)
                    }
                ),
                startAngle = startAngle,
                sweepAngle = endAngle - startAngle,
                useCenter = true,
                style = Fill,
                topLeft = Offset.Zero,
                size = Size(width = radius * 2, height = radius * 2),
            )
            this.drawCursor(
                degrees = percentageOfCurrentTimeToADay,
                size = radius / 3,
                origin = Offset(
                    x = (1 - sin(percentageOfCurrentTimeToADay)) * radius,
                    y = (1 + cos(percentageOfCurrentTimeToADay)) * radius
                )
            )
            this.drawLine(
                brush = SolidColor(Color.Green),
                start = Offset.Zero,
                end = Offset(
                    x = (1 - sin(percentageOfCurrentTimeToADay)) * radius,
                    y = (1 + cos(percentageOfCurrentTimeToADay)) * radius
                )
            )
        }
    }
}

private fun DrawScope.drawCursor(
    degrees: Float,
    size: Float,
    origin: Offset,
) {
    this.rotate(
        degrees = degrees
    ) {
        val path = Path().apply {
            lineTo(origin.x, origin.y)
            lineTo(origin.x + size / 2, origin.y + size * 2 / 3)
            lineTo(origin.x + size / 4, origin.y + size)
            lineTo(origin.x, origin.y + size * 2 / 3)
            lineTo(origin.x - size / 4, origin.y + size)
            lineTo(origin.x - size / 2, origin.y + size * 2 / 3)
            lineTo(origin.x, origin.y)
        }
        drawPath(
            path = path,
            color = Color.Black,
            style = Fill,
        )
    }
}
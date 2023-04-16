package com.nemo.androidui.top

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.nemo.sharedext.secondsOfDay

//(現在時刻, Planのリスト)
@Composable
private fun PieChart(uiModel: TopUiModel.PieChartUiModel) {
    Canvas(
        modifier = Modifier.size(250.dp)
    ) {

        val chartRadius = size.minDimension / 2
        var startAngle = 0f
        var sweepAngle = 0f

        uiModel.plans.forEach { plan ->
            val degrees = plan.percentageOfStartTimeToADay() * 360
            sweepAngle = degrees
            drawArc(
                brush = SolidColor(Color.Blue),
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = true,
                style = Stroke(width = chartRadius)
            )
            startAngle += sweepAngle
        }

        // Draw the current time cursor
        val cursorAngle = uiModel.currentTime.secondsOfDay() / 24f * 360f
        drawArc(
            brush = SolidColor(Color.Red),
            startAngle = cursorAngle,
            sweepAngle = 0.5f,
            useCenter = false,
            style = Stroke(width = 4.dp.toPx())
        )
    }
}
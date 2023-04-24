package com.nemo.shared.data.db

import com.nemo.shared.domain.model.Plan

class PlanDao(
    dbService: DatabaseService
) {
    val db: SmakatsuDB = dbService.database

    fun insert(plan: Plan) {
        db.smakatsudbQueries.insertPlan(
            plan.startTime.toString(),
            plan.endTime.toString(),
            plan.type.name,
            plan.startTime.date.toString(),
        )
    }
}

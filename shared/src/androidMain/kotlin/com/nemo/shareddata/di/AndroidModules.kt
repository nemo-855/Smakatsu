package com.nemo.shareddata.di

import com.nemo.shared.data.db.DriverFactory
import com.nemo.shared.data.db.DatabaseService
import com.nemo.shared.data.db.PlanDao
import com.nemo.shared.data.db.DailyLogDao
import com.nemo.shared.data.db.LogDao
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val androidModule = module {
    single { DriverFactory(androidContext()) }
    singleOf(::DatabaseService)
    singleOf(::PlanDao)
    singleOf(::LogDao)
    singleOf(::DailyLogDao)
}
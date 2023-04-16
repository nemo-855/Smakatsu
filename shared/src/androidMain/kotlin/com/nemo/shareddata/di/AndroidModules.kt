package com.nemo.shareddata.di

import com.nemo.shareddata.db.DatabaseService
import com.nemo.shareddata.db.DriverFactory
import com.nemo.shareddata.db.PlanDao
import com.nemo.shareddata.db.DailyLogDao
import com.nemo.shareddata.db.LogDao
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
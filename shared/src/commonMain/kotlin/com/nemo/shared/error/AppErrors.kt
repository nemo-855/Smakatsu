package com.nemo.shared.error

fun Throwable.toAppError(): AppError {
    return when {
        this.message.orEmpty().contains("UNIQUE constraint failed") -> AppError.DbError.UniqueConstraintException(this)
        else -> AppError.UnknownException(this)
    }
}
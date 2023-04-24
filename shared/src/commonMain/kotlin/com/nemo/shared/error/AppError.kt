package com.nemo.shared.error

sealed class AppError : RuntimeException {
    constructor()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)

    sealed class DbError(cause: Throwable?) : AppError(cause) {
        class UniqueConstraintException(cause: Throwable?) : DbError(cause)
    }

    class UnknownException(cause: Throwable?) : AppError(cause)
}

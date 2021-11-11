package com.gb.stopwatch.domain

class TimestampProviderImpl : ITimestampProvider {
    override fun getMilliseconds(): Long =
        System.currentTimeMillis()
}
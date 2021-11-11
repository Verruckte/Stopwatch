package com.gb.stopwatch.domain

interface ITimestampProvider {
    fun getMilliseconds(): Long
}
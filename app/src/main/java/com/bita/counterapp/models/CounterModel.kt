package com.bita.counterapp.models

interface CounterModel {
    var valueCount: Int
    fun addCount()
    fun removeCount()
}


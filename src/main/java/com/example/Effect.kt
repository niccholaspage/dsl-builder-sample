package com.example

interface Effect<T : Target> {
    fun apply()
}
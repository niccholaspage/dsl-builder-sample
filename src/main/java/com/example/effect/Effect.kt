package com.example.effect

import com.example.target.Target

interface Effect<T : Target> {
    fun apply()
}
package com.example.effect

import com.example.target.Target

interface Effect<in T : Target> {
    fun apply()
}
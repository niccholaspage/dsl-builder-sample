package com.example

import com.example.effect.Effect
import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder
import com.example.target.Target

@GenerateBuilder
class StatusEffect<T : Target> : Effect<T> {
    override fun apply() {
        TODO("Not yet implemented")
    }
}
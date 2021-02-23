package com.example.effect.status

import com.example.effect.Effect
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder
import com.example.target.Target

@GenerateBuilder
class StatusEffect<T : Target> : Effect<T> {
    override fun apply() {
        TODO("Not yet implemented")
    }
}
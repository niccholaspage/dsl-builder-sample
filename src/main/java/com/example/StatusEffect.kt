package com.example

import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

@GenerateBuilder
class StatusEffect<T : Target> : Effect<T> {
    override fun apply() {
        TODO("Not yet implemented")
    }
}
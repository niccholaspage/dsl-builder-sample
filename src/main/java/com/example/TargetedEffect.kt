package com.example

import com.example.effect.Effect
import com.example.target.Target
import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

@GenerateBuilder
class TargetedEffect<T : Target>(val effects: List<Effect<T>>)
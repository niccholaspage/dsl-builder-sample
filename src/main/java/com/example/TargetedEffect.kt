package com.example

import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

@GenerateBuilder
class TargetedEffect<T : Target>(val effects: List<Effect<T>>)
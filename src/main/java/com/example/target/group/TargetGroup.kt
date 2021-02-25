package com.example.target.group

import com.example.target.Target
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class TargetGroup<in I : Target, out T: Target>(
    private val selection: TargetGroupSelection<I, T>
)
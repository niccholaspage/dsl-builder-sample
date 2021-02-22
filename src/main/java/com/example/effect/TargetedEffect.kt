package com.example.effect

import com.example.target.Target
import com.example.target.group.TargetGroup
import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

@GenerateBuilder
open class TargetedEffect<T : Target>(private val targetGroups: List<TargetGroup<T>>)
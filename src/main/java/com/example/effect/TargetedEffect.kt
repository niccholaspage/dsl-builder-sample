package com.example.effect

import com.example.target.Target
import com.example.target.group.TargetGroup
import com.example.target.group.TargetGroupSelection
import com.nicholasnassar.dslbuilder.api.annotation.BuilderModifier
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder(BuilderModifier.OPEN_COLLECTION_GENERIC)
open class TargetedEffect<T : Target>(private val selection: TargetGroupSelection<T>, private val targetGroups: List<TargetGroup<T>>)
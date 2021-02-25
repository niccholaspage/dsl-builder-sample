package com.example.target.group

import com.example.target.LivingEntityTarget
import com.example.target.Target
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class CasterTargetGroupSelection: TargetGroupSelection<Target, LivingEntityTarget>
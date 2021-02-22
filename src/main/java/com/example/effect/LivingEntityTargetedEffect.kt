package com.example.effect

import com.example.target.LivingEntityTarget
import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

@GenerateBuilder
class LivingEntityTargetedEffect : TargetedEffect<LivingEntityTarget>(emptyList()) {
}
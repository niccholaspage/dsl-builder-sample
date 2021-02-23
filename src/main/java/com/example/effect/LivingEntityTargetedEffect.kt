package com.example.effect

import com.example.target.LivingEntityTarget
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class LivingEntityTargetedEffect : TargetedEffect<LivingEntityTarget>(emptyList()) {
}
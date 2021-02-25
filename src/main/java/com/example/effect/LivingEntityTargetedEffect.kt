package com.example.effect

import com.example.target.LivingEntityTarget
import com.example.target.Target
import com.example.target.group.TargetGroup
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class LivingEntityTargetedEffect<I : Target>(
    targetGroups: List<TargetGroup<I, LivingEntityTarget>>,
    effects: List<Effect<LivingEntityTarget>>
) :
    TargetedEffect<I, LivingEntityTarget>(targetGroups, effects) {
}
package com.example.skill

import com.example.effect.TargetedEffect
import com.example.effect.status.StatusEffect
import com.example.target.LivingEntityTarget
import com.example.target.Target
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class Skill(val targetedEffects: List<TargetedEffect<LivingEntityTarget, Target>>, val statusEffects: List<StatusEffect<Target>>)
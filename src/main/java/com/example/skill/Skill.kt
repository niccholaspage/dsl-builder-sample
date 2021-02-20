package com.example.skill

import com.example.effect.TargetedEffect
import com.example.effect.status.StatusEffect
import com.example.target.Target
import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

@GenerateBuilder
class Skill(val targetedEffects: List<TargetedEffect<Target>>, val statusEffects: List<StatusEffect<Target>>)
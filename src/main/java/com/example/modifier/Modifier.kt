package com.example.modifier

import com.example.target.LivingEntityTarget
import com.example.target.Target
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

interface Modifier<in T : Target>

@GenerateBuilder
open class DamageModifier() : Modifier<LivingEntityTarget>
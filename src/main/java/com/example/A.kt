package com.example

import com.example.skill.SkillBuilder
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder
import com.nicholasnassar.dslbuilder.api.annotation.NullValue
import kotlin.random.Random

@GenerateBuilder
class C(@NullValue("12.0") val funNumber: Double, @NullValue("5") val intDynamicValue: DynamicValue<Int>)

fun main() {
    val builder = AClassBuilder()
    val bBuilder = BBuilder<Number>()

    val skillBuilder = SkillBuilder()

    skillBuilder.apply {
        targetedEffects {
            livingEntityTargetedEffect {
                targetGroups {
                    targetGroup {
                        casterTargetGroupSelection {}
                    }
                }
            }
        }
    }

    bBuilder.apply {
        coolGenericThing = { 5.0 }
    }

    builder.apply {
        cooldown = 5.0
        cooldown {
            Random.nextDouble() * 500
        }
        rollingCooldown {
            Random.nextDouble() * 1000
        }
        students {
            person {
                firstName = "Pizza"
                lastName = "Hut"
                pet {  }
            }
        }
    }
}



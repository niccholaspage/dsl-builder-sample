package com.example

import com.example.modifier.Modifier
import com.example.target.LivingEntityTarget
import com.example.target.Target
import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder


@GenerateBuilder
class SpawnModifier(val name: String) : Modifier<Target>

@GenerateBuilder
class PizzaModifier(val pizzaSlices: Int) : Modifier<Target>

@GenerateBuilder
class UhohModifier() : Modifier<LivingEntityTarget>

@GenerateBuilder
class CoolClass(val modifiers: List<Modifier<Target>>)

fun main() {
    val builder = CoolClassBuilder()

    builder.apply {
        modifiers {

            spawnModifier {
                name = "???"
            }
            pizzaModifier {
                pizzaSlices = 5
            }
        }
    }
}
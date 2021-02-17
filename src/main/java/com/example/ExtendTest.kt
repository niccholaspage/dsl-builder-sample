package com.example

import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder

interface Modifier

@GenerateBuilder
class SpawnModifier(val name: String) : Modifier
@GenerateBuilder
class PizzaModifier(val pizzaSlices: Int) : Modifier

@GenerateBuilder
class CoolClass(val modifiers: List<Modifier>)

fun main() {
    val builder = CoolClassBuilder()

    builder.apply {
        modifiers {
            spawnModifier {
                name = "AASDF"
            }
            pizzaModifier {
                pizzaSlices = 5
            }
        }
    }
}
package com.example

import com.example.modifier.Modifier
import com.nicholasnassar.dslbuilder.annotation.GenerateBuilder
import com.example.target.Target


@GenerateBuilder
class SpawnModifier(val name: String) : Modifier<Target>

@GenerateBuilder
class PizzaModifier(val pizzaSlices: Int) : Modifier<Target>

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
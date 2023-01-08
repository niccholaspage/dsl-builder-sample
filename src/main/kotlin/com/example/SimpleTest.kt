package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class Person2(val firstName: String, val lastName: String, val pet: Pet2)

@GenerateBuilder
open class Pet2(val name: String, val breed: String)

fun main() {
    val person = Person2Builder().apply {
        firstName = "Nicholas"
        lastName = "Nassar"

        pet {
            name = "Pepper"
            breed = "Domestic Shorthair"
        }
    }.build()

    println("Hi, I'm ${person.firstName} ${person.lastName}! I have a cat called ${person.pet.name}!")
}
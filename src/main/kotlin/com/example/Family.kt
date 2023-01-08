package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

// A simple example of a couple classes that make up a "family", compromised of people and their pets.
// Let's define out a few classes and annotate them with @GenerateBuilder so that we can use our builder.
// Note that these do not have to be data classes - I have just made them data classes so that we can get
// nice output if we print them out.
@GenerateBuilder
data class Family(val members: List<FamilyMember>)

@GenerateBuilder
data class Person(val firstName: String, val lastName: String) : FamilyMember()

@GenerateBuilder
data class Pet(val type: PetType, val name: String) : FamilyMember()

enum class PetType {
    DOG, CAT
}

@GenerateBuilder
open class FamilyMember

// A nice function that wraps around our builder class so that we can simply call it to get back a
// built out family. We don't need to have this, but it makes invoking our builder nicer if we do.
fun family(callback: FamilyBuilder.() -> Unit): Family {
    val builder = FamilyBuilder()

    builder.apply(callback)

    return builder.build()
}

fun main() {
    // Construct our family with our nice family builder.
    val myFamily = family {
        members {
            person {
                firstName = "Nicholas"
                lastName = "Nassar"
            }
            pet {
                type = PetType.CAT
                name = "Pepper"
            }
        }
    }

    // Print it out!
    println(myFamily)
}
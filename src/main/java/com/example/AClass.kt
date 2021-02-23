package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder
import java.io.OutputStream

@GenerateBuilder
class B<T : Number>(
    private val coolGenericThing: Function<Double>,
    private val a: List<AClass>
)

@GenerateBuilder
class AClass(
    private val chickens: List<List<String>>,
    private val outputStream: OutputStream?,
    val b: String,
    val cooldownDynamicValue: DynamicValue<Double>,
    val coolGrades: List<Double>,
    val chickenString: String,
    var changingString: String?,
    val students: List<Person>
) {
    val pizzaHut: Double = 5.0
}
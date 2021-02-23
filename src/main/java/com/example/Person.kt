package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class Person(val firstName: String, val lastName: String)
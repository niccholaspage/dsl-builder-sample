package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class Dog(name: String, breed: String) : Pet(name, breed)
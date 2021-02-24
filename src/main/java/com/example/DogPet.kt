package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class DogPet(name: String, breed: String) : Pet(name, breed)
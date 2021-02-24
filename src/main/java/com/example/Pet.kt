package com.example

import com.nicholasnassar.dslbuilder.api.annotation.GenerateBuilder

@GenerateBuilder
class Pet(val name: String, val breed: String)
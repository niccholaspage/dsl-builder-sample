package com.example.target.group

import com.example.target.Target

class TargetGroup<in I : Target, out T: Target>(
    private val selection: TargetGroupSelection<I, T>
)
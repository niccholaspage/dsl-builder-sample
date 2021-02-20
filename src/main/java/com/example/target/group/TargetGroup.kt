package com.example.target.group

import com.example.target.Target

class TargetGroup<T : Target>(
    private val selection: TargetGroupSelection<T>
)
package com.jblprog.retrofit

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)
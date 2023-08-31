package com.example.alaram_jetpack_ui.util.clock

data class Weeks(
    val shortName: Char, val fullName: String
)

val listOfWeeks = listOf(
    Weeks(
        'S', "Sun"
    ),
    Weeks(
        'M', "Mon"
    ),
    Weeks(
        'T', "Tue"
    ),
    Weeks(
        'W', "Wed"
    ),
    Weeks(
        'T', "Thu"
    ),
    Weeks(
        'F', "Fri"
    ),
    Weeks(
        'S', "Sat"
    ),
)
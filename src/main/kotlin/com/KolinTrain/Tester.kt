package com.KolinTrain

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var TotalTickets=scanner.nextInt()
    println("How many round-trip tickets: ")
    var RoundTripTickets=scanner.nextInt()
    val tickets=Tickets(TotalTickets,RoundTripTickets)
    tickets.counter()

}

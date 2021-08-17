package com.KolinTrain

class Tickets (var TotalTickets:Int,var RoundTripTickets:Int){
    fun counter(){
        var OneRoundTickets:Int=TotalTickets-RoundTripTickets
        var Total:Float = OneRoundTickets*1000+(RoundTripTickets*2000)*0.9f
        println("Total tickets:$TotalTickets \n " +
                "Round-trip tickets:$RoundTripTickets \n"+
                "Total:$Total")

    }
}
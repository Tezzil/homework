package com.train;

public class Tickets {

    int TotalTicketCount ;
    int RoundTripTicketCount;

    public Tickets(int totalTicketCount, int roundTripTicketCount) {
        TotalTicketCount = totalTicketCount;
        RoundTripTicketCount = roundTripTicketCount;
    }

    public void conter(){
        int OneRoundTicket=TotalTicketCount-RoundTripTicketCount;
        float Total=OneRoundTicket*1000+(RoundTripTicketCount*2000)*0.9f;
        System.out.println("Toatal tickets:"+TotalTicketCount+"\n"+
                            "Round-trip:"+RoundTripTicketCount+"\n"+
                            "Total:"+Total);
    }
}

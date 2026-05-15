package com.xworkz.arena;

import com.xworkz.dto.normalClass.TicketDto;

public class TicketRunner {
    public static void main(String[] args) {
        TicketDto ticketDto=new TicketDto("movie",250);
        //getters
        System.out.println("initial values:");
        System.out.println(ticketDto.getCost());
        System.out.println(ticketDto.getType());

        //setters
        ticketDto.setCost(350);
        ticketDto.setType("event");

        //upadted
        System.out.println("updated values:");
        System.out.println(ticketDto.getCost());
        System.out.println(ticketDto.getType());
    }
}

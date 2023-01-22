package com.greatLearning.ticketAPI.service;

import com.greatLearning.ticketAPI.model.Ticket;

public interface TicketService {

    public void saveTicket(Ticket ticket);
    public Ticket getTicket(int ticketID);
}

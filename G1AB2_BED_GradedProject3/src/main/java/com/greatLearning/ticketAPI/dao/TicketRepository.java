package com.greatLearning.ticketAPI.dao;

import com.greatLearning.ticketAPI.model.Ticket;

public interface TicketRepository {
    public void saveTicket(Ticket ticket);

    public Ticket getTicket(int theId);
}

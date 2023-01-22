package com.greatLearning.ticketAPI.serviceIMPL;

import com.greatLearning.ticketAPI.dao.TicketRepository;
import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceIMPL implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public void saveTicket(Ticket ticket) {
        this.ticketRepository.saveTicket(ticket);
    }

    public Ticket getTicket(int ticketID) {
        return this.ticketRepository.getTicket(ticketID);
    }
}

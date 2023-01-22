package com.greatLearning.ticketAPI.dao;

import com.greatLearning.ticketAPI.model.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TicketRepositoryIMPL implements TicketRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void saveTicket(Ticket ticket) {
        Session session = sessionFactory.getCurrentSession();
        session.save(ticket);
    }

    @Transactional
    public Ticket getTicket(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Ticket ticket = session.get(Ticket.class, theId);
        return ticket;
    }
}

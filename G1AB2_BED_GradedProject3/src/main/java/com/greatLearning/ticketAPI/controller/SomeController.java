package com.greatLearning.ticketAPI.controller;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SomeController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/")
    public String redirect(){
        return "redirect:/ticket";
    }
    @RequestMapping("/ticketSave")
    @ResponseBody
    public String ticketSave(){
        this.ticketService.saveTicket(Ticket.builder().ticketName("ticketName" + Thread.currentThread().getName()).ticketID(1).build());
        return "ticketSaved";
    }

    @RequestMapping("/ticketGet")
    @ResponseBody
    public String ticketGet(){
        System.out.println(this.ticketService.getTicket(1));
        return "ticketGet";
    }
}

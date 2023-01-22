package com.greatLearning.ticketAPI.controller;


import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketCreateService;
import com.greatLearning.ticketAPI.service.TicketReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class RedirectController {

    @GetMapping("")
    public String redirect() {
        return "redirect:/ticket";
    }
}
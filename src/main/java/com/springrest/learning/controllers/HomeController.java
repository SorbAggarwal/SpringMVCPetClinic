package com.springrest.learning.controllers;

import com.springrest.learning.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @GetMapping("/getModel")
    public String getModel(Model model){
        String name ="Saurabh";
        String surNamee = "Aggarwal";
        model.addAttribute("firstName",name);
        model.addAttribute("lastName",surNamee);
        return "View";
    }


    @RequestMapping(method = RequestMethod.GET,path = "/getEmployee")
    @ResponseBody
    public Employee getEmployee()
    {
        return new Employee("1","Saurabh","9643297048");
    }

}

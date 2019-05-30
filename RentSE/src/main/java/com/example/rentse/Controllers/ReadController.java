package com.example.rentse.Controllers;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;
import com.example.rentse.Services.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class ReadController {

    @Autowired
    ReadService readService;

    Logger log = Logger.getLogger(ReadController.class.getName());

//STRINGS
    private final String READ = "read";

    @GetMapping("/read/{id}")
    public String read(@PathVariable("id") int id, Model model) {
        log.info("Read called with id: " + id);

        model.addAttribute("SE", readService.readSE(id));

        List<Education> Edu = readService.readEdu(id);
        model.addAttribute("EDU", Edu);

        List<FJob> fjob = readService.readFJob(id);
        model.addAttribute("fjob", fjob);

        return READ;
    }
}

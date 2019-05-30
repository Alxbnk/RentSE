package com.example.rentse.Controllers;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;
import com.example.rentse.Services.ReadService;
import com.example.rentse.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
public class UserController {

    Logger log = Logger.getLogger(UserController.class.getName());

    @Autowired
    UserService userService;

    @Autowired
    ReadService readService;


//STRINGS

    //SE
    private final String CREATESE = "Create/createse";
    private final String EDITSE = "Edit/editse";

    //Education
    private final String CREATEEDU = "Create/createedu";
    private final String EDITEDU = "Edit/editedu";

    //FJob
    private final String CREATEFJOB = "Create/createfjob";
    private final String EDITFJOB = "Edit/editfjob";

    //REDIRECT
    private final String REDIRECT = "redirect:/";

//SE

    //Create SE

        @GetMapping("/createSE")
        public String createSE(Model model) {
            log.info("Get createSE action called...");

            model.addAttribute("se", new SE());


            return CREATESE;
        }

        @PostMapping("/createSE")
        public String postCreateSE(@ModelAttribute SE se) {
            log.info("Post createSE action called...");

            userService.createSE(se);

            return REDIRECT;
        }

    //Edit SE

        @GetMapping("/read/editSE/{id}")
        public String editSE(@PathVariable("id") int id, Model model) {
            log.info("Get editSE action called with id: " + id);

            model.addAttribute("SE", readService.readSE(id));

            return EDITSE;
        }

        @PostMapping("/read/editSE/{id}")
        public String postEditSE(@PathVariable("id") int id,@ModelAttribute SE se) {
            log.info("Put editSE action called with id: " + id);

            userService.editSE(se, id);

            return REDIRECT;
        }

    //Delete SE

        @GetMapping("/read/deleteSE/{id}")
        public String deleteSE(@PathVariable("id") int id) {
            log.info("DeleteSE action called with id: " + id);

            userService.deleteSE(id);

            return REDIRECT;
        }

//Education

    //Create Education

        @GetMapping("/read/createEDU/{id}")
        public String createEDU(@PathVariable("id") int id, Model model) {
            log.info("Get createEDU action called with id: " + id);

            model.addAttribute("SE", readService.readSE(id));
            model.addAttribute("edu", new Education());


            return CREATEEDU;
        }

        @PostMapping("/read/createEDU/{id}")
        public String postCreateEDU(@PathVariable("id") int id, @ModelAttribute Education edu, Model model) {
            log.info("Post createEDU action called with id: " + id);

            model.addAttribute("SE", readService.readSE(id));
            userService.createEDU(edu, id);

            return REDIRECT;
        }

    //Edit Education

        @GetMapping("/read/editEDU/{id}")
        public String editEDU(@PathVariable("id") int id, Model model) {
            log.info("Get editEDU action called with id: " + id);

            model.addAttribute("EDU", readService.readWithEduId(id));

            return EDITEDU;
        }

        @PostMapping("/read/editEDU/{id}")
        public String postEditEDU(@PathVariable("id") int id,@ModelAttribute Education edu) {
            log.info("Post editEDU action called with id: " + id);

            userService.editEDU(edu, id);

            return REDIRECT;
        }

    //Delete Education

        @GetMapping("/read/editEDU/deleteEDU/{id}")
        public String deleteEDU(@PathVariable("id") int id) {
            log.info("DeleteEDU action called with id: " + id);

            userService.deleteEDU(id);

            return REDIRECT;
        }

//FJob

    //Create FJob

        @GetMapping("/read/createFJOB/{id}")
        public String createFJOB(@PathVariable("id") int id, Model model) {
            log.info("Get createFJOB action called with id: " + id);

            model.addAttribute("SE", readService.readSE(id));
            model.addAttribute("fjob", new FJob());


            return CREATEFJOB;
        }

        @PostMapping("/read/createFJOB/{id}")
        public String postCreateFJOB(@PathVariable("id") int id, @ModelAttribute FJob fjob, Model model) {
            log.info("Post createFJOB action called with id: " + id);

            model.addAttribute("SE", readService.readSE(id));
            userService.createFJOB(fjob, id);

            return REDIRECT;
        }

    //Edit FJob

        @GetMapping("/read/editFJOB/{id}")
        public String editFJOB(@PathVariable("id") int id, Model model) {
            log.info("Get editFJOB action called with id: " + id);

            model.addAttribute("FJOB", readService.readWithFJobId(id));

            return EDITFJOB;
        }

        @PostMapping("/read/editFJOB/{id}")
        public String postEditFJOB(@PathVariable("id") int id,@ModelAttribute FJob fjob) {
            log.info("Post editFJOB action called with id: " + id);

            userService.editFJOB(fjob, id);

            return REDIRECT;
        }

    //Delete FJob

        @GetMapping("/read/editFJOB/deleteFJOB/{id}")
        public String deleteFJOB(@PathVariable("id") int id) {
            log.info("DeleteFJOB action called with id: " + id);

            userService.deleteFJOB(id);

            return REDIRECT;
        }

}

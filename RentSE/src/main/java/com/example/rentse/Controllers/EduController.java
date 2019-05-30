package com.example.rentse.Controllers;

import com.example.rentse.Models.Education;
import com.example.rentse.Services.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class EduController {

    Logger log = Logger.getLogger(EduController.class.getName());

    @Autowired
    EduService eduService;

//STRINGS

    private final String EDUTO = "Education/tømrere";
    private final String EDUSNEDKERE = "Education/snedkere";
    private final String EDUTAG = "Education/tag";
    private final String EDUSMED = "Education/smed";
    private final String EDUVVS = "Education/vvs";
    private final String EDUMURER = "Education/murer";
    private final String EDUJB = "Education/jordbeton";
    private final String EDUEL = "Education/elektrikker";
    private final String EDUMALER = "Education/maler";


//Tømrere

    @GetMapping("/tømrere")
    public String eduToemrere (Model model){
        log.info("Get EduTo called");

        List<Education> Edu = eduService.getEduTo();
        model.addAttribute("EDU", Edu);

        
        return EDUTO;
    }

//Snedkere

    @GetMapping("/snedkere")
    public String eduSnedkere (Model model){
        log.info("Get EduSnedkere called");

        List<Education> EduS = eduService.getEduSned();
        model.addAttribute("EDU", EduS);

        return EDUSNEDKERE;
    }

//Tag

    @GetMapping("/tag")
    public String eduTag (Model model){
        log.info("Get EduTag called");

        List<Education> EduT = eduService.getEduTag();
        model.addAttribute("EDU", EduT);

        return EDUTAG;
    }

//Smed

    @GetMapping("/smed")
    public String eduSmed (Model model){
        log.info("Get EduSmed called");

        List<Education> EduS = eduService.getEduSmed();
        model.addAttribute("EDU", EduS);

        return EDUSMED;
    }

//VVS

    @GetMapping("/vvs")
    public String eduVVS (Model model){
        log.info("Get EduVVS called");

        List<Education> EduVV = eduService.getEduVVS();
        model.addAttribute("EDU", EduVV);

        return EDUVVS;
    }

//Murer

    @GetMapping("/murer")
    public String eduMurer (Model model){
        log.info("Get EduMurer called");

        List<Education> EduMu = eduService.getEduMurer();
        model.addAttribute("EDU", EduMu);

        return EDUMURER;
    }

//JordBeton

    @GetMapping("/jordbeton")
    public String eduJordBeton (Model model){
        log.info("Get EduJordBeton called");

        List<Education> EduJB = eduService.getEduJB();
        model.addAttribute("EDU", EduJB);

        return EDUJB;
    }

//Elektrikker

    @GetMapping("/elektrikker")
    public String eduEL (Model model){
        log.info("Get EduEL called");

        List<Education> EduEL = eduService.getEduEl();
        model.addAttribute("EDU", EduEL);

        return EDUEL;
    }

//Maler

    @GetMapping("/maler")
    public String eduMaler (Model model){
        log.info("Get EduMaler called");

        List<Education> EduMA = eduService.getEduMaler();
        model.addAttribute("EDU", EduMA);

        return EDUMALER;
    }

}

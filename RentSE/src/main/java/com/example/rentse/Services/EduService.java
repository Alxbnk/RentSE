package com.example.rentse.Services;

import com.example.rentse.Models.Education;

import java.util.List;

public interface EduService {

//Tømrere

    List<Education> getEduTo();

//Snedkere

    List<Education> getEduSned();

//Tag

    List<Education> getEduTag();

//Smed

    List<Education> getEduSmed();

//VVS

    List<Education> getEduVVS();

//Murer

    List<Education> getEduMurer();

//JordBeton

    List<Education> getEduJB();

//Elektrikker

    List<Education> getEduEl();

//Maler

    List<Education> getEduMaler();

}

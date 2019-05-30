package com.example.rentse.Services;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;

import java.util.List;

public interface ReadService {

//Read SE
    SE readSE(int id);

//Read Education
    List<Education> readEdu(int id);
    Education readWithEduId(int id);

//Read FJob
    List<FJob> readFJob(int id);
    FJob readWithFJobId (int id);

}

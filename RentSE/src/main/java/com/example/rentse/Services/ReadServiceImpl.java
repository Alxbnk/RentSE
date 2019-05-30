package com.example.rentse.Services;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;
import com.example.rentse.Repositories.ReadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadServiceImpl implements ReadService {

    @Autowired
    ReadRepo readRepo;

//Read SE
    @Override
    public SE readSE (int id) {
        return readRepo.readSE(id);
    }

//Read Education
    @Override
    public List<Education> readEdu(int id){
        return readRepo.readEdu(id);
    }

    @Override
    public Education readWithEduId (int id) {return readRepo.readWithEduId(id);}

//Read FJob
    @Override
    public List<FJob> readFJob(int id){
        return readRepo.readFJob(id);
    }

    @Override
    public FJob readWithFJobId (int id){
        return readRepo.readWithFJobId(id);
    }


}

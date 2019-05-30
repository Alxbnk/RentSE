package com.example.rentse.Services;

import com.example.rentse.Models.Education;
import com.example.rentse.Repositories.EduRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduServiceImpl implements EduService{

    @Autowired
    EduRepo eduRepo;

//Tømrere
    @Override
    public List<Education> getEduTo(){
        return eduRepo.getEduTo();
    }

//Snedkere
    @Override
    public List<Education> getEduSned(){
        return eduRepo.getEduSned();
    }

//Tag
    @Override
    public List<Education> getEduTag(){
        return eduRepo.getEduTag();
    }

//Smed
    @Override
    public List<Education> getEduSmed(){
        return eduRepo.getEduSmed();
    }

//VVS
    @Override
    public List<Education> getEduVVS(){
        return eduRepo.getEduVVS();
    }

//Murer
    @Override
    public List<Education> getEduMurer(){
        return eduRepo.getEduMurer();
    }

//JordBeton
    @Override
    public List<Education> getEduJB(){
        return eduRepo.getEduJB();
    }

//Elektrikker
    @Override
    public List<Education> getEduEl(){
        return eduRepo.getEduEl();
    }

//Maler
    @Override
    public List<Education> getEduMaler(){
        return eduRepo.getEduMaler();
    }

}

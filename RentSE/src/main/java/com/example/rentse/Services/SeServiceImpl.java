package com.example.rentse.Services;

import com.example.rentse.Models.SE;
import com.example.rentse.Repositories.SeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeServiceImpl implements SeService {

    @Autowired
    SeRepo seRepo;

    @Override
    public List<SE> getSE(){
        return seRepo.getSE();
    }
}

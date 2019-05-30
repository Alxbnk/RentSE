package com.example.rentse.Services;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;
import com.example.rentse.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

//SE

    @Override
    public SE createSE(SE se) {
        return  userRepo.createSE(se);
    }

    @Override
    public SE editSE(SE se, int id) {return userRepo.editSE(se, id);}

    @Override
    public void deleteSE (int id) {userRepo.deleteSE(id);}

//Education

    @Override
    public Education createEDU(Education edu, int id) {
        return  userRepo.createEDU(edu, id);
    }

    @Override
    public Education editEDU (Education edu, int id) {return userRepo.editEDU(edu, id);}

    @Override
    public void deleteEDU (int id) {userRepo.deleteEDU(id);}

//FJob

    @Override
    public FJob createFJOB(FJob fjob, int id) {
        return  userRepo.createFJOB(fjob, id);
    }

    @Override
    public FJob editFJOB(FJob fjob, int id) {
        return  userRepo.editFJOB(fjob, id);
    }

    @Override
    public void deleteFJOB (int id) {userRepo.deleteFJOB(id);}

}

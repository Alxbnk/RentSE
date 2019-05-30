package com.example.rentse.Repositories;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;

public interface UserRepo {

//SE

    SE createSE (SE se);
    SE editSE(SE se, int id);
    void deleteSE (int id);

//Education

    Education createEDU (Education edu, int id);
    Education editEDU (Education edu, int id);
    void deleteEDU (int id);

//FJob
    FJob createFJOB (FJob fjob, int id);
    FJob editFJOB (FJob fjob, int id);
    void deleteFJOB (int id);

}

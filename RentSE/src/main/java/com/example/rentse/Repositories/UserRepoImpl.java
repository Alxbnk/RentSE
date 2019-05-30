package com.example.rentse.Repositories;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements UserRepo {

    @Autowired
    JdbcTemplate jdbc;


//SE

    @Override
    public SE createSE (SE se) {

        String sql = "INSERT INTO SEDatabase.SE values (default, ?, ?, ?, ?)";
        jdbc.update(sql, se.getSeName(), se.getSeAge(),se.getStartWage(), se.getSeDescription());

        return se;
    }

    @Override
    public SE editSE(SE se, int id) {

        String sql = "UPDATE SEDatabase.SE SET seName = ?, seAge = ?, startwage = ?, seDescription = ? WHERE idSE = ?";
        jdbc.update(sql, se.getSeName(), se.getSeAge(),se.getStartWage(), se.getSeDescription(), id);

        return se;
    }

    @Override
    public void deleteSE(int id) {

        String sql = "DELETE FROM SEDatabase.education WHERE idSE = ?";

        String sql2 = "DELETE FROM SEDatabase.fJob WHERE idSE = ?";

        String sql3 = "DELETE FROM SEDatabase.SE WHERE idSE = ?";

        try {
            jdbc.update(sql, id);
            jdbc.update(sql2, id);
            jdbc.update(sql3, id);

            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


//Education
    @Override
    public Education createEDU (Education edu, int id) {

        String sql = "INSERT INTO SEDatabase.education VALUES\n" +
                "(default, ?, ?, ?, ?, ?)";
        jdbc.update(sql, edu.getEduEducation(), edu.getEduName(), edu.getEduDescription(), edu.getEduTime(), id);

        return edu;
    }

    @Override
    public Education editEDU(Education edu, int id) {

        String sql = "UPDATE SEDatabase.education SET eduEducation = ?, eduName = ?, eduDescription = ?, eduTime = ? \n" +
                "WHERE idEdu = ?";
        jdbc.update(sql, edu.getEduEducation(), edu.getEduName(), edu.getEduDescription(), edu.getEduTime(), id);

        return edu;
    }

    @Override
    public void deleteEDU(int id) {

        String sql = "DELETE FROM SEDatabase.education WHERE idEdu = ?";

        try {
            jdbc.update(sql, id);

            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//FJob

    @Override
    public FJob createFJOB (FJob fjob, int id) {

        String sql = "INSERT INTO SEDatabase.fJob VALUES (default, ?, ?, ?, ?);";
        jdbc.update(sql, fjob.getFjName(), fjob.getFjDescription(), fjob.getFjTime(), id);

        return fjob;
    }

    @Override
    public FJob editFJOB(FJob fjob, int id) {

        String sql = "UPDATE SEDatabase.fJob SET fjName = ?, fjDescription = ?, fjTime = ?\n" +
                "WHERE idFJob = ?";
        jdbc.update(sql, fjob.getFjName(), fjob.getFjDescription(), fjob.getFjTime(), id);

        return fjob;
    }

    @Override
    public void deleteFJOB(int id) {

        String sql = "DELETE FROM SEDatabase.fJob WHERE idFJob = ?";

        try {
            jdbc.update(sql, id);

            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

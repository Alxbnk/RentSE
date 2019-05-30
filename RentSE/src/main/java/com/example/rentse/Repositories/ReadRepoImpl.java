package com.example.rentse.Repositories;

import com.example.rentse.Models.Education;
import com.example.rentse.Models.FJob;
import com.example.rentse.Models.SE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ReadRepoImpl implements ReadRepo{

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public SE readSE(int id){

        String sql = "SELECT idSE, seName, seAge, startwage, seDescription FROM SEDatabase.SE WHERE idSE = ?";

        RowMapper<SE> rowMapper = new BeanPropertyRowMapper<>(SE.class);
        SE se = jdbc.queryForObject(sql, rowMapper, id);

        return se;
    }

    @Override
    public List<Education> readEdu(int id){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT education.idEdu, education.eduEducation, education.eduName, \n" +
                "education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education WHERE idSE = ?";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idEdu = rs.getInt(1);
                    String eduEducation = rs.getString(2);
                    String eduName = rs.getString(3);
                    String eduDescription = rs.getString(4);
                    String eduTime = rs.getString(5);

                    Education edu = new Education(idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        }, id);
    }


    @Override
    public Education readWithEduId(int id){

        String sql ="SELECT idEdu, eduEducation, eduName, \n" +
                "eduDescription, eduTime\n" +
                "FROM SEDatabase.education WHERE idEdu = ?";

        RowMapper<Education> rowMapper = new BeanPropertyRowMapper<>(Education.class);
        Education edu = jdbc.queryForObject(sql, rowMapper, id);

        return edu;
    }

    @Override
    public List<FJob> readFJob(int id){

        ArrayList<FJob> fj = new ArrayList<>();

        String sql ="SELECT fJob.idFJob, fJob.fjName, fJob.fjDescription, fJob.fjTime\n" +
                "FROM SEDatabase.fJob WHERE idSE = ?";

        return this.jdbc.query(sql, new ResultSetExtractor<List<FJob>>(){

            @Override
            public List<FJob> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idFJob = rs.getInt(1);
                    String fjName = rs.getString(2);
                    String fjDescription = rs.getString(3);
                    String fjTime = rs.getString(4);

                    FJob f = new FJob(idFJob, fjName, fjDescription, fjTime);

                    fj.add(f);
                }
                return fj;
            }
        }, id);
    }

    @Override
    public FJob readWithFJobId (int id){

        String sql ="SELECT idFJob, fjName, fjDescription, fjTime \n" +
                "FROM SEDatabase.fJob WHERE idFJob = ?";

        RowMapper<FJob> rowMapper = new BeanPropertyRowMapper<>(FJob.class);
        FJob fjob = jdbc.queryForObject(sql, rowMapper, id);

        return fjob;
    }
}

package com.example.rentse.Repositories;

import com.example.rentse.Models.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EduRepoImpl implements EduRepo {

    @Autowired
    JdbcTemplate jdbc;

//Tømrere

    @Override
    public List<Education> getEduTo(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Tømrere\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//Snedkere

    @Override
    public List<Education> getEduSned(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Snedkere\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//Tag

    @Override
    public List<Education> getEduTag(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Tag\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//Smed

    @Override
    public List<Education> getEduSmed(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Smed\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//VVS

    @Override
    public List<Education> getEduVVS(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"VVS\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//Murer

    @Override
    public List<Education> getEduMurer(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Murer\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//JordBeton

    @Override
    public List<Education> getEduJB(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"JordBeton\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//Elektrikker

    @Override
    public List<Education> getEduEl(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Elektrikker\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

//Maler

    @Override
    public List<Education> getEduMaler(){

        ArrayList<Education> ed = new ArrayList<>();

        String sql ="SELECT SE.idSE, SE.seName, SE.seAge, SE.startwage, SE.seDescription, education.idEdu, education.eduEducation, \n" +
                "education.eduName, education.eduDescription, education.eduTime\n" +
                "FROM SEDatabase.education\n" +
                "INNER JOIN SE ON education.idSE = SE.idSE\n" +
                "WHERE education.eduEducation = \"Maler\"\n" +
                "GROUP BY education.idSE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<Education>>(){

            @Override
            public List<Education> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);
                    int idEdu = rs.getInt(6);
                    String eduEducation = rs.getString(7);
                    String eduName = rs.getString(8);
                    String eduDescription = rs.getString(9);
                    String eduTime = rs.getString(10);

                    Education edu = new Education(idSE, seName, seAge, startWage, seDescription, idEdu, eduEducation, eduName, eduDescription, eduTime);

                    ed.add(edu);
                }
                return ed;
            }
        });
    }

}

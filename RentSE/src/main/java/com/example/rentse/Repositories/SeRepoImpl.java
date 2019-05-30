package com.example.rentse.Repositories;

import com.example.rentse.Models.SE;
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
public class SeRepoImpl implements SeRepo {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<SE> getSE(){

        ArrayList<SE> s = new ArrayList<>();

        String sql = "SELECT * FROM SEDatabase.SE;";

        return this.jdbc.query(sql, new ResultSetExtractor<List<SE>>() {

            @Override
            public List<SE> extractData (ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()) {
                    int idSE = rs.getInt(1);
                    String seName = rs.getString(2);
                    int seAge = rs.getInt(3);
                    int startWage = rs.getInt(4);
                    String seDescription = rs.getString(5);

                    SE se = new SE(idSE, seName, seAge, startWage, seDescription);

                    s.add(se);
                }
                return s;
            }
        });
    }


}

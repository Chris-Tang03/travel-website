package com.christang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TravelRepository {

    @Autowired
    JdbcTemplate template;


    public List<Country> listCountry(String search){
        if(search == null || search.isEmpty() ){
            return template.query("Select * FROM country",
                    (rs, i) -> new Country(
                            rs.getInt("country_id"),
                            rs.getString("country_name")
                    )
            );

        }else {
            return template.query("Select * FROM country WHERE " +
                            "lower(country_name) LIKE ?",
                    new Object[]{"%" + search.toLowerCase() + "%"},
                    (rs, i) -> new Country(
                            rs.getInt("country_id"),
                            rs.getString("country_name")

                    ));
        }

    }












//    public void addCountry(Country country){
//
//        template.update(
//                "INSERT INTO country(country_name) VALUES (?)",
//                country.getCountryId(),
//                country.getCountryName()
//        );
//    }
}

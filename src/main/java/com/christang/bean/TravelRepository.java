//package com.christang.bean;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
////@Component
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class TravelRepository {
//
//    private String name;
//    private String alpha2Code;
//    private String capital;
//    private String region;
//    private String demonym;
//    private String flag;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAlpha2Code() {
//        return alpha2Code;
//    }
//
//    public void setAlpha2Code(String alpha2Code) {
//        this.alpha2Code = alpha2Code;
//    }
//
//    public String getCapital() {
//        return capital;
//    }
//
//    public void setCapital(String capital) {
//        this.capital = capital;
//    }
//
//    public String getRegion() {
//        return region;
//    }
//
//    public void setRegion(String region) {
//        this.region = region;
//    }
//
//    public String getDemonym() {
//        return demonym;
//    }
//
//    public void setDemonym(String demonym) {
//        this.demonym = demonym;
//    }
//
//    public String getFlag() {
//        return flag;
//    }
//
//    public void setFlag(String flag) {
//        this.flag = flag;
//    }
//
////    public JdbcTemplate getTemplate() {
////        return template;
////    }
////
////    public void setTemplate(JdbcTemplate template) {
////        this.template = template;
////    }
////
//
//
//
//
////    @Autowired
////    JdbcTemplate template;
////
////
////    public List<Country> listCountry(String search){
////        if(search == null || search.isEmpty() ){
////            return template.query("Select * FROM country",
////                    (rs, i) -> new Country(
////                            rs.getInt("country_id"),
////                            rs.getString("country_name")
////                    )
////            );
////
////        }else {
////            return template.query("Select * FROM country WHERE " +
////                            "lower(country_name) LIKE ?",
////                    new Object[]{"%" + search.toLowerCase() + "%"},
////                    (rs, i) -> new Country(
////                            rs.getInt("country_id"),
////                            rs.getString("country_name")
////
////                    ));
////        }
////
////    }
//
//
//
//}

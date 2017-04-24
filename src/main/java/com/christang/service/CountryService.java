package com.christang.service;

import com.christang.bean.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryService {

    @Value("${restcountries.api.url}")
    String apiUrl;

    public List<Country> listCountries(){
        RestTemplate restTemplate = new RestTemplate();

        Country[] countries = restTemplate.getForObject(
                apiUrl + "/all",
                Country[].class);
        return Arrays.asList(countries);
    }

    public Country getCountryByCode(String alpha3Code){
        RestTemplate restTemplate = new RestTemplate();

        Country country = restTemplate.getForObject(
                apiUrl + "/alpha/" + alpha3Code,
                Country.class);
        return country;
    }

//    public String getCountry(Country country) {
//        if(country != ' ' || country != null){
//
//        }
//    }
}

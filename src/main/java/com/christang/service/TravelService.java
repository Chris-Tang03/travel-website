package com.christang.service;

import com.christang.bean.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class TravelService {

    @Value("${restcountries.api.url}")
    String apiUrl;

    public List<Country> listCountries(){
        RestTemplate restTemplate = new RestTemplate();

        Country[] repos = restTemplate.getForObject(
                apiUrl + "/all",
                Country[].class);
        return Arrays.asList(repos);
    }
}

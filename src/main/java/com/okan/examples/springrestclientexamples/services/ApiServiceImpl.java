package com.okan.examples.springrestclientexamples.services;

import com.okan.examples.api.model.User;
import com.okan.examples.api.model.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     11:38
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UserData userData = restTemplate.getForObject("https://private-anon-75291b6732-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);
        return userData.getData();
    }
}

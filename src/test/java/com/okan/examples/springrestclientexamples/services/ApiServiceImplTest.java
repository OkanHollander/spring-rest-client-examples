package com.okan.examples.springrestclientexamples.services;

import com.okan.examples.api.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     11:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUsers() {
        List<User> users = apiService.getUsers(1);

        assertEquals(1, users.size());

    }
}

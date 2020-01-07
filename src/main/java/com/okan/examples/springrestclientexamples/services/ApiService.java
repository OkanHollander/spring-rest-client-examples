package com.okan.examples.springrestclientexamples.services;

import com.okan.examples.api.model.User;

import java.util.List;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     11:38
 */
public interface ApiService {
    List<User> getUsers(Integer limit);
}

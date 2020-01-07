package com.okan.examples.springrestclientexamples.services;

import com.okan.examples.api.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     11:38
 */
public interface ApiService {
    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);
}

package org.mtf.service;


import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;


@Service
public class TestService implements TestApi {


    @Override
    public String getNumber() {

       throw  new RuntimeException();

    }

    @Override
    public String getStr() {

        int i = 1/0;
        return "OK";
    }
}

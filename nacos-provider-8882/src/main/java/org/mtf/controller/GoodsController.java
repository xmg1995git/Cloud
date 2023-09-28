package org.mtf.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Slf4j
@RestController
public class GoodsController {

    private static Lock lock = new ReentrantLock();
    private static AtomicInteger goods = new AtomicInteger(2);
    private static AtomicInteger order = new AtomicInteger(0);



    @GetMapping("/exe")
    public  void exe(){
        if(goods.get()>0){
            try {
                lock.lock();
                goods.getAndDecrement();
                order.incrementAndGet();
            }finally {
                lock.unlock();
            }
            log.info("===>"+Thread.currentThread().getName());
        }
        log.info("XXXXXXXXXXXX");
    }

    @GetMapping("/get")
    public String get(){
        return goods.get() + "----" +order.get();
    }
}

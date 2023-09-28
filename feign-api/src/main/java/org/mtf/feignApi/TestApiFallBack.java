package org.mtf.feignApi;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author mtf
 */
@Slf4j
@Component
public class TestApiFallBack implements TestApi{


    @Override
    public String getNumber() {
//        log.info("getNumber...sorry!!!");
        return "ERROR！！！";
    }

    @Override
    public String getStr() {
        return "error ！！！";
    }
}

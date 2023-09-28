package org.mtf.feignApi;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mtf
 */
@FeignClient(value = "provider-8001", fallback = TestApiFallBack.class)
public interface TestApi {

    @GetMapping("/getNumber")
    String getNumber();

    @GetMapping("/str")
    String getStr();

}

package com.wayne.metric.producer;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import org.springframework.stereotype.Service;

@Service
public class MetricService {

    //@Timed(value = "biz.time.test", percentiles = {0.95, 0.99}, description = "metrics of test01")
    @Timed(description = "test01")
    public String test01(){
        return "001";
    }


    @Counted(value = "biz.count.test")
    public String test02(String num) {
        Integer.valueOf(num);
        return num;
    }
}

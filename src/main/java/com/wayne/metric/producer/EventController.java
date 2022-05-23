package com.wayne.metric.producer;

import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.web.servlet.WebMvcTagsProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Auther: Wayne
 * @Date: 2022/5/11 17:06
 * @Description:
 */
@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private WebMvcTagsProvider webMvcTagsProvider;

    @GetMapping("/get")
    public ResponseEntity<ServiceTagVO> get() {
        ServiceTagVO serviceTagVO = new ServiceTagVO();
        serviceTagVO.setCreateAt(new Date());
        return new ResponseEntity<>(serviceTagVO, HttpStatus.OK);
    }

    @RequestMapping(value = "/a5/{num}", method = RequestMethod.GET)
    public String a5(@PathVariable("num") String num) {
        Integer.valueOf(num);
        return "a5,ok:" + num + " --" + System.currentTimeMillis();
    }
}

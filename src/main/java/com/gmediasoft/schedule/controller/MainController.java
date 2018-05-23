package com.gmediasoft.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by betterFLY on 2018. 5. 19.
 * Github : http://github.com/betterfly88
 */

@Controller
public class MainController {

    @GetMapping("/main")
    public String indexView(){
        return "/index";
    }

    @GetMapping("/batch")
    public String batchView(){
        return "/schedule/batch";
    }
}

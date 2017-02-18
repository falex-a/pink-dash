/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import main.notmain;

@Controller
@EnableAutoConfiguration
public class main {
    public int parsum = 0;
    
    @Controller
    public static class JSPController {
        @RequestMapping("/jsptest")
        public String test(ModelAndView modelAndView) {
            return "jsp-spring-boot";
        }
    }
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/groo")
    @ResponseBody
    String groo(@RequestParam String par1) {
        parsum += Integer.parseInt(par1);
        notmain.myvar += parsum;
        return "parsum = "+parsum;
    }

    @RequestMapping("/jsontest") 
    public @ResponseBody Map<String, String> callSomething () {
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("url", "http://www.leveluplunch.com");
        
        return map;
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(main.class, args);
    }
}



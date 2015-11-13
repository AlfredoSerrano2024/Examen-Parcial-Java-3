/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Controller
public class Base {
    @RequestMapping("/")
    public String inicio(){
        return "inicio.html";
    }
    @RequestMapping(value="/reservacion",method=RequestMethod.GET)
    @ResponseBody String guardar()throws Exception{
        return " Reservacion guardada";
    }
    public static void main(String[] args)throws Exception{
        SpringApplication.run(Base.class, args);
     }
}
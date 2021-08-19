package de.maurice.casestudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {
  
  @RequestMapping("/")
  public String startPage(){
    return "<body style='background: #cafcfa; width: 100%; height: 100%;'>"
    		+ "<div style='position: absolute; top: 45%; width:100%; font-size: 120px; text-align: center;'>"
    		+ "Verwendung der API: <br>"
    		+ "<a style='font-size: 80px' href=\"http://localhost:8080/betriebsstelle/aamp\">"
    		+ "'http://localhost:8080/betriebsstelle/Stellenabkürzung'</a>"
    		+ "</div>"
    		+ "</body>";
  }
  
}
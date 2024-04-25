package io.chagchagchag.example.springdoc_example.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {
  @GetMapping("/healthcheck/ready")
  public String getReady(){
    return "OK";
  }


}

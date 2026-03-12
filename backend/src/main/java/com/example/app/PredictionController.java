
package com.example.app;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class PredictionController {

 @PostMapping("/predict")
 public String predict(@RequestParam int skill,@RequestParam double cgpa){

  if(skill >=7 && cgpa >=7.5){
   return "High Chance of Placement";
  }
  else{
   return "Low Chance of Placement";
  }

 }

}


package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlacementTest {

 @Test
 void testPrediction(){
  int skill=8;
  double cgpa=8.0;

  assertTrue(skill>=7 && cgpa>=7.5);
 }

}

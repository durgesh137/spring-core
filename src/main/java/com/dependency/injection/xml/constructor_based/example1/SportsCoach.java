package com.dependency.injection.xml.constructor_based.example1;
public class SportsCoach {

  public SportsCoach() {
	  System.out.println("Constructor: 0-param constructor call of CricketCoach");
  }

  public String getDailyWorkout() {
    return "6 hours of practice";
  }

}
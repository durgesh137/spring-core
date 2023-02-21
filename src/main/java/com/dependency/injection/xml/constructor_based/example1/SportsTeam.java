package com.dependency.injection.xml.constructor_based.example1;

public class SportsTeam {
	private String name;
	// CricketTeam has dependency over CricketCoach class
	private SportsCoach teamCoach;

	//for constructor based injection
	public SportsTeam(String name, SportsCoach coach) {
		System.out.println("Constructor: parameterized constructor is called in SportsTeam class");
		this.name = name;
		this.teamCoach = coach;

	}

	public String getInstruction() {
		return "Team Name: " + name + "----" + teamCoach.getDailyWorkout();

	}
}
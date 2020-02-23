/**
 * 
 */
package com.sap.empexp.pojo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author i319792
 *
 */
public class Activity {
	@Id
	public String id;
	
	private String date;
	
	private int caloriesBurn;
	
	private int steps;
	
	private double distance;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCaloriesBurn() {
		return caloriesBurn;
	}

	public void setCaloriesBurn(int caloriesBurn) {
		this.caloriesBurn = caloriesBurn;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	

}

/**
 *
 */
package com.sap.empexp.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author i319792
 *
 */
@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

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

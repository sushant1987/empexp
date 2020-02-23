/**
 * 
 */
package com.sap.empexp;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.empexp.pojo.Activity;
import com.sap.empexp.repositiory.ActivityRepositiory;


/**
 * @author i319792
 *
 */
@RestController
public class ActivityController {
	
	@Autowired
	ActivityRepositiory repositiory;
	
	static int stepsCount;
	@CrossOrigin
	@GetMapping("/walk")
	public Activity walk() {
		LocalDate today = LocalDate.now();
		String date = today.toString();
		List<Activity> activities = repositiory.findByDate(date);
		Activity a = new Activity();
		if(activities.isEmpty()) {
			stepsCount = 1;
			a.setSteps(1);
			a.setDistance(0);
			a.setDate(date);
			a.setCaloriesBurn(0);
			repositiory.save(a);
		} else {
			stepsCount +=1;
			a = activities.get(0);
			int steps = a.getSteps() + 1;
			a.setSteps(steps);
			if(stepsCount%14 == 0) {
				double distance = a.getDistance() + .01;
				a.setDistance(distance);
				int caloriesBurn = a.getCaloriesBurn() + 4;
				a.setCaloriesBurn(caloriesBurn);
				stepsCount =0;
			}
			repositiory.save(a);
		}
		
		return a;
		
	}

}

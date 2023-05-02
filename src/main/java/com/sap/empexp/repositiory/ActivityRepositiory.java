/**
 *
 */
package com.sap.empexp.repositiory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sap.empexp.pojo.Activity;

/**
 * @author i319792
 *
 */
public interface ActivityRepositiory extends CrudRepository<Activity, String> {

	/**
	 * aaaaa .
	 * 
	 * @param date
	 * @return
	 */
	List<Activity> findByDate(@Param("date") String date);

}

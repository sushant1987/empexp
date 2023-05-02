/**
 *
 */
package com.sap.empexp.repositiory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sap.empexp.pojo.Person;

/**
 * @soundtrack abc
 * @author i319792
 *
 */

public interface PersonRepositiory extends CrudRepository<Person, String> {

	/**
	 * a
	 * 
	 * @soundtrack abc
	 * @param Name
	 * @return list
	 */
	List<Person> findByName(@Param("name") String name);

}

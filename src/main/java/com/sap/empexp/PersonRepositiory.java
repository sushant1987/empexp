/**
 * 
 */
package com.sap.empexp;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author i319792
 *
 */

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
@CrossOrigin
public interface PersonRepositiory extends MongoRepository<Person, String>{
	
	List<Person> findByName(@Param("name") String name);

}

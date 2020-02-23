/**
 * 
 */
package com.sap.empexp.repositiory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sap.empexp.pojo.Activity;

/**
 * @author i319792
 *
 */
@RepositoryRestResource(collectionResourceRel = "activity", path = "activity")
@CrossOrigin
public interface ActivityRepositiory extends MongoRepository<Activity, String> {
	
	List<Activity> findByDate(@Param("date") String date);
	
}

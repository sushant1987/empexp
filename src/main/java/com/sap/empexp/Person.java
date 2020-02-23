/**
 * 
 */
package com.sap.empexp;

import org.springframework.data.annotation.Id;

/**
 * @author i319792
 *
 */
public class Person {
	@Id
	public String id;
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

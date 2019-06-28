package com.bdd;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationSteps {
	
	
	@Given("user loads application")
	public void user_loads_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("user registration using following info:")
	public void user_registration_using_following_info(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		 Map<String, String>map=dataTable.asMap(String.class, String.class);
		 for(String key: map.keySet())
				 {
			 System.out.println("KEY : "  +key+" value:" +map.get(key));
			 
				 }
	}
	/*
	 * @Given("user performs {} add {}")
	 * 
	 * // @Given("user performs {string}") public void user_performs_add(Object
	 * double1, Object double2) {
	 * 
	 * }
	 */
		 
		 @Given("user performs {double} and {double}")
		 public void user_performs_and(Double double1, Double double2) {
		    
		 }

		 
	}




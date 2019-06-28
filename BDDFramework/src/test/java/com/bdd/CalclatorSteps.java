package com.bdd;

import java.util.List;

import org.junit.Assert;

import com.sapient.qurate.CalculatorBDD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class CalclatorSteps {
	
	
	CalculatorBDD calci = new CalculatorBDD();
    
	@Given("i have an calculator")
	public void i_have_an_calculator() {
	    Assert.assertTrue(calci.calpresent());
	}

	@When("I have addition of {int} and {int}")
	public void i_have_addition_of_and(int int1, int int2) {
	    calci.add2Integers(int1, int2);
	}
	
	@When("I have subtraction of {int} and {int}")
	public void i_have_subtraction_of_and(int int1, int int2) {
	    calci.sub2Integers(int1, int2);
	}
	
	@When("I have multiplication of {int} and {int}")
	public void i_have_multiplication_of_and(int int1, int int2) {
	    calci.mul2Integers(int1, int2);
	}

	@Then("Result will be {int}")
	public void result_will_be(int int1) {
	    Assert.assertEquals(int1, calci.getResult());
	} 
	
	@When("user adds:")
	public void user_adds(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	     List<Integer> numbers=dataTable.asList(Integer.class);
	     calci.add(numbers);
	}




}

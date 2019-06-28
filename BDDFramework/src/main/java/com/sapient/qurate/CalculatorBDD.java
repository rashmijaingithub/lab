package com.sapient.qurate;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorBDD {
	
	int result;
	
	public boolean calpresent()
	{
		return true;
	}
public void add2Integers(int i, int j)
{
	result=i+j;
		
}


public void sub2Integers(int i, int j)
{
	result=i-j;
		
}
public void mul2Integers(int i, int j)
{
	result=i*j;
		
}
public int getResult()
{
	return result;
}

public void add(List<Integer> inputList)
{
	for(Integer input:inputList )
	{
		result=result+input;
	}
}

	

}

package TestNGAssignment;


import org.testng.annotations.Test;

public class TestNGpractice {

	@Test(invocationCount=5)
	public void d1() {
		System.out.println("Test Invocation count ");
		System.out.println("Run Sucessfully");}


/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/

class TestNGpractice1 {
	
	@Test(priority=1)
	public void login() {
	System.out.println("login function");
	}
	@Test(priority=3)
	public void Signin() {
		System.out.println("Signin function");
	}
	
	@Test(priority=2)
		public void email() {
			System.out.println("email id insert");
			
		}
	}}
/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/


//class TestNGpractice2 {
	


	
	
	
	
	
	
	
	


package Frameword_practice.test;

import java.util.Base64;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class TC001 {

	

	
	@Test(priority=1,groups="smoke")
	public void TS001()
	{
		System.out.println("Testing");
		//System.out.println(name);
	}
	
	@Test(priority=2)
	public void TS002()
	{
		System.out.println("Test method - 2");
	}
	
	
	@Test(priority=3, dataProvider="testData")
	public void testData(String name, String name1)
	{
		System.out.println(name);
		System.out.println(name1);
	}
	
	@DataProvider(name="testData")
	public Object[][] testData01()
	{
		Object ob [] []= {{"Arun","Venkatesh"},{"Dhoni","Raina"}};
		return ob;
	}
	
	@Test
	public void encodedString()
	{
		String name = "Welcome to qeads";
		String encoded_bytes = Base64.getEncoder().encodeToString(name.getBytes());
		System.out.println(encoded_bytes);
	}
	@Test
	public void decodedBytes()
	{
		String encodedString = "V2VsY29tZSB0byBxZWFkcw==";
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
	}
	
	
	@Test
	public void encoding()
	{
		String name = "Welcome";
		String encoded_string = Base64.getEncoder().encodeToString(name.getBytes());
		System.out.println(encoded_string);
		
		byte[] Decoded_Bytes = Base64.getDecoder().decode(encoded_string);
		String decodedString = new String(Decoded_Bytes);
		System.out.println(decodedString);
		System.out.println("Git Testing");
	}
	
}

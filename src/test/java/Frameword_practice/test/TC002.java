package Frameword_practice.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class TC002 {

	
	@Test
	public void TC003()
	{
		System.out.println("Test Method - 3");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@Test
	public void readJson() throws FileNotFoundException
	{
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\Frameword_practice\\test\\testData.json";
		System.out.println(path);
		FileReader file = new FileReader(path);
		JsonReader jsonReader = new JsonReader(file);
		JsonParser jsonParse = new JsonParser();
		JsonElement jsonelement = jsonParse.parse(jsonReader);
		System.out.println(jsonelement);
		JsonObject jObject= jsonelement.getAsJsonObject();
		JsonObject jsonAddress = jObject.getAsJsonObject("address");
		System.out.println(jsonAddress.get("new"));
	}
}

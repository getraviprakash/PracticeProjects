package readWriteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class ReadJsonArray {
 
    public static void main(String a[]) {
    String filePath = "D:\\Eclipse Workspace\\PracticeProjects\\ReadArray.json";
    try {
    	
    	FileInputStream fis = new FileInputStream(new File(filePath));
 
            // Create JsonReader from Json.
        JsonReader reader = Json.createReader(fis);
        JsonArray arr = reader.readArray();
        for (int i = 0; i < arr.size(); i++) 
        	{
            JsonObject obj = arr.getJsonObject(i);
            // read string 
            System.out.println("Name: " + obj.getString("name"));
            // read string 
            System.out.println("Salary: " + obj.getInt("salary"));
            // read integer 
            System.out.println("Age: " + obj.getInt("age"));
            // read integer 
            System.out.println("Id: " + obj.getInt("id"));
            
            }
        reader.close();
        
    } catch (Exception e) {
        System.out.println("Failed: " + e.getMessage());
    }
    }
}
 
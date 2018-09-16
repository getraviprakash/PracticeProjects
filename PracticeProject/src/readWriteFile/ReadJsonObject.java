package readWriteFile;

import java.io.File;
import java.io.FileInputStream;
 
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
 
public class ReadJsonObject {
 
    public static void main(String a[]) {
 
        try {
            FileInputStream fis = new FileInputStream(new File("D:\\Eclipse Workspace\\PracticeProjects\\ArrayInsideObject.json"));
 
            // Create JsonReader from Json.
            JsonReader reader = Json.createReader(fis);
 
            // Get the JsonObject structure from JsonReader.
            JsonObject obj = reader.readObject();
            reader.close();
 
            // read integer 
            System.out.println("Int: " + obj.getInt("MyNo"));
 
            // read string 
            System.out.println("String: " + obj.getString("MyName"));
 
            // read boolean 
            System.out.println("Boolean: " + obj.getBoolean("MyBoolean"));
            
            //read array
            JsonArray array = obj.getJsonArray("Members");
            System.out.println("Members of family are :");
            for (JsonValue value : array) {
                System.out.println(value.toString());
            } 
 
        } catch (Exception e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
 
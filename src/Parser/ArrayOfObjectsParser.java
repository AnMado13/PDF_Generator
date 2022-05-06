package Parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfObjectsParser
        implements SimpleParser{
    public String parse(String filePath, String cityTag){
        String city = "";

        JSONParser parser = new JSONParser();
        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");

            JSONArray rootJson = (JSONArray) parser.parse(reader);

            int dataSize = rootJson.size();
            JSONObject place = (JSONObject) rootJson.get((int) (Math.random() * dataSize));

            city = (String) place.get(cityTag);


        } catch (IOException | ParseException thrown) {
            System.out.println("Parsing error: " + thrown.toString());
        }
        return city;
    }


    public String[] parse(String filePath, String cityTag, String regionTag){
        String[] resultArray = new String[2];

        JSONParser parser = new JSONParser();
        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");

            JSONArray rootJson = (JSONArray) parser.parse(reader);

            int dataSize = rootJson.size();
            JSONObject place = (JSONObject) rootJson.get((int) (Math.random() * dataSize));

            resultArray[0] = (String) place.get(cityTag);
            resultArray[1] = (String) place.get(regionTag);


        } catch (IOException | ParseException thrown) {
            System.out.println("Parsing error: " + thrown.toString());
        }
        return resultArray;
    }

}

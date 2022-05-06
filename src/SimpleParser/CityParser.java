package SimpleParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CityParser
        implements SimpleParser{
    public String parse(String filePath, String tag){
        String city = "";

        JSONParser parser = new JSONParser();
        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");

            JSONArray rootJson = (JSONArray) parser.parse(reader);

            int dataSize = rootJson.size();
            JSONObject place = (JSONObject) rootJson.get((int) (Math.random() * dataSize));

            city = (String) place.get(tag);


        } catch (IOException | ParseException thrown) {
            System.out.println("Parsing error: " + thrown.toString());
        }
        return city;
    }
}

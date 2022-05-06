package Parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayParser
        implements SimpleParser{
    public String parse(String filePath, String tag){
        String resultData = "";

        JSONParser parser = new JSONParser();
        try{


            InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");

            JSONObject rootJson = (JSONObject) parser.parse(reader); //распарсили json файл

            JSONArray dataArray = (JSONArray) rootJson.get(tag); //получаем значения ключа tag

            int dataSize = dataArray.size();
            resultData = (String) dataArray.get((int) (Math.random() * dataSize));

        } catch (IOException | ParseException thrown) {
            System.out.println("Parsing error: " + thrown.toString());
        }
        return resultData;
    }
}

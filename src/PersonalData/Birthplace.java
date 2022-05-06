package PersonalData;

import SimpleParser.*;

public class Birthplace
        implements PersonalData{
    private String birthplace;

    public Birthplace(){
        this.birthplace = "Орёл";
    }

    public Birthplace(String place){
        this.birthplace = place;
    }

    public String getData(){
        return this.birthplace;
    }

    public void setData(String place){
        this.birthplace = place;
    }

    public void setRandomData(){

        String filePath = "./data/Russia.json";
        SimpleParser parser = new CityParser();
        this.birthplace = parser.parse(filePath, "city");

    }
}

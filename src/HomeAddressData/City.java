package HomeAddressData;

import Parser.*;

public class City {

    private String country;
    private String region;
    private String city;

    public City(){
        this.country = "Россия";
        this.region = "Орловская обл.";
        this.city = "Орёл";
    }

    public void setRandomData(){
        String filePath = "./data/Russia.json";
        SimpleParser parser = new ArrayOfObjectsParser();
        String[] placeParseResult = parser.parse(filePath, "city","region");
        this.city = placeParseResult[0];
        this.region = placeParseResult[1];
    }

    public String getCountry() {
        return this.country;
    }

    public String getRegion(){
        return this.region;
    }

    public String getCity() {
        return this.city;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

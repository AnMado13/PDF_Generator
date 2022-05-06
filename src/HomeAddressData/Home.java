package HomeAddressData;

import Parser.*;

public class Home {
    private String street;
    private String house;
    private String apartment;
    private String index;

    public Home(){
        this.street = "Пушкинская";
        this.house = "42";
        this.apartment = "57";
        this.index = "302001";
    }


    public void setRandomData(){
        this.index = "" + (101000 + (int) (Math.random() * 593000));
        this.house = "" + (1 + (int) (Math.random() * 300));
        this.apartment = "" + (1 + (int) (Math.random() * 120));

        String filePath = "./data/Street.json";
        SimpleParser parser = new ArrayParser();
        this.street = parser.parse(filePath, "street");
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    public String getIndex() {
        return index;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}

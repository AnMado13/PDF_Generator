public class HomeAddressData {
    private String index;
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public HomeAddressData(){

    }

    public HomeAddressData(String[] address){
        this.index = address[0];
        this.country = address[1];
        this.region = address[2];
        this.city = address[3];
        this.street = address[4];
        this.house = address[5];
        this.apartment = address[6];

    }

    public String getIndex(){
        return this.index;
    }

    public String getCountry(){
        return this.country;
    }

    public String getRegion(){
        return this.region;
    }

    public String getCity(){
        return this.city;
    }

    public String getStreet(){
        return this.street;
    }

    public String getHouse(){
        return this.house;
    }

    public String getApartment(){
        return this.apartment;
    }
}

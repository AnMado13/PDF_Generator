import java.time.LocalDate;

public class Person {
    private PersonalData personalInfo;
    private HomeAddressData address;

    //стандартный конструктор: все поля заполняются случайным образом
    public Person(){
        this.personalInfo = new PersonalData();
        this.address = new HomeAddressData();
    }

    //кастомный конструктор: все поля заполняются в соответствии с переданными данными
    public Person(String[] personalInfo, String[] address){
        this.personalInfo = new PersonalData(personalInfo);
        this.address = new HomeAddressData(address);
    }

    public String[] getPersonalData(){
        return null;
    }
    // returns [имя, фамилия, отчество, возраст, пол, дата рождения, место рождения]

    public String[] getHomeAddressData(){
        return null;
    }
    // returns [почтовый индекс, страна, область, город, улица, дом, квартира]



}

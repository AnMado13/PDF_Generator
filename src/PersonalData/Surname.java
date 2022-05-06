package PersonalData;

import Parser.*;

public class Surname
        implements PersonalData{
    private String surname;
    private String sex;

    public Surname(){
        this.sex = "МУЖ";
        this.surname = "Васильев";
    }

    public Surname(String sex){
        this.sex = sex;
        this.surname = "Бондаренко";
    }

    public Surname(String sex, String surname){
        this.sex = sex;
        this.surname = surname;
    }

    public String getData() {
        return this.surname;
    }

    public void setData(String data){
        this.surname = data;
    }

    public void setRandomData(){

        String filePath = "./data/" + ((this.sex == "МУЖ") ? "Man.json" : "Woman.json");

        SimpleParser parser = new ArrayParser();
        this.surname = parser.parse(filePath, "surname");
    }
}

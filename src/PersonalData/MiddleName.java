package PersonalData;

import SimpleParser.*;

public class MiddleName
        implements PersonalData {
    private String middleName;
    private String sex;

    public MiddleName(){
        this.sex = "МУЖ";
        this.middleName = "Васильевич";
    }

    public MiddleName(String sex){
        this.sex = sex;
        this.middleName = (sex == "МУЖ") ? "Васильевич" : "Васильевна";
    }

    public MiddleName(String sex, String middleName){
        this.sex = sex;
        this.middleName = middleName;
    }

    public String getData(){
        return this.middleName;
    }

    public void setData(String data){
        this.middleName = data;
    }

    public void setRandomData(){

        String filePath = "./data/" + ((this.sex == "МУЖ") ? "Man.json" : "Woman.json");

        SimpleParser parser = new FullNameParser();
        this.middleName = parser.parse(filePath, "middleName");

    }

}

public class Name
        implements PersonalData {
    private String name;
    private String sex;

    public Name(){
        this.sex = "МУЖ";
        this.name = "Василий";
    }

    public Name(String sex){
        this.sex = sex;
        this.name = (sex == "МУЖ") ? "Василий" : "Полина";
    }

    public Name(String sex, String name){
        this.sex = sex;
        this.name = name;
    }

    public String getData(){
        return this.name;
    }

    public void setData(String data){
        this.name = data;
    }

    public void setRandomData(){

    }
}

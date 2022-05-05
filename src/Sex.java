public class Sex
        implements PersonalData {
    private String sex;

    public Sex(){
        this.sex = "МУЖ";
    }

    public Sex(String sex){
        this.sex = sex;
    }

    public String getData(){
        return this.sex;
    }

    public void setData(String data){
        this.sex = data;
    }

    public void setRandomData(){

    }
}

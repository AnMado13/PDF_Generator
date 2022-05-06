package PersonalData;

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
        int sexRandom = (int) (Math.random() * 2);

        this.sex = (sexRandom == 0) ? "ЖЕН" : "МУЖ";
    }
}

public class Birthdate {
    private String birthdate;
    protected int birthYear;
    protected int birthMonth;
    protected int birthDay;

    public Birthdate(){
        this.birthdate = "13-08-2000";
        this.birthYear = 2000;
        this.birthMonth = 8;
        this.birthDay = 13;
    }

    public Birthdate(int day, int month, int year){
        this.birthdate = ((day < 10) ? "0" : "") + day + "-" + ((month < 10) ? "0" : "") + month + "-" + year;
        this.birthYear = year;
        this.birthMonth = month;
        this.birthDay = day;
    }

    private void dateToString(){
        this.birthdate = ((this.birthDay < 10) ? "0" : "") + this.birthDay + "-";
        this.birthdate += ((this.birthMonth < 10) ? "0" : "") + this.birthMonth + "-";
        this.birthdate += birthYear;
    }

    public String getData(){
        return this.birthdate;
    }

    public void setData(int day, int month, int year){
        this.birthdate = ((day < 10) ? "0" : "") + day + "-" + ((month < 10) ? "0" : "") + month + "-" + year;
        this.birthYear = year;
        this.birthMonth = month;
        this.birthDay = day;
    }

    public void setRandomData(){
        this.birthYear = 1920 + (int) (Math.random() * 100);
        this.birthMonth = 1 + (int) (Math.random() * 12);

        if (birthMonth == 2) {
            this.birthDay = 1 + (int) (Math.random() * 28);
        } else {
            this.birthDay = 1 + (int) (Math.random() * (30 + (birthMonth % 2)));
        }

        String b = birthDay + "-" + birthMonth + "-" + birthYear;
    }
}

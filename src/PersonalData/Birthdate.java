package PersonalData;
import java.time.LocalDate;

public class Birthdate
        implements PersonalData{
    private String birthdate;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

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

    public String getData(){
        return this.birthdate;
    }

    public void setData(String date){
        String[] splitDate = date.split("-");

        this.birthdate = date;
        this.birthDay = Integer.parseInt(splitDate[0]);
        this.birthMonth = Integer.parseInt(splitDate[1]);
        this.birthYear = Integer.parseInt(splitDate[2]);
    }

    public void setRandomData(){
        this.birthYear = 1920 + (int) (Math.random() * 100);
        this.birthMonth = 1 + (int) (Math.random() * 12);

        if (birthMonth == 2) {
            this.birthDay = 1 + (int) (Math.random() * 28);
        } else {
            this.birthDay = 1 + (int) (Math.random() * (30 + (this.birthMonth % 2)));
        }

        this.birthdate = ((this.birthDay < 10) ? "0" : "") + this.birthDay + "-";
        this.birthdate += ((this.birthMonth < 10) ? "0" : "") + this.birthMonth + "-";
        this.birthdate += birthYear;
    }

    public String calculateAge(){
        LocalDate currentDate = LocalDate.now();

        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();

        int age = currentYear - this.birthYear;

        if ((this.birthMonth > currentMonth) || ((this.birthMonth == currentMonth) && (this.birthDay > currentDay))){
            age -= 1;
        }
        return ("" + age);
    }

}

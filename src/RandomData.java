import java.time.LocalDate;

public class RandomData {

    public void randomBirthdate(){

        int birthYear = 1920 + (int) (Math.random() * 100);
        int birthMonth = 1 + (int) (Math.random() * 12);
        int birthDay;

        if (birthMonth == 2) {
            birthDay = 1 + (int) (Math.random() * 28);
        } else {
            birthDay = 1 + (int) (Math.random() * (30 + (birthMonth % 2)));
        }

        String b = birthDay + "-" + birthMonth + "-" + birthYear;

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        int a = currentYear - birthYear;

        if ((birthMonth > currentMonth) || ((birthMonth == currentMonth) && (birthDay > currentDay))){
             a -= 1;
        }
    }

}

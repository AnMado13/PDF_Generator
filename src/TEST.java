import PersonalData.*;

public class TEST {
    public static void main(String[] args){
        Sex sex = new Sex();
        sex.setRandomData();

        Name name = new Name(sex.getData());
        name.setRandomData();

        Surname surname = new Surname(sex.getData());
        surname.setRandomData();

        MiddleName middleName = new MiddleName(sex.getData());
        middleName.setRandomData();

        Birthdate birthdate = new Birthdate();
        birthdate.setRandomData();

        Birthplace birthplace = new Birthplace();
        birthplace.setRandomData();

        System.out.println(name.getData());
        System.out.println(surname.getData());
        System.out.println(middleName.getData());
        System.out.println(birthdate.calculateAge());
        System.out.println(sex.getData());
        System.out.println(birthdate.getData());
        System.out.println(birthplace.getData());
    }
}

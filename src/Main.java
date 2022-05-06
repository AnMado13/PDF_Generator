import HomeAddressData.*;
import PersonalData.*;

public class Main {
    public static void main(String[] args){
        int rowsNumber = 10;

        for (int i = 1; i <= rowsNumber; i++){

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

            City city = new City();
            city.setRandomData();

            Home address = new Home();
            address.setRandomData();


        }

    }
}

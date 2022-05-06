import HomeAddressData.City;
import HomeAddressData.Home;
import PersonalData.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Generator {
    public void generate(int rowsNumber) throws DocumentException {
        int columnsNumber = 14;
        BaseFont times; //внешний шрифт

        //подключение внешнего шрифта с кириллицей
        try {
            times = BaseFont.createFont("./fonts/times.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (DocumentException | IOException e) {
            throw new RuntimeException(e);
        }

        //задается шрифт
        Font font = new Font(times, 6);

        //создается pdf
        PdfWriter writer;
        Document pdfDocument = new Document();
        try {
            writer = PdfWriter.getInstance(pdfDocument, new FileOutputStream("./pdf/iTextTable.pdf"));
        } catch (DocumentException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        pdfDocument.open();

        //инициализируем таблицу
        float [] columnWidth = {1.5f, 2f, 2f, 1f, 0.7f, 1.5f, 2f, 1f, 1f, 2.5f, 2f, 2f, 0.9f, 1.1f};
        PdfPTable table = new PdfPTable(columnWidth);
        table.setWidthPercentage(110f);

        //задаем заголовки
        table.addCell(new PdfPCell(new Phrase("Имя", font)));
        table.addCell(new PdfPCell(new Phrase("Фамилия", font)));
        table.addCell(new PdfPCell(new Phrase("Отчество", font)));
        table.addCell(new PdfPCell(new Phrase("Возраст", font)));
        table.addCell(new PdfPCell(new Phrase("Пол", font)));
        table.addCell(new PdfPCell(new Phrase("Дата рождения", font)));
        table.addCell(new PdfPCell(new Phrase("Место рождения", font)));
        table.addCell(new PdfPCell(new Phrase("Индекс", font)));
        table.addCell(new PdfPCell(new Phrase("Страна", font)));
        table.addCell(new PdfPCell(new Phrase("Область", font)));
        table.addCell(new PdfPCell(new Phrase("Город", font)));
        table.addCell(new PdfPCell(new Phrase("Улица", font)));
        table.addCell(new PdfPCell(new Phrase("Дом", font)));
        table.addCell(new PdfPCell(new Phrase("Квартира", font)));

        for (int i = 1; i <= rowsNumber; i++){

            //генерируются данные
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

            //заполнение ячеек данными
            table.addCell(new PdfPCell(new Phrase(name.getData(), font)));
            table.addCell(new PdfPCell(new Phrase(surname.getData(), font)));
            table.addCell(new PdfPCell(new Phrase(middleName.getData(), font)));
            table.addCell(new PdfPCell(new Phrase(birthdate.calculateAge(), font)));
            table.addCell(new PdfPCell(new Phrase(sex.getData(), font)));
            table.addCell(new PdfPCell(new Phrase(birthdate.getData(), font)));
            table.addCell(new PdfPCell(new Phrase(birthplace.getData(), font)));
            table.addCell(new PdfPCell(new Phrase(address.getIndex(), font)));
            table.addCell(new PdfPCell(new Phrase(city.getCountry(), font)));
            table.addCell(new PdfPCell(new Phrase(city.getRegion(), font)));
            table.addCell(new PdfPCell(new Phrase(city.getCity(), font)));
            table.addCell(new PdfPCell(new Phrase(address.getStreet(), font)));
            table.addCell(new PdfPCell(new Phrase(address.getHouse(), font)));
            table.addCell(new PdfPCell(new Phrase(address.getApartment(), font)));





        }

        //таблица добавляется в pdf
        try {
            pdfDocument.add(table);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        pdfDocument.close();
    }




}

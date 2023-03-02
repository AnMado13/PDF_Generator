import com.itextpdf.text.DocumentException;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DocumentException, IOException {

        consolePrint("Input required number of rows in the table:");

        int rowsNumber = consoleInput();
        generatePdf(rowsNumber);

        consolePrint("File successfully generated at PDF_Generator/pdf/iTextTable.pdf");
    }

    private static int consoleInput() {
        Scanner consoleIn = new Scanner(System.in);

        return consoleIn.nextInt();
    }

    private static void consolePrint(Object output) {
        PrintStream consoleOut = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        consoleOut.println(output);
    }

    private static void generatePdf(int rowsNumber) throws DocumentException, IOException {
        PDF pdfDoc = new PDF(
                "./pdf/iTextTable.pdf",
                "./fonts/times.ttf",
                6,
                8
        );

        //настройки для столбцов можно вынести в отдельный файл
        pdfDoc.createTable(
                new String[][]{{""}},
                new String[]{"Имя", "Фамилия", "Отчество", "Возраст", "Пол", "Дата рождения", "Место рождения", "Индекс", "Страна", "Область", "Город", "Улица", "Дом", "Квартира",},
                new float[]{1.5f, 2f, 2f, 1f, 0.7f, 1.5f, 2f, 1f, 1f, 2.5f, 2f, 2f, 0.9f, 1.1f},
                110f
        );
    }
}

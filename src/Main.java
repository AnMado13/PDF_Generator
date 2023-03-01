import com.itextpdf.text.DocumentException;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DocumentException {

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

    private static void generatePdf(int rowsNumber) throws DocumentException {
        PDF pdfDoc = new PDF();
        pdfDoc.generate(rowsNumber);
    }
}

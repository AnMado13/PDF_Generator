import com.itextpdf.text.DocumentException;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DocumentException, UnsupportedEncodingException {

        PrintStream printStream = new PrintStream(System.out, true, "UTF-8");
        printStream.println("Input:");

        Scanner in = new Scanner(System.in);
        int rowsNumber = in.nextInt();
        in.close();

        Generator pdfDoc = new Generator();
        pdfDoc.generate(rowsNumber);

        printStream.println("File successfully generated at PDF_Generator/pdf/iTextTable.pdf");

    }

}

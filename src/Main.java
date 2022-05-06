import com.itextpdf.text.DocumentException;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DocumentException, UnsupportedEncodingException {

        PrintStream printStream = new PrintStream(System.out, true, "UTF-8");
        printStream.println("Введите целое число от 1 до 30...");

        Scanner in = new Scanner(System.in);
        int rowsNumber = in.nextInt();
        in.close();

        Generator pdfDoc = new Generator();
        pdfDoc.generate(rowsNumber);

    }

}

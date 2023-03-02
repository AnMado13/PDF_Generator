import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDF {
    Font textFont;
    Font titleFont;
    Document pdfDocument;

    //create PDF with custom font and font size
    public PDF(String filePath,
               String fontPath,
               int textSize,
               int titlesSize
    ) throws DocumentException, IOException {

        this.textFont = FontFactory.getFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED, textSize);
        this.titleFont = FontFactory.getFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED, titlesSize);
        this.pdfDocument = new Document();
        PdfWriter.getInstance(pdfDocument, new FileOutputStream(filePath));
    }

    /*
    toDO: one constructor with base font

    public void generateTable(int rowsNumber,
                              int columnsNumber,
                              float tableWidthPercentage
    ){

    }

    public void generateTable(int rowsNumber,
                              String [] columnsTitles,
                              float tableWidthPercentage
    ){

    }

    public void generateTable(int rowsNumber,
                              float [] columnsWidth,
                              float tableWidthPercentage
    ){

    }

*/

    public void createTable(String [][] tableContent,
                            String [] columnsTitles,
                            float [] columnsWidth,
                            float tableWidthPercentage
    ) throws DocumentException {
        PdfPTable table;

        //creates table, columnsWidth.length also sets the number of columns
        pdfDocument.open();
        table = new PdfPTable(columnsWidth);
        table.setWidthPercentage(tableWidthPercentage);

        //fill columns with titles
        for (String title : columnsTitles){
            new Phrase();
            table.addCell(new PdfPCell(new Phrase(title, titleFont)));
        }

        //fill table with content
        for (String[] row: tableContent){
            for (String cellContent: row){
                table.addCell(new PdfPCell(new Phrase(cellContent, textFont)));
            }
        }

        pdfDocument.add(table);
        pdfDocument.close();
    }
}

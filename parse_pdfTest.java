package parse;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class parse_pdfTest {

	public static void main(String[] args) {
		
		try {
			
			File pdf_file = new File("C://Users//hp//Downloads//pdf box//OpTransactionHistoryUX3_PDF24-10-2021.pdf");
			PDDocument document = PDDocument.load(pdf_file);
			
			PDFTextStripper pdfstripper = new PDFTextStripper();
			
			String parse_text = pdfstripper.getText(document);
			System.out.println(parse_text);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}

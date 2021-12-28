package parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class parse_pdfTest {

	public static void main(String[] args) throws IOException {
		
		//File pdf_file = new File("C://Users//hp//Downloads//pdf box//statement.pdf");
		//PDDocument document1 = PDDocument.load(pdf_file);
		//PDFTextStripper pdfstripper = new PDFTextStripper();
		//String parse_text = pdfstripper.getText(document1);
		//System.out.println(parse_text);
		
		
			String[] lines = readlinesfromPDF("C:\\Users\\hp\\eclipse-workspace\\Parse_Pdf\\statement.pdf");

			Statementclass document = getStatementclass(lines);
			
			System.out.println(document.toString());
			System.out.println(document.getDate());
			System.out.println(document.getAccountType());
			System.out.println(document.getBranchName());
			System.out.println(document.getMIRCCode());
			System.out.println(document.getIFSCCode());
			System.out.println(document.getOpeningBalance());
			System.out.println(document.getClosingBalance());
					
		}
		public static String[] readlinesfromPDF(String filePath)  throws IOException {
			
			
			File file = new File(filePath);
			InputStream is = new FileInputStream(file);
			
			PDFParser parser = new PDFParser(is);
			parser.parse();
			
			COSDocument cosdoc = parser.getDocument();
			PDDocument pddoc = new PDDocument(cosdoc);		
			
			PDFTextStripper str = new PDFTextStripper();
			String data = str.getText(pddoc);
			
			String a[] = data.split("\\n",0);
			//getStatementclass(a);
			return a;
			
		}
		
		public static Statementclass getStatementclass(String b[]) throws IOException { 
			Statementclass document = new 	Statementclass();
			
			document.Name = b[1];
			document.Date = b[10];
			document.AccountType = b[16];
			document.BranchName = b[12];
			document.MIRCCode = b[17];
			document.IFSCCode = b[18];
			document.OpeningBalance = b[23];
			document.ClosingBalance = b[149];
		    return document;
	
		}
}

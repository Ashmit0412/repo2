package Excel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel1 {//read data of given cell

	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("../Excelnew/excel1.xls"); 
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter column #");
		int a=s.nextInt();
		System.out.println("Enter row #");
		int b=s.nextInt();
		Cell c=ws.getCell(a, b);
       System.out.println(c.getContents());
	}

}

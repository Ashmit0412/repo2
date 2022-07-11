package Excel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Excel4 {//write data with Scanner class 

	public static void main(String[] args) throws IOException, WriteException {
		File f=new File("../Excelnew/excel2.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("first",0);
		Scanner s=new Scanner(System.in);
		{
			for(int i=0;i<=3;i++) {
				for(int j=0;j<=3;j++) {
					String content;
					System.out.println("Enter cell contentof cell " +j+i);
					content=s.nextLine();
					Label l=new Label(j,i,content);
					ws.addCell(l);
				}
			}wk.write();
			wk.close();
		}
	}

}

package Excel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel2 {//Create a method which will read particular row

	public static void main(String[] args) throws BiffException, IOException {
	File f=new File("../Excelnew/excel1.xls");
    Workbook wk= Workbook.getWorkbook(f);
    Sheet ws=wk.getSheet(0);
    int co=ws.getColumns();
    int ro=ws.getRows();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter row required");
    int c=s.nextInt();
    for (int i=0;i<=ro;i++) {
    	for(int j=0;j<=co;j++) {
    		if(i==c) {Cell k=ws.getCell(j, i);
    		System.out.println(k.getContents());
    			
    		}
    	}
    }
    
	}

}

package Excel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel5 {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f=new File("../Excelnew/excel1.xls");
	    Workbook wk= Workbook.getWorkbook(f);
	    Sheet ws=wk.getSheet(0);
	    int r=ws.getColumns();
	    int c=ws.getRows();
	    File f1=new File("../Excelnew/excel3.xls");
		WritableWorkbook w1=Workbook.createWorkbook(f1);
		WritableSheet w3=w1.createSheet("first",0);
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter row required");
	    int a=s.nextInt();
	    System.out.println("Enter row required");
	    int b=s.nextInt();
	    
	    for (int i=0;i<=r;i++) {
	    	for(int j=0;j<=c;j++) {
	    		
	    		if((i>=a)&&(i<=b))
	    		{Cell k=ws.getCell(j, i);
				String content= k.getContents();
				Label l=new Label(j,i,content);
				w3.addCell(l);
	    		}
	    	}
	    }w1.write();
		w1.close();
	    
		}

	}
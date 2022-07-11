package Excel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public interface Excel3 {//read data based upon range
	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("../Excelnew/excel1.xls");
	    Workbook wk= Workbook.getWorkbook(f);
	    Sheet ws=wk.getSheet(0);
	    int r=ws.getColumns();
	    int c=ws.getRows();
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter row required");
	    int a=s.nextInt();
	    System.out.println("Enter row required");
	    int b=s.nextInt();
	    for (int i=0;i<=r;i++) {
	    	for(int j=0;j<=c;j++) {
	    		if((i>=a)&&(i<=b))
	    		{Cell k=ws.getCell(j, i);
	    		System.out.println(k.getContents());
	    			
	    		}
	    	}
	    }
	    
		}

	}



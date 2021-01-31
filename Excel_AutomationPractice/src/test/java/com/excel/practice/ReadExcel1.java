package com.excel.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {
	static FileInputStream fis;
	static XSSFWorkbook wb;
	public static void main(String[] args) {
	//String path="./Data folder/Test Data Financial.xlsx";
	File path = new File("./Data folder/Test Data Financial.xlsx");//1==>path
	try {
		 fis = new FileInputStream(path);//data>>stream//2)serialization
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	//Apache POI >>JAR to handle excel >>>read the excel data as stream
	// XSSFWorkbook wb = new XSSFWorkbook(fis);
	//XSSFSheet sht = wb.getSheetAt(0);
	
	//XSSFRow row = wb.getRow();
	
	//XSSFCell cell = wb.getCell(cellnum);
	//Apache POI
	try {
		 wb = new XSSFWorkbook(fis);//3==>Whole Excel as workbook
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	///XSSFCell cellValue = wb.getSheetAt(1).getRow(0).getCell(0);
	///System.out.println(cellValue.toString());
	
	//column code>>>1)all rows/row count(?)
	XSSFSheet sht = wb.getSheetAt(0);//4==>select sheet number
	int RowCount = sht.getPhysicalNumberOfRows();//5==>row count/rownum/row/number/total row
	System.out.println("Row number="+RowCount);//2
	
	//loop through all rows
	int columnCount=0;
	
	Set<String>mySet = new LinkedHashSet<>();
	for(int i=0;i<RowCount;i++) {//5(i)==>loop for row
		
	XSSFRow row = sht.getRow(0);
	
	
	columnCount = row.getLastCellNum();
	for(int j=0;j<columnCount;j++) {//6==>loop for column
		XSSFCell cellValue = row.getCell(0);
		DataFormatter df = new DataFormatter();//convert all types of data into String
		mySet.add(df.formatCellValue(cellValue).toString());
		
	}
		
	}
	System.out.println("Column number="+columnCount);//3
	System.out.println(mySet);
	}
}

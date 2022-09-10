package OverAll;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelData() throws IOException {

		String filelocation = "C:\\Users\\suppo\\Desktop\\ExcelData.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);

		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastrownum = sheet.getLastRowNum();
		int physicalnumofrows = sheet.getPhysicalNumberOfRows();
		System.out.println("inclusive of header" + physicalnumofrows);
		System.out.println("no.of rows:" + lastrownum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("no.of cells" + lastCellNum); 
		String[][] data = new String[lastrownum][lastCellNum];
		for (int i = 1; i <= lastrownum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String Value = dft.formatCellValue(cell);
				// String value = cell.getStringCellValue();
				// System.out.println(Value);
				data[i - 1][j] = Value;

			}
		}

		wbook.close();
		return data;

	}

}

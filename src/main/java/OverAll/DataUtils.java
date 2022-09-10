
package OverAll;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import OverAll.ReadExcel;

public class DataUtils {

	@DataProvider(parallel = !true)
	public String[][] getData() throws IOException {
		String[][] excelData = ReadExcel.getExcelData();
		return excelData;
	}

}
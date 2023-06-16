package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public Object[][] dataSupplier(String filePath) throws IOException {

		// File file = new File(filePath);

		FileInputStream fis = new FileInputStream(filePath);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		int lastRowNum = sheet.getLastRowNum();

		int lastCellNum = sheet.getRow(0).getLastCellNum();

//		System.out.println(lastRowNum);

//		System.out.println(lastCellNum);

		Object[][] obj = new Object[lastRowNum][1];

		for (int i = 0; i < lastRowNum; i++) {

			Map<Object, Object> datamap = new HashMap<>();

			for (int j = 0; j < lastCellNum; j++) {

				datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());

			}

			obj[i][0] = datamap;

		}

		wb.close();

		fis.close();

		return obj;

	}
}

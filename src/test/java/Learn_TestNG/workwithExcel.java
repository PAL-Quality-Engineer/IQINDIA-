package Learn_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class workwithExcel {

	@DataProvider(name="dataSend")

	public Object[][] ExcelSheetWork() throws IOException {

		String path = "C:\\Users\\ROYAL INFOTECH\\OneDrive\\Desktop\\IQ-INDIA OFFICE\\TestNG_ExcelFileWorkSheet(XSSF).xlsx.xlsx";

		// we can be create the file class and inslizaction of string path variable ine
		// the file
		File fl = new File(path);
		// then after we can read the file useing fileinputstrim
		FileInputStream fis = new FileInputStream(fl);
		// We can be store file in the workbook space
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// Workbook key ander sheet per jana h
		XSSFSheet sh = wb.getSheet("Altoro");
		// get the xssf sheet row
		int row = sh.getLastRowNum();// in this methods are used for o index base
		System.out.println("Row" + ":" + row);
		// Get the xssf sheet col
		int col = sh.getRow(0).getLastCellNum();
		System.out.println("ColNumber" + " :" + col);
		
		Object [][]obj=new Object[row][col];
		// useing thr for for loop
//		for (int r = 0; r < row; r++) {
//			for (int c = 0; c < col; c++) {
//				String RowCol = sh.getRow(r + 1).getCell(c).getStringCellValue();
//				System.out.println(RowCol);
		
		for (int r = 0; r < row; r++) {
			XSSFRow rw=sh.getRow(r+1);
			for (int c = 0; c < col; c++) {
				XSSFCell cell=rw.getCell(c);
				
				CellType celltype=cell.getCellType();
				switch(celltype) {
				case STRING:
					obj [r][c]=cell.getStringCellValue();
					break;
				case NUMERIC:
//					System.out.println(cell.getNumericCellValue());
					obj [r][c]=(Integer.toString((int)cell.getNumericCellValue()));
					break;
				case BOOLEAN:
					obj [r][c]=cell.getBooleanCellValue();
					break;
				default:
					System.out.println("Invalid data");
					
				
				
				}
				
		}

			}
		fis.close();
		wb.close();
		return obj;
	

		}

}

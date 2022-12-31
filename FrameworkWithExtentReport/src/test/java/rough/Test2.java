package rough;

import utilities.ExcelReader;

public class Test2 {

	public static void main(String[] args) {
		String sheetName = "Sheet1";
		ExcelReader excel = new ExcelReader("F:\\My Framework VV\\Nov2022\\MyFramework1\\TestData\\TestData.xlsx");
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		System.out.println("rows: "+rows);
		System.out.println("Cols: "+cols);
		
		for (int row = 2; row <= rows; row++) {

			for (int col = 0; col < cols; col++) {
				System.out.print(excel.getCellData(sheetName, col, row)+" : ");
			}
		System.out.println();
		}

	}

}

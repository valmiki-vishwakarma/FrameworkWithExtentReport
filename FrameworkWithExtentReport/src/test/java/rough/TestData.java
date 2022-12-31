package rough;

import utilities.ExcelReader;

public class TestData {

	public static void main(String[] args) {


		ExcelReader excel = new ExcelReader("C:\\Users\\Selenium\\Desktop\\hybridframework\\testdata.xlsx");
		
		String sheetName = "Sheet1";
		String testCase = "LoginTest";
		//Test case start from
		
		int testCaseRowNum=1;
		
		while(!excel.getCellData(sheetName, 0, testCaseRowNum).equalsIgnoreCase(testCase)){
			
			
			testCaseRowNum++;
		}
		
		System.out.println("Test case starts from : "+testCaseRowNum);
		
		
		//total cols & rows - cols starts and test data starts from
		
		
		int colsStartRowNum=testCaseRowNum+1;
		int dataStartRowNum=colsStartRowNum+1;
		
		
		//total cols in test are
		
		int cols=0;
		
		while(!excel.getCellData(sheetName, cols, colsStartRowNum).trim().equals("")){
			
			cols++;
			
		}
		
		System.out.println("Total cols in a test are : "+cols);
		
		
		//total rows in a test are
		
		int rows=0;
		
		while(!excel.getCellData(sheetName, 0, dataStartRowNum+rows).trim().equals("")){
			
			rows++;
			
		}

		System.out.println("Total rows are : "+rows);
		
		//printing the test data
		
		for(int row=dataStartRowNum; row<dataStartRowNum+rows;row++){
			
			for(int col=0;col<cols;col++){
				
				
				System.out.println(excel.getCellData(sheetName, col, row));
				
			}
			
			
		}
		
		
	}

}

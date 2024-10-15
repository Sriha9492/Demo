package Sample;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel {
    private static final String FILE_PATH = "C:\\Users\\SRPULA\\OneDrive -Capgemini\\Desktop\\Excel.xlsx";

    public static List<Product> readProductsFromExcel() throws IOException {
    	
        List<Product> products = new ArrayList<>();
        
        FileInputStream fis = new FileInputStream(FILE_PATH);
        
        Workbook workbook = new XSSFWorkbook(fis);
        
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
        	
            if (row.getRowNum() == 0) continue; // Skip header row
            
            String productName = row.getCell(0).getStringCellValue();
            
            int price = (int) row.getCell(1).getNumericCellValue();
            
            products.add(new Product());
        }

        workbook.close();
        fis.close();
        return products;
    }
}

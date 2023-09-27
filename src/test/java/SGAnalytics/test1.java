package SGAnalytics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class test1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f= new FileInputStream(".\\src\\test\\resources\\MapData.xlsx");
		DataFormatter df = new DataFormatter();
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		HashMap<String, String> map= new HashMap<String, String>();
		for (int i = 1; i <= rowcount; i++) 
		{
			String key = df.formatCellValue(sh.getRow(i).getCell(0));
				String value = df.formatCellValue(sh.getRow(i).getCell(1));
				map.put(key, value);
		}

		for (Entry<String, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+":"+e.getValue());

		}
	}

}

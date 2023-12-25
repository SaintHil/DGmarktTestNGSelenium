package com.dgmarkt.test;

import com.dgmarkt.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;

public class excelTest extends TestBase{

    @DataProvider
    public Object[][] userData(){
        ExcelUtil testData=new ExcelUtil("src/test/resources/RegisterNegativeTest.xlsx","Sayfa1");
        return testData.getDataArrayWithoutFirstRow();
    }
}

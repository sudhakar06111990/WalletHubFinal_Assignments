package helper;
import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
public class Properties1 {

public static String helperProperty(String paramter1) throws Exception{  
    FileReader reader=new FileReader("resources//testdata.properties");  
    Properties p1=new Properties();  
    p1.load(reader);       
    return p1.getProperty(paramter1);
}
}

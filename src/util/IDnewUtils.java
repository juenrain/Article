package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IDnewUtils {
    /**
     * java生成流水号  
     * 14位时间戳 + 6位随机数 
     * @return String 
     */
   public static String getNumberForPK(){  
       String id="";  
       SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");  
       String temp = sf.format(new Date());  
       int random=(int) (Math.random());  
       id=temp+random;  
       return id;  
   } 
}

package util;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class IDnewUtils {
    /**
     * java生成流水号  
     * 14位时间戳 + 1位随机数 
     * @return String 
     */
   public static String getNumberForPK(){  
       String id="";  
       SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");  //yyyyMMddHHmmss
       String temp = sf.format(new Date());  
       
       int random=(int) (Math.random()*10);  
       id=temp+random;  
       return id;  
   } 
   
   /**
    * 
    * @Description:根据数据表格生成相对应得数字流水ID,由8位日期以及4位数字组成
    * @param: tablename:表名
    * @return:String
    * @author:Junerain
    * @throws SQLException 
    * @time:2017年7月19日下午3:08:53
    */
   public static String getFlowIDByTable(String tablename) throws SQLException{
	   String id="",temp_r = "",key = "";  
       SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
       String temp = sf.format(new Date());
       
       String sql = "select "+tablename+"_key from "+tablename+" order by "+tablename+"_key desc limit 0,1";
       Map<String,Object> map = DataBaseUtils.queryForMap(sql);
       if (map != null){
    	   key = StringUtils.toString(map.get(""+tablename+"_key"));
       }
//       System.out.println("之前的："+key);
       if(key.equals("") || key.length()==0 || key == null){
    	   int i = 1;
    	   temp_r = String.format("%04d", i);
       }else{
    	   String temp0 = key.substring(0,8);
    	   String temp_r0 = key.substring(8,key.length());
    	   if(temp.equals(temp0)){
    		   temp_r = String.format("%04d", Integer.parseInt(temp_r0) + 1);
    	   }else{
    		   int i = 1;
        	   temp_r = String.format("%04d", i);
    	   }
       }
       id = temp + temp_r;
//       System.out.println("之后的："+id);
	   return id;
   }
   /**
    * 
    * @Description:根据数据表格生成相对应得数字流水ID,由8位日期以及自定义的n位数字组成
    * @param: num:自定义位数,tablename:表名
    * @return:String 
    * @author:Junerain
    * @throws SQLException 
    * @time:2017年7月19日下午3:15:04
    */
   public static String getFlowIDByTable(String tablename,int num) throws SQLException{
	   String n = String.valueOf(num);
	   String id="",temp_r = "",key = "";  
       SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
       String temp = sf.format(new Date());
       
       String sql = "select "+tablename+"_key from "+tablename+" order by "+tablename+"_key desc limit 0,1";
       Map<String,Object> map = DataBaseUtils.queryForMap(sql);
       if (map != null){
    	   key = StringUtils.toString(map.get(""+tablename+"_key"));
       }
//       System.out.println("之前的："+key);
       if(key.equals("") || key.length()==0 || key == null){
    	   int i = 1;
    	   temp_r = String.format("%0"+n+"d", i);
       }else{
    	   String temp0 = key.substring(0,8);
    	   String temp_r0 = key.substring(8,key.length());
    	   if(temp.equals(temp0)){
    		   temp_r = String.format("%0"+n+"d", Integer.parseInt(temp_r0) + 1);
    	   }else{
    		   int i = 1;
        	   temp_r = String.format("%0"+n+"d", i);
    	   }
       }
       id = temp + temp_r;
//       System.out.println("之后的："+id);
	   return id;
   }
}

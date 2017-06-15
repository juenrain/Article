package test;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.junit.Test;

import bean.userbean;
import util.DataBaseUtils;
import util.IDnewUtils;


/**
 * 读取Properties文件测试类
 * @author Junerain
 *
 */
public class TestProperties {
	public static void main(String args[]) throws SQLException{
//		readproperties();
		
//		//测试数据库连接
//	    DataBaseUtils.config("jdbc.properties");
//	    Connection conn = DataBaseUtils.getConnection();
//	    System.out.println(conn);
		
//	    try {
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
//	    DataBaseUtils.closeConnection(conn,null,null);
//	    boolean a = DataBaseUtils.validate(conn);
//	    System.out.println(a);
	    String id = UUID.randomUUID() + "";
	    id = IDnewUtils.getNumberForPK();
	    System.out.println(id);
	    //插入语句
//	    String createTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//	    String inssql = "INSERT INTO t_user(id,username,password,sex,create_time,is_delete,address,telephone) "
//	    		   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//	    DataBaseUtils.wysql(inssql, id,"张三",123456,0,createTime,0,"保密","保密");
	    //删除语句
//	    String delsql = "DELETE FROM t_user WHERE username = '张三'";
//	    DataBaseUtils.wysql(delsql);
	    //查询语句
	    String quesql = "SELECT * FROM t_user";
	    List<Map<String,Object>> list = DataBaseUtils.queryForList(quesql);
		Map<String,Object> map = DataBaseUtils.queryForMap(quesql);
	    System.out.println("这是list的:"+list);
	    System.out.println("这是map的:"+map);
	    //测试querybean
	    userbean user = DataBaseUtils.queryForBean("select * from t_user  limit 1", userbean.class);
	    System.out.println(user);
	}
	
	public static void readproperties(){
		InputStream inputStream =  TestProperties.class.getClassLoader().getResourceAsStream("jdbc.properties");
//		FileInputStream in = new FileInputStream("jdbc.properties");
		Properties p = new Properties();
		try {
		    p.load(inputStream);
		    System.out.println(p);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		System.out.println(p.getProperty("db.username"));
		System.out.println(p.getProperty("db.password"));
		System.out.println(p.getProperty("db.dataBaseName"));
	}
}

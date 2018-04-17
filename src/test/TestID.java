package test;

import java.sql.SQLException;

import org.junit.Test;

import util.IDnewUtils;
import util.StringUtils;

public class TestID {
	@Test
	public void testIdCreate(){
		String id = IDnewUtils.getNumberForPK();
//		System.out.println(id);
	}
	
	@Test
	public void testUp() throws SQLException{
		IDnewUtils.getFlowIDByTable("t_article");//t_test_id
		Object i = null;
//		String hehe = StringUtils.toString(i);
//		System.out.println(hehe);
		int j = 1;
 	   	String temp_r = String.format("%05d", j);
 	   	System.out.println(temp_r);
	}
}

package service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import util.DataBaseUtils;
import util.IDnewUtils;

@Controller
public class SignupService {
	@RequestMapping("/signup_saveinfo")
	public void saveSignupInfo(HttpServletRequest req,HttpServletResponse res) throws IOException, SQLException{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String telephone = req.getParameter("telephone");
		String id = IDnewUtils.getFlowIDByTable("t_user");
		String curtime = df.format(new Date());
		String inssql = "insert into t_user(t_user_key,username,password,email,sex,create_time,"
				+ "is_delete,address,telephone) values(?,?,?,?,?,?,?,?,?)";
		String msg = DataBaseUtils.wysql(inssql, id,username,password,email,"1",curtime,"0","保密",telephone);
		res.getWriter().write(msg);
	}
	
	
}

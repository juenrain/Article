package service;

import util.DataBaseUtils;
import bean.userbean;

/**
 * 用户登录的服务类
 * @author junerain
 *
 */
public class LoginService {
    
    public static userbean getUser(String username){
        String sql = "select * from t_user where username = ?";
        userbean user = DataBaseUtils.queryForBean(sql, userbean.class, username);
        if(user == null){
            return null;
        }
        //System.out.println(user);
        return user;
    }
    
}

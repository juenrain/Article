package bean;

import annotation.Column;
import annotation.Table;

/**
 * 
 * @author Junerain
 *
 */
@Table(tableName = "t_user")
public class userbean {
	@Column(type = "varchar(100)" ,field = "t_user_key" ,primaryKey = true ,defaultNull = false)
	private String t_user_key; //主键

	@Column(type = "VARCHAR(20)", field = "username")
	private String username;  //用户名

	@Column(type = "VARCHAR(20)", field = "password")
	private String password;  //密码

	@Column(type = "VARCHAR(60)", field = "headerPic")
	private String headerPic; //头像

	@Column(type = "VARCHAR(60)", field = "email")
	private String email;     //电子邮箱

	@Column(type = "VARCHAR(2)", field = "sex")
	private Integer sex;      //性别 0男 1女 3保密

	@Column(type = "datetime", field = "create_time")
	private String create_time;//创建时间

	@Column(type = "timestamp", field = "update_time")
	private String update_time;//最后更新时间

	@Column(type = "int(1)", field = "is_delete")
	private Integer is_delete; // 删除状态  0未删除  1删除

	@Column(type = "VARCHAR(200)", field = "address")
	private String address;   //地址

	@Column(type = "VARCHAR(15)", field = "telephone")
	private String telephone; //电话
	
	public String getT_user_key() {
		return t_user_key;
	}
	
	public void setT_user_key(String t_user_key) {
		this.t_user_key = t_user_key;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getHeaderPic() {
		return headerPic;
	}
	
	public void setHeaderPic(String headerPic) {
		this.headerPic = headerPic;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getMale() {
		return sex;
	}
	
	public void setMale(Integer male) {
		this.sex = male;
	}
	
	public String getCreate_time() {
		return create_time;
	}
	
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public String getUpdate_time() {
		return update_time;
	}
	
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	
	public Integer getIs_delete() {
		return is_delete;
	}
	
	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}

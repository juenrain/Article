package bean;

import java.util.Date;

import annotation.Column;
import annotation.Table;

@Table(tableName = "t_article")
public class Article {
    
    @Column(field = "t_article_key" , type = "varchar(100)" , primaryKey = true,defaultNull = false)
    private String t_article_key; //主键
    
    @Column(field = "header" , type = "varchar(100)")
    private String header; //标题
    
    @Column(field = "name" , type = "varchar(60)")
    private String name; //文章名称
    
    @Column(field = "content" , type = "text")
    private String content; //文章内容
     
    @Column(field = "author" , type = "varchar(30)")
    private String author; //作者
    
    @Column(field = "description" , type = "varchar(100)")
    private String description; //概要
    
    @Column(field = "is_published" , type = "int(1)")
    private Integer is_published; //是否发布 0 未发布 1 发布
    
    @Column(field = "is_delete" , type = "int(1)")
    private Integer is_delete;      //是否删除   0 未删除 1 已删除
    
    @Column(field = "create_time" , type = "datetime")
    private Date create_time;//创建时间
    
	@Column(field = "update_time" , type = "timestamp" , defaultNull = false)
    private Date update_time;//最后更新时间
    
    @Column(field = "user_id" , type = "varchar(100)" , defaultNull = false)
    private String user_id;//作者id
    
    @Column(field = "category_id" , type = "int(2)" , defaultNull = false)
    private Integer category_id;//分类ID

	@Override
	public String toString() {
		return "Article [t_article_key=" + t_article_key + ", header=" + header + ", name=" + name
				+ ", content=" + content + ", author=" + author
				+ ", description=" + description + ", isPublished="
				+ is_published + ", isDelete=" + is_delete + ", createTime="
				+ create_time + ", updateTime=" + update_time + ", userId="
				+ user_id + ", categoryId=" + category_id + ", toString()="
				+ super.toString() + "]";
	}

	public String getT_article_key() {
		return t_article_key;
	}

	public void setT_article_key(String t_article_key) {
		this.t_article_key = t_article_key;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIs_published() {
		return is_published;
	}

	public void setIs_published(Integer is_published) {
		this.is_published = is_published;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

    public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

    
}
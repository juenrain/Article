package test;

import java.util.List;

import bean.Article;
import bean.userbean;
import service.ArticleService;
import util.TableUtils;

/**
 * 创建SQL脚本的测试类
 * @author Junerain
 *
 */
public class TestMain {
	public static void main(String[] args) {
//        String sql1 = TableUtils.getCreateTableSQl(userbean.class);
//        System.out.println(sql1);
//        String sql2 = TableUtils.getCreateTableSQl(Article.class);
//        System.out.println(sql2);
        //测试
        ArticleService ArticleService = new ArticleService();
        List list = ArticleService.getArticlesByCategoryId(2,0,10);
        System.out.println(list);
    }
}

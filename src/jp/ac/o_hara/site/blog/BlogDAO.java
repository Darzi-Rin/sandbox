package jp.ac.o_hara.site.blog;

import jp.ac.o_hara.site.SimpleDAO;

public class BlogDAO extends SimpleDAO {
	private static BlogDAO dao = new BlogDAO();
	
	private BlogDAO() {
	}
    
	public static BlogDAO getInstanse() {
		return dao;
	}
}

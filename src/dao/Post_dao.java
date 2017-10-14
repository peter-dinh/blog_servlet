package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import dto.Post;
import web_app.ConnectDb;

public class Post_dao {

	private Post set_post(ResultSet rs) throws SQLException {
		Post item = new Post();
		item.setId_Post(rs.getInt("id_post"));
		item.setTitle(rs.getString("title"));
		item.setUnsigned_Title(rs.getString("unsigned_title"));
		item.setExcerpt(rs.getString("excerpt"));
		item.setUrl_Image(rs.getString("url_image"));
		item.setDate(rs.getDate("date"));
		item.setId_User(rs.getInt("id_user"));
		item.setContent(rs.getString("content"));
		item.setId_Type(rs.getInt("id_type"));
		item.setView(rs.getInt("view"));
		item.setHighlights(rs.getBoolean("highlights"));
		item.setShow(rs.getBoolean("public"));
		return item;
	}
	
	
	public ArrayList<Post> List_post() throws SQLException{
		ConnectDb.get_connect();
		String query = "select  * from post";
		Statement st = (Statement) ConnectDb.con.createStatement();
		ResultSet rs = st.executeQuery(query);
		ArrayList<Post> list_post = new ArrayList<>();
		while(rs.next()) {
			Post item = this.set_post(rs);
			list_post.add(item);
		}
		
		return list_post;
	}
	
	
	public ArrayList<Post> Post_popular() throws SQLException{
		ConnectDb.get_connect();
		String query = "select  * from post order by view desc";
		Statement st = (Statement) ConnectDb.con.createStatement();
		ResultSet rs = st.executeQuery(query);
		ArrayList<Post> post_popular = new ArrayList<>();
		while(rs.next()) {
			Post item = this.set_post(rs);
			post_popular.add(item);
		}
		
		return post_popular;
	}
	
	
	
	public ArrayList<Post> Post_important() throws SQLException{
		ConnectDb.get_connect();
		String query = "select  * from post where highlights=1 order by date desc";
		Statement st = (Statement) ConnectDb.con.createStatement();
		ResultSet rs = st.executeQuery(query);
		ArrayList<Post> post_important = new ArrayList<>();
		while(rs.next()) {
			Post item = this.set_post(rs);
			post_important.add(item);
		}
		
		return post_important;
	}
	
	
	
	public static void main(String [] agrs) throws SQLException {
		Post_dao dao = new Post_dao();
    	for(Post item : dao.List_post()){
    		System.out.print(item.getTitle());
    	}
	}
}

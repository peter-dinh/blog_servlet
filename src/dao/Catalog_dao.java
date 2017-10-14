package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import dto.Catalog;
import web_app.ConnectDb;


public class Catalog_dao {

	public  ArrayList<Catalog> Get_List_Catalog () throws SQLException{
		Connection con = ConnectDb.get_connect();
		String query = "select * from category";
		Statement ps = (Statement) con.createStatement();
		ResultSet rs = ps.executeQuery(query);
		ArrayList<Catalog> list_catalog = new ArrayList<>();
		while(rs.next()) {
			Catalog item = new Catalog();
			item.setId_Catalog(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setUnsigned_Name(rs.getString("unsigned_name"));
			item.setSort_Order(rs.getInt("sort_order"));
			item.setShow(rs.getBoolean("show"));
			list_catalog.add(item);
		}
		return list_catalog;
	}

}

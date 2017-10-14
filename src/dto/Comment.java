package dto;

import java.util.Date;

public class Comment {

	private int Id_Comment;
	private String Name;
	private String Email;
	private String Website;
	private String Content;
	private Date Date;
	private int Id_Post;
	private boolean See;
	
	public int getId_Comment() {
		return Id_Comment;
	}
	public void setId_Comment(int id_Comment) {
		Id_Comment = id_Comment;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public int getId_Post() {
		return Id_Post;
	}
	public void setId_Post(int id_Post) {
		Id_Post = id_Post;
	}
	public boolean isSee() {
		return See;
	}
	public void setSee(boolean see) {
		See = see;
	}
}

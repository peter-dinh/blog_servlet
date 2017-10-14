package dto;

import java.util.Date;
public class Post {
	
	private int Id_Post;
	private String Title;
	private String Unsigned_Title;
	private String Excerpt;
	private String Url_Image;
	private Date Date;
	private int Id_User;
	private String Content;
	private int Id_Type;
	private int View;
	private boolean highlights;
	private boolean show;
	
	
	
	
	
	
	
	public int getId_Post() {
		return Id_Post;
	}
	public void setId_Post(int id_Post) {
		Id_Post = id_Post;
	}
	
	
	public String getUnsigned_Title() {
		return Unsigned_Title;
	}
	public void setUnsigned_Title(String unsigned_Title) {
		Unsigned_Title = unsigned_Title;
	}
	
	
	public String getUrl_Image() {
		return Url_Image;
	}
	public void setUrl_Image(String url_Image) {
		Url_Image = url_Image;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getExcerpt() {
		return Excerpt;
	}
	public void setExcerpt(String excerpt) {
		Excerpt = excerpt;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getId_User() {
		return Id_User;
	}
	public void setId_User(int id_User) {
		Id_User = id_User;
	}
	public int getId_Type() {
		return Id_Type;
	}
	public void setId_Type(int id_Type) {
		Id_Type = id_Type;
	}
	public boolean isHighlights() {
		return highlights;
	}
	public void setHighlights(boolean highlights) {
		this.highlights = highlights;
	}
	public int getView() {
		return View;
	}
	public void setView(int view) {
		View = view;
	}
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
}

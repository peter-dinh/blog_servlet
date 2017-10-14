package dto;

public class Catalog {
	private int Id_Catalog;
	private String Name;
	private String Unsigned_Name;
	private int Sort_Order;
	private boolean Show;
	
	
	public int getId_Catalog() {
		return Id_Catalog;
	}
	public void setId_Catalog(int id_catalog) {
		this.Id_Catalog = id_catalog;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUnsigned_Name() {
		return Unsigned_Name;
	}
	public void setUnsigned_Name(String unsigned_Name) {
		Unsigned_Name = unsigned_Name;
	}
	public int getSort_Order() {
		return Sort_Order;
	}
	public void setSort_Order(int sort_Order) {
		Sort_Order = sort_Order;
	}
	public boolean isShow() {
		return Show;
	}
	public void setShow(boolean show) {
		Show = show;
	}
}

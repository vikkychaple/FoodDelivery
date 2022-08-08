package cloudkitchen.application.models;

public class MenuItem {
	private Integer menuItemId;
	private String menuItemName;
	private Double menuItemPrice;
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuItem(Integer menuItemId, String menuItemName, Double menuItemPrice) {
		super();
		this.menuItemId = menuItemId;
		this.menuItemName = menuItemName;
		this.menuItemPrice = menuItemPrice;
	}
	public Integer getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(Integer menuItemId) {
		this.menuItemId = menuItemId;
	}
	public String getMenuItemName() {
		return menuItemName;
	}
	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}
	public Double getMenuItemPrice() {
		return menuItemPrice;
	}
	public void setMenuItemPrice(Double menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}
	@Override
	public String toString() {
		return "MenuItem [menuItemId=" + menuItemId + ", menuItemName=" + menuItemName + ", menuItemPrice="
				+ menuItemPrice + "]";
	}
	
}

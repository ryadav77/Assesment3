package moduleShop;

public class Item {
	private double cost;
	private String code;
	private int quantity;
	private String name;
	public Item(double cost, String code, int quantity, String name) {
		super();
		this.cost = cost;
		this.code = code;
		this.quantity = quantity;
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

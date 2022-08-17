package Entity;

import java.util.Date;

public class Product {

	private String id;
	private Date dayInsert;
	private String name;
	private int qualtity;
	private Date Exprivate;
	private Double price;
	private Category category;


	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String id, Date dayInsert, String name, int qualtity, Date exprivate,
			Category category, Double price) {
		super();
		this.id = id;
		this.dayInsert = dayInsert;
		this.name = name;
		this.qualtity = qualtity;
		Exprivate = exprivate;
		this.category = category;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDayInsert() {
		return dayInsert;
	}
	public void setDayInsert(Date dayInsert) {
		this.dayInsert = dayInsert;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQualtity() {
		return qualtity;
	}
	public void setQualtity(int i) {
		this.qualtity = i;
	}
	public Date getExprivate() {
		return Exprivate;
	}
	public void setExprivate(Date exprivate) {
		Exprivate = exprivate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", "
				+ "dayInsert=" + dayInsert + ", "
						+ "name=" + name + ", "
								+ "qualtity=" + qualtity
				+ ", Exprivate=" + Exprivate + ","
						+ " price=" + price + ", "
								+ "category=" + category + "]";
	}
	
	
}
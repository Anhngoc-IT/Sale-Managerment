package Entity;

public class Category {
	
	private String name;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String nameCategory) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}
}

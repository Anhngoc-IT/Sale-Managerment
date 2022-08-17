package Interface;

public interface IProduct {

	void addProduct();

	boolean deleteProduct(String name);

	boolean editProduct(String name);

	void viewProduct();

	boolean searchByName(String name);

}
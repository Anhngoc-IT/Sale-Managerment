package Interface;

public interface IAction {
	
	Object add();
	boolean edit(String id);
	boolean delete(String id);
	void searchById(String id);
	void viewAll();

}

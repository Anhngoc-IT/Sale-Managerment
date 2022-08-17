package Interface;

public interface IOfficer {

	void addOfficer();

	boolean editOfficer(String id);

	boolean deleteOfficer(String id);

	void viewOfficer();

	boolean searchById(String id);

}
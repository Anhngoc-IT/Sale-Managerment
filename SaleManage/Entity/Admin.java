package Entity;

public class Admin extends Officer {

	private String task;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	public void showInfor() {
		throw new UnsupportedOperationException();
	}

}
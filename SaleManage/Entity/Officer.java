package Entity;

public class Officer {

	private String id;
	private int age;
	private String fullname;
	private String email;
	private String phone;
	private String address;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void showInfor() {
		// TODO - implement Officer.showInfor
		throw new UnsupportedOperationException();
	}

}
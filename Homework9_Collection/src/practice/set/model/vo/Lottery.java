package practice.set.model.vo;

import java.util.Objects;

public class Lottery {

	private String name;
	private String phone;
	public Lottery() {
		// TODO Auto-generated constructor stub
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery l=(Lottery)obj;
			if(this.name.equals(l.name)
					&&this.phone.equals(l.phone)) {
			return true;	
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "\nLottery [name=" + name + ", phone=" + phone + "]";
	}

	
	
}

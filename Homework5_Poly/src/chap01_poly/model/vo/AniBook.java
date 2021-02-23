package chap01_poly.model.vo;

public class AniBook extends Book{

	private int accessAge;
	
	public AniBook() {
		// TODO Auto-generated constructor stub
	}
	public AniBook(String title,String author, String publisher, int accessAge) {
		super(title,author,publisher);
		this.accessAge = accessAge;
	}
	//get/set
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	//¿Á¡§¿«
	@Override
	public String toString() {
		return "AniBook [getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor() + ", getPublisher()="
				+ getPublisher() + ", accessAge=" + accessAge + "]";}
}

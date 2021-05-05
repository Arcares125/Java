
public class Book extends Item{


	String author;
	String category;
	Integer page;
	
	public Book(String name, double price, String type, String author, String category, Integer page) {
		// TODO Auto-generated constructor stub
		super(name, price, type);
		this.author=author;
		this.category=category;
		this.page=page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
}

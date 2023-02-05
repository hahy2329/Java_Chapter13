package reducepratice;

import java.util.ArrayList;

class Book{
	private String name;
	private int price;
	
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}


public class LibraryTest {

	public static void main(String[] args) {
		Book book1 = new Book("자바",25000);
		Book book2 = new Book("파이썬",15000);
		Book book3 = new Book("안드로이드",30000);
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		int sum = bookList.stream().mapToInt(s -> s.getPrice()).sum();
		System.out.println("모든 책의 합: " + sum);
		
		bookList.stream().filter(c -> c.getPrice()>=20000).map(m->m.getName()).forEach(s->System.out.println(s));
		
	}

}

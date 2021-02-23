package list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.library.model.vo.Book;

public class BookController {
	
	List<Book> list=new ArrayList<Book>();
	
	public BookController() {
		System.out.println("==== 도서 전체 조회 ====");
		list.add(new Book("자바의 정석","남궁 성","기타",20000));
		list.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		list.add(new Book("대화의 기술","강보람","인문",17500));
		list.add(new Book("암 정복기","박신우","의료",21000));		
	}
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public List<Book> selectList() {
		return list;
	}
	public List<Book> searchBook(String keyword) {
		List<Book> searchList=new ArrayList<Book>();
		for(Book bk : list) {
			if(bk.getTitle().contains(keyword)) {
				searchList.add(bk);
			}
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook=null;
		Book search=new Book(title, author, "",1);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(search)) {
				removeBook=list.get(i);
				list.remove(i);
			}
		}
		return removeBook;
	}
	public int ascBook() {
		try {
		Collections.sort(list);
		}catch(Exception e) {
		return -1;
		}
	return -1;
}
}
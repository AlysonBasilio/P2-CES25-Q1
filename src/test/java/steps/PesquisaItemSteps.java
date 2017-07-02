package steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import Model.Book;
import cucumber.api.java.en.*;

public class PesquisaItemSteps {
	private Map<String, Book> bookList;
	private List<Book> result;
	
	@Given("^a sort of books$")
	public void sort_of_books(List<Book> books) throws Throwable{
		bookList = new HashMap<String, Book>();
		for(Book b:books){
			bookList.put(b.getName(), b);
		}
	}
	
	@When("^a costumer searches for a book with (.*?) at it name$")
	public void costumer_searches(String n) throws Throwable{
		result = new ArrayList<Book>();
		for(String nome: bookList.keySet()){
			Book l = bookList.get(nome);
			if(l.getName().toLowerCase().contains(n.toLowerCase()) || l.getDescription().toLowerCase().contains(n.toLowerCase())){
				result.add(l);
				System.out.println(l.getName().toLowerCase()+ " "+l.getDescription().toLowerCase()+" "+nome.toLowerCase());
				System.out.println(l.getName().toLowerCase().indexOf(nome.toLowerCase()));
			}
		}
	}

	@Then("^(\\d+) books must return as a result$")
	public void number_books(int expected) throws Throwable{
		assertThat(result.size(),is(expected));
	}
	
	@And("^book1 must have the name (.*?)$")
	public void book1(String expected_name) throws Throwable{
		assertThat(result.get(0).getName(),is(expected_name));
	}
	
	@And("^book2 must have the name (.*?)$")
	public void book2(String expected_name) throws Throwable{
		assertThat(result.get(1).getName(),is(expected_name));
	}
}

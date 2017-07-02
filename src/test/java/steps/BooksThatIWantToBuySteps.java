package steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import Model.Book;
import Model.Costumer;
import cucumber.api.java.en.*;

public class BooksThatIWantToBuySteps {
	private Book book;
	private Costumer costumer;
	
	@Given("^a book named (.*?) with description (.*?) qtd (\\d+) and value (\\d+)$")
	public void get_book(String n, String d, int q, float v) throws Throwable{
		this.book = new Book(n,d,q,v);
	}
	
	@And("^a costumer named (.*?), a (.*?)$")
	public void get_costumer(String name, String type) throws Throwable{
		this.costumer = new Costumer(name, type);
	}
	
	@When("^this costumer decided to put this livro in his list$")
	public void add_book_to_costumer_list(String n) throws Throwable{
		this.costumer.addBookToBooksThatIWantToBuy(this.book);
	}

	@Then("^(\\d+) books must return as a result to this costumer's list$")
	public void number_books(int expected) throws Throwable{
		book = costumer.getBooksThatIWantToBuy().get(0);
		assertThat(costumer.getBooksThatIWantToBuy().size(),is(expected));
	}
	
	@And("^book3 must have the name (.*?)$")
	public void book2(String expected_name) throws Throwable{
		assertThat(book.getName(),is(expected_name));
	}
}

package Model;

import java.util.ArrayList;
import java.util.List;

public class Costumer {
	private String name;
	private String type;
	private int ID;
	private List<Book> booksThatIWantToBuy;
	
	public Costumer(String n, String t){
		this.name = n;
		this.type = t;
		this.ID = Control.CostumerBD.getNewID();
		this.booksThatIWantToBuy = new ArrayList<Book>();
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getID() {
		return ID;
	}
	public void addBookToBooksThatIWantToBuy(Book b){
		this.booksThatIWantToBuy.add(b);
	}
	public void removeBookAtBooksThatIWantToBuy(Book b){
		this.booksThatIWantToBuy.remove(b);
	}
	public List<Book> getBooksThatIWantToBuy(){
		return this.booksThatIWantToBuy;
	}
}

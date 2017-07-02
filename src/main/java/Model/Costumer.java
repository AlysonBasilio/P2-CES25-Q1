package Model;

public class Costumer {
	private String name;
	private String type;
	private int ID;
	public Costumer(String n, String t){
		this.name = n;
		this.type = t;
		ID = Control.CostumerBD.getNewID();
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
}

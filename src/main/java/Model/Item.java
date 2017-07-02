package Model;

public class Item {
	private String name;
	private String description;
	private int qtd;
	private float value;
	public Item(String n, String d, int q, float v){
		this.name = n;
		this.description = d;
		this.qtd = q;
		this.value = v;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
}

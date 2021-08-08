package cogent.tcvm.wrapper;

public class DrinkRow {

	private String name;
	private float cost;
	private int cupAmnt;
	

	public DrinkRow(String name, float cost, int cupAmnt) {
		super();
		this.name = name;
		this.cost = cost;
		this.cupAmnt = cupAmnt;
	}
	
	public DrinkRow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCupAmnt() {
		return cupAmnt;
	}

	public void setCupAmnt(int cupAmnt) {
		this.cupAmnt = cupAmnt;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}

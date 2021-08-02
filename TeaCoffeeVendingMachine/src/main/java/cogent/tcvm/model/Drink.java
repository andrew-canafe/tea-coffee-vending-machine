package cogent.tcvm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DRINK")
public class Drink {
	
	@Id
	@Column(name="DRINK_ID")
	private int drinkId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="COST")
	private float cost;

	public int getDrinkId() {
		return drinkId;
	}

	public void setDrinkId(int drinkId) {
		this.drinkId = drinkId;
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

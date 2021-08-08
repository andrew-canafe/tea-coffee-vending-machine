package cogent.tcvm.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DRINK")
public class Drink {

	@Id
	@Column(name = "DRINK_ID")
	private int drinkId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COST")
	private float cost;
	
	@OneToMany(mappedBy = "drinkIngredient.drink", cascade = CascadeType.ALL)
	Set<DrinkIngredient> drinkIngedients = new HashSet<DrinkIngredient>();

	public Drink() {
		super();
	}

	public Drink(int drinkId, String name, float cost, Set<DrinkIngredient> drinkIngedients) {
		super();
		this.drinkId = drinkId;
		this.name = name;
		this.cost = cost;
		this.drinkIngedients = drinkIngedients;
	}

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

	public Set<DrinkIngredient> getDrinkIngedients() {
		return drinkIngedients;
	}

	public void setDrinkIngedients(Set<DrinkIngredient> drinkIngedients) {
		this.drinkIngedients = drinkIngedients;
	}

	@Override
	public String toString() {
		return "Drink [drinkId=" + drinkId + ", name=" + name + ", cost=" + cost + ", drinkIngedients="
				+ drinkIngedients + "]";
	}

}

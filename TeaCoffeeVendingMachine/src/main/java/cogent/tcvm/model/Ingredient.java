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
@Table(name = "INGREDIENT")
public class Ingredient {

	@Id
	@Column(name = "INGREDIENT_ID")
	private int ingredientId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "UNIT_TYPE")
	private String unitType;
	
	@OneToMany(mappedBy = "drinkIngredient.ingredient", cascade = CascadeType.ALL)
	private Set<DrinkIngredient> drinks = new HashSet<DrinkIngredient>();

	public Ingredient() {
		super();
	}

	public Ingredient(int ingredientId, String name, String unitType, Set<DrinkIngredient> drinks) {
		super();
		this.ingredientId = ingredientId;
		this.name = name;
		this.unitType = unitType;
		this.drinks = drinks;
	}

	public int getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public Set<DrinkIngredient> getDrinks() {
		return drinks;
	}

	public void setDrinks(Set<DrinkIngredient> drinks) {
		this.drinks = drinks;
	}

	@Override
	public String toString() {
		return "Ingredient [ingredientId=" + ingredientId + ", name=" + name + ", unitType=" + unitType + ", drinks="
				+ drinks + "]";
	}

}

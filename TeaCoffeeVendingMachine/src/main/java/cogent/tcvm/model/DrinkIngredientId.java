package cogent.tcvm.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class DrinkIngredientId implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "DRINK_ID")
	private Drink drink;

	@ManyToOne
	@JoinColumn(name = "INGREDIENT_ID")
	private Ingredient ingredient;

	public DrinkIngredientId() {
		super();
	}

	public DrinkIngredientId(Drink drink, Ingredient ingredient) {
		super();
		this.drink = drink;
		this.ingredient = ingredient;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
}

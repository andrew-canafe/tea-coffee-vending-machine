package cogent.tcvm.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DRINK_INGREDIENT")
public class DrinkIngredient {
	@JsonIgnore
	@EmbeddedId
	/*@JoinColumns({
		@JoinColumn(name = "DRINK_ID", referencedColumnName = "DRINK_ID"),
		@JoinColumn(name = "INGREDIENT_ID", referencedColumnName = "INGREDIENT_ID")
	})*/
	private DrinkIngredientId drinkIngredient;
	
	@Column(name = "QUANTITY")
	private float quantity;

	public DrinkIngredient() {
		super();
	}

	public DrinkIngredient(DrinkIngredientId drinkIngredient, float quantity) {
		super();
		this.drinkIngredient = drinkIngredient;
		this.quantity = quantity;
	}

	public DrinkIngredientId getDrinkIngredient() {
		return drinkIngredient;
	}

	public void setDrinkIngredient(DrinkIngredientId drinkIngredient) {
		this.drinkIngredient = drinkIngredient;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "DrinkIngredient [drinkIngredient=" + drinkIngredient + ", quantity=" + quantity + "]";
	}
	
}

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
	private DrinkIngredientId drinkIngredient;
	
	@Column(name = "UNIT_QUANTITY")
	private float unitQuantity;

	public DrinkIngredient() {
		super();
	}

	public DrinkIngredient(DrinkIngredientId drinkIngredient, float unitQuantity) {
		super();
		this.drinkIngredient = drinkIngredient;
		this.unitQuantity = unitQuantity;
	}

	public DrinkIngredientId getDrinkIngredient() {
		return drinkIngredient;
	}

	public void setDrinkIngredient(DrinkIngredientId drinkIngredient) {
		this.drinkIngredient = drinkIngredient;
	}

	public float getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(float unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	@Override
	public String toString() {
		return "DrinkIngredient [drinkIngredient=" + drinkIngredient + ", unitQuantity=" + unitQuantity + "]";
	}
	
}

package cogent.tcvm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	public Ingredient() {
		super();
	}

	public Ingredient(int ingredientId, String name, String unitType) {
		super();
		this.ingredientId = ingredientId;
		this.name = name;
		this.unitType = unitType;
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

	@Override
	public String toString() {
		return "Ingredient [ingredientId=" + ingredientId + ", name=" + name + ", unitType=" + unitType + "]";
	}

}

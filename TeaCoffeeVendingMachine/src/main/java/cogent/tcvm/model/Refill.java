package cogent.tcvm.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "REFILL")
public class Refill {

	@Id
	@Column(name = "REFILL_ID")
	private int refillId;

	@ManyToOne
	@JoinColumn(name = "INGREDIENT_ID")
	private Ingredient ingredient;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "UNIT_QUANTITY")
	private float unitQuantity;

	@JsonIgnore
	@Column(name = "DATE")
	private LocalDate date;

	public Refill() {
		super();
	}

	public Refill(int refillId, int quantity, float unitQuantity, LocalDate date, Ingredient ingredient) {
		super();
		this.refillId = refillId;
		this.quantity = quantity;
		this.unitQuantity = unitQuantity;
		this.date = date;
		this.ingredient = ingredient;
	}

	public int getRefillId() {
		return refillId;
	}

	public void setRefillId(int refillId) {
		this.refillId = refillId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(float unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "Refill [refillId=" + refillId + ", quantity=" + quantity + ", unitQuantity=" + unitQuantity + ", date="
				+ date + ", ingredient=" + ingredient + "]";
	}

}

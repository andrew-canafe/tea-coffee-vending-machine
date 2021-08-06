package cogent.tcvm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTAINER")
public class Container {

	@Id
	@Column(name = "CONTAINER_ID")
	private int containersId;

	@ManyToOne
	@JoinColumn(name = "INGREDIENT_ID")
	private Ingredient ingredient;

	@Column(name = "MAX_CAPACITY")
	private float maxCapacity;

	@Column(name = "AVAILABLE")
	private float available;

	public Container() {
		super();
	}

	public Container(int containersId, Ingredient ingredient, float maxCapacity, float available) {
		super();
		this.containersId = containersId;
		this.ingredient = ingredient;
		this.maxCapacity = maxCapacity;
		this.available = available;
	}

	public int getContainersId() {
		return containersId;
	}

	public void setContainersId(int containersId) {
		this.containersId = containersId;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public float getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(float maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public float getAvailable() {
		return available;
	}

	public void setAvailable(float available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Container [containersId=" + containersId + ", ingredient=" + ingredient + ", maxCapacity=" + maxCapacity
				+ ", available=" + available + "]";
	}

}

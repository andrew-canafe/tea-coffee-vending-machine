package cogent.tcvm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTAINERS")
public class Containers {
	
	@Id
	@Column(name="CONTAINERS_ID")
	private int containersId;
	
	@Column(name="TEA_CONTAINER")
	private float teaContainer;
	
	@Column(name="COFFEE_CONTAINER")
	private float coffeeContainer;
	
	@Column(name="SUGAR_CONTAINER")
	private float sugarContainer;
	
	@Column(name="WATER_CONTAINER")
	private float waterContainer;
	
	@Column(name="MILK_CONTAINER")
	private float milkContainer;

	public int getContainersId() {
		return containersId;
	}

	public void setContainersId(int containersId) {
		this.containersId = containersId;
	}

	public float getTeaContainer() {
		return teaContainer;
	}

	public void setTeaContainer(float teaContainer) {
		this.teaContainer = teaContainer;
	}

	public float getCoffeeContainer() {
		return coffeeContainer;
	}

	public void setCoffeeContainer(float coffeeContainer) {
		this.coffeeContainer = coffeeContainer;
	}

	public float getSugarContainer() {
		return sugarContainer;
	}

	public void setSugarContainer(float sugarContainer) {
		this.sugarContainer = sugarContainer;
	}

	public float getWaterContainer() {
		return waterContainer;
	}

	public void setWaterContainer(float waterContainer) {
		this.waterContainer = waterContainer;
	}

	public float getMilkContainer() {
		return milkContainer;
	}

	public void setMilkContainer(float milkContainer) {
		this.milkContainer = milkContainer;
	}
	
}

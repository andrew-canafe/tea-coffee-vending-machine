package cogent.tcvm.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REFILLS")
public class Refills {

	@Id
	@Column(name="REFILL_ID")
	private int refillId;
	
	@Column(name="TEA_REFILL")
	private int teaRefill;
	
	@Column(name="COFFEE_REFILL")
	private int coffeeRefill;
	
	@Column(name="SUGAR_REFILL")
	private int sugarRefill;
	
	@Column(name="WATER_REFILL")
	private int waterRefill;
	
	@Column(name="MILK_REFILL")
	private int milkRefill;
	
	@Column(name="DATE")
	private LocalDate date;

	public int getRefillId() {
		return refillId;
	}

	public void setRefillId(int refillId) {
		this.refillId = refillId;
	}

	public int getTeaRefill() {
		return teaRefill;
	}

	public void setTeaRefill(int teaRefill) {
		this.teaRefill = teaRefill;
	}

	public int getCoffeeRefill() {
		return coffeeRefill;
	}

	public void setCoffeeRefill(int coffeeRefill) {
		this.coffeeRefill = coffeeRefill;
	}

	public int getSugarRefill() {
		return sugarRefill;
	}

	public void setSugarRefill(int sugarRefill) {
		this.sugarRefill = sugarRefill;
	}

	public int getWaterRefill() {
		return waterRefill;
	}

	public void setWaterRefill(int waterRefill) {
		this.waterRefill = waterRefill;
	}

	public int getMilkRefill() {
		return milkRefill;
	}

	public void setMilkRefill(int milkRefill) {
		this.milkRefill = milkRefill;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Refills [refillId=" + refillId + ", teaRefill=" + teaRefill + ", coffeeRefill=" + coffeeRefill
				+ ", sugarRefill=" + sugarRefill + ", waterRefill=" + waterRefill + ", milkRefill=" + milkRefill
				+ ", date=" + date + "]";
	}

}

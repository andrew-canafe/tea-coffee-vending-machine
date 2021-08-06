package cogent.tcvm.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SALE")
public class Sale {

	@Id
	@Column(name="SALE_ID")
	private int saleId;
	
	@ManyToOne
	@JoinColumn(name="DRINK_ID")
	private Drink drinkId;
	
	@Column(name="NUMBER_OF_CUPS")
	private int numberOfCups;
	
	@Column(name="DATE")
	private LocalDate date;

	public Sale() {
		super();
	}

	public Sale(int saleId, Drink drinkId, int numberOfCups, LocalDate date) {
		super();
		this.saleId = saleId;
		this.drinkId = drinkId;
		this.numberOfCups = numberOfCups;
		this.date = date;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public Drink getDrinkId() {
		return drinkId;
	}

	public void setDrinkId(Drink drinkId) {
		this.drinkId = drinkId;
	}

	public int getNumberOfCups() {
		return numberOfCups;
	}

	public void setNumberOfCups(int numberOfCups) {
		this.numberOfCups = numberOfCups;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", drinkId=" + drinkId + ", numberOfCups=" + numberOfCups + ", date=" + date
				+ "]";
	}
	
}

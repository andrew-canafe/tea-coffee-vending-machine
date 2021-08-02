package cogent.tcvm.model;

import java.util.Date;

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
	private Date date;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}

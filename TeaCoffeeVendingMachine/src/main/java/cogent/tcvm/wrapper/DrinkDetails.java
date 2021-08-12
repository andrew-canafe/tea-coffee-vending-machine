package cogent.tcvm.wrapper;

import java.util.ArrayList;
import java.util.List;

import cogent.tcvm.model.Drink;

public class DrinkDetails {

	private List<DrinkRow> drinkRowList = new ArrayList<>();

	public DrinkDetails(List<Drink> drinkList) {
		super();
		for (Drink drink : drinkList) {
			String name = drink.getName();
			float cost = drink.getCost();

			this.drinkRowList.add(new DrinkRow(name, cost, 1));
		}
	}

	public DrinkDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<DrinkRow> getDrinkRowList() {
		return drinkRowList;
	}

	public void setDrinkRowList(List<DrinkRow> drinkRowList) {
		this.drinkRowList = drinkRowList;
	}

	@Override
	public String toString() {
		return "DrinkDetails [drinkRowList=" + drinkRowList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drinkRowList == null) ? 0 : drinkRowList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DrinkDetails other = (DrinkDetails) obj;
		if (drinkRowList == null) {
			if (other.drinkRowList != null)
				return false;
		} else if (!drinkRowList.equals(other.drinkRowList))
			return false;
		return true;
	}

}

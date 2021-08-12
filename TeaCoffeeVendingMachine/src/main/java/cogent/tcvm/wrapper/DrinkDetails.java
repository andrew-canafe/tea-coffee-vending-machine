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

			this.drinkRowList.add(new DrinkRow(name, cost, 0));
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

}

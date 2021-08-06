package cogent.tcvm.wrapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cogent.tcvm.model.Refill;

public class RefillDetails {
	
	private List<RefillRow> refillRowList;
	
	public RefillDetails() {
		super();
	}

	public RefillDetails(List<Refill> refillList) {
		super();
		
		refillRowList = new ArrayList<RefillRow>();
		Map<String, RefillRow> refillRowMap = new HashMap<String, RefillRow>();
		LocalDate today = LocalDate.now();
		
		for (Refill refill : refillList) {
			String name = refill.getIngredient().getName();
			int quantity = refill.getQuantity(); // Used for allDays and today
			float unitQuantity = refill.getUnitQuantity();
			String unitType = refill.getIngredient().getUnitType();
			
			if (refillRowMap.containsKey(name)) {
				RefillRow refillRowOld = refillRowMap.get(name);
				
				if (refill.getDate().equals(today)) {
					refillRowMap.put(name, new RefillRow(name,
							quantity+refillRowOld.getAllDays(),
							quantity+refillRowOld.getToday(),
							unitQuantity+refillRowOld.getUnitQuantity(),
							unitType));
				} else {
					refillRowMap.put(name, new RefillRow(name,
							quantity+refillRowOld.getAllDays(),
							refillRowOld.getToday(),
							unitQuantity+refillRowOld.getUnitQuantity(),
							unitType));
				}
			} else {
				if (refill.getDate().equals(today)) {
					refillRowMap.put(name, new RefillRow(
							name,
							quantity,
							quantity,
							unitQuantity,
							unitType));
				} else {
					refillRowMap.put(name, new RefillRow(name,
							quantity,
							0,
							unitQuantity,
							unitType));
				}
			}
		}
		
		this.refillRowList = new ArrayList<RefillRow>(refillRowMap.values()); // Convert hash map to list
	}

	public List<RefillRow> getRefillRowList() {
		return refillRowList;
	}

	public void setRefillRowList(List<RefillRow> refillRowList) {
		this.refillRowList = refillRowList;
	}

	@Override
	public String toString() {
		return "RefillDetails [refillRowList=" + refillRowList + "]";
	}
	
}

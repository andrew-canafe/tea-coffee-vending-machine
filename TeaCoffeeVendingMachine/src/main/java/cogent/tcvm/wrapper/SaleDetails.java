package cogent.tcvm.wrapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cogent.tcvm.model.Sale;

public class SaleDetails{
	
	private List<SaleRow> saleRowList = new ArrayList<>();
	
	public SaleDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleDetails(List<Sale> saleList) {
		super();
		
		Map<String, SaleRow> saleRowMap = new HashMap<String, SaleRow>();
		LocalDate today = LocalDate.now();
		for(Sale sale : saleList) {
			String name = sale.getDrink().getName();
			int numberOfCups = sale.getNumberOfCups();
			float cost = sale.getDrink().getCost();
			if(saleRowMap.containsKey(name)){
				float oldTotalCostAllDays =saleRowMap.get(name).getTotalCostAllDays();
				float oldTotalCostToday = saleRowMap.get(name).getTotalCostToday();
				int numberOfCupsTodayOld = saleRowMap.get(name).getNumberOfCupsToday();
				int numberOfCupsAllDaysOld = saleRowMap.get(name).getNumberOfCupsAllDays();
				if(sale.getDate().equals(today)) {
					saleRowMap.put(name, new SaleRow(name, oldTotalCostToday+(cost*numberOfCups), numberOfCups+numberOfCupsTodayOld, (cost*numberOfCups)+oldTotalCostAllDays, numberOfCups+numberOfCupsAllDaysOld));
				}else {
					saleRowMap.put(name, new SaleRow(name, oldTotalCostToday, numberOfCupsTodayOld, (cost*numberOfCups)+oldTotalCostAllDays, numberOfCups+numberOfCupsAllDaysOld));
				}
			}else {
				if(sale.getDate().equals(today)) {
					saleRowMap.put(name, new SaleRow(name, cost, numberOfCups,cost*numberOfCups,numberOfCups));
				}else {
					saleRowMap.put(name, new SaleRow(name,0,0,cost*numberOfCups,numberOfCups));
				}
			}
		}
		
		this.saleRowList = new ArrayList<SaleRow>(saleRowMap.values());
	}

	public List<SaleRow> getSaleRowList() {
		return saleRowList;
	}

	public void setSaleRowList(List<SaleRow> saleRowList) {
		this.saleRowList = saleRowList;
	}

	@Override
	public String toString() {
		return "SaleDetails [saleRowList=" + saleRowList + "]";
	}
	
}

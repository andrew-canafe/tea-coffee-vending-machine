package cogent.tcvm.wrapper;

public class SaleRow {
	
	private String name;
	private int numberOfCupsToday;
	private float totalCostToday;
	private float totalCostAllDays;
	private int numberOfCupsAllDays;
	
	public SaleRow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleRow(String name, float totalCostToday, int numberOfCupsToday, float totalCostAllDays, int numberOfCupsAllDays) {
		super();
		this.name = name;
		this.numberOfCupsToday = numberOfCupsToday;
		this.totalCostAllDays = totalCostAllDays;
		this.totalCostToday = totalCostToday;
		this.numberOfCupsAllDays = numberOfCupsAllDays;
	}

	public float getTotalCostToday() {
		return totalCostToday;
	}

	public void setTotalCostToday(float totalCostToday) {
		this.totalCostToday = totalCostToday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfCupsToday() {
		return numberOfCupsToday;
	}

	public void setNumberOfCupsToday(int numberOfCupsToday) {
		this.numberOfCupsToday = numberOfCupsToday;
	}
	
	public int getNumberOfCupsAllDays() {
		return numberOfCupsAllDays;
	}

	public void setNumberOfCupsAllDays(int numberOfCupsAllDays) {
		this.numberOfCupsAllDays = numberOfCupsAllDays;
	}

	public float getTotalCostAllDays() {
		return totalCostAllDays;
	}

	public void setTotalCostAllDays(float totalCostAllDays) {
		this.totalCostAllDays = totalCostAllDays;
	}
	
}

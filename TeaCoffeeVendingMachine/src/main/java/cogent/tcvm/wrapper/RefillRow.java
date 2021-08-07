package cogent.tcvm.wrapper;

public class RefillRow {

	private String name;
	private int allDays;
	private int today;
	private float unitQuantity;
	private String unitType;

	public RefillRow() {
		super();
	}

	public RefillRow(String name, int allDays, int today, float unitQuantity, String unitType) {
		super();
		this.name = name;
		this.allDays = allDays;
		this.today = today;
		this.unitQuantity = unitQuantity;
		this.unitType = unitType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAllDays() {
		return allDays;
	}

	public void setAllDays(int allDays) {
		this.allDays = allDays;
	}

	public int getToday() {
		return today;
	}

	public void setToday(int today) {
		this.today = today;
	}

	public float getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(float unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	@Override
	public String toString() {
		return "RefillRow [name=" + name + ", allDays=" + allDays + ", today=" + today + ", unitQuantity="
				+ unitQuantity + ", unitType=" + unitType + "]";
	}

}

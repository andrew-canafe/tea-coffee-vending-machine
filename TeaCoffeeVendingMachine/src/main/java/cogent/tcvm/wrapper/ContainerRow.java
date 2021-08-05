package cogent.tcvm.wrapper;

public class ContainerRow {

	private String name; // Container name
	private String unitType;
	private float maxCapacity;
	private float available;

	public ContainerRow() {
		super();
	}

	public ContainerRow(String name, String unitType, float maxCapacity, float available) {
		super();
		this.name = name;
		this.unitType = unitType;
		this.maxCapacity = maxCapacity;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public float getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(float maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public float getAvailable() {
		return available;
	}

	public void setAvailable(float available) {
		this.available = available;
	}

}

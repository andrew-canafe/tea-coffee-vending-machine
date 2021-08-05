package cogent.tcvm.wrapper;

public class ContainerRow {

	private String name; // Container name
	private String unitType;
	private float maxCapacity;
	private float available;

	public ContainerRow(String name, String unitType, float maxCapacity, float available) {
		super();
		this.name = name;
		this.unitType = unitType;
		this.maxCapacity = maxCapacity;
		this.available = available;
	}

}

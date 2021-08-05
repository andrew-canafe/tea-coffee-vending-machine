package cogent.tcvm.wrapper;

import java.util.ArrayList;
import java.util.List;

import cogent.tcvm.model.Container;

public class ContainerDetails {

	private List<ContainerRow> containerRowList = new ArrayList<ContainerRow>();

	public ContainerDetails() {
		super();
	}

	public ContainerDetails(List<Container> containerList) {
		for (Container container : containerList) {
			String name = container.getIngredient().getName();
			String unitType = container.getIngredient().getUnitType();
			float maxCapacity = container.getMaxCapacity();
			float available = container.getAvailable();

			this.containerRowList.add(new ContainerRow(name, unitType, maxCapacity, available));
		}
	}

	public List<ContainerRow> getContainerRowList() {
		return containerRowList;
	}

	public void setContainerRowList(List<ContainerRow> containerRowList) {
		this.containerRowList = containerRowList;
	}

	@Override
	public String toString() {
		return "ContainerDetails [containerRowList=" + containerRowList + "]";
	}

}
package Pojos;

public class SelectionStrategy {
	
	SelectionStrategyChoices selectionStrategyChoices;
	String vehicleName;
	public SelectionStrategyChoices getSelectionStrategyChoices() {
		return selectionStrategyChoices;
	}
	public void setSelectionStrategyChoices(SelectionStrategyChoices selectionStrategyChoices) {
		this.selectionStrategyChoices = selectionStrategyChoices;
	}
	public SelectionStrategy(SelectionStrategyChoices selectionStrategyChoices, String vehicleName) {
		this.selectionStrategyChoices = selectionStrategyChoices;
		this.vehicleName = vehicleName;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}

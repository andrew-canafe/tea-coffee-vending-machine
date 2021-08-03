package cogent.tcvm.model;

public class RefillDetails {
	
	private Refills allDays;
	private Refills today;
	
	public RefillDetails() {
		super();
	}

	public RefillDetails(Refills allDays, Refills today) {
		super();
		this.allDays = allDays;
		this.today = today;
	}

	public Refills getAllDays() {
		return allDays;
	}

	public void setAllDays(Refills allDays) {
		this.allDays = allDays;
	}

	public Refills getToday() {
		return today;
	}

	public void setToday(Refills today) {
		this.today = today;
	}
	
}

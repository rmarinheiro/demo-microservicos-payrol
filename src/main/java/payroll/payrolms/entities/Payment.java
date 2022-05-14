package payroll.payrolms.entities;

import java.io.Serializable;

public class Payment implements Serializable {
	
	private String name;
	
	private Double dailyIncome;
	
	private Integer daiys;
	
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(String name, Double dailyIncome, Integer daiys) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.daiys = daiys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDaiys() {
		return daiys;
	}

	public void setDaiys(Integer daiys) {
		this.daiys = daiys;
	}

	public Double getTotal() {
		return daiys*dailyIncome;
	}

	
	
	

}

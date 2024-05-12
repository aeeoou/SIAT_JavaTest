package 서형종.hr.java.com.my.hr.domain;

import java.time.LocalDate;

// Domain = 데이터
public class Laborer {
	private static int nextId = 1;
	public int laborerId;
	public String laborerName;
	public LocalDate hireDate;
	
	public Laborer(String laborerName, LocalDate hireDate) {
		this.laborerId = nextId++;
		this.laborerName = laborerName;
		this.hireDate = hireDate;
	}

	public int getLaborerId() {
		return laborerId;
	}

	public String getLaborerName() {
		return laborerName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setLaborerName(String laborerName) {
		this.laborerName = laborerName;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
}

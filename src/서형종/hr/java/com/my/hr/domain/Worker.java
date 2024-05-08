package 서형종.hr.java.com.my.hr.domain;

import java.time.LocalDate;

// Domain = 데이터
public class Worker {
	public int workerId;
	public String workerName;
	public LocalDate hireDate;
	
	public void Worker(int workerId) {
		
	}
	
	public void Worker(String workerNmae) {
		
	}
	
	public void Worker(LocalDate hireDate) {
		
	}

	public int getWorkerId() {
		return workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
}

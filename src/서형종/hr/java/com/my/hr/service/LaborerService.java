package 서형종.hr.java.com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import 서형종.hr.java.com.my.hr.domain.Laborer;

public interface LaborerService {
	List<Laborer> getAllLaborers();
	Laborer getLaborerById(int laborerId);
	public void addLaborer(String laborerName, LocalDate hireDate);
	public void updateLaborer(int laborerId, String laborerName, LocalDate hireDate);
	public void deleteLaborer(int laborerId);
}

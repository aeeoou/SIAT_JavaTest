package 서형종.hr.java.com.my.hr.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import 서형종.hr.java.com.my.hr.domain.Laborer;

public class LaborerDaoImpl implements LaborerDao {
	private List<Laborer> laborers;
	
	public LaborerDaoImpl() {
		this.laborers = new ArrayList<>();
	}
	
	@Override
	public List<Laborer> getAllLaborers(){
		return laborers;
	}
	
	@Override
	public Laborer getLaborerById(int laborerId) {
		for(Laborer laborer : laborers) {
			if(laborer.getLaborerId() == laborerId) {
				return laborer;
			}
		}
		return null;
	}
	
	@Override
	public void addLaborer(Laborer laborer) {
		laborers.add(laborer);
	}
	
	@Override
	public void updateLaborer(int laborerId, String laborerName, LocalDate hireDate) {
		Laborer laborer = getLaborerById(laborerId);
		if(laborer != null) {
			laborer.setLaborerName(laborerName);
			laborer.setHireDate(hireDate);
		}
	}
	
	@Override
	public void deleteLaborer(int laborerId) {
		laborers.removeIf(laborer -> laborer.getLaborerId() == laborerId);
	}
}

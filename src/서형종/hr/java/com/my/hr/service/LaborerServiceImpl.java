package 서형종.hr.java.com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import 서형종.hr.java.com.my.hr.dao.LaborerDao;
import 서형종.hr.java.com.my.hr.domain.Laborer;

public class LaborerServiceImpl implements LaborerService {
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl(LaborerDao laborerDao) {
		this.laborerDao = laborerDao;
	}
	
	@Override
	public List<Laborer> getAllLaborers(){
		return laborerDao.getAllLaborers();
	}
	
	@Override
	public Laborer getLaborerById(int laborerId) {
		return laborerDao.getLaborerById(laborerId);
	}
	
	@Override
	public void addLaborer(String laborerName, LocalDate hireDate) {
		laborerDao.addLaborer(new Laborer(laborerName, hireDate));
	}
	
	@Override
	public void updateLaborer(int laborerId, String laborerName, LocalDate hireDate) {
		laborerDao.updateLaborer(laborerId, laborerName, hireDate);
	}
	
	@Override
	public void deleteLaborer(int laborerId) {
		laborerDao.deleteLaborer(laborerId);
	}
}

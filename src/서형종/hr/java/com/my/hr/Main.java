package 서형종.hr.java.com.my.hr;

import 서형종.hr.java.com.my.hr.dao.LaborerDao;
import 서형종.hr.java.com.my.hr.dao.LaborerDaoImpl;
import 서형종.hr.java.com.my.hr.io.LaborerIo;
import 서형종.hr.java.com.my.hr.service.LaborerService;
import 서형종.hr.java.com.my.hr.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		LaborerDao laborerDao = new LaborerDaoImpl();
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.run();
	}
}

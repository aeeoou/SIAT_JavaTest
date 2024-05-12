package 서형종.hr.java.com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import 서형종.hr.java.com.my.hr.domain.Laborer;

public interface LaborerDao {
	List<Laborer> getAllLaborers();
	Laborer getLaborerById(int laborerId);
	// 추가
	void addLaborer(Laborer laborer);
	// 수정
	void updateLaborer(int laborerId, String laborerName, LocalDate hireDate);
	// 삭제
	void deleteLaborer(int laborerId);
}

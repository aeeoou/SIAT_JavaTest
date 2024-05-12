package 서형종.hr.java.com.my.hr.io;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import 서형종.hr.java.com.my.hr.domain.Laborer;
import 서형종.hr.java.com.my.hr.service.LaborerService;

public class LaborerIo {
	private LaborerService laborerService;
	private Scanner sc;
	
	public LaborerIo(LaborerService laborerService) {
		this.laborerService = laborerService;
		this.sc = new Scanner(System.in);
	}
	
	public void displayList() {
		System.out.println("****** 노동자 관리 프로그램 ******");
		System.out.print("1.목록 ");
		System.out.print("2.추가 ");
		System.out.print("3.수정 ");
		System.out.print("4.삭제 ");
		System.out.println("0.종료 ");
		System.out.println("****************************");
	}
	
	public void run() {
		int choice;
		do {
			displayList();
			System.out.print("선택 : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: displayLaborers();
					break;
			case 2: addLaborer();
					break;
			case 3: updateLaborer();
					break;
			case 4: deleteLaborer();
					break;
			case 0: System.out.println("프로그램을 종료합니다.");
			        break;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
		} while(choice != 0);
	}
	
	private void displayLaborers() {
		System.out.println("***** 노동자 목록 *****");
		System.out.println("ID\t이름\t입사일");
		for(Laborer laborer : laborerService.getAllLaborers()) {
			System.err.println(laborer.getLaborerId() + "\t" +
							   laborer.getLaborerName() + "\t" +
							   laborer.getHireDate());
		}
		if(laborerService.getAllLaborers().isEmpty()) {
			System.out.println("등록된 노동자가 없습니다.");
		}
		System.out.println("**************************");
	}
	
	private void addLaborer() {
		System.out.println("***** 노동자 추가 *****");
		System.out.print("이름 : ");
		String laborerName = sc.nextLine();
		LocalDate hireDate = getValidDateInput("입사일(YYYY-MM-DD): ");
		laborerService.addLaborer(laborerName, hireDate);
		System.out.println("노동자가 추가되었습니다.");
	}
	
	private void updateLaborer() {
		System.out.println("***** 노동자 수정 *****");
		int laborerId = getValidInput();
		Laborer laborer = laborerService.getLaborerById(laborerId);
		if(laborer != null) {
			System.out.print("이름 : ");
			String laborerName = sc.nextLine();
			LocalDate hireDate = getValidDateInput("입사일(YYYY-MM-DD) : ");
			laborerService.updateLaborer(laborerId, laborerName, hireDate);
			System.out.println("노동자 정보가 수정되었습니다.");
		} else {
			System.out.println("해당 ID의 노동자가 없습니다.");
		}
	}
	
	private void deleteLaborer() {
		System.out.println("***** 노동자 삭제 *****");
		int laborerId = getValidInput();
		Laborer laborer = laborerService.getLaborerById(laborerId);
		if(laborer != null) {
			laborerService.deleteLaborer(laborerId);
			System.out.println("노동자가 삭제되었습니다.");
		} else {
			System.out.println("해당 ID의 노동자가 없습니다.");
		}
	}
	
	// 예외 처리
	private int getValidInput() {
		while(true) {
			System.out.print("번호를 입력해주세요.");
			String input = sc.nextLine();
			try {
				return Integer.parseInt(input);
			} catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
			}
		}
	}
	
	// 예외 처리
	private LocalDate getValidDateInput(String msg) {
		while(true) {
			System.out.print(msg);
			String input = sc.nextLine();
			try {
				return LocalDate.parse(input);
			} catch(DateTimeParseException e) {
				System.out.println("잘못된 입력입니다. YYYY-MM-DD 형식으로 입력해주세요.");
			}
		}
	}
}

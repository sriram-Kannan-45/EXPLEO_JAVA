package Hands_on_2;

import java.time.LocalTime;
import java.util.Scanner;

class Attendance
{
	Scanner sc = new Scanner(System.in);
	
	private LocalTime  checkInTime;
	
	private LocalTime checkOutTime;
	
	private int empId;
	
	private boolean isCheckIn ;
	
	private boolean isCheckOut  ;
	
	public boolean markCheckIn()
	{
		
		
		this.checkInTime = LocalTime.now();;
		
		if (!isCheckIn)
		{
			isCheckIn = true ;
			isCheckOut = false ;
			return true ;
		}
		
		return false ;
		
		
	}
	
	public boolean markCheckOut()
	{
		
		
		this.checkOutTime = LocalTime.now(); ;
		
		if (isCheckIn)
		{
			isCheckOut = true ;
			
			return true ;
		}
		
		return false;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public boolean isCheckIn() {
		return isCheckIn;
	}

	public void setCheckIn(boolean isCheckIn) {
		this.isCheckIn = isCheckIn;
	}

	public boolean isCheckOut() {
		return isCheckOut;
	}

	public void setCheckOut(boolean isCheckOut) {
		this.isCheckOut = isCheckOut;
	}

	@Override
	public String toString() {
		
		return "ID : "+ empId + "\nIn Time : " + checkInTime + "\nOut Time : "+ checkOutTime + "\nIN : "+isCheckIn+"\nout : "+isCheckOut ; 
	}
	
	
	
	
}

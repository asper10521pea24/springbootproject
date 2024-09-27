package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="Bankingentity", uniqueConstraints= {
		@UniqueConstraint(columnNames="Accountid")
})
public class Bankingentity {
	@Id
	
	@Column(name="Accountid",unique=true,nullable=false)
	private int Accountid;
	private String AccountHoldersname;
	private long AccountNumber;
	private int Customerid;
	private String AccountType;
	private double Balance;
	private String Currency;
	private  String DateOpened;
	private float  InterestRate;
	private String AccountStatus;
	public int getAccountid() {
		return Accountid;
	}
	public void setAccountid(int accountid) {
		Accountid = accountid;
	}
	public String getAccountHoldersname() {
		return AccountHoldersname;
	}
	public void setAccountHoldersname(String accountHoldersname) {
		AccountHoldersname = accountHoldersname;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getCustomerid() {
		return Customerid;
	}
	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getDateOpened() {
		return DateOpened;
	}
	public void setDateOpened(String dateOpened) {
		DateOpened = dateOpened;
	}
	public float getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(float interestRate) {
		InterestRate = interestRate;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	public Bankingentity(int accountid, String accountHoldersname, long accountNumber, int customerid,
			String accountType, double balance, String currency, String dateOpened, float interestRate,
			String accountStatus) {
		super();
		Accountid = accountid;
		AccountHoldersname = accountHoldersname;
		AccountNumber = accountNumber;
		Customerid = customerid;
		AccountType = accountType;
		Balance = balance;
		Currency = currency;
		DateOpened = dateOpened;
		InterestRate = interestRate;
		AccountStatus = accountStatus;
	}
	public Bankingentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  
	
	
	
	
	
	
	

}

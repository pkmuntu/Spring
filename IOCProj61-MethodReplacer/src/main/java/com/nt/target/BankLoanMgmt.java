package com.nt.target;

import java.util.Random;

public  class BankLoanMgmt {
	
	public final  float    calculateIntrestAmount(float pAmt,float rate,float time) {
		  System.out.println("BankLoanMgmt.calculateIntrestAmount() ::: compound Intrest Amount");
		  return  (float)(pAmt*Math.pow(1+rate/100, time))-pAmt;
	}
	
	public   float getBalance() {
		System.out.println("BankLoanMgmt.getBalance()");
		return  new Random().nextInt(100000);
	}

}

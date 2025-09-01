package org.generation.util.extras;
import org.generation.util.Imprimible;

public class TarjetaRegalo implements Imprimible {
	
	private int accountNumber;
	private double balance;
	private String name;

	private static int consecutivo = 5000;
	
	public TarjetaRegalo( double balance, String name) {
		this.accountNumber=consecutivo;
		this.balance=balance;
		this.name=name;
	}


	@Override
	public double getSaldo(){
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int getNumeroCuenta() {
		// TODO Auto-generated method stub
		return accountNumber;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public String toString() {
		return "TarjetaRegalo [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
	
	
	

}

package org.generation.util.banco;

import java.util.Date;


public class CuentaCredito extends Cuenta {
	private double limite;
	private float tasa;
	private Date fechaCorte;
	//private Date fechaLimitePago;
	//(int, String, Date, Date, float, double, String)
	
	
	public CuentaCredito(double saldo, String numeroCliente, Date fechaCorte, 
			Date fechaLimitePago, float tasa, double limite, String nombreCliente ) {
		super(saldo, numeroCliente, fechaCorte, nombreCliente);
		this.fechaCorte = fechaCorte;
		this.limite=limite;
		this.tasa =tasa;
	}//constructor
	
	

	public double getLimite() {
		return limite;
	}//getLimite



	public void setLimite(double limite) {
		this.limite = limite;
	}//setLimite



	public float getTasa() {
		return tasa;
	}//getTasa



	public void setTasa(float tasa) {
		this.tasa = tasa;
	}//setTasa



	public Date getFechaCorte() {
		return fechaCorte;
	}//getFechaCorte



	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}//setFechaCorte




	@Override
	public double retiro(double cantidad) {
		if (limite-saldo>=cantidad) {
			setSaldo(getSaldo()-cantidad-0.05*cantidad);
		} else {
			setSaldo(getSaldo()-5);
		}
		return saldo;
	}//retiro


	@Override

		public double deposito(double cantidad) {
		    if (cantidad <= 0) { 
		        return getSaldo(); 
		    }
		    if (cantidad > 0) { 
		        setSaldo(getSaldo() + cantidad);
		    }
		    return saldo;   // ← este return debe ir fuera del if
		}//deposito



	@Override
	public double getSaldo() {
		this.saldo -=3;
		return this.saldo;
	}//getSaldo

	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString

	

}

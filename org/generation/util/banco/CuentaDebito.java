package org.generation.util.banco;

import java.util.Date;

public class CuentaDebito extends Cuenta{
		private double montoMinimo;
		
		public CuentaDebito(double saldoInicial, String numeroCliente, Date fechaApertura,
				double montoMinimo, String nombreCliente) {
			super(saldoInicial, numeroCliente, fechaApertura, nombreCliente);
			
			this.montoMinimo = montoMinimo;
		}//Constructor
		
		public double getMontoMinimo() {
			return montoMinimo;
		}//getMontoMinimo
		
		public void setMontoMinimo(double montoMinimo) {
			this.montoMinimo = montoMinimo;
		}//setMontoMinmo
		

		@Override
		public double retiro(double cantidad) {
			
			if (cantidad<=0) {return getSaldo();}
			if (saldo >= cantidad) {
				setSaldo(getSaldo() - cantidad);}
			 return getSaldo();
		}//retiro
	
		@Override 
		public double deposito(double cantidad) {
		    if (cantidad <= 0) { 
		        return getSaldo(); 
		    }
		    if (cantidad > 0) { 
		        setSaldo(getSaldo() + cantidad);
		    }
		    return getSaldo();   // ← este return debe ir fuera del if
		}//deposito
		
		@Override 
		public double getSaldo(){
			return saldo;
		}//getSaldo
		
		@Override
		public String toString() {

	        return "Cuenta Débito [" 
	        + super.toString() + ", Monto mínimo=" + montoMinimo + "]";
		}//toString
		
		@Override
		public String imprimir() {
			// TODO Auto-generated method stub
			return null;
		}//Imprimir interface
}
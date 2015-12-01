package model;

import java.util.ArrayList;

public class Numeros {
	private ArrayList<Integer> numeros;
	private String num;
	
	public Numeros() {
		setNumeros(new ArrayList<Integer>(10));
		popular();
	}

	public void popular() {
		for (int i = 1; i <= 10; i++) {
			getNumeros().add(i);
		}
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public void sortear() {
		
		if (numeros.size() > 0) {
			int i = (int) Math.random() * 10;
			String numero = numeros.get(i).toString();
			numeros.remove(i);
			num = numero;
		}
		num = "!";
	}
	
	public String sorteado() {
		if(num==null) {
			return "?";
		}
		
		return num;
	}

}

package view;

import model.Produto;

public class Teste {

	public static void main(String[] args) {
		Produto ps4 = new Produto("Playstation 4", 1988.04);
		Produto xbox = new Produto("Xbox One", 1862.14);
		
		System.out.println(ps4);
		System.out.println(xbox);
	}

}
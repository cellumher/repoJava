package com.main;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Eva");
		cliente.setApellidos("Lopez");
		cliente.setDocumento("12345678D");
		cliente.setTipo("Arcoiris");
		cliente.setCategoria("A");
		cliente.generarCodigo();
		
		System.out.println(cliente.getApellidos()+" "+cliente.getCategoria()+" "+cliente.getCodigo());
	}

}

package com.alura.foro_inicial.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException {
	public ValidacionDeIntegridad(String s) {
        super(s);
    }
}

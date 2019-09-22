package br.com.money.api.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GerdorDeSenha {

	public static void main(String[] args) {
		BCryptPasswordEncoder enconder = new BCryptPasswordEncoder();
		System.out.println(enconder.encode("maria"));
	}
}

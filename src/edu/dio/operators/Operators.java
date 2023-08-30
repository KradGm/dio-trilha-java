package edu.dio.operators;

public class Operators {
	public static void main(String[] args) {
		//// classe Operadores.java
		String name = "GLEYSON";
		int age = 22;
		double weight = 68.5;
		char sex = 'M';
		boolean organDonator = false;
		// Date birthDate = new Date();

		//// classe OPERADORES ARITMETICOS
		double sum = 10.5 + 15.7;
		int subtract = 113 - 25;
		int multiplication = 20 * 7;
		int division = 15 / 3;
		int module = 18 % 3;// Resto de divisão
		double result = (10 * 7) + (20 / 4);
		//// classe OPERADORES UNARIOS
		String fullName = "LINGUAGEM" + "JAVA";
		System.out.println(fullName);

		//// qual o resultado das expressoes abaixo?
		String concatenation = "?";

		concatenation = 1 + 1 + 1 + "1";
		System.out.println(concatenation);

		concatenation = 1 + "1" + 1 + 1;
		System.out.println(concatenation);

		concatenation = 1 + "1" + 1 + "1";
		System.out.println(concatenation);

		concatenation = "1" + 1 + 1 + 1;
		System.out.println(concatenation);

		concatenation = "1" + (1 + 1 + 1);
		System.out.println(concatenation);

		int number = 5;

		// Imprimindo o numero negativo
		System.out.println(-number); // é possivel mudar permanentemente o valor do numero com number*-1(de negativo para positivo) ou - number

		// incrementando numero em mais 1 numero, imprime 6
		number++;
		System.out.println(number);

		//incrementando numero em mais 1 numero, imprime 7
		System.out.println(number++);// Nesse caso ele printa o resultado e depois faz a soma.

		System.out.println(number);// Verificando a logica de incrementação.

		System.out.println(++number);// Ordem de precedencia, incrementa o valor e depois printa

		boolean verdadeiro = true;

		System.out.println("Inverteu " + !verdadeiro);

		////OPERADORES TERNARIOS
		int a, b;

		a = 5;
		b = 6;
		String resultIf = "";
		//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE COMUM
		if (a == b)
			resultIf = "true";
		else
			resultIf = "false";

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultIfDiff = (a == b) ? "true" : "false";
		// ? = if; : = else
		System.out.println(resultIfDiff);

		////OPERADORES RELACIONAIS
		int numero1 = 1;
		int numero2 = 2;

		if (numero1 > numero2)
			System.out.println("Numero 1 maior que numero 2");

		if (numero1 < numero2)
			System.out.println("Numero 1 menor que numero 2");

		if (numero1 >= numero2)
			System.out.println("Numero 1 maior ou igual que numero 2");

		if (numero1 <= numero2)
			System.out.println("Numero 1 menor ou igual que numero 2");

		if (numero1 != numero2)
			System.out.println("Numero 1 é diferente de numero 2");
		
		//Com strings
		String nameOne = "Enzo";
		String nameTwo = new String("Enzo");
		System.out.println(nameOne.equals(nameTwo));

	}
}

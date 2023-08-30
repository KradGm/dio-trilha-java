package edu.dio.variables;

public class Variables {
	public static void main(String[] args) {
	////VARIAVEIS PRIMITIVAS
	double minimunPay = 2500.33;	
	double minimnPay = 2.500; //Isso é 2.5
	int cep = 33233160; //Caso comece com 0 o valor não sera armazenado, portanto o ideal é utilizar outro tipo como string
	long cpf = 14501439629L; //Mesma coisa do acima, alem disso deve terminar com L.
	float pi = 3.14F; //deve sempre terminar com F
	String  myName = "Enzo Oliveira";
	
	short lowNumber = 1;
	int normalNumber = lowNumber;
	short lowNumber2 = (short) normalNumber;//Transferencia de um para o outro.
	
	
	////CONSTANTES
	int commonNumber = 5;
	commonNumber = 10;
	System.out.print(commonNumber);
	
	final double PI_NUMBER = 3.14;//Não é mais possivel mudar o valor dessa variavel
	
	}
}

package exercicios01;

import java.util.Scanner;

public class ClasseExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Exercicio 1 */
		System.out.println("Digite um número para somar:");
		Scanner n1 = new Scanner(System.in);
		int num1 = n1.nextInt();
		System.out.println("Digite outro número:");
		Scanner n2 = new Scanner(System.in);
		int num2 = n2.nextInt();
		int soma1 = num1+num2;
		
		System.out.println("A soma dos números é "+soma1);
				
		//Exercicio 4
		
		/*System.out.println("Digite o código do funcionário: ");
		Scanner n1 = new Scanner(System.in);
		int cod = n1.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		Scanner n2 = new Scanner(System.in);
		int h = n2.nextInt();
		System.out.println("Digite o valor do salário por hora: ");
		Scanner n3 = new Scanner(System.in);
		double s = n3.nextDouble();
		
		double salario = s*h;
		System.out.println("O funcionário "+cod+", recebe o salário no valor de U$"+salario);
		*/
		
		//Exercicio 5
		
		/*System.out.println("Insira as informações da peça 1, primeiro o código da peça, depois a quantidade de peças e o valor dela:");
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int qnt = sc.nextInt();
		double prc = sc.nextDouble();
		
		System.out.println("Agora insira as informações da peça 2:");
		int cod2 = sc.nextInt();
		int qnt2 = sc.nextInt();
		double prc2 = sc.nextDouble();
		
		double total = (qnt*prc)+(qnt2*prc2); 
		
		double valorFormatado = Math.round(total * 100.0) / 100.0;
		System.out.println("O valor a pagar é: R$" + valorFormatado);
		*/
		
		//Exercicio 6
		
		System.out.println("Insira três valores e iremos calcular as áreas do triangulo, circulo, trapézio, quadrado e retangulo:");
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double aTrianR = (n1*n3)/2;
		double aCir = 3.14159*Math.pow(n3, 2);
		double aTrap = (n1+n2)*n3/2;
		double aQuad = Math.pow(n2, 2);
		double aRet = n1*n2;
		
		System.out.println("Os resultados das áreas são: Triângulo "+aTrianR+", Circulo "+aCir+", Trapézio "+aTrap+", Quadrado "+aQuad+", Retângulo "+aRet);
		}

}

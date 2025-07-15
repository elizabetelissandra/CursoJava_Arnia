package Principal;

public class Calculo {

    public int dobro(int valor) {
        return valor * 2;
    }

    public int triplo(int valor) {
        return valor * 3;
    }

    public int quadrado(int valor) {
        return valor * valor;
    }

    public String par(int valor) {
        if (valor % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }
    
    public double gastouFumante(int anos, int qtdCigarros, double prcCigarro) {
    	int totalCigarros = anos * 365 * qtdCigarros;
    	double totalMacos = totalCigarros / 20;
    	double totalGasto = totalMacos * prcCigarro;
    	return totalGasto;
    }
    
    public String calculoIMC(double peso, double altura) {
    	double imc = peso/(altura * altura);
    	if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 40) {
            return "Obesidade";
        } else {
            return "Obesidade Grave";
        }
    	
    
    }
    
    public double mediaArit(double n1, double n2, double n3) {
    	double media = (n1 + n2 + n3)/3;
    	return media;
    }
    
    public String resultadoFinal(double media) {
    	if(media<5) {
    		return "Reprovado";
    	}else if(media>=5 && media<7) {
    		return "Recuperação";
    	}else {
    		return "Aprovado";
    	}
    }
    
    public double conversor(double temp, int opcao) {
    	switch (opcao) {
		case 1:
			double f = (temp * 9/5) + 32;
			return f;
		case 2: 
			 double c = (temp - 32) * 5/9;
			return c;
		default:
			System.out.println("Opção incorreta, tente novamente");
			return -1;
		}
    }
}


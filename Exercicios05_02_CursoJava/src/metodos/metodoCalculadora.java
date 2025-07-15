package metodos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class metodoCalculadora {

	public double comprasSoma = 0.0;
	Scanner sc = new Scanner(System.in);

	public double soma(double compra) {

		System.out.println("valor da compra, " + compra);
		comprasSoma += compra;
		System.out.println("Total de compras: R$ " + comprasSoma);
		return comprasSoma;
	}
	
	public double calculoTroco(double valorPago) {
		double troco = valorPago - comprasSoma;
		
		while(troco < 0) {
			System.out.println("O valor é insuficiente e falta R$ "+troco);
			System.out.println("Informe o valor restante:");
			double pago = sc.nextDouble();
			troco = pago - comprasSoma;
			
		}
		
		if (troco == 0) {
	        System.out.println("Não há troco. O valor pago foi exato.");
	    } else {
	        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");
	        System.out.println("O valor do troco é: " + formato.format(troco));
	    }

		return troco;
	}

}

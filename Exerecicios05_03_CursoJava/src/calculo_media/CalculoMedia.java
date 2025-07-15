package calculo_media;

public class CalculoMedia {
	
	public int mediaArit( int n1,int  n2) {
		int media = (n1 + n2)/2;
		
		return media;
	}
	
	public String statusAluno(int media) {
			if(media >=7) {
				return "Aprovado";
			}else {
				return "Reprovado";
			}
	}
	
}

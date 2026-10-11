package ejemplo2If;

public class Ejemplo2If {

	public static void main(String[] args) {
		Integer a=5;
		Integer b=23;
		Integer c=2;
		Integer mayor=0;
		if (a>b) {
			if (a>c) {
				mayor=a;
			}else {
				mayor=b;
			}
		}
			else {
				if(c>b) {
					mayor=c;
				}else {
					mayor=b;
				}
				
			}
			System.out.println("El mayor es : " + mayor);
		}
	}
}

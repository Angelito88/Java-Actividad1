import java.util.Scanner; 
/**
 * @author: angNavarro
 * 
 * test
 */
public class U1Activitat1 {
    public static void main(String[] args) {
	Scanner inputTeclat = new Scanner(System.in);

	double radiCercle;
	double baseRectangle;
	double alturaRectangle;
	double perimetreCecle;
	double areaCercle;
	double areaRectangle;
	double primerCatet;
	double segonCatet;
	double quadratHipotenusa;
	double valorHipotenusa;
	final double NUMERO_PI=3.14;
	
	
        System.out.print("Di-me el valor del radi d'un cercle: ");
	radiCercle=inputTeclat.nextFloat();
	inputTeclat.nextLine();
	
	System.out.print("\nAra dis-me el valor de la base d'un rectangle: ");
	baseRectangle=inputTeclat.nextFloat();
	inputTeclat.nextLine();
	System.out.print("\nNo oblides dir-me també el valor de l'altura del rectangle: ");
	alturaRectangle=inputTeclat.nextFloat();
	inputTeclat.nextLine();

	perimetreCecle= 2*NUMERO_PI*radiCercle;
	areaCercle= NUMERO_PI*radiCercle*radiCercle;
	areaRectangle=baseRectangle*alturaRectangle;
	
	System.out.printf("\nDe moment tenim un cercle de perímetre %.2f i àrea %.2f, i un rectangle d'àrea %.2f\n", perimetreCecle, areaCercle, areaRectangle); 
	
	System.out.println("\nM'agrada el teorema de Pitàgores, dis-me el valor del catet 1: ");
	primerCatet=inputTeclat.nextFloat();
	inputTeclat.nextLine();
	
	System.out.print("\nI també del catet 2: ");
	segonCatet=inputTeclat.nextFloat();
	inputTeclat.nextLine();

	quadratHipotenusa=primerCatet*primerCatet+segonCatet*segonCatet;
	valorHipotenusa=Math.sqrt(quadratHipotenusa);

	System.out.printf("\nD'acord, el valor de la hipotenusa al quadrat és %.2f, per tant, el valor de la hipotenusa és %.2f", quadratHipotenusa, valorHipotenusa);























	
	
	
    } 
}
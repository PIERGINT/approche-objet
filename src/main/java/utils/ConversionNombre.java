package utils;

/** Appel de méthodes sttatic
 * @author pierre
 *
 */
public class ConversionNombre {

	public static void main(String args[]) {
		String soleil = "713705";

		int codesoleil = Integer.parseInt(soleil);

		System.out.println("Conversion Nombre en code soleil : " + codesoleil);
	}
}
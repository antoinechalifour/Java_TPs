package tpJava.tp3.exercice4;

public class Test {
	// Static pour éviter de faire un new dans la méthode de test.
	public static double diviser(double a, double b)
			throws DenominateurException, NbNegatifException {
		if (b == 0)
			throw new DenominateurException();
		if (a < 0 || b < 0)
			throw new NbNegatifException();
		return a / b;

	}

	public static void main(String args[]) {
		/*
		 * QUESTION 1 et 2
		 */
		try {
			int count = args.length;
			if (count != 2)
				throw new ParametreException();
			int nb1 = Integer.parseInt(args[0]);
			int nb2 = Integer.parseInt(args[1]);

			if (nb2 == 0)
				throw new DenominateurException();
			if (nb1 < 0 || nb2 < 0)
				throw new NbNegatifException();
		}
		/*
		 * Try catch imbriqué pas très élégant... Mais seule manière d'obtenir
		 * notre message = attraper l'exception envoyée par parseInt et renvoyer
		 * une autre.
		 */
		catch (NumberFormatException nf) {
			try {
				throw new TypeException();
			} catch (TypeException e) {
				System.out.println(e.getMessage());
			}
		} catch (ParametreException pe) {
			System.out.println(pe.getMessage());
		} catch (DenominateurException de) {
			System.out.println(de.getMessage());
		} catch (NbNegatifException ne) {
			System.out.println(ne.getMessage());
		}

		/*
		 * QUESTION 3 et 4
		 */
		double a = -4;
		double b = -2;
		double r = -1;
		try {
			r = Test.diviser(a, b);
		} catch (DenominateurException e) {
			System.out.println(e.getMessage());
		} catch (NbNegatifException e) {
			try {
				r = Test.diviser(Math.abs(a), Math.abs(b));
			} catch (DenominateurException | NbNegatifException e1) {
				System.out.println(e1.getMessage());
			}
		}
		System.out.println("Resultat : " + r);
	}
}

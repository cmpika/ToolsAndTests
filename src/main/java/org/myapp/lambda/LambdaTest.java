package org.myapp.lambda;

import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Classe utilisée pour demontrer l'usage des expressions lambda
 * @version 1.0 2017-10-11
 * @author cmpika
 *
 */
public class LambdaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Test de tri de chaines de caractères
		String[] planets = new String[]{"Mercury", "Venus","Earth", "Mars", "Saturn", "Jupiter", "Uranus", "Neptune"};
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted by length:");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(planets));
		//Test d'exécution de timer 
		Timer t = new Timer(1000, event -> {System.out.println("The time is" + new Date());
		Toolkit.getDefaultToolkit().beep();});
		t.start();
		//Keep program running until user selcets "OK"
		JOptionPane.showMessageDialog(null, "Quit program ?");
		//Arrêt du programme dès qu'on clique sur "OK"
		System.exit(0);
		
		}

}

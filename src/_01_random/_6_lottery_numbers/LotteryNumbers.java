package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
	
		Random random = new Random();
		String a = "" + random.nextInt(99);
		String b = "" + random.nextInt(99);
		String c = "" + random.nextInt(99);
		String d = "" + random.nextInt(99);
		String e = "" + random.nextInt(99);
		String f = "" + random.nextInt(99);
		
		System.out.println("Lottery Ticket");
		System.out.println(a + "   " + b + "   " + c + "   " + d + "   " + e + "   " + f);
	}	
}

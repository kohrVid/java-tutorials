/*
 * File name: "Stanford.java"
 */

import acm.program.*;

public class Stanford extends ConsoleProgram {
	public void run() {
		setFont("Liberation Serif-20");
		Student stud = new Student("Ben Newman", 1001);
		stud.setUnits(179);
		
		println(stud.getName() + " has " +
				stud.getUnits() + " units");
		println(stud.getName() + " can graduate: "
				+ stud.hasEnoughUnits());
		println(stud.getName() + " takes CS160A!");
		stud.incrementUnits(5);
		
		println(stud.getName() + " can graduate: "
				+ stud.hasEnoughUnits());
		if (stud.hasEnoughUnits()) {
			println("Rock on " + stud.toString() + "!");
		}
	}
}
public class Frosh extends Student {
	public Frosh(String name, int id) {
		super(name, id); //calls Student constructor
		setUnits(0);
	}
	
	//Override toString method of Student
	public String toString() {
		//studentID and studentName are private
		//so they are not directly accessible in
		//the subclass. Must use public getters
		return ("Frosh: " + getName() +
				" (#" + getID() + ")");
	}
}

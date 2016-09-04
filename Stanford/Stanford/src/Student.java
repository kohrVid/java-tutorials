/**
 * The Student class keeps track of the following pieces
 * of data about a student: the student's name, ID number,
 * and the number of credits the student has earned
 * towards graduation.
 * All of this information is entirely private to the class.
 * Clients can obtain this information only by using
 * the various methods defined by the class.
 * @author jessica
 *
 */
public class Student {
	/**
	 * Creates a new Student object with the specified
	 * name and ID.
	 * @param name The student's name as a string
	 * @param id The student's ID number as an int
	 */
	public Student(String name, int id) {
		studentName = name;
		studentID = id;
	}
	
	/**
	 * Gets the name of this student
	 * @return The name of the student
	 */
	public String getName() {
		return studentName;
	}
	
	/**
	 * Gets the ID number of this student
	 * @returns the ID number of this student
	 */
	
	public int getID() {
		return studentID;
	}
	
	/**
	 * Sets the number of units earned.
	 * @param units The new number of units earned
	 */
	public void setUnits(double units) {
		unitsEarned = units;
	}
	
	/**
	 * Get the number of units earned.
	 * @return The number of units this student has earned
	 */
	public double getUnits() {
		return unitsEarned;
	}
	
	/**
	 * Increments the number of units earned.
	 * @param additionalUnits the additional number of units
	 */
	public void incrementUnits(double additionalUnits) {
		unitsEarned += additionalUnits;
	}
	
	/**
	 * Gets the number of units earned.
	 * @return Whether the student has enough units to
	 * graduate
	 */
	public boolean hasEnoughUnits() {
		return (unitsEarned >= UNITS_TO_GRADUATE);
	}
	
	/**
	 * Creates a string identifying this student.
	 * @return The string used to display this student. 
	 */
	public String toString() {
		return studentName + " (#" + studentID + ")";
	}
	
	/*Public constants */
	
	/** The number of units required for graduation
	 */
	public static final double UNITS_TO_GRADUATE = 180.0;
	
	/* Private instance variable */
	
	private String studentName; /* The student's name */
	private int studentID; /* The student's ID number */
	private double unitsEarned; /*The number of units earned*/
}

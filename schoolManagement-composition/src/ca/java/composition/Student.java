package ca.java.composition;

public class Student {
	
	private String firstName;
	private String lastName;
	private double score;
	
	public Student(String firstName, String lastName, double score) {
		setFirstName(firstName);
		setLastName(lastName);
		setScore(score);
	}
	
	/*
	 * @ return firstname
	 */
	public String getFirstName() {
		return firstName ;
	}
	
	/*
	 * @ return lastname
	 */
	public String getLastName() {
		return lastName ;
	}
	
	/*
	 * @ return score
	 */
	public double getScore() {
		return score;
	}
	
	/*
	 * @param firstname
	 */
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		}
	}
	
	/*
	 * @param lastname
	 */
	public void setLastName(String lastName) {
		if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		}
	}
	
	/*
	 * @param score
	 */
	public void setScore(double score) {
		if (score > 0 && score <= 20) {
			this.score = score;
		} else {
			this.score = 0;
		}
	}
	
	
	
}
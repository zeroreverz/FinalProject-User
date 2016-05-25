/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Student.
 * 
 * @author humar
 */
public class Student extends User {

	protected int studentID;
	protected int groupID;

	/**
	 * The constructor.
	 */
	public Student(int studentID, String firstname, String surname, String login, String pwd) {
		super(firstname, surname, login, pwd);
		this.studentID = studentID;
		this.groupID = -1;
	}
	
	public Student(int studentID, String firstname, String surname, String login, String pwd, int groupID) {
		super(firstname, surname, login, pwd);
		this.studentID = studentID;
		this.groupID = groupID;
	}

	/**
	 * Returns studentID.
	 * @return studentID 
	 */
	public int getStudentID() {
		return this.studentID;
	}

	/**
	 * Sets a value to attribute studentID. 
	 * @param newStudentID 
	 */
	public void setStudentID(Integer newStudentID) {
		this.studentID = newStudentID;
	}

	/**
	 * Returns groupID.
	 * @return groupID 
	 */
	public int getGroupID() {
		return this.groupID;
	}

	/**
	 * Sets a value to attribute groupID. 
	 * @param newGroupID 
	 */
	public void setGroupID(int newGroupID) {
		this.groupID = newGroupID;
	}

}

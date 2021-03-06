package com.snowdays_enrollment.model;

/**
* User is the JavaBean representing the record of the table Participant
* 
* @author Luca Barazzuol
*/
public class Participant {

	/**
	 * @uml.property  name="id"
	 */
	private int id;
	/**
	 * @uml.property  name="id_group"
	 */
	private int id_group;
	/**
	 * @uml.property  name="fname"
	 */
	private String fname;
	/**
	 * @uml.property  name="lname"
	 */
	private String lname;
	/**
	 * @uml.property  name="email"
	 */
	private String email;
	/**
	 * @uml.property  name="uuid"
	 */
	private String uuid;
	/**
	 * @uml.property  name="date_of_birth"
	 */
	private String date_of_birth;
	/**
	 * @uml.property  name="registration_date"
	 */
	private String registration_date;
	/**
	 * @uml.property  name="approved"
	 */
	private boolean approved;
	/**
	 * @uml.property  name="blocked"
	 */
	private boolean blocked;
	
	
	//Getters and Setters
	/**
	 * @return
	 * @uml.property  name="id"
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @uml.property  name="id"
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return
	 * @uml.property  name="id_group"
	 */
	public int getId_group() {
		return id_group;
	}
	/**
	 * @param id_group
	 * @uml.property  name="id_group"
	 */
	public void setId_group(int id_group) {
		this.id_group = id_group;
	}
	/**
	 * @return
	 * @uml.property  name="fname"
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname
	 * @uml.property  name="fname"
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return
	 * @uml.property  name="lname"
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname
	 * @uml.property  name="lname"
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return
	 * @uml.property  name="email"
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email
	 * @uml.property  name="email"
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return
	 * @uml.property  name="uuid"
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid
	 * @uml.property  name="uuid"
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	/**
	 * @return
	 * @uml.property  name="date_of_birth"
	 */
	public String getDate_of_birth() {
		return date_of_birth;
	}
	/**
	 * @param date_of_birth
	 * @uml.property  name="date_of_birth"
	 */
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	/**
	 * @return
	 * @uml.property  name="registration_date"
	 */
	public String getRegistration_date() {
		return registration_date;
	}
	/**
	 * @param registration_date
	 * @uml.property  name="registration_date"
	 */
	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}
	/**
	 * @return
	 * @uml.property  name="approved"
	 */
	public boolean isApproved() {
		return approved;
	}
	/**
	 * @param approved
	 * @uml.property  name="approved"
	 */
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	/**
	 * @return
	 * @uml.property  name="blocked"
	 */
	public boolean isBlocked() {
		return blocked;
	}
	/**
	 * @param blocked
	 * @uml.property  name="blocked"
	 */
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	
	
}

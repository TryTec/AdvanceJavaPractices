/**
 * 
 */
package com.msit.aeu.exercise3;

import java.util.Date;

/**
 * @author Try
 *
 */
public class Person {
	private String firtName;
	private String lastName;
	private Date  birthday;
	/**
	 * @return the firtName
	 */
	public String getFirtName() {
		return firtName;
	}
	/**
	 * @param firtName the firtName to set
	 */
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}

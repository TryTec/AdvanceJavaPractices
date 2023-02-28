/**
 * 
 */
package com.msit.aeu.exercise3;

/**
 * @author Try
 *
 */
public class TeamLeader extends Employee implements ILabelisale {
	private int projectNum;

	/**
	 * @return the projectNum
	 */
	public int getProjectNum() {
		return projectNum;
	}

	/**
	 * @param projectNum the projectNum to set
	 */
	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return String.format("Team Leader List\nName : %1$s %2$s, Number of Projects : %3$s", 
				getFirtName().toUpperCase(), getLastName().toUpperCase(),getProjectNum());
	}
}

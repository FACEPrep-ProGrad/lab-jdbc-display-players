package model;

public class Skill{
	private int skillid;
	private String skillName;
	
	public Skill(int i, String skillName) {
		super();
		this.skillid = i;
		this.skillName = skillName;
	}
	
	
	public  int getSkillid() {
		return skillid;
	}
	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}
	public  String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}

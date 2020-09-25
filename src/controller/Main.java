package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException 	{
		SkillDAO skilldao = new SkillDAO();
		TreeMap<Integer,Skill> skillmap =  skilldao.skillCount();
		System.out.println("Skills         players");
		//System.out.println(skillmap.size());

		for(Entry<Integer,Skill> e: skillmap.entrySet())
		{
			int  count= e.getKey();
			Skill skill= e.getValue();
			String skillname = skill.getSkillName();
			
			int spaces = 15- (skillname.length());  
			for(int i=0; i<spaces; i++) {
				skillname = skillname + " "; 
			}
			skillname = skillname+count;
		
			System.out.println(skillname);
			
		}
	}
}

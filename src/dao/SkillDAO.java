package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	
	public TreeMap<Integer,Skill> skillCount() throws ClassNotFoundException, SQLException, IOException{
		TreeMap<Integer,Skill> skillmap = new TreeMap <Integer,Skill>();
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		int batsmanCount =0;
		int bowlerCount = 0;
		int allrounderCount =0;
		int keeperCount = 0;
		
		ResultSet rs = st.executeQuery("SELECT  * FROM  SKILLS INNER JOIN PLAYERS ON skills.skill_id = players.skill_id");
		
		while(rs.next())
		{
			
			String skillName=rs.getString(2);
			//System.out.println(skillName);
			if(skillName.equalsIgnoreCase("BATSMAN")){
				batsmanCount++;
			}else if(skillName.equalsIgnoreCase("BOWLER")){
				bowlerCount++;
			}else if(skillName.equalsIgnoreCase("ALLROUNDER")){
				allrounderCount++;
			}else if(skillName.equalsIgnoreCase("WICKETKEEPING")){
				keeperCount++;
			}	
			
		}
		
		Skill s1 = new Skill((long)1,"BATSMAN");
		Skill s2 = new Skill((long)2,"BOWLER");
		Skill s3 = new Skill((long)3,"ALLROUNDER");
		Skill s4 = new Skill((long)4,"WICKETKEEPING");

		
		skillmap.put(batsmanCount,s1);
		skillmap.put(bowlerCount,s2 );
		skillmap.put(allrounderCount,s3);
		skillmap.put(keeperCount,s4);
		
		
		return skillmap;
		
	}
}

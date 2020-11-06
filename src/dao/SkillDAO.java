package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import utility.ConnectionManager;
import model.Skill;

public class SkillDAO {
	
	
	public TreeMap<String,Integer> skillCount() throws ClassNotFoundException, SQLException, IOException{
		ConnectionManager con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("SELECT SKILL.name,COUNT(player.id) as player FROM player INNER JOIN skill ON player.skill_id = skill.id GROUP BY skill.name");
		TreeMap<String,Integer> playerCount = new TreeMap<String,Integer>();
		while(rs.next()) {
			String skill = rs.getString("name");
			int players = rs.getInt("player");
			
			playerCount.put(skill, players);
			con.getConnection().close();
		}
		return playerCount;		
	}
	
	
	
//	String username = loginPojo.getUsername();
//	String password = loginPojo.getPassword();
//	
//	ConnectionManager con = new ConnectionManager();
//	Statement st = con.getConnection().createStatement();
//	
//	ResultSet rs = st.executeQuery("SELECT * from USERDETAILS");
//	
//	while(rs.next()) {
//		if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD"))) {
//			con.getConnection().close();
//			return true;
//		}
//		else {
//			con.getConnection().close();
//			return false;
//		}
//	}
//	
//	return false;
	
}

package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
		
		 public TreeMap<Integer, Skill> skillCount() throws Exception {
			 TreeMap<Integer,Skill>map = new TreeMap<Integer,Skill>();
			 
		 Connection con =ConnectionManager.getConnection();
		 Statement st=con.createStatement();
		 String sql="select * from player";
		 
		 ResultSet rs=st.executeQuery(sql);
		 
		 int batting=0;
		 int bowling=0;
		 int wicketkeeping=0;
		 while(rs.next())
		 {
			 if(rs.getLong(4)==1) {
				 System.out.println("test1"+ rs.getLong(4));
				 batting++;
			 }
			 else if(rs.getLong(4)==2) {
				 bowling++;
				 System.out.println("test2"+ rs.getLong(4));
			 }
			 else if(rs.getLong(4)==3) {
				 wicketkeeping++;
				 System.out.println("test3"+ rs.getLong(4));
			 }
		 }
				 Skill s1=new Skill(1,"batting");
				 Skill s2=new Skill(2,"bowler");
				 Skill s3=new Skill(3,"keeper");
				 
				 map.put(batting,s1);
				 map.put(bowling,s2);
				 map.put(wicketkeeping,s3);
		return map;

		 
}
}

package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;


import dao.SkillDAO;

public class Main{
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		SkillDAO playerDAO = new SkillDAO();
		
		TreeMap<String,Integer> skillCount = new TreeMap<String,Integer>();
		
		skillCount = playerDAO.skillCount();
		
		System.out.printf("%-20s %s\n", "Skill" , "Players");
		for (Map.Entry<String, Integer> entry : skillCount.entrySet()) {
			System.out.printf("%-20s %s\n", entry.getKey() ,entry.getValue());
		}
		
	}
}

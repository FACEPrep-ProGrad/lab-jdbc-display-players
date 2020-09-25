package controller;

import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;

import model.Skill;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SkillDAO skilldao=new SkillDAO();
		
		 TreeMap<Integer, Skill> map = new TreeMap<Integer, Skill>();
				
		 map=skilldao.skillCount();
		 
			//	System.out.println("test");
				
			for(Entry<Integer, Skill> out: map.entrySet())
			{
				int id=out.getKey();
				Skill skill=out.getValue();
				System.out.println(skill.getSkillid()+"   "+skill.getSkillName());
			}
			}
	}

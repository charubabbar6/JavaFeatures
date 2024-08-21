package com.core.designpatterns.creationalpattern.prototypepattern;

public class ProtoTypePatternMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ProfessionCache.loadProfessionCache();
		
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		
		Profession engProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engProfession);
		
		Profession teachProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teachProfession);
		
		Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession2);
	}

}

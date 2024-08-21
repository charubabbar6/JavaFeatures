package com.core.designpatterns.creationalpattern.builderpattern;

public interface Builder {
	public void buildFloor(); 
	  
    public void buildWalls(); 
  
    public void bulidTerrace(); 
  
  
    public Home getComplexHomeObject(); 
}

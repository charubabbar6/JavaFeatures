package com.core.designpatterns.creationalpattern.builderpattern;

//Builder

public interface CarBuilder {
	void buildModel();
    void buildEngine();
    void buildWheels();
    Car getResult();
}

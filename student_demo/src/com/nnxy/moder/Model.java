package com.nnxy.moder;

public class Model {
 private int id;//唯一标识
 private String name;//姓名
 private int sex;//性别
 
public Model(int id, String name, int sex) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
 
}

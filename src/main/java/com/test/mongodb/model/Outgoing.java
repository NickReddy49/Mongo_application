package com.test.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document
public class Outgoing 
{
@Id
private int id;
private String removed_duplicates;
private String removed_whitespaces;
private String isboolean;
private int maxnum;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRemoved_duplicates() {
	return removed_duplicates;
}
public void setRemoved_duplicates(String removed_duplicates) {
	this.removed_duplicates = removed_duplicates;
}
public String getRemoved_whitespaces() {
	return removed_whitespaces;
}
public void setRemoved_whitespaces(String removed_whitespaces) {
	this.removed_whitespaces = removed_whitespaces;
}
public String isIsboolean() {
	return isboolean;
}
public void setIsboolean(String isboolean) {
	this.isboolean = isboolean;
}
public int getMaxnum() {
	return maxnum;
}
public void setMaxnum(int maxnum) {
	this.maxnum = maxnum;
}
@Override
public String toString() {
	return "Outgoing [id=" + id + ", removed_duplicates=" + removed_duplicates + ", removed_whitespaces="
			+ removed_whitespaces + ", isboolean=" + isboolean + ", maxnum=" + maxnum + "]";
}
	


	
}

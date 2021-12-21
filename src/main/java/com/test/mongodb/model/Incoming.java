package com.test.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Document
public class Incoming
{
 @Id	
 private String id;
 private String findDuplicates;
 private String whiteSpacesGalore;
 private String validateMeOnlyIActuallyShouldBeABoolean;
 private String numbersMeetNumbers;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFindDuplicates() {
	return findDuplicates;
}
public void setFindDuplicates(String findDuplicates) {
	this.findDuplicates = findDuplicates;
}
public String getWhiteSpacesGalore() {
	return whiteSpacesGalore;
}
public void setWhiteSpacesGalore(String whiteSpacesGalore) {
	this.whiteSpacesGalore = whiteSpacesGalore;
}
public String getValidateMeOnlyIActuallyShouldBeABoolean() {
	return validateMeOnlyIActuallyShouldBeABoolean;
}
public void setValidateMeOnlyIActuallyShouldBeABoolean(String validateMeOnlyIActuallyShouldBeABoolean) {
	this.validateMeOnlyIActuallyShouldBeABoolean = validateMeOnlyIActuallyShouldBeABoolean;
}
public String getNumbersMeetNumbers() {
	return numbersMeetNumbers;
}
public void setNumbersMeetNumbers(String numbersMeetNumbers) {
	this.numbersMeetNumbers = numbersMeetNumbers;
}
 
 
 
 
}

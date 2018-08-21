package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipemanager")
public class RecipeManager {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 @Column(name="name")
 private String name;
 

@Column(name="ing1")
 private String ing1;

 @Column(name="ing2")
 private String ing2;
 
 @Column(name="ing3")
 private String ing3;
 
 @Column(name="ing4")
 private String ing4;
 
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getIng1() {
	return ing1;
}

public void setIng1(String ing1) {
	this.ing1 = ing1;
}

public String getIng2() {
	return ing2;
}

public void setIng2(String ing2) {
	this.ing2 = ing2;
}

public String getIng3() {
	return ing3;
}

public void setIng3(String ing3) {
	this.ing3 = ing3;
}

public String getIng4() {
	return ing4;
}

public void setIng4(String ing4) {
	this.ing4 = ing4;
}

 
 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }


}
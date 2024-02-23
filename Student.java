package com.example.Studentinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
 @Id
 @Generated
 public int id;
 public String name;
 public String address;
 public String email;
 public String phone;
 public String course;
 public String password;
 public String department;
 public String semester;
 public String section;
 public String roll;


}

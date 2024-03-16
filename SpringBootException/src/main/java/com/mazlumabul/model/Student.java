package com.mazlumabul.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
    private Long id;

  //  @GeneratedValue(strategy = GenerationType.UUID)
  //  private String id;

    @Column(name ="FIRST_NAME", length = 100,nullable = false)
    private String firstName;


    @Column(name ="LAST_NAME")
    private String LastName;


    @Column(name ="EMAIL",unique = true)
    private String email;

   // private int schoolNo;

}

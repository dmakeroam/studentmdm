package com.example.studentmdm.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Student")
public class Student extends AbstractPersistable<Long>{

    private String firstName;
    private String lastName;
    private String faculty;
    private String department;
    private Integer years;
}

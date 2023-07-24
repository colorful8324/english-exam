package com.englishexamweb.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tp_id")
    private Integer id;
    @Column(name = "tp_name")
    private String name;
    @Column(name = "tp_description")
    private Integer descr;
    @OneToMany
    @JoinColumn(name = "tp_id")
    private List<Exam> exams;

    public Topic(String name, Integer descr, List<Exam> exams) {
        this.name = name;
        this.descr = descr;
        this.exams = exams;
    }
}

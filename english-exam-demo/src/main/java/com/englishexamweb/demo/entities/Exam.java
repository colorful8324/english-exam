package com.englishexamweb.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ex_id")
    private Integer id;
    @Column(name = "ex_percent")
    private Double percent;
    @Column(name = "ex_question_no")
    private Integer question_no;
    @Column(name = "ex_time")
    private Date time;
    @ManyToMany
    List<Topic> topics;
}

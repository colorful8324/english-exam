package com.englishexamweb.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qu_id")
    private Integer id;
    @Column(name = "qu_content")
    private String questionContent;
    @Column(name = "qu_option1")
    private String option1;
    @Column(name = "qu_option2")
    private String option2;
    @Column(name = "qu_option3")
    private String option3;
    @Column(name = "qu_option4")
    private String option4;
    @Column(name = "qu_answer")
    private Integer answer;
    @Column(name = "qu_explain")
    private String explain;
    @Column(name = "qu_type")
    private Integer type;
    @Column(name = "tp_id")
    private Integer topicId;
    @Column(name = "lv_id")
    private Integer level;

    public Question(String questionContent, String option1, String option2, String option3, String option4, Integer answer, String explain, Integer type, Integer topicId, Integer level) {
        this.questionContent = questionContent;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.explain = explain;
        this.type = type;
        this.topicId = topicId;
        this.level = level;
    }
}

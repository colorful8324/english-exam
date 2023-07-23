package com.englishexamweb.demo.repositories;

import com.englishexamweb.demo.entities.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByTopicId(Integer topicId);
}

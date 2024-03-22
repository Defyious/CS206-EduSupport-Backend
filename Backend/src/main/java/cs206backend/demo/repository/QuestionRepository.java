package cs206backend.demo.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cs206backend.demo.models.Question;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


@Transactional
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    // Methods to find questions, for example by user
    // List<Question> findByTitleAndMentee(String title);
}

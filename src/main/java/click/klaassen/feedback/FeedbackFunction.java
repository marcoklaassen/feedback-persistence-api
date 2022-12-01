package click.klaassen.feedback;

import io.quarkus.funqy.Funq;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Slf4j
public class FeedbackFunction {

    @Inject
    EntityManager em;

    @Transactional
    @Funq
    public void feedback(Feedback feedback) {
        log.info("Feedback persistence got rating: {}", feedback.getRating());
        em.persist(Feedback.builder().rating(feedback.getRating()).build());
    }
}
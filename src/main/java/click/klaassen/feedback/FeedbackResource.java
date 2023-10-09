package click.klaassen.feedback;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/debug")
@ApplicationScoped
public class FeedbackResource {

    @Inject
    EntityManager em;

    @GET
    public String get() {
        return em.createNamedQuery("Feedback.findAll", Feedback.class)
                .getResultList().toString();
    }
}
package nfaustino.com;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class TestResource {
    @Inject
    EntityManager em;

    @GET
    @Transactional
    public MyEntity hello() {
        Data data = new Data();
        data.setLongProp(100l);
        data.setStringProp("Teste");
        MyEntity entity = new MyEntity();
        entity.setFieldJson(data);
        em.persist(entity);

        MyEntity savedEntity = em.find(MyEntity.class, entity.getId());
        System.out.println(savedEntity.getFieldJson().getStringProp());
        return savedEntity;
    }
}

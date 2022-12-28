package nfaustino.com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class TestResource {

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}

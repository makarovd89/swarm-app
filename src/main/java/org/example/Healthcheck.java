package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class Healthcheck {

    @GET
    @Path("/healthcheck")
    @Produces("text/plain")
    public Response hello() {
            return Response.ok()
                    .build();
    }
}

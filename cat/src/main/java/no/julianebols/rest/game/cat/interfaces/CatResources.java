package no.julianebols.rest.game.cat.interfaces;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("cats")
public class CatResources {

    @GET
    public Response getCats(){
        return Response.ok("Vasily").build();
    }

    @POST
    public Response getCatName(String name){
        return Response.ok(name + " the cat.").build();
    }

    @PUT
    public Response getCat(String name){
        return Response.ok(name + " the cat.").build();
    }




}

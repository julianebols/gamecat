package no.julianebols.rest.game.cat.interfaces;

import no.julianebols.rest.game.cat.domain.Cat;
import no.julianebols.rest.game.cat.infrastracture.CatRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("cats")
public class CatResources {

    private CatRepository catRepository;

    public CatResources(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCats() {
        List<Cat> cats = catRepository.getCats();
        return Response.ok(cats).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createCat(Cat cat) {
        boolean createdCat = catRepository.createCat(cat);
        if (createdCat) {
            return Response.ok(cat.getId()).build();
        } else {
            return Response.status(400).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCat(@PathParam("id") String id) {
        Cat cat = catRepository.getCat(id);
        if (cat == null) {
            return Response.status(404).build();
        }
        return Response.ok(cat).build();
    }


}

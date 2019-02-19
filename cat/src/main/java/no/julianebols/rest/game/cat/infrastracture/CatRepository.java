package no.julianebols.rest.game.cat.infrastracture;

import no.julianebols.rest.game.cat.domain.Cat;

import java.util.List;

public interface CatRepository {

    boolean createCat(Cat cat);

    List<Cat> getCats();

    Cat getCat(String id);

    boolean updateCat(Cat cat);

    void deleteCate(String id);
}

package no.julianebols.rest.game.cat.infrastracture.memory;

import no.julianebols.rest.game.cat.domain.Cat;
import no.julianebols.rest.game.cat.infrastracture.CatRepository;

import java.util.ArrayList;
import java.util.List;

public class CatRepositoryInMemory implements CatRepository {

    private List<Cat> cats;

    public CatRepositoryInMemory() {
        this.cats = new ArrayList<>();
    }

    @Override
    public boolean createCat(Cat cat) {
        return cats.add(cat);
    }

    @Override
    public List<Cat> getCats() {
        return cats;
    }

    @Override
    public Cat getCat(String id) {
        Cat catFound = null;

        for (Cat cat : cats) {
            if (cat.getId().equals(id)) {
                catFound = cat;
            }
        }
        return catFound;
    }

    @Override
    public boolean updateCat(Cat cat) {
        return false;
    }

    @Override
    public void deleteCate(String id) {

    }
}

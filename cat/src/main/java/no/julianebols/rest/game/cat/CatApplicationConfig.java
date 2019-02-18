package no.julianebols.rest.game.cat;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.Valid;

public class CatApplicationConfig extends Configuration {
    @Valid
    @JsonProperty("name")
    private String name;

    public CatApplicationConfig(){}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}
}

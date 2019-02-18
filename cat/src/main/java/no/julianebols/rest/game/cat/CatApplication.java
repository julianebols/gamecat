package no.julianebols.rest.game.cat;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import no.julianebols.rest.game.cat.interfaces.CatResources;

public class CatApplication extends Application<CatApplicationConfig> {

    public static void main(String[] args) throws Exception {
       new CatApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<CatApplicationConfig> bootstrap) {
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)));
        super.initialize(bootstrap);
    }

    @Override
    public void run(CatApplicationConfig catApplicationConfig, Environment environment) throws Exception {
        System.out.println("HERE: " + catApplicationConfig);
        CatResources catResources = new CatResources();
        environment.jersey().register(catResources);
    }


}

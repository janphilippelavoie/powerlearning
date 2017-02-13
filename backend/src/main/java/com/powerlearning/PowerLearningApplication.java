package com.powerlearning;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PowerLearningApplication extends Application<PowerLearningConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PowerLearningApplication().run(args);
    }

    @Override
    public String getName() {
        return "PowerLearning";
    }

    @Override
    public void initialize(final Bootstrap<PowerLearningConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PowerLearningConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

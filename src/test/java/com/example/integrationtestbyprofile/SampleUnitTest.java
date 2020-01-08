package com.example.integrationtestbyprofile;

import org.junit.jupiter.api.Test;

/**
 * Created by adam.
 */
class SampleUnitTest {

    @Test
    void shouldRunTestOnlyInIntegrationProfile() {
        System.out.println("Run unit tests");
    }

}

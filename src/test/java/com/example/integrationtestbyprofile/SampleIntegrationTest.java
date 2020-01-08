package com.example.integrationtestbyprofile;

import org.junit.jupiter.api.Test;

/**
 * Created by adam.
 */
class SampleIntegrationTest {

    @Test
    void shouldRunTestOnlyInIntegrationProfile() {
        System.out.println("Run integration tests");
    }

}

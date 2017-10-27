package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class EndpointsAsyncTaskTest {

    @Test
    public void testNonEmptyString() throws Exception {
        EndpointsAsyncTask testTask = new EndpointsAsyncTask(InstrumentationRegistry.getTargetContext());
        testTask.execute();
        String result = testTask.get();
        assertNotNull("result null", result);
        assertTrue("result not empty", result.length() > 0);
    }

}

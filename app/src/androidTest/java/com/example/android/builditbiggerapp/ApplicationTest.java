package com.example.android.builditbiggerapp;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
    @Test
    public void testAsyncTaskReturnsNonEmpty() throws Exception{
        try {
            EndPointsAsyncTask endpointsAsyncTask = new EndPointsAsyncTask();
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(5, TimeUnit.SECONDS);

            assertNotNull(result);

        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "testAsyncTaskReturnsNonEmpty: Failed Test");
        }
    }
}
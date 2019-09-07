package org.sdoroshenko.model;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ThreadTestListener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("[--INFO--] Thread: " + Thread.currentThread().getName());
    }
}

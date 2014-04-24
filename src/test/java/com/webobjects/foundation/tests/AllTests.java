package com.webobjects.foundation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends TestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite("Test for com.webobjects.foundation");
    //$JUnit-BEGIN$
    suite.addTestSuite(TestNSSelector.class);
    suite.addTestSuite(TestNSMutableSet.class);
    suite.addTestSuite(TestNSArray.class);
    suite.addTestSuite(TestNSTimestamp.class);
    suite.addTestSuite(TestNSMutableRange.class);
    suite.addTestSuite(TestNSMutableArray.class);
    suite.addTestSuite(TestNSDictionary.class);
    suite.addTestSuite(TestNSSet.class);
    suite.addTestSuite(TestNSRange.class);
    suite.addTestSuite(TestNSMutableDictionary.class);
    suite.addTestSuite(TestNSNotificationCenter.class);
    //$JUnit-END$
    return suite;
  }

}

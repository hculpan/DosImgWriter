package org.culpan.dosimgwriter;

import org.junit.Test;

public class MainTest {
    @Test
    public void testMain() throws Exception {
        System.out.println("This is my test");
    }

    @Test
    public void testMain2() throws Exception {
        throw new Exception("This is my exception");
    }

}
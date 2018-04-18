package org.sample;

import org.junit.Test;

public class SlowProjectTest {

    @Test
    public void testSlow() {
        new Project("test");
    }
}

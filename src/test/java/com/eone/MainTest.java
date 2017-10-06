package com.eone;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();

    @Test
    public void sum() throws Exception {
        int sum = main.sum(1, 2);
        assertEquals(3, sum);
    }

    @Test
    public void main() {
        Main.main(new String[] {});
    }

}

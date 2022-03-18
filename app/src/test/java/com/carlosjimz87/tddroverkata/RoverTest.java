package com.carlosjimz87.tddroverkata;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {
    Rover rover;

    @Before
    public void setUp() {
        rover = new Rover();
    }

    @Test
    public void init_rover_position_is_0_0_N() {
        assertThat(rover.getPoint(), is("0:0:N"));
    }

    @Test
    @Parameters({
            "R,0:0:E"
    })
    public void rotate_right(String commands, String position) {
        assertThat(rover.execute(commands), is(position));
    }
}

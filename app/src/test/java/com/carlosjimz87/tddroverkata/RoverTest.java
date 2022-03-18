package com.carlosjimz87.tddroverkata;

import static com.google.common.truth.Truth.assertThat;

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
    public void init_position_is_0_0_N() {
        assertThat(rover.execute("")).isEqualTo("0:0:N");
    }

    @Test
    @Parameters({
            "R,0:0:E",
            "RRR,0:0:W",
            "RRRR,0:0:N",
            "RRRRRRRR,0:0:N",
    })
    public void rotate_right(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }

    @Test
    @Parameters({
            "L,0:0:W",
            "LLL,0:0:E",
            "LLLL,0:0:N",
            "LLLLLLLL,0:0:N",
    })
    public void rotate_left(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }
}

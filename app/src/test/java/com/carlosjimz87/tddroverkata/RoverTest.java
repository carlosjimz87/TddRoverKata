package com.carlosjimz87.tddroverkata;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {
    private Rover rover;

    @Before
    public void setUp() {
        rover = new Rover();
    }

    @Test
    public void init_position_is_correct() {
        assertThat(rover.execute("")).isEqualTo("0:0:N");
    }

    @Test
    @Parameters({
            "R,0:0:E",
            "RR,0:0:S",
            "RRR,0:0:W",
            "RRRR,0:0:N",
    })
    public void rotation_is_correct(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }

}

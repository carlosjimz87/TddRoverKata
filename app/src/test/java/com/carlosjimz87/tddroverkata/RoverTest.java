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
    public void rotate_right(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }

    @Test
    @Parameters({
            "L,0:0:W",
            "LL,0:0:S",
            "LLL,0:0:E",
            "LLLL,0:0:N",
    })
    public void rotate_left(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }

    @Test
    @Parameters({
            "M,0:9:N",
            "RM,1:0:E",
            "RRM,0:1:S",
            "RRRM,9:0:W",
            "RMMMMM,5:0:E",
            "RMMMMMMMMMM,0:0:E",
            "RMMMMMMMMMMMMMMM,5:0:E",
    })
    public void move_right(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }

    @Test
    @Parameters({
            "LM,9:0:W",
            "LLM,0:1:S",
            "LLLM,1:0:E",
            "LMMMMM,5:0:W",
            "LMMMMMMMMMM,0:0:W",
            "LMMMMMMMMMMMMMMM,5:0:W",
    })
    public void move_left(String commands, String position) {
        assertThat(rover.execute(commands)).isEqualTo(position);
    }

}

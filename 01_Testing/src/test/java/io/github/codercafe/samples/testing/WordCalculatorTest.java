package io.github.codercafe.samples.testing;

import org.junit.Test;

import java.text.ParseException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordCalculatorTest {

    @Test
    public void add() throws ParseException {
        WordCalculator calculator = new WordCalculator();
        assertThat(calculator.add("three", "two"), is(equalTo(5)));
    }

    @Test
    public void subtract() {

    }

    @Test
    public void multiply() {

    }

    @Test
    public void divide() {

    }

    @Test
    public void primeFactorization() {

    }

}
package probability;

import probability.exceptions.InvalidInputException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class ProbabilityTest {

    private Probability probability;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception, InvalidInputException {
        probability = Probability.create(0.5);
    }

    @Test
    public void ExceptionThrownWhenOneAskAProbabilityWithNegativeChance() throws InvalidInputException {
        thrown.expectMessage("Expected: between 0 to 1,\nActual: -0.1");
        thrown.expect(InvalidInputException.class);
        Probability.create(-0.1);
    }

    @Test
    public void ExceptionThrownWhenOneAskAProbabilityWithGreaterThanOneChance() throws InvalidInputException {
        thrown.expectMessage("Expected: between 0 to 1,\nActual: 1.1");
        thrown.expect(InvalidInputException.class);
        Probability.create(1.1);
    }

    @Test
    public void representTheChanceOfOccuranceWhenAProbabilityIsGiven() throws InvalidInputException {
        Probability chance = probability.occurrence(Probability.create(0.5));
        Probability expected = Probability.create(0.25);
        assertTrue(chance.equals(expected));
    }

    @Test
    public void representTheChanceOfNotOccurrenceWhenAProbabilityIsGiven() throws InvalidInputException {
        Probability notOccurrence = probability.notOccurrence();
        Probability expected = Probability.create(0.5);
        assertTrue(notOccurrence.equals(expected));
    }

    @Test
    public void representTheDeMorgansLaw() throws InvalidInputException {
        Probability occurrence = probability.or(Probability.create(0.5));
        Probability expected = Probability.create(0.75);
        assertTrue(expected.equals(occurrence));
    }
}
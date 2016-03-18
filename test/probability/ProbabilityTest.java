package probability;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProbabilityTest {

    @Test
    public void probabilityToGetTailWhenItTossedACoin() {
        Probability probability = new Probability(2);
        assertEquals(0.5, probability.getChanceOfOccurrenceAtEveryTime(1));
    }

    @Test
    public void probablityToNotGetATailWhileFlippingACoinIsDifferenceOf1AndGettingTail() {
        Probability probability = new Probability(2);
        assertEquals(0.5, probability.getChanceOfNotOccurrence(1));
    }

    @Test
    public void probabilityToGetTailsEverytimeWhenFlippingTwoCoinsIs1by4() {
        Probability probability = new Probability(2);
        assertEquals(0.25, probability.getChanceOfOccurrenceAtEveryTime(2));

    }

    @Test
    public void probabilityOfGettingAtLestOneTailsIs3By4TimesOfNumberOfFlips() {
        Probability probability = new Probability(2);
        assertEquals(0.75, probability.getChanceOfAtLeastOneOccurrence(2));

    }
}
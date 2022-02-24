package com.bridgelab.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	
	@Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }

}

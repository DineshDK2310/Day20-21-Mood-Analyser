package com.bridgelab.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMessege_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is the Sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessege_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is the Happy mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}

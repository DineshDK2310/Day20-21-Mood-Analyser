package com.bridgelab.moodanalyzer;

public class MoodAnalyser {


	public String analyseMood(String message) {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}
		} catch (NullPointerException ex) {
			return "HAPPY";
		}
		return null;
	}
}

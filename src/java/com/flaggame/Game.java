/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flaggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Chris
 */
public class Game {
    private ArrayList<String> urls;
    private ArrayList<String> countries;
    private int difficulty;
    private String playerName;
    private int currentScore;
    private int currentNumber;

    /**
     * @return the difficulty
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the currentScore
     */
    public int getCurrentScore() {
        return currentScore;
    }

    /**
     * @param currentScore the currentScore to set
     */
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    /**
     * @return the urls
     */
    public List<String> getUrls() {
        return urls;
    }

    /**
     * @param urls the urls to set
     */
    public void setUrls(List<String> urls) {
        this.urls = (ArrayList<String>) urls;
    }

    /**
     * @return the countries
     */
    public List<String> getCountries() {
        return countries;
    }

    /**
     * @param countries the countries to set
     */
    public void setCountries(List<String> countries) {
        this.countries = (ArrayList<String>) countries;
    }

    /**
     * @return the currentNumber
     */
    public int getCurrentNumber() {
        return currentNumber;
    }

    /**
     * @param currentNumber the currentNumber to set
     */
    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }
    
    
}

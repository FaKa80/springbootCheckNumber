package com.example.demo.checknumber;

import java.util.ArrayList;

public class CheckNumber {
    private String checkArmstrong;
    private ArrayList<Integer> factors;

    public CheckNumber(String checkArmstrong, ArrayList<Integer> factors) {
        this.checkArmstrong = checkArmstrong;
        this.factors = factors;
    }

    public String getCheckArmstrong() {
        return checkArmstrong;
    }

    public void setCheckArmstrong(String checkArmstrong) {
        this.checkArmstrong = checkArmstrong;
    }

    public ArrayList<Integer> getFactors() {
        return factors;
    }

    public void setFactors(ArrayList<Integer> factors) {
        this.factors = factors;
    }

    @Override
    public String toString() {
        return "CheckNumber{" +
                "checkArmstrong='" + checkArmstrong + '\'' +
                ", prime factors=" + factors +
                '}';
    }
}

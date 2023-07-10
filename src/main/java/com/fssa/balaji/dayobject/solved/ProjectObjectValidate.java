package com.fssa.balaji.dayobject.solved;

public class ProjectObjectValidate { 

    public static boolean validate(Minister minister) throws IllegalArgumentException {

        if (minister == null) {
            throw new IllegalArgumentException("Argument is NULL");
        }
        
        validateName(minister.getWinCantidateName());
        validateConstuency(minister.getConstuencyName());
        validateDistrict(minister.getDistrict());
        validateParties(minister.getParties());
        validateCantidateVotes(minister.getCantidateVotes());
        validateTotalVotes(minister.getTotalVotesOfConstuency());
        validateExperience(minister.getExprience());

        return true; // Return true if validation passes
    }
 
    private static void validateName(String name) {
        if (name == null || name.isEmpty() || !name.matches("[a-zA-Z]+")) {
        	
            throw new IllegalArgumentException("Minister name is required");
        }
    }
 
    private static void validateConstuency(String constuency) {
        if (constuency == null || constuency.isEmpty() || !constuency.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Constuency name is required");
        }
    }

    private static void validateDistrict(String name) {
        if (name == null || name.isEmpty() || !name.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("District name is required");
        }
    }

    private static void validateParties(String name) {
        if (name == null || name.isEmpty() || !name.matches("[a-zA-Z0-9]+") || name.length() < 3) {
            throw new IllegalArgumentException("Parties name is required");
        }
    }

    private static void validateCantidateVotes(float votes) {
        if (votes <= 0) {
            throw new IllegalArgumentException("Votes is required");
        }
    }

    private static void validateTotalVotes(int total) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total votes is required");
        }
    }

    private static void validateExperience(int experience) {
        if (experience <= 0 || experience >= 100) {
            throw new IllegalArgumentException("Minister experience should be a positive value");
        }
    }
}


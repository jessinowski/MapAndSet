package com.github;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    // Step 2:
    // Create a Java class 'Pharmacy' that uses a Java Map
    // to store the Medication name as the key and its information as the value.
    private Map<String, Medication> medicationMap = new HashMap<>();

    // Step 3:
    // Create a method 'int getCount()' in the class Pharmacy.
    // This method should return the number of Medications in the pharmacy.
    public int getCount(){
        return medicationMap.size();
    }

    // Step 4:
    // Create a method 'void save(Medication medication)' in the class Pharmacy.
    // This method should insert the Medication indexed by its name into the pharmacy.
    public void save(Medication medication){
        medicationMap.put(medication.getName(), medication);
    }

    // Step 5:
    // Create a method 'Medication find(String medicationName)' in the class Pharmacy.
    // This method should return the requested Medication with this name.
    // If no Medication with this name is found, the method should return null.
    public Medication find(String medicationName){
        if (medicationMap.containsKey(medicationName)) {
            return medicationMap.get(medicationName);
        } else {
            return null;
        }
    }

    // Step 6:
    // Create a method 'void delete(String medicationName)' in the class Pharmacy.
    // This method should delete the Medication with this name.
    public void delete(String medicationName){
        medicationMap.remove(medicationName);
    }

    // Step 7:
    // Implement a method to print all Medications in the map,
    // including their name, price, and availability.
    @Override
    public String toString() {
        return "Pharmacy{" +
                "medicationMap=" + medicationMap +
                '}';
    }
}

package com.balki;

public class TSP_GA {

    public static void main(String[] args) {

        // Create and add our cities
        City city = new City("İstanbul", 41.01, 28.97);
        TourManager.addCity(city);
        City city2 = new City("Izmit", 40.77, 29.92);
        TourManager.addCity(city2);
        City city3 = new City("Bolu", 40.73, 31.58);
        TourManager.addCity(city3);
        City city4 = new City("Ankara", 39.92, 32.86);
        TourManager.addCity(city4);
        City city5 = new City("Izmir", 38.42, 27.14);
        TourManager.addCity(city5);
        City city6 = new City("Antalya", 36.91, 30.70);
        TourManager.addCity(city6);

        // Initialize population
        Population pop = new Population(6, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
        
        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}

package edu.jhu.cs.oose.fall2017.examples.videorental;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final String ROSENCRANTZ_AND_GUILDENSTERN_ARE_DEAD = "Rosencrantz and Guildenstern are Dead";
    public static final String SUCKERPUNCH = "Suckerpunch";
    public static final String ANASTASIA = "Anastasia";
    public static final String BRAVE_LITTLE_TOASTER = "Brave Little Toaster, The";
    public static final String CITIZEN_KANE_3D = "Citizen Kane 3D";
    public static final String RIVER_TAM_BEATS_UP_EVERYONE = "River Tam Beats Up Everyone";
    public static final String SNEAKERS = "Sneakers";

    // Public static fields for customers
    public static final Customer gretelFishweaver;
    public static final Customer danielleDeBarbarac;
    public static final Customer richardCarlisle;
    public static final Customer murrayHewitt;

    static {
        // Initialize movies
        Movie rosencrantzAndGuildensternAreDead = new Movie(ROSENCRANTZ_AND_GUILDENSTERN_ARE_DEAD, new RegularPriceCalculator());
        Movie suckerpunch = new Movie(SUCKERPUNCH, new RegularPriceCalculator());
        Movie anastasia = new Movie(ANASTASIA, new ChildrensPriceCalculator());
        Movie braveLittleToaster = new Movie(BRAVE_LITTLE_TOASTER, new ChildrensPriceCalculator());
        Movie citizenKane3D = new Movie(CITIZEN_KANE_3D, new NewReleasePriceCalculator());
        Movie riverTamBeatsUpEveryone = new Movie(RIVER_TAM_BEATS_UP_EVERYONE, new NewReleasePriceCalculator());
        Movie sneakers = new Movie(SNEAKERS, new RegularPriceCalculator());

        // Initialize customers
        gretelFishweaver = new Customer("Fishweaver, Gretel");
        gretelFishweaver.addRental(new Rental(rosencrantzAndGuildensternAreDead, 2));
        gretelFishweaver.addRental(new Rental(suckerpunch, 2));
        gretelFishweaver.addRental(new Rental(anastasia, 1));
        gretelFishweaver.addRental(new Rental(braveLittleToaster, 5));
        gretelFishweaver.addRental(new Rental(citizenKane3D, 1));
        gretelFishweaver.addRental(new Rental(riverTamBeatsUpEveryone, 3));

        danielleDeBarbarac = new Customer("de Barbarac, Danielle");
        danielleDeBarbarac.addRental(new Rental(anastasia, 2));
        danielleDeBarbarac.addRental(new Rental(anastasia, 2));
        danielleDeBarbarac.addRental(new Rental(anastasia, 2));

        richardCarlisle = new Customer("Carlisle, Sir Richard");
        richardCarlisle.addRental(new Rental(citizenKane3D, 10));

        murrayHewitt = new Customer("Hewitt, Murray");
        murrayHewitt.addRental(new Rental(sneakers, 947));
    }

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(gretelFishweaver, danielleDeBarbarac, richardCarlisle, murrayHewitt);
        for (Customer customer : customers) {
            System.out.println(customer.generateStatement());
            System.out.println("********************************************************************************");
        }
    }
}
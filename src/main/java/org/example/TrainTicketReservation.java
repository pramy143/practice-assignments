package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TrainTicketReservation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1st: no of people,
        // 2nd: is the number of ticket windows,
        // 3rd:  is the number of destinations separated by a single space (in the same order)
        String[] noPeopleTicketWindowsAndDestinations = in.nextLine().split(" ");

        // Place and price for the ticket booking
        String[]  ticketWindowsAndPrice= in.nextLine().split(",");

        // Place and price for the ticket booking
        String[] places = in.nextLine().split(",");

        findOutPut(noPeopleTicketWindowsAndDestinations, ticketWindowsAndPrice, places);

        System.out.println(noPeopleTicketWindowsAndDestinations.length);
    }

    private static void findOutPut(String[] noPeopleTicketWindowsAndDestinations, String[] ticketWindowsAndPrice, String[] places) {

        Set<String> counterWindow = new TreeSet<>();
        Map<String, List<String>> queueUpdate = new HashMap<>();

    }

}

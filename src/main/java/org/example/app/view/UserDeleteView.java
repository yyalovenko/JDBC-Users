package org.example.app.view;

import java.util.Scanner;

public class UserDeleteView {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String title = "Enter user's ID: ";
        System.out.print(title);
        String id = scanner.nextLine().trim();
        return new String[]{id};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

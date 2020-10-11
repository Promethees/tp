package seedu.duke.user;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class User {
    private String name;
    private LocalDateTime registeredDate;

    public User(String name) {
        setName(name);
        setRegisteredDate();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegisteredDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        this.registeredDate = now;
    }

    public void greetUser() {
        System.out.println("Hello " + this.name + ". Welcome to Fluffle!");
        System.out.println("Your registration has been recorded at " + registeredDate);
    }

    public void printInstruction() {
        System.out.println("Please type in the following commands to proceed!");
    }

    @Override
    public String toString() {
        return "Your username is: " + name
                + "Your registeredDate is" + registeredDate;
    }
}

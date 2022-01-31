import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    static ArrayList<User> users = new ArrayList<User>();


    public static void printMenu() {
        // Function to print various user options
        System.out.println("\n");
        System.out.println("Select an option:");
        System.out.println("(1) Create a Calendar");
        System.out.println("(2) Delete a Calendar");
        System.out.println("(3) Rename a Calendar");
        System.out.println("(4) View Calendars");
        System.out.println("(5) Add an Event");
        System.out.println("(6) Remove an Event");
        System.out.println("(7) Edit an Event");
        System.out.println("(8) View Events in a Calendar");
        System.out.println("(9) Search Calendar for Events");
        System.out.println("(10) View Details of an Event");
        System.out.println("(11) Change Timezone");
        System.out.println("(12) Login as another user");

        System.out.println("(0) Exit");
    }

    // Creates a User object and adds to array to simulate logging that user in
    public static int signUserIn(String userName) {
        boolean userExists = false;
        int index = 0;

        if (users.size() == 0) {

            users.add(new User(userName));

        }

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(userName)) {
                userExists = true;
                index = i;
                System.out.println(userName + " is logged in!");

            }

        }
        if (userExists == false) {
            users.add(new User(userName));
        }

        return index;

    }
    // Creates a calendar under a user
    public static void createCal(String calName, String username) {

        System.out.println("Calendar name is: " + calName);

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(username)) {
                users.get(i).addCalendar(calName);

            }
        }

    }
    // Deletes a user's calendar
    public static void deleteCal(String calName, int index) {

        ArrayList<Calendar> arrCal = users.get(index).calendars;

        for (int i = 0; i < arrCal.size(); i++) {
            if (arrCal.get(i).getCalName().equals(calName)) {
                arrCal.remove(i);
            }
        }
        System.out.println("Successfully deleted " + calName);

    }

    // Renames an existing calendar
    public static void renameCal(String torename, String newcalname, int index) {

        ArrayList<Calendar> arrCal = users.get(index).calendars;

        for (int i = 0; i < arrCal.size(); i++) {
            if (arrCal.get(i).getCalName().equals(torename)) {
                arrCal.get(i).setCalName(newcalname);
                ;
            }
        }
        System.out.println("Successfully renamed " + torename + " to " + newcalname);

    }

    // Displays all calendars under a username

    public static void viewCals(String uName) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(uName)) {
                ArrayList<Calendar> userCals = users.get(i).getCalendars();
                for (int j = 0; j < userCals.size(); j++) {
                    System.out.println(userCals.get(j).name);
                }

            }
        }

    }
    // displays all users by username
    public static void viewUsers() {

        for (int i = 0; i < users.size(); i++) {

            System.out.println(users.get(i).getName());

        }

    }

    // creates an event in a user's calendar
    public static void createEvent(String calendartoAddTo, String eventName, String time, String dur, int index) throws ParseException {

        ArrayList<Calendar> calArr = users.get(index).calendars;
        for (int i = 0; i < calArr.size(); i++) {

            if (calArr.get(i).getCalName().equals(calendartoAddTo)) {
                calArr.get(i).addEvent(eventName, time, dur);

                

            }

        }

    }

    // deletes an event in a user's calendar
    public static void deleteEvent(String calName, int index, String eventName) {

        ArrayList<Calendar> arrCal = users.get(index).calendars;

        for (int i = 0; i < arrCal.size(); i++) {
            if (arrCal.get(i).getCalName().equals(calName)) {
                for (int e = 0; e < arrCal.get(i).events.size(); e++) {
                    if (arrCal.get(i).events.get(e).getEventName().equals(eventName)) {
                        arrCal.get(i).events.remove(e);
                    }
                }
            }
        }
        System.out.println("Successfully deleted " + eventName);

    }

    // allows a user to rename an event in a calendar
    public static void renameEvent(String caleventbelongsto, String eventtoberenamed, String neweventname, int index) {

        ArrayList<Calendar> arrCal = users.get(index).calendars;

        for (int i = 0; i < arrCal.size(); i++) {
            if (arrCal.get(i).getCalName().equals(caleventbelongsto)) {
                for (int j = 0; j < arrCal.get(i).events.size(); j++) {
                    if (arrCal.get(i).events.get(j).getEventName().equals(eventtoberenamed)) {
                        arrCal.get(i).events.get(j).setEventName(neweventname);
                    }
                }
            }
        }
        System.out.println("Successfully renamed " + eventtoberenamed + " to " + neweventname);

    }

    // displays the details of a selected event
    public static void eventDetails(String calDet, String eventDet, int index, String tz) throws ParseException {
        ArrayList<Calendar> arrCal = users.get(index).calendars;

        for (int i = 0; i < arrCal.size(); i++) {
            if (arrCal.get(i).getCalName().equals(calDet)) {
                for (int j = 0; j < arrCal.get(i).events.size(); j++) {
                    if (arrCal.get(i).events.get(j).getEventName().equals(eventDet)) {
                        System.out.println(arrCal.get(i).events.get(j).createDetails(tz));
                    }
                }
            }
        }

    }

    // displays all events in a user's calendar
    public static void viewEvents(int userindex, String calName) {
        ArrayList<Calendar> calArr = users.get(userindex).calendars;
        for (int i = 0; i < calArr.size(); i++) {
            if (calArr.get(i).getCalName().equals(calName)) {
                System.out.println(calArr.get(i).eventsToString());
            }

        }

    }

    // displays all events in a calendar that contain the user searched string
    public static void searchEvents(String calsearch, String searchsubstr, int index){
        ArrayList<Calendar> calArr = users.get(index).calendars;
        for (int i = 0; i < calArr.size(); i++) {
            if (calArr.get(i).getCalName().equals(calsearch)) {
                System.out.println(calArr.get(i).search(searchsubstr));
            }

        }
    }

    // main method with all the cases based on which menu item the user selects
    public static void main(String[] args) throws ParseException {
        System.out.println("******WELCOME TO THE BEST CALENDAR APP EVER*****");
        int choiceentry;
        Scanner myObj = new Scanner(System.in);
        String tz = "America/New_York";
        System.out.println("Enter a username:");
        String userName = myObj.next();
        int userindex = signUserIn(userName);

        do {
            printMenu();

            choiceentry = myObj.nextInt();

            switch (choiceentry) {
                case 1:
                    System.out.println("Enter calendar name:");
                    String calName = myObj.next();
                    createCal(calName, userName);

                    break;
                case 2:
                    System.out.println("Enter calendar name:");
                    String calDelete = myObj.next();
                    deleteCal(calDelete, userindex);

                    break;
                case 3:
                    System.out.println("Enter the name of the calendar you'd like to rename:");
                    String rename = myObj.next();
                    System.out.println("Enter the new name:");
                    String newNameCal = myObj.next();
                    renameCal(rename, newNameCal, userindex);
                    break;

                case 4:
                    System.out.println("These are " + userName + "'s calendars:");
                    viewCals(userName);
                    break;

                case 5:

                    System.out.println("Enter the calendar name you would like to add this event to:");
                    String calendartoAddTo = myObj.next();
                    System.out.println("Enter event name:");
                    String eventName = myObj.next();
                    System.out.println("Enter the day, time, and AM/PM the event starts [dd-M-yyyy hh:mm a]:");
                    String timebeg = myObj.next() + " " + myObj.next() + " " + myObj.next();
                    System.out.println("Enter the day, time, and AM/PM the event ends [dd-M-yyyy hh:mm a]:");
                    String timeend = myObj.next() + " " + myObj.next() + " " + myObj.next();
                    

                    createEvent(calendartoAddTo, eventName, timebeg, timeend, userindex);

                    break;

                case 6:
                    System.out.println("Enter calendar you'd like to delete an event from:");
                    String caleventDel = myObj.next();
                    System.out.println("Enter the name of the event you'd like to delete:");
                    String eventDel = myObj.next();
                    deleteEvent(caleventDel, userindex, eventDel);
                    // remove event

                    break;

                case 7:
                    System.out.println("Enter the name of the calendar that contains the event to update:");
                    String eventrenamecal = myObj.next();
                    System.out.println("Enter the name of the event you'd like to rename:");
                    String eventrename = myObj.next();
                    System.out.println("Enter new name of the event:");
                    String neweventname = myObj.next();
                    renameEvent(eventrenamecal, eventrename, neweventname, userindex);

                    break;

                case 8:
                    System.out.println("Enter the calendar you want to see events for:");
                    String calforEvents = myObj.next();
                    viewEvents(userindex, calforEvents);

                    break;
                case 9:
                    System.out.println("Enter the calendar you want to search:");
                    String calsearch = myObj.next();
                    System.out.println("Search: ");
                    String searchstr = myObj.next();

                    searchEvents(calsearch, searchstr, userindex);
                    break;
                    
                case 10:
                    System.out.println("Enter the name of the calendar that contains the event:");
                    String detailsCal = myObj.next();
                    System.out.println("Enter the name of the event you'd like to select:");
                    String detailsEvent = myObj.next();

                    eventDetails(detailsCal, detailsEvent, userindex, tz);

                    break;

                case 11:
                    System.out.println("Enter a Timezone [PST or EST]:");
                    String timezone = myObj.next();
                    if (timezone.equals("PST")){
                        tz = "America/California";

                    }
                    if (timezone.equals("EST")){
                        tz = "America/New_York";

                    }
                    break;

                case 12:
                    System.out.println("Enter another username:");
                    userName = myObj.next();
                    userindex = signUserIn(userName);
                    break;

                case 0:
                    System.exit(0);
                    // .. exit program
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 3.");
            }

        } while (choiceentry != 0);
        printMenu();

        myObj.close();

    }

}

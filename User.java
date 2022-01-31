import java.util.ArrayList;

public class User {

    String userName;
    ArrayList<Calendar> calendars = new ArrayList<Calendar>();

    public User(String name){
        setName(name);
        

    }

    void addCalendar(String calName){
        calendars.add(new Calendar(calName));
    }

    ArrayList<Calendar> getCalendars(){
        return calendars;
    }

    void setName(String name) {
        this.userName= name;
    }

    String getName() {
        return userName;
    }
    
}

import java.text.ParseException;
import java.util.ArrayList;

public class Calendar {
    String name;
    ArrayList<Event> events = new ArrayList<Event>();

    public Calendar(String calName){
        name = calName;
    }

    void addEvent(String eventName, String time, String endtime) throws ParseException{
        events.add(new Event(eventName, time, endtime));

    }
    String getCalName(){
        return name;

    }
    void setCalName(String newName){
        name = newName;

    }

    String eventsToString(){
        String result = "Events in this calendar are: ";
        for (int i = 0; i < events.size(); i++) {
            result += events.get(i).getEventName() + "\n";
        } 
        return result;
    }

    String search(String searchstr){
        String result = "";
        for (int i = 0; i < events.size(); i++) {
            if(events.get(i).getEventName().contains(searchstr)){
                result += events.get(i).getEventName() + "\n";
            }
            
        } 

        return result;
    }

 
	
}

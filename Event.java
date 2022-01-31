import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Event {
    String eventName;
    String startTime;
    String endTime;

    
    


    public Event(String name, String time, String endtime) throws ParseException{
        eventName = name;
        startTime = time;
        endTime = endtime;

    }

    String createDetails(String timezone) throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm a");
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        
        Date s = dateFormat.parse(startTime);
        Date e = dateFormat.parse(endTime);

        String result = "";
        result += "Event Name: " + eventName + "\n";
        result += "Start Time: " + s + "\n";
        result += "End Time: " + e + "\n";

        return result;
    }



    
    String getEventName(){
        return eventName;
    }
    void setEventName(String newName){
        eventName = newName;

    }






    
}

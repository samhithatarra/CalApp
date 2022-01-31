# Calendar Application (Samhitha Tarra)

By following all the outlined steps in order with example inputs you will see how I satisfied each of the 8 requirements selected. Keep in mind this program is case-sensitive. 

I used openjdk version "16.0.1" 2021-04-20.

1. The Calendarsapp must support the Gregorian calendar.
    - This calendar app was designed to follow the Gregorian calendar, by entering dates for events in calendars you will easily tell that it follows the Gregorian Calendar.

2. Each calendar in the Calendarsapp can have different sets of events that a user can set hours and minutes for, including starting and ending times.
    - Enter a username (ex: **Sam**)
    - Enter **1** (Create a Calendar)
    - Enter Calendar Name (ex: **Work**)
    - Enter **5** (Add an Event)
    - Enter Calendar to add event to (ex: **Work**)
    - Enter Event name (ex: **Meeting**)
    - Enter day/time of event start (ex: **20-2-2022 06:30 AM**)
    - Enter day/time of event end (ex: **20-2-2022 07:30 AM**)
    - Enter **1** (Create a Calendar)
    - Enter Calendar Name (ex: **School**)
    - Enter **5** (Add an Event)
    - Enter Calendar to add event to (ex: **School**)
    - Enter Event name (ex: **Class**)
    - Enter day/time of event start (ex: **30-3-2022 09:30 AM**)
    - Enter day/time of event end (ex: **30-3-2022 10:30 AM**)
    - Enter **8** (View Events in a Calendar)
    - Enter calendar name to show events (ex: **Work**)
    - Enter **8** (View Events in a Calendar)
    - Enter calendar name to show events (ex: **School**)
4. A user can add, remove, and update events.
    - Enter **5** (Add an Event)
    - Enter Calendar to add event to (ex: **School**)
    - Enter Event name (ex: **Exam**)
    - Enter day/time of event start (ex: **04-2-2022 05:00 PM**)
    - Enter day/time of event end (ex: **04-2-2022 06:00 PM**)
    - Enter **8** (View Events in a Calendar)
    - Enter calendar name to show events (ex: **School**)

    - Enter **7** (Edit an Event)
    - Enter Calendar that has the event to edit (ex: **School**)
    - Enter event to rename (ex: **Exam**)
    - Enter new name (ex: **Study**)
    - Enter **8** (View Events in a Calendar)
    - Enter calendar name to show events (ex: **School**)

    - Enter **6** (Remove an Event)
    - Enter calendar to delete from (ex: **School**)
    - Enter event to delete (ex: **Study**)
    - Enter **8** (View Events in a **Calendar**)
    - Enter calendar name to show events (ex: **School**)


5. The Calendarsapp supports multiple users each of which may have multiple calendars.
    - Currently we have been adding calendars and events to the user Sam
    - Enter **4** (View Calendars)
    - Enter **12** (Login as another user)
    - Enter another username (ex: **Amanda**)
    - Enter **1** (Create a Calendar)
    - Enter Calendar Name (ex: **MCAT**)
    - Enter **4** (View Calendars)
    - Enter **12** again
    - Enter username (ex: **Sam**)
    - Enter **4** (View Calendars)
    - We can see that switching between usernames their respective calendars and events are still accessible


6. Users can add, remove, and update individual calendars.
    - We have already seen calendars added so let's rename and delete a calendar.
    - Enter **3** (Rename a Calendar)
    - Enter existing calendar to rename (ex: **Work**)
    - Enter new name for calendar (ex: **Family**)
    - Enter **4** (View Calendars) to see changes take effect

    - Enter **2** (Delete a Calendar)
    - Enter calendar name to delete (ex: **Family**)
    - Enter **4** (View Calendars) to see changes take effect

16. Selecting a particular event should show details of an event, including the time it starts and ends, the title of the event, and any users the event is shared with.

    - Enter **10** (View Details of an Event)
    - Enter calendar of event (ex: **School**)
    - Enter name of event (ex: **Class**)
    
    
7. The Calendarsapp supports multiple time zones. Changing time zones for the app automatically updates the time for events in a user's calendar.

    - Events are default set to EST so we will change it to PST below
    - Enter **11** (Change Timezone)
    - Enter PST/EST (ex: **PST**)
    - Enter **10** (View Details of an Event)
    - Enter calendar of event (ex: **School**)
    - Enter name of event (ex: **Class**)

    

15. A user should be able to search for events that contain a particular string or substring. For example, if a user searches for "birth", events entitled "Rebirth meeting" and "Birthday party" should be returned to the user.

    - For the sake of demonstration let's add another event "Research"
    - Enter **5** (Add an Event)
    - Enter Calendar to add event to (ex: **School**)
    - Enter Event name (ex: **Research**)
    - Enter day/time of event start (ex: **04-2-2022 05:00 PM**)
    - Enter day/time of event end (ex: **04-2-2022 06:00 PM**)
    - Enter **8** (View Events in a Calendar)
    - Enter calendar name to show events (ex: **School**)

    - Now that we have events "Class" and "Research" let's search for "Re", we should get "Research to display
    - Enter **9** (Search Calendar for Events)
    - Enter calendar to search (ex: **School**)
    - Enter search term (ex: **Re**)









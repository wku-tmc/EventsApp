package sg.edu.tmc.comp1661.eventsapp;

public class Event {
    String id;
    String title;
    String location;
    String datetime;
    String organiser;
    String description;

    public Event(String title, String location, String datetime, String organiser, String description) {
        this.title = title;
        this.location = location;
        this.datetime = datetime;
        this.organiser = organiser;
        this.description = description;
    }

    public Event() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

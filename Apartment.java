package SPD_asnmnt1;

public class Apartment {
    private int rooms;
    private int floor;
    private String furniture;
    private String appliances;
    private String interior;
    private boolean balcony;
    private boolean smartHome;
    private String heating;

    private boolean euroRenovation;
    private boolean panoramicView;
    private boolean penthouse;
    public Apartment(int rooms, int floor, String furniture,String appliances, String interior, boolean balcony,
                     boolean smartHome, String heating,boolean euroRenovation,boolean panoramicView,boolean penthouse){
        this.rooms = rooms;
        this.floor = floor;
        this.furniture = furniture;
        this.appliances = appliances;
        this.interior = interior;
        this.balcony = balcony;
        this.smartHome = smartHome;
        this.heating = heating;
        this.euroRenovation = euroRenovation;
        this.panoramicView = panoramicView;
        this.penthouse = penthouse;

    }
    public int getRooms() {
        return rooms;
    }
    public int getFloor() {
        return floor;
    }
    public String getFurniture() {
        return furniture;
    }
    public String getAppliances() {
        return appliances;
    }
    public String getInterior() {
        return interior;
    }
    public boolean isBalcony() {
        return balcony;
    }
    public boolean isSmartHome() {
        return smartHome;
    }
    public String getHeating() {
        return heating;
    }
    public boolean isPanoramicView() {
        return panoramicView;
    }
    public boolean isEuroRenovation() {
        return euroRenovation;
    }
    public boolean isPenthouse() {
        return penthouse;
    }
    @Override
    public String toString() {
        return "Apartment:\n" +
                "1) Rooms: " + rooms + "\n" +
                "2) Floor: " + floor + "\n" +
                "3) Furniture: " + furniture + "\n" +
                "4) Appliances: " + appliances + "\n" +
                "5) Interior: " + interior + "\n" +
                "6) Balcony: " + balcony + "\n" +
                "7) Smart Home: " + smartHome + "\n" +
                "8) Heating: " + heating + "\n" +
                "9) Euro Renovation: " + euroRenovation + "\n" +
                "10) Panoramic View: " + panoramicView + "\n" +
                "11) Penthouse: " + penthouse;
    }

}


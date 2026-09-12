package SPD_asnmnt1;

public class LuxuryApartmentBuilder implements ApartmentBuilder{
    private int rooms=4;
    private int floor=8;
    private String furniture="Traditional";
    private String appliances="Premium";
    private String interior="Neoclassic";
    private boolean balcony=true;
    private boolean smartHome=true;
    private String heating="Electric";
    private boolean panoramicView=true;
    private boolean penthouse=false;
    @Override
    public ApartmentBuilder setRooms(int rooms){
        this.rooms=rooms;
        return this;}
    @Override
    public ApartmentBuilder setFloor(int floor){
        this.floor=floor;
        return this;
    }
    @Override
    public ApartmentBuilder setFurniture(String furniture){
        this.furniture=furniture;
        return this;
    }
    @Override
    public ApartmentBuilder setAppliances(String appliances){
        this.appliances=appliances;
        return this;
    }
    @Override
    public ApartmentBuilder setInterior(String interior){
        this.interior=interior;
        return this;
    }
    @Override
    public ApartmentBuilder setHeating(String heating) {
        this.heating = heating;
        return this;
    }
    @Override
    public ApartmentBuilder setBalcony(boolean balcony) {
        this.balcony = balcony;
        return this;
    }

    @Override
    public ApartmentBuilder setSmartHome(boolean smartHome) {
        this.smartHome = smartHome;
        return this;
    }
    public LuxuryApartmentBuilder setPanoramicView(boolean panoramicView){ //We can make apartment have panoramic view oe not
        this.panoramicView=panoramicView;
        return this;
    }
    public LuxuryApartmentBuilder setPenthouse(boolean penthouse){ //the same with penthouse
        this.penthouse=penthouse;
        return this;
    }
    @Override
    public Apartment build(){
        if (rooms < 0) {
            throw new IllegalStateException("Number of rooms must be greater than 0");
        }
        if (floor < 0) {
            throw new IllegalStateException("Floor cannot be negative");
        }
        return new Apartment(rooms,floor,furniture,appliances,interior,balcony,smartHome,heating, false,panoramicView, penthouse);
    }


}

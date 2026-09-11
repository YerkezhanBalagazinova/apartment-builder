package SPD_asnmnt1;

public class StandardApartmentBuilder implements ApartmentBuilder{
    private int rooms=2; //def values
    private int floor=5;
    private String furniture="Modern";
    private String appliances="Standard";
    private String interior="Minimalism";
    private boolean balcony=true;
    private boolean smartHome=false;
    private String heating="Central";
    private boolean euroRenovation = false;
    @Override
    public ApartmentBuilder setRooms(int rooms){
        this.rooms=rooms;
        return this;
    }
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
    public StandardApartmentBuilder setEuroRenovation(boolean euroRenovation) { //It can have euro reno or not
        this.euroRenovation = euroRenovation;
        return this;
    }
    public Apartment build(){
        return new Apartment(rooms,floor,furniture,appliances,interior,balcony,smartHome,heating,
                euroRenovation,
                false,
                false );
    }
}



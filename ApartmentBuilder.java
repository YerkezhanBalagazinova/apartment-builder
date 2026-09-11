package SPD_asnmnt1;

public interface ApartmentBuilder {
    ApartmentBuilder setRooms(int rooms);

    ApartmentBuilder setFloor(int floor);

    ApartmentBuilder setFurniture(String furniture);

    ApartmentBuilder setAppliances(String appliances);

    ApartmentBuilder setInterior(String interior);

    ApartmentBuilder setBalcony(boolean balcony);

    ApartmentBuilder setSmartHome(boolean smartHome);

    ApartmentBuilder setHeating(String heating);

    Apartment build();
}

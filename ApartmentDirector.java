package SPD_asnmnt1;

public class ApartmentDirector {
    public Apartment createEconomyApartment() {
        StandardApartmentBuilder builder = new StandardApartmentBuilder();
        builder.setRooms(1);
        builder.setFloor(3);
        builder.setFurniture("Simple");
        builder.setAppliances("Basic");
        builder.setInterior("Minimal");
        builder.setBalcony(false);
        builder.setSmartHome(false);
        builder.setHeating("Central");
        return builder.build();
    }

    public Apartment createComfortApartment() {
        StandardApartmentBuilder builder = new StandardApartmentBuilder();

        builder.setRooms(3);
        builder.setFloor(7);
        builder.setFurniture("Modern");
        builder.setAppliances("Standard");
        builder.setInterior("Scandinavian");
        builder.setBalcony(true);
        builder.setSmartHome(false);
        builder.setHeating("Central");
        builder.setEuroRenovation(true);
        return builder.build();
    }

    public Apartment createPremiumApartment() {
        LuxuryApartmentBuilder builder = new LuxuryApartmentBuilder();
        builder.setRooms(6);
        builder.setFloor(12);
        builder.setFurniture("Traditional");
        builder.setAppliances("Premium");
        builder.setInterior("Neoclassic");
        builder.setBalcony(true);
        builder.setSmartHome(true);
        builder.setHeating("Electric");
        builder.setPanoramicView(true);
        builder.setPenthouse(true);
        return builder.build();
    }
}

# apartment-builder
Assignment1 Software Design Patterns.Implementation of the Builder Pattern for creating apartments.
The product is an Apartment with different characteristics such as rooms, floor, furniture, appliances, interior, heating, balcony, and smart home.
The project uses two concrete builders:
StandardApartmentBuilder-creates standard apartments and can include Euro-renovation
LuxuryApartmentBuilder-creates luxury apartments and can include a panoramic view and penthouse
Also there is a Director called ApartmentDirector, that provides predefined 3 types of Apartments:Economy, Comfort, Premium.
Both of Concrete Builders have default values.You can change in with chaining method.To create an apartment, first create a Concrete Builder and set the characteristics. Then call build() to create the final Apartment object.
How to Run?:
Open the project in IntelliJ IDEA.
Run Client.java.
Choose an apartment class:
1 — Economy
2 — Comfort
3 — Premium

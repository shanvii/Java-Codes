class India {
    India() {
        System.out.println("\nCountry name: India");
    }
}

class NorthIndia extends India{
    NorthIndia() {
        System.out.println("North India");
    }
}

class SouthIndia extends India{
    SouthIndia() {
        System.out.println("South India");
    }
}

class Nstate extends NorthIndia{
    Nstate() {
        System.out.println("States in North India: Uttarakhand, Haryana, Bihar, Uttar Pradesh, Rajasthan...");
    }
}

class Sstate extends NorthIndia{
    Sstate() {
        System.out.println("States in South India: Kerala, Krnataka, Tamil Nadu....");
    }
}

public class countryInheri {
    public static void main(String [] args) {

        Nstate obj = new Nstate();
        Sstate obj2 = new Sstate();
    }
}

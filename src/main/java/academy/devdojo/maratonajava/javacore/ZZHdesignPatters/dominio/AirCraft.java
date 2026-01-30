package academy.devdojo.maratonajava.javacore.ZZHdesignPatters.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraft {
    private final String name;
    private final Set<String>availablesSeats= new HashSet<>();

    public AirCraft(String name) {
        this.name = name;
    }

    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availablesSeats.remove(seat);
    }
}

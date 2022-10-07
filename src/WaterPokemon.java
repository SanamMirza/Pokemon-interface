import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private static final String type = "Water";

    List<String> attacks = Arrays.asList
            ("surf", "hydroPump","hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    List<String> getAttacks() {
        return attacks;
    }


        void surf(Pokemon name, Pokemon enemy){
            System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

        };

        void hydroPump(Pokemon name, Pokemon enemy){
            System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

        };

        void hydroCanon(Pokemon name, Pokemon enemy){
            System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

        };

        void rainDance(Pokemon name, Pokemon enemy){
            System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

        };

}

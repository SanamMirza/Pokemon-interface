import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "Electric";

    List<String> attacks = Arrays.asList("thunderPunch, electroBall, thunder, voltTackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );
    };

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };




}





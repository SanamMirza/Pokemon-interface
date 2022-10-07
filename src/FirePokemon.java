import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "Fire";

    List<String> attacks = Arrays.asList("fireLash, flameThrower, inferno, pyroBall");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };

    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(getName() + " attacks " + enemy + " with " + getAttacks() );

    };





}

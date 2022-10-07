import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    String name;
    private String trainer;


    FirePokemon charizard = new FirePokemon("charizard",5,250,"pokepeppers","charrcharr");
    WaterPokemon blastoise = new WaterPokemon("blastoise", 3, 240,"pokefish","blasstblasst");
    GrassPokemon venusaur = new GrassPokemon("venusaur", 3,230,"pokegrass","saursaur");
    GrassPokemon ditto = new GrassPokemon("ditto",1,210,"pokeslyme","toootooo");
    ElectricPokemon raichu = new ElectricPokemon("raichu",2,210,"pokeberry's","raichuuraichuu");
    WaterPokemon gyarados = new WaterPokemon("gyarados", 2,220,"pokeschrimp","arghhh");

    public PokemonTrainer() {
    }

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }



}




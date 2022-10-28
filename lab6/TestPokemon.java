import java.util.Scanner;

public class TestPokemon{
    public static Pokemon readPokemon(){
        System.out.println("Enter details of pokemon");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Pokemon pokemon=new Pokemon(s);
        return pokemon;
    }
    private static void printPokemonList(Pokemon[] pl){
        for(int i=0;pl[i]!=null;i++){
            System.out.println(pl[i].getPokemon());
        }
    }
    public static void main(String[] args){
        int n=2; // Number of pokemons
        for(int i=0;i<n;i++){
            Trainer.capturePokemon(readPokemon());
        }
        System.out.println("Pokemons with type \"fire\" are:");
        Pokemon[] pl1=Trainer.getPokemonWithType("Fire");
        printPokemonList(pl1);
        System.out.println("Pokemon with type as one of the given types are:");
        String[] types=new String[]{"Grass","Fire","Bug","Water"};
        Pokemon[] pl2=Trainer.getPokemonsWithGivenTypes(types);
        printPokemonList(pl2);
        System.out.println("Pokemon with ids between 13 and 26 are:");
        Pokemon[] pl3=Trainer.getPokemonsInRange(13,26);
        printPokemonList(pl3);
    }
}
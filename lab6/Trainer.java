import java.util.Vector;
public class Trainer{
    public static Vector<Pokeball> collection=new Vector<Pokeball>();
    public static void capturePokemon(Pokemon pokemon){
        Pokeball pokeball=new Pokeball(pokemon);
        collection.add(pokeball);
    }
    public static Pokemon[] getPokemonWithType(String type){
        Pokemon[] pokemonList=new Pokemon[10];
        int count=0;
        for(int i=0;i<collection.size();i++){
            if(collection.elementAt(i).getPokemon().getType().equalsIgnoreCase(type)){
                pokemonList[count]=collection.elementAt(i).getPokemon();
                count++;
            }
        }
        if(count!=0){
            return pokemonList;
        }
        return null;
    }
    public static Pokemon[] getPokemonsWithGivenTypes(String[] types){
        Pokemon[] pokemonList=new Pokemon[10];
        int count=0;
        for(int i=0;i<collection.size();i++){
            for(int j=0;j<types.length;j++){
                if(types[j].equals(collection.elementAt(i).getPokemon().getType())){
                    pokemonList[count]=collection.elementAt(i).getPokemon();
                    count++;
                }
            }
        }
        if(count!=0){
            return pokemonList;
        }
        return null;
    }
    public static Pokemon[] getPokemonsInRange(int minId, int maxId){
        Pokemon[] pokemonList=new Pokemon[10];
        int count=0;
        for(int i=0;i<collection.size();i++){
            int id=Integer.parseInt(collection.elementAt(i).getPokemon().getId());
            if(id>=minId && id<=maxId){
                pokemonList[count]=collection.elementAt(i).getPokemon();
                count++;
            }
        }
        if(count!=0){
            return pokemonList;
        }
        return null;
    }
}
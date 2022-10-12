public class Pokeball{
    private Pokemon pokemon;
    public Pokeball(){

    }
    public Pokeball(Pokemon pokemon){
        this.pokemon=pokemon;
    }
    public Pokemon getPokemon(){
        return pokemon;
    }
    public void setPokemon(Pokemon pokemon){
        this.pokemon=pokemon;
    }
    public String toString(){
        String s=pokemon.getId()+" "+pokemon.getName()+" "+pokemon.getType();
        return s;
    }
}
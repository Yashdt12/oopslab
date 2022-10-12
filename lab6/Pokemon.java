public class Pokemon{
    private String name;
    private String id;
    private String type;
    public Pokemon(){

    }
    public Pokemon(String s){
        String[] t=new String[3];
        if(s.contains("|")){
            t=s.split("|");
            name=t[0];
            id=t[1];
            type=t[2];
        }
        else{
            t=s.split(";");
            id=t[0];
            name=t[1];
            type=t[2];
        }
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public String getPokemon(){
        String s="#"+id+"\n"+name+"\n"+type;
        return s;
    }
    public String toString(){
        String s=name+" "+id+" "+type;
        return s;
    }
}
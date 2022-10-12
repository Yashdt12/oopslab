import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class Name{
    private String fname;
    private String mname;
    private String lname;
    public Name(){
    
    }
    public Name(String s){
        StringTokenizer st=null;
        try{
            st=new StringTokenizer(s,",");
            fname=st.nextToken();
            mname=st.nextToken();
            lname=st.nextToken();
        }catch(NoSuchElementException e){
            st=new StringTokenizer(s,";");
            lname=st.nextToken(";");
            mname=st.nextToken();
            fname=st.nextToken();
        }
    }
    public String getFName(){
        return fname;
    }
    public String getMName(){
        return mname;
    }
    public String getLName(){
        return lname;
    }
    public String getName(){
        return (fname+" "+mname+" "+lname);
    }
    public String toString(){
        return (fname+mname+lname);
    }
}
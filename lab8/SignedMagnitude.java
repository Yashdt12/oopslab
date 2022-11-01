import java.util.ArrayList;
public class SignedMagnitude implements BinaryInterface{
    public ArrayList<Integer> arr=new ArrayList<Integer>(8);
    @Override
    public void toBinary(int n){
        int org=n;
        boolean flag=true; // True represenst positive no.
        // Check sign of decimal number
        if(n<0){
            n*=-1;
            flag=false;
        }
        // Convert to binary
        for(int i=0;i<7;i++,n/=2){
            arr.add(i,n%2);
        }
        // Add sign bit
        if(flag){
            arr.add(7,0);
        }
        else{
            arr.add(7,1);
        }
        // Reverse the number
        int temp;
        for(int i=0;i<4;i++){
            temp=arr.get(7-i);
            arr.set(7-i,arr.get(i));
            arr.set(i,temp);
        }
        System.out.println("Signed Magnitude Representation of "+org+" is= "+arr);
    }
}
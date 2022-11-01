import java.util.ArrayList;
public class OneComplement implements BinaryInterface{
    public ArrayList<Integer> arr=new ArrayList<Integer>(8);
    @Override
    public void toBinary(int n){
        int org=n;
        if(n<0){
            n*=-1;
        }
        // Convert to binary
        for(int i=0;i<8;i++,n/=2){
            arr.add(i,n%2);
        }
        // Reverse the number
        int temp;
        for(int i=0;i<4;i++){
            temp=arr.get(7-i);
            arr.set(7-i,arr.get(i));
            arr.set(i,temp);
        }
        // Perform one's complement
        for(int i=0;i<8;i++){
            if(arr.get(i)==1){
                arr.set(i,0);
            }
            else{
                arr.set(i,1);
            }
        }
        System.out.println("One's complement of "+org+" is= "+arr);
    }
}
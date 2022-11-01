import java.util.ArrayList;
public class TwoComplement extends OneComplement implements BinaryInterface{
    @Override
    public void toBinary(int n){
        int org=n;
        // Convert to one's complement
        if(n<0){
            n*=-1;
        }
        for(int i=0;i<8;i++,n/=2){
            arr.add(i,n%2);
        }
        int temp;
        for(int i=0;i<4;i++){
            temp=arr.get(7-i);
            arr.set(7-i,arr.get(i));
            arr.set(i,temp);
        }
        for(int i=0;i<8;i++){
            if(arr.get(i)==1){
                arr.set(i,0);
            }
            else{
                arr.set(i,1);
            }
        }
        // Add one to the result
        int i=7;
        int sum,carry;
        do{
            sum=arr.get(i)^1;
            carry=arr.get(i)&1;
            arr.set(i,sum);
            i--;
        }while(carry!=0);
        System.out.println("Two's complement of "+org+" is= "+arr);
    }
}
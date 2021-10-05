int[] cryptoTrading(int[] deposits, String[] operations) {

int[] res= new int[operations.length];
int[] amt=deposits;
int[] stk1=new int[deposits.length];

Arrays.fill(stk1,0);
Arrays.fill(amt,0);

for (int i=0;i<operations.length;i++){
    String[] str=(operations[i]).split(" ");
    for(int j=0;j<str.length;j++){
        String s=str[0];
        String s1=str[1];
        int id=Integer.parseInt(s);
            int stk=Integer.parseInt(s1);
           // int price=Integer.parseInt(str[2]);
            
        switch(str[0]){
            case "buy":
            String s3=str[3];
            int price=Integer.parseInt(s3);
            int need=stk*price;
            int has=deposits[id-1];
            if(has>need){
                int left=has-need;
                amt[id-1]=left;
                stk1[id-1]=stk;
                res[i]=amt[id-1];
            }
            else{
                int left=has;
                amt[id=1]=left;
                stk1[id-1]=stk;
                res[i]=amt[id-1];
            }
            break;
            case "sell":
            String s4=str[3];
            int price1=Integer.parseInt(s4);
            
            if(stk1[id-1]>stk){
                stk1[id-1]=stk1[id-1]-stk;
                amt[id-1]=amt[id-1]+stk*price1;
                res[i]=amt[id-1];
            }
            else{
                stk1[id-1]=stk1[id-1];
                amt[id-1]=amt[id-1];
                res[i]=amt[id-1];
            }
            break;
            case "deposit":
            amt[id-1]=amt[id-1]+stk;
            res[i]=amt[id-1];
            break;
            
        }
    }
    
}
return res;

}

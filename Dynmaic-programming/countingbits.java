class Solution {
    public int[] countBits(int n) {
     
        // array
        
        int[] arr1=new int[n+1];
        int[] res=new int[n+1];
        
        if(n>0){
        res[0]=0;
        res[1]=1;
        
        for(int i=2;i<=n;i++){
            int j=i;
            int count=0;
            while(j/2!=0){
                int l=j%2;
                if(l==1){
                    count++;
                }
                j=j/2;
            }
            
            res[i]=count+1;
            
        }
        return res;
        }
        else{
            res[0]=0;
            return res;
        }
    }
}

public class taher{

    public static void main(String[] args) {
       System.out.println();
    }

    public static int firstOccu(int a[],int x){
       
        int left = 0;   
        int n = a.length;
        int right = n-1;
        
        while(left <= right){
            int mid = left+(right - left)/2;
            
            if(a[mid] == x && a[mid-1] != x)return mid;
            else if(a[mid] == x && a[mid-1] == x)right = mid-1;
            else left = mid+1;
        } 
        return -1;
   }
   public static int lastOccu(int a[],int x){
    int left = 0;
    int n = a.length;
    int right = n-1;
    
    while(left <= right){
        int mid = left+(right - left)/2;
        
        if(a[mid] == x && a[mid+1] != x)return mid;
        else if(a[mid] <= x) left = mid + 1;
        else right = mid - 1;
    } 
    return -1;
}
}
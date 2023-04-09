public class Assignment {
    private Assignment(){}
    public static int GCD(int a,int b){
        int r=a%b;
        if(r==0){
            return b;
        }
        return GCD(b,r);
    }
    public static int binomialCoeff(int n, int k){
        if(k==0||k==n){
            return 1;
        }
        return binomialCoeff(n-1,k-1)+binomialCoeff(n-1,k);
    }
    public static void isOnlyDigits(char[] arr){
        if( isOnlyDigitsKostyl(arr,0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    private static boolean isOnlyDigitsKostyl(char[]arr,int i){
        if(i==arr.length){
            return true;
        }
        if(!Character.isDigit(arr[i])){
            return false;
        }
        return isOnlyDigitsKostyl(arr,i+1);
    }
    public static void permutationsRecursive(char[] arr){
        permutationsRecursiveKostyl(arr,0);
    }
    private static void permutationsRecursiveKostyl(char[] arr,int i){
        if (i==arr.length){
            System.out.println(arr);
            return;
        }
        for(int k=i;k<arr.length;k++) {
            char temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            permutationsRecursiveKostyl(arr, i + 1);
            temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
        }
    }
    public static int pow(int a, int n){
        if(n==1){
            return a;
        }
        return a*pow(a,n-1);
    }
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int factorial(int n){
        if(n<2){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static boolean isPrime(int n){
        return isPrimeKostyl(n,(int)Math.sqrt(n));
    }
    private static boolean isPrimeKostyl(int n, int i){
        if(i<=1){
            return true;
        }
        if(n<2){
            return false;
        }if(n==2) {
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isPrimeKostyl(n,i-1);

    }

    public static int min(int[]arr){
        return minKostyl(arr,0);
    }
    private static int minKostyl(int[] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int minInArray=minKostyl(arr,i+1);
        if(minInArray<arr[i]){
            return minInArray;
        }else{
            return arr[i];
        }
    }

    public static double mean(int[] arr){
        return meanKostyl(arr,arr.length);
    }

    private static double meanKostyl(int[] arr,int n){
        if(n==0){
            return arr[n];
        }
        double prevMean=meanKostyl(arr,n-1);
        return (prevMean*(n-1)+arr[n-1])/n;
    }
}

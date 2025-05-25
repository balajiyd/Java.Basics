public class hello{
    public static void main(String[] args) {
                
      System.out.println("The Average is: "+average(2,2,4,3));

    }
    static double average(double... numbers){
        double sum =0;
        if(numbers.length == 0){
            return 0;
        }

        for(double n : numbers){
            sum = sum+n/numbers.length;
            

        }
        return sum;
    }
}


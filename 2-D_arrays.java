public class hello{
    public static void main(String[] args) {
             
      char[][] telephone = {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}};
        for(char[] row:telephone){
              for(char numbers:row){
                System.out.print(numbers+" ");
              }
              System.out.println();
        }


  }
}


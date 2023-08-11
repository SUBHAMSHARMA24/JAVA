class SimpleInterest {
  public static void main(String[] args) {
         System.out.print("\n\t\t Subham sharma_1000015301\n");
          int principal = Integer.parseInt(args[0]);
          int rate = Integer.parseInt(args[1]);
          int time = Integer.parseInt(args[2]);
             double SI;
             SI= (principal*rate*time)/100;
             System.out.print("\nThe Simple Interest is : "+SI);      
  }
}
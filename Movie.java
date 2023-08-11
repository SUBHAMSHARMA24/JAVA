import java.util.Scanner;
public class Movie {
    
    public static void main(String[] args){
      MovieMagic obj=new MovieMagic();
      obj.display(); 
    }
}
    

    class MovieMagic{
        Scanner sc=new Scanner(System.in);
        int release_year;
        String movie_title;
        double ratings;

        MovieMagic(){
           accept();
        }

        void accept(){
            System.out.println("enter release year ");
            release_year=sc.nextInt();
            System.out.println("enter movie title ");
            movie_title=sc.next();
            System.out.println("enter the rating of the movie");
            ratings=sc.nextDouble();
        }

        void display(){
            System.out.println("\n Subham Sharma_1000015301\n");
            System.out.println("enter release year  "+release_year);
            System.out.println("Movie Tiltle  "+movie_title);
            System.out.println("ratings "+ratings);
            if(ratings>=0.0 && ratings<=2.0){
                System.out.println("The movie has "+ratings+" :-----> Flop ");
            }
                else if(ratings>=2.1 && ratings<=3.4){
                    System.out.println("the movie has "+ratings+" :-----> Semi-Hit ");
                }
                else if(ratings>=3.5 && ratings<=4.5){
                    System.out.println("the movie has "+ratings+" :-----> Hit ");
                }
                else if(ratings>=4.6 && ratings<=5.0){
                    System.out.println("The movie has "+ratings+" :-----> Super-Hit ");
                }
                }
            }

        

    
    
   

    
    


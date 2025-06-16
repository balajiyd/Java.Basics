//MAIN CLASS
public class Main{
    public static void main(String[] args){
        Book b1 = new Book("Cant Hurt Me",300);
        Book b2 = new Book("Ikigai",250);
        Book b3 = new Book("Power",321);
        Book[] books = {b1,b2,b3};
        Library l = new Library("SAIL",2014, books);

      l.displayInfo();

    }
}

//LIBRARY CLASS 
public class Library{
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year=year;
        this.books = books;
    }
    void displayInfo(){
        System.out.println("The "+this.year+" "+this.name);
        System.out.println("Books Available: ");
        for(Book b:books){
            System.out.println(b.displayInfo());
        }
    }
}

//BOOK CLASS


public class Book{
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
     String displayInfo(){
        return this.title+" ("+this.pages+" pages)";
     }
}

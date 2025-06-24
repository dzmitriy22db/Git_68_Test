package app;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int yearOfPublished;

public Book (String title, String author, String genre, int yearOfPublished){
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.yearOfPublished = yearOfPublished;
}
public String toString(){
    return "Title: " + title + " Author: " + author + " Genre:  " + genre + " " + yearOfPublished;
}

public boolean isOlderThan(int year){
    return this.yearOfPublished < year;

}
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public String getGenre(){
    return genre;
}
public int getYearOfPublished(){
    return yearOfPublished;
}


}

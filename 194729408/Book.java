public class Book extends Item{
    private long isbn_number;
    private String author;

    public Book (){

    }
    public Book (long isbn_number, String author, String title){
        this.isbn_number = isbn_number;
        this.author = author;
        setTitle(title);
    }



    public long getIsbn_number() {
        return isbn_number;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn_number(long isbn_number) {
        this.isbn_number = isbn_number;
    }

    @Override
    public String getListing() {
        return "Book Name - "+getTitle()+
                "\n"+"Author - "+ author +
                "\n"+"ISBN # - "+ isbn_number;
    }
}

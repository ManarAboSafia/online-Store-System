
package newstore;

public class Book extends Item {

    public static String titleBook, authorty;

    public Book( int id, int quan, int price, String name, String nameItem, String Author) {
        super(id, quan, price, name);
        this.titleBook = titleBook;
        this.authorty = authorty;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getAuthorty() {
        return authorty;
    }

    public void setAuthorty(String authorty) {
        this.authorty = authorty;
    }

}


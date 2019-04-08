public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxIndex) {
        this.books = new Book[maxIndex];
    }

    public Book getBookAt(int index) {
        return this.books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return this.last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}

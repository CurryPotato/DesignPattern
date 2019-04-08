public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return this.index < bookShelf.getLength() ? true : false;
    }

    public Book next() {
        Book book = this.bookShelf.getBookAt(this.index);
        this.index++;
        return book;
    }

}

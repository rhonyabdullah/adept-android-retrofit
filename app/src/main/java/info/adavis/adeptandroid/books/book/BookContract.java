package info.adavis.adeptandroid.books.book;

import info.adavis.adeptandroid.models.Book;

/**
 * The contract between the view and presenter
 */
public interface BookContract
{
    interface View
    {
        void showErrorMessage ();

        void showBook (Book book);
    }

}
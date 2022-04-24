package com.company.service.book;

import com.company.service.IGeneralService;
import com.company.model.Book;
import com.company.model.Category;

public interface IBookService extends IGeneralService<Book> {
    Iterable<Book> findAllByCategory(Category category);
}

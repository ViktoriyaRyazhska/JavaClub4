package org.softserve.controller;

import org.softserve.model.Book;
import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;


    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/create/books/")
    public String create(Model model) {
        model.addAttribute("book", new Book());
        return "create-book";
    }

    @PostMapping("/create/books")
    public String create(@ModelAttribute("book") Book book) {
        book.setAuthors(book.getAuthors());
        book.setCopies_owned(book.getCopies_owned());
        book.setPublication_date(book.getPublication_date());
        book.setTitle(book.getTitle());
        Book newBook = bookService.create(book);
        return "redirect:/books/all/" + newBook.getId();
    }



    @GetMapping("/{book_id}/update/")
    public String update(@PathVariable int book_id, Model model) {
        Book book = bookService.readById(book_id);
        model.addAttribute("book", book);
        return "update-book";
    }

    @PostMapping("/{book_id}/update")
    public String update(@PathVariable int book_id, Model model, @ModelAttribute("book") Book book) {
        book.setTitle(book.getTitle());
        book.setAuthors(book.getAuthors());
        book.setPublication_date(book.getPublication_date());
        book.setCopies_owned(book.getCopies_owned());
        bookService.update(book);
        return "redirect:/books/" + book_id + "/read";
    }

    @GetMapping("/{book_id}/delete")
    public String delete(@PathVariable int book_id) {
        bookService.delete(book_id);
        return "redirect:/books/";
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("books", bookService.getAll());
        return "books-list";
    }
}


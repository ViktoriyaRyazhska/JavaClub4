package org.softserve.controller;

import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final BookService bookService;

    @Autowired
    public HomeController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping({"/", "home"})
    public String home(Model model) {
        return new BookController(bookService).getAll(model);
    }
}

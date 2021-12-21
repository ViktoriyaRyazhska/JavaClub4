package org.softserve.controller;

import org.softserve.model.Author;
import org.softserve.service.AuthorService;
import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/create/authors/{author_id}")
    public String create(@PathVariable("author_id") int authorId, Model model) {
        model.addAttribute("author", authorService.readById(authorId));
        return "create-book";
    }



    @GetMapping("/{author_id}/update/todos/{book_id}")
    public String update(@PathVariable("author_id") long taskId, @PathVariable("book_id") int bookId, Model model) {

        return "update-book";
    }
}

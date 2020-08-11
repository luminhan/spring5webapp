package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController
{
    @GetMapping("/books")
    public String getBook(Model model)
    {
        return "hello";
    }
}

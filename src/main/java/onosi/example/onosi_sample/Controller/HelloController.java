package onosi.example.onosi_sample.Controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    private final MessageSource messageSource;

    @Autowired
    public HelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello")
    public String hello(Model model, Locale locale) {
        model.addAttribute("hello", "hello world!");
        model.addAttribute("title", messageSource.getMessage("app.title", null, locale));
        return "hello";
    }
}

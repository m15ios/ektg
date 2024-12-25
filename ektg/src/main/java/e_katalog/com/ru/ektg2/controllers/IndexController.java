package e_katalog.com.ru.ektg2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {

    @GetMapping("/") 
    public String index() {
            log.info("IT IS INDEX CONTROLLER");
            return "{\"message\": \"Door open!\", \"status_code\": 200}";
    }
}
package com.technical.git.controller;

        import com.technical.git.service.GeneratorService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import java.io.IOException;

@RestController()
public class Controller {
        @Autowired
        GeneratorService generatorService;
        @GetMapping("/generate")
        public String generateString(@RequestParam int line) throws IOException {
                return generatorService.generateFile(line);
        }
}

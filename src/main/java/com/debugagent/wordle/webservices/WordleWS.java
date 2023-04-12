package com.debugagent.wordle.webservices;

import com.debugagent.wordle.service.WordleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WordleWS {

    private final WordleService wordleService;

    @GetMapping("/guess")
    public Result guess(String word) {
        var error = wordleService.validate(word);
        if(error != null) {
            return new Result(null, error);
        }
        return new Result(wordleService.calculateResults(word), null);
    }
}

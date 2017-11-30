package de.dhbw.casino.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Teile")
public class GameController {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getGames(){

        return ResponseEntity.ok(null);
    }

}

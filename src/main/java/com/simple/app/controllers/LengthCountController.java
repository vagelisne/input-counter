package com.simple.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthCountController {

  @GetMapping(path = "/get-length")
  public ResponseEntity<Integer> getLength(@RequestParam String givenString) {
    int stringLength = givenString.length();
    return ResponseEntity.ok(stringLength);
  }
}

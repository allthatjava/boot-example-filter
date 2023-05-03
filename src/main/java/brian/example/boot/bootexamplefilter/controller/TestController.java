package brian.example.boot.bootexamplefilter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/test")
    public ResponseEntity<?> test(){
        return new ResponseEntity<>("Test Response", HttpStatus.OK);
    }

    @GetMapping("/test2")
    public ResponseEntity<?> test2(){
        return new ResponseEntity<>("Test2 Response", HttpStatus.OK);
    }
}

package boot.springboot.controllers;

import boot.springboot.dto.ResponseTransformer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(path="/" )
    @ResponseBody
    public ResponseEntity ok() {
        return ResponseEntity.status(200).body(new ResponseTransformer("Thanks for Posting !!!"));
    }

}

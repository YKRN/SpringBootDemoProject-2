package com.example.springbootdemoproject2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class DemoProject2Controller {
    @RequestMapping(value ="print/{msg}",method = RequestMethod.GET)
    public String print(@PathVariable(value="") String msg){

return "hello" +msg;

    }

    @GetMapping("/greeting")
    public Product greeting3(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Product(12);
    }


}

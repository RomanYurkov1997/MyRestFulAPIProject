package API.Server.controller;


import API.Server.entity.cats;
import API.Server.service.catsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private catsService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<cats> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = "/one/id={id}", method = RequestMethod.GET)
    @ResponseBody
    public cats getOneCat(@PathVariable("id") long catID) {
        return service.getByID(catID);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public cats addCat(@RequestBody cats cats) {

        return service.save(cats);
    }
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }
}

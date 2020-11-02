package com.events.controller;

import com.events.models.Events;
import com.events.repository.EventsRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventsRepository er;

    @ApiOperation(value = "Get all")
    @GetMapping(produces="application/json")
    public  @ResponseBody Iterable<Events> listEvents(){
        Iterable<Events> listEvents = this.er.findAll();
        return listEvents;
    }
    @ApiOperation(value = "Create event")
    @PostMapping("/event")
    public Events createEvents(@RequestBody Events events){
        return this.er.save(events);
    }

    @ApiOperation(value = "Update event by id")
    @PutMapping ("/event/{id}")
    public Events updateEvents(@RequestBody Events events){
        return this.er.save(events);
    }

    @ApiOperation(value = "Delete event by id")
    @DeleteMapping("/delete/{id}")
    public void deleteEvents(@RequestBody Events events){ this.er.delete(events); }

}

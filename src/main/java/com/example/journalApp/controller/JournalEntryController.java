package com.example.journalApp.controller;

import com.example.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("_journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries = new HashMap<>();

    @GetMapping("/journal")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @GetMapping("")
    public String f(){
        return "Hello server running at port 8080";
    }

}

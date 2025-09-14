package com.progressive.pull.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling PDF-related endpoints.
 */
@RestController
@RequestMapping("/api")
public class PdfController {
	
	
    /**
     * Basic index endpoint for sanity check.
     * Accessible via: http://localhost:8083/
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

}

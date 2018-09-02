package com.rafikzebdi.spritesheet2gif.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class SpriteSheetController {

    @GetMapping("/")
    private ResponseEntity<String> healthCheck() {
        HttpHeaders headers = new HttpHeaders ();
        headers.setAccessControlAllowOrigin ( "*" );
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String reason = "Pending ...";

        return new ResponseEntity<>(reason, headers, status);
    }

    @PostMapping(value = "/", consumes = MediaType.IMAGE_PNG_VALUE)
    private ResponseEntity<String> uploadPngFile(@RequestParam("file")MultipartFile file){
        HttpHeaders headers = new HttpHeaders ();
        headers.setAccessControlAllowOrigin ( "*" );
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String reason = "Pending ...";



        return new ResponseEntity <> ( reason, headers, status );

    }
}

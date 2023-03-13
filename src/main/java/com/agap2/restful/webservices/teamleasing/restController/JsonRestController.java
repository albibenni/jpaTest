package com.agap2.restful.webservices.teamleasing.restController;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.agap2.restful.webservices.teamleasing.Service.JsonService;

@RestController
public class JsonRestController {

	private JsonService jsonMapper;

	public JsonRestController(JsonService jsonMapper) {
		this.jsonMapper = jsonMapper;
	}

	@PostMapping("/json")
	public ResponseEntity<String> uploadJson(@RequestParam("file") MultipartFile file) throws IOException {

		jsonMapper.mapJson(file);

		return ResponseEntity.ok("File caricato con successo");

	}
}

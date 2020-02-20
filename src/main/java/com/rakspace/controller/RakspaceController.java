package com.rakspace.controller;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakspace.service.RakSpaceService;

@CrossOrigin
@RestController
public class RakspaceController {

	@Autowired
	RakSpaceService rkspaceService;

	@RequestMapping(value = "/sorting", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getPartsInvoice(@RequestBody String requestjson) throws JAXBException, IOException {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int[] process = rkspaceService.process(arr);

		return new ResponseEntity(process, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/{input}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity reverse(@Validated @PathVariable String input) throws JAXBException, IOException {
		String finalResult = rkspaceService.reverseInfo(input);
		return new ResponseEntity(finalResult, HttpStatus.OK);
	}

	@RequestMapping(value = "/health-check", method = RequestMethod.GET)
	@ResponseBody
	public String health() throws IOException {
		return "Welcome To RakSpace!!!!";
	}

}
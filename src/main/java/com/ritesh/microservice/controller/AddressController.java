package com.ritesh.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritesh.microservice.request.CreateAddressRequest;
import com.ritesh.microservice.response.AddressResponse;
import com.ritesh.microservice.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController
{
	@Value("${server.port}")
	private String port;

	@Autowired
	AddressService addressService;

	@PostMapping("/create")
	public AddressResponse createAddress (@RequestBody CreateAddressRequest createAddressRequest) {
		return addressService.createAddress(createAddressRequest);
	}
	
	@GetMapping("/getById/{id}")
	public AddressResponse getById(@PathVariable long id)
	{
		System.out.println("Request Served by port : "+port);
		return addressService.getById(id);
	}
	
}

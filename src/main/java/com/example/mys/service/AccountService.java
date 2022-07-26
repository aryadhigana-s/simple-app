package com.example.mys.service;

import org.springframework.http.ResponseEntity;

import com.example.mys.other.AccountRequest;
import com.example.mys.other.AddressRequest;
import com.example.mys.other.DeviceRequest;
import com.example.mys.other.EmergencyContactRequest;
import com.example.mys.other.RequestResponse;

public interface AccountService {

	public ResponseEntity<RequestResponse> saveAccount(AccountRequest accountRequest) throws Exception;
	public ResponseEntity<RequestResponse> updateAddress(AddressRequest addressRequest) throws Exception;
	public ResponseEntity<RequestResponse> updateDevice(DeviceRequest deviceRequest) throws Exception;
	public ResponseEntity<RequestResponse> addEmergencyContact(EmergencyContactRequest request) throws Exception;
	public ResponseEntity<RequestResponse> findEmergencyContact(Long accountId) throws Exception;
}
	
package com.controller;

import com.dao.AddressDao;
import com.dao.CountryDao;

public class AddressController {

	AddressDao addressDao;
	CountryDao countryDao;

	public AddressController(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	public AddressDao getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public CountryDao getCountryDao() {
		return countryDao;
	}
//    public void setCountryDao(CountryDao countryDao) {
//	this.countryDao = countryDao;
//}

}

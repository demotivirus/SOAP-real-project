package com.soap.realsoapproject.interfaces.impl;

import com.soap.realsoapproject.interfaces.CompanyFinder;

import javax.jws.WebService;

@WebService
public class CompanyFinderImpl implements CompanyFinder {
    @Override
    public CompanyFinder findByName(String name) {
        return null;
    }
}

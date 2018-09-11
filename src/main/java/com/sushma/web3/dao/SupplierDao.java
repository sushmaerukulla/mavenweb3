package com.sushma.web3.dao;

import java.util.List;

import com.sushma.web3.model.Supplier;

public interface SupplierDao {
boolean insert(Supplier sup);
List getAllSuppliers();
boolean deleteSupplier(int supid);
}

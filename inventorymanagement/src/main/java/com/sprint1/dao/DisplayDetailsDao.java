package com.sprint1.dao;

import com.sprint1.util.ProductOrderNotFoundException;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;

public interface DisplayDetailsDao {
public  RawMaterialDetails trackOrder(String OrderId)throws  RawMaterialOrderNotFoundException;
public ProductDetails trackProductOrder(String OrderId1)throws ProductOrderNotFoundException;
//String ProductOrder(String OrderId1);
}


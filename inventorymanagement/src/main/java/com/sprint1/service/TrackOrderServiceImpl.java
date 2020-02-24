package com.sprint1.service;
import java.util.*;
import java.util.Map;
import com.sprint1.util.ProductOrderNotFoundException;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.dao.TrackOrderDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;
public class TrackOrderServiceImpl implements TrackOrderService {//4
TrackOrderDaoImpl trackDaoImplObj=new TrackOrderDaoImpl();//5

public RawMaterialDetails trackOrder(String OrderId) throws RawMaterialOrderNotFoundException {
RawMaterialDetails a = trackDaoImplObj.trackOrder(OrderId);
if(a==null) {
throw new RawMaterialOrderNotFoundException(" No order with order Id : "+OrderId);
}
return a;
}

public ProductDetails ProductOrder(String ProductId) throws ProductOrderNotFoundException {
ProductDetails a = trackDaoImplObj.trackProductOrder(ProductId);
if(a==null) {
throw new ProductOrderNotFoundException(" No order with order Id : "+ProductId);
}
return a;
}

}



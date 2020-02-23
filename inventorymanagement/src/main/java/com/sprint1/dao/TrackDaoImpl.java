package com.sprint1.dao;
import java.util.*;
import com.sprint1.model.RawMaterialDetails;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.model.ProductDetails;
public   class TrackDaoImpl implements TrackDao {//6
Map<String,RawMaterialDetails> raws =new HashMap<String, RawMaterialDetails>();//7
Map<String,ProductDetails> product =new HashMap<String, ProductDetails>();//7
RawMaterialDetails  order=new RawMaterialDetails ("1","water",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"245");//8
RawMaterialDetails  order1=new RawMaterialDetails ("2","sugar",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"459");//9
RawMaterialDetails  order11=new RawMaterialDetails ("3","paste",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"434");//10
RawMaterialDetails  order12=new RawMaterialDetails ("4","Merinda",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"414");//11
RawMaterialDetails  order13=new RawMaterialDetails ("5","Fizz",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"404");//12
ProductDetails  order14=new ProductDetails ("1","ThumsUp",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//8
ProductDetails  order15=new ProductDetails ("2","Sprite",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//9
ProductDetails  order16=new ProductDetails ("3","Coca-Cola",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//10
ProductDetails  order17=new ProductDetails ("4","Merinda",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//11
ProductDetails  order18=new ProductDetails ("5","Fizz",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//12


public TrackDaoImpl() {
raws.put(order.getOrderId(), order);
raws.put(order1.getOrderId(), order1);
raws.put(order11.getOrderId(), order11);
raws.put(order12.getOrderId(), order12);
raws.put(order13.getOrderId(), order13);
product.put(order14.getOrderId(), order14);
product.put(order15.getOrderId(), order15);
product.put(order16.getOrderId(), order16);
product.put(order17.getOrderId(), order17);
product.put(order18.getOrderId(), order18);
}
public RawMaterialDetails trackOrder(String OrderId)throws RawMaterialOrderNotFoundException {
return raws.get(OrderId);

}

public  ProductDetails trackProductOrder(String OrderId1) {

       return product.get(OrderId1);

}
}


   

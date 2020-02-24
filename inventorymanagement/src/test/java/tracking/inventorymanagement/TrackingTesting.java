package tracking.inventorymanagement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.sprint1.dao.DisplayDetailsDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import junit.framework.TestCase;
public class TrackingTesting extends TestCase {
	//private static final Object OrderId1 = null;
	ProductDetails pd =new ProductDetails();
	DisplayDetailsDaoImpl td = new DisplayDetailsDaoImpl();
	Map<String,ProductDetails> product =new HashMap<String, ProductDetails>();
/*public void test() throws RawMaterialOrderNotFoundException {
	assertEquals("Water",td.trackOrder("1"));
}*/
public void test1() {
	pd=new ProductDetails ("1","ThumsUp",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//8
	System.out.println(pd.getOrderId());
	product.put(pd.getOrderId(),pd);

	assertEquals(pd,td.trackProductOrder("1"));
}
}

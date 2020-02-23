package tracking.inventorymanagement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.sprint1.dao.TrackDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import junit.framework.TestCase;
public class TrackingTesting extends TestCase {
	//private static final Object OrderId1 = null;
	ProductDetails pd =new ProductDetails();
	TrackDaoImpl td = new TrackDaoImpl();
	Map<String,RawMaterialDetails> product =new HashMap<String, RawMaterialDetails>();
/*public void test() throws RawMaterialOrderNotFoundException {
	assertEquals("Water",td.trackOrder("1"));
}*/
public void test1() {
	assertEquals("water",td.trackProductOrder("1"));
}
}

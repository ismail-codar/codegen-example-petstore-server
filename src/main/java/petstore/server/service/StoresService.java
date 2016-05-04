package petstore.server.service;

import io.advantageous.qbit.annotation.PathVariable;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.annotation.RequestParam;
import io.advantageous.qbit.annotation.RequestMethod;
import io.advantageous.qbit.reactive.Callback;

@RequestMapping(value = "/stores")
public class StoresService {
	petstore.server.service.impl.StoresServiceImpl serviceImpl = new petstore.server.service.impl.StoresServiceImpl();
	
	@RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET, description = "For valid response try integer IDs with value &lt;= 5 or &gt; 10. Other values will generated exceptions", returnDescription = "200: successful operation, 400: Invalid ID supplied, 404: Order not found", summary = "Find purchase order by ID", code = 200, contentType = "application/json")
	public void getOrderById(final Callback<petstore.server.model.Order> callback, 
		@PathVariable(value = "orderId", description = "ID of pet that needs to be fetched") String orderId) {
		serviceImpl.getOrderById(callback, orderId);
	}
	
	@RequestMapping(value = "/order/{orderId}", method = RequestMethod.DELETE, description = "For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors", returnDescription = "400: Invalid ID supplied, 404: Order not found", summary = "Delete purchase order by ID", code = 200, contentType = "application/json")
	public void deleteOrder(final Callback<Void> callback, 
		@PathVariable(value = "orderId", description = "ID of the order that needs to be deleted") String orderId) {
		serviceImpl.deleteOrder(callback, orderId);
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST, description = "", returnDescription = "200: successful operation, 400: Invalid Order", summary = "Place an order for a pet", code = 200, contentType = "application/json")
	public void placeOrder(final Callback<petstore.server.model.Order> callback, 
		 petstore.server.model.Order body) {
		serviceImpl.placeOrder(callback, body);
	}
}
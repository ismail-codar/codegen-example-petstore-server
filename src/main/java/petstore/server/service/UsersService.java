package petstore.server.service;

import io.advantageous.qbit.annotation.PathVariable;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.annotation.RequestParam;
import io.advantageous.qbit.annotation.RequestMethod;
import io.advantageous.qbit.reactive.Callback;

@RequestMapping(value = "/users")
public class UsersService {
	petstore.server.service.impl.UsersServiceImpl serviceImpl = new petstore.server.service.impl.UsersServiceImpl();
	
	@RequestMapping(value = "", method = RequestMethod.POST, description = "This can only be done by the logged in user.", returnDescription = "default: successful operation", summary = "Create user", code = 200, contentType = "application/json")
	public void createUser(final Callback<Void> callback, 
		 petstore.server.model.User body) {
		serviceImpl.createUser(callback, body);
	}
	
	@RequestMapping(value = "/createWithList", method = RequestMethod.POST, description = "", returnDescription = "default: successful operation", summary = "Creates list of users with given input array", code = 200, contentType = "application/json")
	public void createUsersWithListInput(final Callback<Void> callback, 
		 java.util.List<petstore.server.model.User> body) {
		serviceImpl.createUsersWithListInput(callback, body);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET, description = "", returnDescription = "200: successful operation, 400: Invalid username/password supplied", summary = "Logs user into the system", code = 200, contentType = "application/json")
	public void loginUser(final Callback<String> callback, 
		@RequestParam(value = "username", required = false, description = "The user name for login") String username, 
		@RequestParam(value = "password", required = false, description = "The password for login in clear text") String password) {
		serviceImpl.loginUser(callback, username, password);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET, description = "", returnDescription = "default: successful operation", summary = "Logs out current logged in user session", code = 200, contentType = "application/json")
	public void logoutUser(final Callback<Void> callback) {
		serviceImpl.logoutUser(callback);
	}
	
	@RequestMapping(value = "/{username}", method = RequestMethod.GET, description = "", returnDescription = "200: successful operation, 400: Invalid username supplied, 404: User not found", summary = "Get user by user name", code = 200, contentType = "application/json")
	public void getUserByName(final Callback<petstore.server.model.User> callback, 
		@PathVariable(value = "username", description = "The name that needs to be fetched. Use user1 for testing.") String username) {
		serviceImpl.getUserByName(callback, username);
	}
	
	@RequestMapping(value = "/{username}", method = RequestMethod.DELETE, description = "This can only be done by the logged in user.", returnDescription = "400: Invalid username supplied, 404: User not found", summary = "Delete user", code = 200, contentType = "application/json")
	public void deleteUser(final Callback<Void> callback, 
		@PathVariable(value = "username", description = "The name that needs to be deleted") String username) {
		serviceImpl.deleteUser(callback, username);
	}
	
	@RequestMapping(value = "/{username}", method = RequestMethod.PUT, description = "This can only be done by the logged in user.", returnDescription = "400: Invalid user supplied, 404: User not found", summary = "Updated user", code = 200, contentType = "application/json")
	public void updateUser(final Callback<Void> callback, 
		 String username, 
		 petstore.server.model.User body) {
		serviceImpl.updateUser(callback, username, body);
	}
	
	@RequestMapping(value = "/createWithArray", method = RequestMethod.POST, description = "", returnDescription = "default: successful operation", summary = "Creates list of users with given input array", code = 200, contentType = "application/json")
	public void createUsersWithArrayInput(final Callback<Void> callback, 
		 java.util.List<petstore.server.model.User> body) {
		serviceImpl.createUsersWithArrayInput(callback, body);
	}
}
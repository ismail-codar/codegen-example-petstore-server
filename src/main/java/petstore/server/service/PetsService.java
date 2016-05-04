package petstore.server.service;

import io.advantageous.qbit.annotation.PathVariable;
import io.advantageous.qbit.annotation.RequestMapping;
import io.advantageous.qbit.annotation.RequestParam;
import io.advantageous.qbit.annotation.RequestMethod;
import io.advantageous.qbit.reactive.Callback;

@RequestMapping(value = "/pets")
public class PetsService {
	petstore.server.service.impl.PetsServiceImpl serviceImpl = new petstore.server.service.impl.PetsServiceImpl();
	
	@RequestMapping(value = "", method = RequestMethod.POST, description = "", returnDescription = "405: Invalid input", summary = "Add a new pet to the store", code = 200, contentType = "application/json")
	public void addPet(final Callback<Void> callback, 
		 petstore.server.model.Pet body) {
		serviceImpl.addPet(callback, body);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT, description = "", returnDescription = "400: Invalid ID supplied, 404: Pet not found, 405: Validation exception", summary = "Update an existing pet", code = 200, contentType = "application/json")
	public void updatePet(final Callback<Void> callback, 
		 petstore.server.model.Pet body) {
		serviceImpl.updatePet(callback, body);
	}
	
	@RequestMapping(value = "/{petId}", method = RequestMethod.POST, description = "", returnDescription = "405: Invalid input", summary = "Updates a pet in the store with form data", code = 200, contentType = "application/json")
	public void updatePetWithForm(final Callback<Void> callback, 
		 String petId, 
		 String name, 
		 String status) {
		serviceImpl.updatePetWithForm(callback, petId, name, status);
	}
	
	@RequestMapping(value = "/{petId}", method = RequestMethod.GET, description = "Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions", returnDescription = "200: successful operation, 400: Invalid ID supplied, 404: Pet not found", summary = "Find pet by ID", code = 200, contentType = "application/json")
	public void getPetById(final Callback<petstore.server.model.Pet> callback, 
		@PathVariable(value = "petId", description = "ID of pet that needs to be fetched") Integer petId) {
		serviceImpl.getPetById(callback, petId);
	}
	
	@RequestMapping(value = "/{petId}", method = RequestMethod.DELETE, description = "", returnDescription = "400: Invalid pet value", summary = "Deletes a pet", code = 200, contentType = "application/json")
	public void deletePet(final Callback<Void> callback, 
		@RequestParam(value = "api_key", required = true, description = "") String api_key, 
		@PathVariable(value = "petId", description = "Pet id to delete") Integer petId) {
		serviceImpl.deletePet(callback, api_key, petId);
	}
	
	@RequestMapping(value = "/findByTags", method = RequestMethod.GET, description = "Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.", returnDescription = "200: successful operation, 400: Invalid tag value", summary = "Finds Pets by tags", code = 200, contentType = "application/json")
	public void findPetsByTags(final Callback<java.util.List<petstore.server.model.Pet>> callback, 
		@RequestParam(value = "tags", required = false, description = "Tags to filter by") java.util.List<String> tags) {
		serviceImpl.findPetsByTags(callback, tags);
	}
	
	@RequestMapping(value = "/findByStatus", method = RequestMethod.GET, description = "Multiple status values can be provided with comma seperated strings", returnDescription = "200: successful operation, 400: Invalid status value", summary = "Finds Pets by status", code = 200, contentType = "application/json")
	public void findPetsByStatus(final Callback<java.util.List<petstore.server.model.Pet>> callback, 
		@RequestParam(value = "status", required = false, description = "Status values that need to be considered for filter") java.util.List<String> status) {
		serviceImpl.findPetsByStatus(callback, status);
	}
}
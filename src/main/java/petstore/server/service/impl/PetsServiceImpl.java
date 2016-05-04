package petstore.server.service.impl;

import java.util.List;

import io.advantageous.qbit.reactive.Callback;
import petstore.server.model.Pet;

public class PetsServiceImpl {

	public void addPet(Callback<Void> callback, Pet body) {
		callback.returnThis(null);
	}

	public void updatePet(Callback<Void> callback, Pet body) {
		// TODO Auto-generated method stub
		
	}

	public void updatePetWithForm(Callback<Void> callback, String petId, String name, String status) {
		// TODO Auto-generated method stub
		
	}

	public void getPetById(Callback<Pet> callback, Integer petId) {
		callback.returnThis(new Pet());
	}

	public void deletePet(Callback<Void> callback, String api_key, Integer petId) {
		// TODO Auto-generated method stub
		
	}

	public void findPetsByTags(Callback<List<Pet>> callback, List<String> tags) {
		// TODO Auto-generated method stub
		
	}

	public void findPetsByStatus(Callback<List<Pet>> callback, List<String> status) {
		// TODO Auto-generated method stub
		
	}

}

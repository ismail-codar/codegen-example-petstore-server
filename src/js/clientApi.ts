/// <reference path="../../../../typings/main/ambient/whatwg-fetch/index.d.ts" />
export var clientApiOptions = {
    rootUrl: "server"
};

export interface Order {
	petId:number;
	quantity:number;
	id:number;
	shipDate:string;
	complete:boolean;
	status:string;
}
export interface User {
	firstName:string;
	lastName:string;
	password:string;
	userStatus:number;
	phone:string;
	id:number;
	email:string;
	username:string;
}
export interface Category {
	name:string;
	id:number;
}
export interface Tag {
	name:string;
	id:number;
}
export interface Pet {
	photoUrls:Array<string>;
	name:string;
	id?:number;
	category?:Category;
	tags?:Array<Tag>;
	status?:string;
}

export class PetsServiceClient {
    addPet(body?:Pet): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/", {"method":"POST","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    updatePet(body?:Pet): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/", {"method":"PUT","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    updatePetWithForm(petId:string, name:string, status:string): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/{petId}/".replace('{petId}', petId.toString()), {"method":"POST","headers":{"Content-Type":"application/json"},"body":(function () {
				var f = new FormData();
				f.append("name", name);
				f.append("status", status);
				return f;
			})()}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    getPetById(petId:number): Promise<Pet> {
		return new Promise<Pet>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/{petId}/".replace('{petId}', petId.toString()), {"method":"GET"}).then(function (response) {
				response.json().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
    deletePet(api_key:string, petId:number): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/{petId}/".replace('{petId}', petId.toString()), {"method":"DELETE","headers":{"api_key":api_key}}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    findPetsByTags(tags?:Array<string>): Promise<Array<Pet>> {
		return new Promise<Array<Pet>>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/findByTags/" + "?tags=" + tags, {"method":"GET"}).then(function (response) {
				response.json().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
    findPetsByStatus(status?:Array<string>): Promise<Array<Pet>> {
		return new Promise<Array<Pet>>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/pets/findByStatus/" + "?status=" + status, {"method":"GET"}).then(function (response) {
				response.json().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
}
export class StoresServiceClient {
    getOrderById(orderId:string): Promise<Order> {
		return new Promise<Order>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/stores/order/{orderId}/".replace('{orderId}', orderId.toString()), {"method":"GET"}).then(function (response) {
				response.json().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
    deleteOrder(orderId:string): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/stores/order/{orderId}/".replace('{orderId}', orderId.toString()), {"method":"DELETE"}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    placeOrder(body?:Order): Promise<Order> {
		return new Promise<Order>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/stores/order/", {"method":"POST","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.json().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
}
export class UsersServiceClient {
    createUser(body?:User): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/", {"method":"POST","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    createUsersWithListInput(body?:Array<User>): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/createWithList/", {"method":"POST","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    loginUser(username?:string, password?:string): Promise<string> {
		return new Promise<string>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/login/" + "?username=" + username + "&password=" + password, {"method":"GET"}).then(function (response) {
				response.text().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
    logoutUser(): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/logout/", {"method":"GET"}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    getUserByName(username:string): Promise<User> {
		return new Promise<User>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/{username}/".replace('{username}', username.toString()), {"method":"GET"}).then(function (response) {
				response.json().then(function (data) {
					resolve(data);
				})
			})
		 });
	}
	
    deleteUser(username:string): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/{username}/".replace('{username}', username.toString()), {"method":"DELETE"}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    updateUser(username:string, body?:User): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/{username}/".replace('{username}', username.toString()), {"method":"PUT","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
    createUsersWithArrayInput(body?:Array<User>): Promise<void> {
		return new Promise<void>((resolve, reject) => {
			fetch(clientApiOptions.rootUrl + "/users/createWithArray/", {"method":"POST","headers":{"Content-Type":"application/json"},"body":JSON.stringify(body)}).then(function (response) {
				response.text().then(function () {
					resolve();
				})
			})
		 });
	}
	
}

package petstore.server;

import io.advantageous.qbit.admin.ManagedServiceBuilder;
import io.advantageous.qbit.annotation.RequestMapping;
import petstore.server.service.PetsService;
import petstore.server.service.StoresService;
import petstore.server.service.UsersService;

public class RunServices {


	public static void main(final String... args) {
		final ManagedServiceBuilder managedServiceBuilder = ManagedServiceBuilder.managedServiceBuilder()
				.setRootURI("/server");

		/* Start the service. */
		managedServiceBuilder.addEndpointService(new PetsService()).addEndpointService(new StoresService())
				.addEndpointService(new UsersService()).getEndpointServerBuilder().build().startServer();

		/*
		 * Start the admin builder which exposes health end-points and meta
		 * data.
		 */
		//managedServiceBuilder.getAdminBuilder().build().startServer();

		System.out.println("Servers started");

	}

}

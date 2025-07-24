package com.pradeip.poc.corejava.designpatterns;

//Java program to
//illustrate Service Design Service
//Locator Pattern

import java.util.ArrayList;
import java.util.List;

//Service interface
//for getting name and
//Executing it.

interface Service {
	public String getName();

	public void execute();
}

// Service one implementing Locator
class ServiceOne implements Service {
	public void execute() {
		System.out.println("Executing ServiceOne");
	}

	@Override
	public String getName() {
		return "ServiceOne";
	}
}

// Service two implementing Locator
class ServiceTwo implements Service {
	public void execute() {
		System.out.println("Executing ServiceTwo");
	}

	@Override
	public String getName() {
		return "ServiceTwo";
	}
}

// Checking the context
// for ServiceOne and ServiceTwo
class InitialContext {
	public Object lookup(String name) {
		if (name.equalsIgnoreCase("ServiceOne")) {
			System.out.println("Creating a new ServiceOne object");
			return new ServiceOne();
		} else if (name.equalsIgnoreCase("ServiceTwo")) {
			System.out.println("Creating a new ServiceTwo object");
			return new ServiceTwo();
		}
		return null;
	}
}

class Cache {
	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}

// Locator class
class ServiceLocator {
	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String name) {
		Service service = cache.getService(name);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		Service ServiceOne = (Service) context.lookup(name);
		cache.addService(ServiceOne);
		return ServiceOne;
	}
}

// Driver class
class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("ServiceOne");
		service.execute();

		service = ServiceLocator.getService("ServiceTwo");
		service.execute();

		service = ServiceLocator.getService("ServiceOne");
		service.execute();

		service = ServiceLocator.getService("ServiceTwo");
		service.execute();
	}
}

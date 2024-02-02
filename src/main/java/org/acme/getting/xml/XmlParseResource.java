package org.acme.getting.xml;

import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/xml")
public class XmlParseResource {

	private static final Logger log = Logger.getLogger(XmlParseResource.class);

	@Inject
	XmlParseService service;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String personalisedHello(String name, int age) {
		return "Hello " + name + " is your age really " + age + "?";
	}
}

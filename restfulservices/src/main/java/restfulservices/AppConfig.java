package restfulservices;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//host:8080/restfulservices/v1/resources

@ApplicationPath("v1")
public class AppConfig extends Application{
private Set<Class<?>> resources= new HashSet<>();

public AppConfig(){
	System.out.print("Created AppConfig");
	resources.add(R1.class);
}

	@Override
	public Set<Class<?>> getClasses() {
		return resources;
	}

	
}

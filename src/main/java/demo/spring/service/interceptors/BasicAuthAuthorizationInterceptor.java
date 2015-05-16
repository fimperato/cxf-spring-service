package demo.spring.service.interceptors;

import org.apache.cxf.binding.soap.interceptor.SoapHeaderInterceptor;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;

public class BasicAuthAuthorizationInterceptor extends SoapHeaderInterceptor {

	@Override
	public void handleMessage(Message message) throws Fault {
	    String str = "";
	    AuthorizationPolicy policy = message.get(AuthorizationPolicy.class);
	    str = "123";
	}
	

}

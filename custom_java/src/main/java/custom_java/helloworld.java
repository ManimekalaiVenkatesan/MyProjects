package custom_java;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class helloworld implements Callable{
	
	@Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
		String name="Hello World";
        return name;
     
    }
}
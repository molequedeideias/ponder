package er.r2d2w.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSKeyValueCodingAdditions;

import er.directtoweb.components.ERD2WStatelessComponent;
import er.extensions.foundation.ERXValueUtilities;

public class R2DGroupingHeaderString extends ERD2WStatelessComponent {
	/**
	 * Do I need to update serialVersionUID?
	 * See section 5.6 <cite>Type Changes Affecting Serialization</cite> on page 51 of the 
	 * <a href="http://java.sun.com/j2se/1.4/pdf/serial-spec.pdf">Java Object Serialization Spec</a>
	 */
	private static final long serialVersionUID = 1L;

    public R2DGroupingHeaderString(WOContext context) {
        super(context);
    }
    
    public String keyWhenGrouping() {
    	String key = (String)d2wContext().valueForKey("keyWhenGrouping");
    	return key;
    }

	public String groupingString() {
		Object o = object();
		if(ERXValueUtilities.isNull(o)) { return null; }
		return (String)NSKeyValueCodingAdditions.Utility.valueForKeyPath(o, keyWhenGrouping());
	}
}
// DO NOT EDIT.  Make changes to er.corebl.model.ERCMailCategory.java instead.
package er.corebl.model.eogen;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;


@SuppressWarnings("all")
public abstract class _ERCMailCategory extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ERCMailCategory";

  // Attributes
  public static final ERXKey<String> DETAIL = new ERXKey<String>("detail");
  public static final String DETAIL_KEY = DETAIL.key();
  public static final ERXKey<String> NAME = new ERXKey<String>("name");
  public static final String NAME_KEY = NAME.key();

  // Relationships

  public static class _ERCMailCategoryClazz<T extends er.corebl.model.ERCMailCategory> extends ERXGenericRecord.ERXGenericRecordClazz<T> {
    /* more clazz methods here */
  }

  private static final Logger LOG = Logger.getLogger(_ERCMailCategory.class);

  public er.corebl.model.ERCMailCategory.ERCMailCategoryClazz clazz() {
    return er.corebl.model.ERCMailCategory.clazz;
  }
  
  public String detail() {
    return (String) storedValueForKey(_ERCMailCategory.DETAIL_KEY);
  }

  public void setDetail(String value) {
    if (_ERCMailCategory.LOG.isDebugEnabled()) {
    	_ERCMailCategory.LOG.debug( "updating detail from " + detail() + " to " + value);
    }
    takeStoredValueForKey(value, _ERCMailCategory.DETAIL_KEY);
  }

  public String name() {
    return (String) storedValueForKey(_ERCMailCategory.NAME_KEY);
  }

  public void setName(String value) {
    if (_ERCMailCategory.LOG.isDebugEnabled()) {
    	_ERCMailCategory.LOG.debug( "updating name from " + name() + " to " + value);
    }
    takeStoredValueForKey(value, _ERCMailCategory.NAME_KEY);
  }


}

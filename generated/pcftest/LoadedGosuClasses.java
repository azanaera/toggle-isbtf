package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadedGosuClasses.LoadedGosuClasses_UpLink;
import pcftest.LoadedGosuClasses._Paging;
import pcftest.LoadedGosuClasses.__crumb__;
import pcftest.LoadedGosuClasses._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadedGosuClasses extends PCFLocation {
  public final static String CHECKSUM = "fb65c3966cd6e9b9b667d89de0e024f4";
  
  public LoadedGosuClasses(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadedGosuClasses"));
  }
  
  public ValueElement getLoadedClassNames() {
    return getOrCreateProperty("LoadedClassNames", "LoadedClassNames", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LoadedGosuClasses_UpLink getLoadedGosuClasses_UpLink() {
    return getOrCreateProperty("LoadedGosuClasses_UpLink", "LoadedGosuClasses_UpLink", null, pcftest.LoadedGosuClasses.LoadedGosuClasses_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadedGosuClasses._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadedGosuClasses.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadedGosuClasses._msgs.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadedGosuClasses_UpLink extends ClickableActionElement {
    public LoadedGosuClasses_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MBeans.MBeansScreen;
import pcftest.MBeans.MBeansScreen._msgs;
import pcftest.MBeans.MBeans_UpLink;
import pcftest.MBeans._Paging;
import pcftest.MBeans.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MBeans extends PCFLocation {
  public final static String CHECKSUM = "b81c4fe57bbc13f03f1110ccb4753493";
  
  public MBeans(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MBeans"));
  }
  
  public MBeansScreen getMBeansScreen() {
    return getOrCreateProperty("MBeansScreen", "MBeansScreen", null, pcftest.MBeans.MBeansScreen.class);
  }
  
  public MBeans_UpLink getMBeans_UpLink() {
    return getOrCreateProperty("MBeans_UpLink", "MBeans_UpLink", null, pcftest.MBeans.MBeans_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MBeans._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MBeans.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MBeansScreen extends PCFElement {
    public MBeansScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.MBeans.MBeansScreen.MBeansLV getMBeansLV() {
      return getOrCreateProperty("MBeansLV", "MBeansLV", null, pcftest.MBeans.MBeansScreen.MBeansLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MBeans.MBeansScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MBeansLV extends PCFElement {
      public MBeansLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.MBeansLV getMBeansLV() {
        return getOrCreateProperty("MBeansLV", "MBeansLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MBeansLV.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MBeans_UpLink extends ClickableActionElement {
    public MBeans_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/MBeans.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
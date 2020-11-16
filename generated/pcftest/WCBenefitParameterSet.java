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
import pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen;
import pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.Add;
import pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.AddWCBenefitParameterSet;
import pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.Remove;
import pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen._msgs;
import pcftest.WCBenefitParameterSet.WCBenefitParameterSet_UpLink;
import pcftest.WCBenefitParameterSet._Paging;
import pcftest.WCBenefitParameterSet.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitParameterSet extends PCFLocation {
  public final static String CHECKSUM = "271ef6902a719a2d2504f568ff9e00b1";
  
  public WCBenefitParameterSet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WCBenefitParameterSet"));
  }
  
  public WCBenefitParameterSetScreen getWCBenefitParameterSetScreen() {
    return getOrCreateProperty("WCBenefitParameterSetScreen", "WCBenefitParameterSetScreen", null, pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.class);
  }
  
  public WCBenefitParameterSet_UpLink getWCBenefitParameterSet_UpLink() {
    return getOrCreateProperty("WCBenefitParameterSet_UpLink", "WCBenefitParameterSet_UpLink", null, pcftest.WCBenefitParameterSet.WCBenefitParameterSet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WCBenefitParameterSet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WCBenefitParameterSet.__crumb__.class);
  }
  
  public WCParms get_parent() {
    return getOrCreateProperty("_parent", pcftest.WCParms.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetScreen extends PCFElement {
    public WCBenefitParameterSetScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.Add.class);
    }
    
    public AddWCBenefitParameterSet getAddWCBenefitParameterSet() {
      return getOrCreateProperty("AddWCBenefitParameterSet", "AddWCBenefitParameterSet", null, pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.AddWCBenefitParameterSet.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen.Remove.class);
    }
    
    public WCBenefitParameterSetLV getWCBenefitParameterSetLV() {
      return getOrCreateProperty("WCBenefitParameterSetLV", "WCBenefitParameterSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WCBenefitParameterSetLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WCBenefitParameterSet.WCBenefitParameterSetScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddWCBenefitParameterSet extends ClickableActionElement {
      public AddWCBenefitParameterSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WCBenefitParameterSetPopup click() {
        return clickThis(pcftest.WCBenefitParameterSetPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSet_UpLink extends ClickableActionElement {
    public WCBenefitParameterSet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCBenefitParameterSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
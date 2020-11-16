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
import pcftest.WCPDWeeksAndLimits.WCPDWeeksAndLimits_UpLink;
import pcftest.WCPDWeeksAndLimits._Paging;
import pcftest.WCPDWeeksAndLimits.__crumb__;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Add;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Cancel;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Edit;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Remove;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Update;
import pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCPDWeeksAndLimits extends PCFLocation {
  public final static String CHECKSUM = "4f59ecd2c4c31d049bf6432f48460f4c";
  
  public WCPDWeeksAndLimits(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WCPDWeeksAndLimits"));
  }
  
  public WCPDWeeksAndLimits_UpLink getWCPDWeeksAndLimits_UpLink() {
    return getOrCreateProperty("WCPDWeeksAndLimits_UpLink", "WCPDWeeksAndLimits_UpLink", null, pcftest.WCPDWeeksAndLimits.WCPDWeeksAndLimits_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WCPDWeeksAndLimits._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WCPDWeeksAndLimits.__crumb__.class);
  }
  
  public WCParms get_parent() {
    return getOrCreateProperty("_parent", pcftest.WCParms.class);
  }
  
  public ref_WC_PD_WeeksAndLimitsScreen getref_WC_PD_WeeksAndLimitsScreen() {
    return getOrCreateProperty("ref_WC_PD_WeeksAndLimitsScreen", "ref_WC_PD_WeeksAndLimitsScreen", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCPDWeeksAndLimits_UpLink extends ClickableActionElement {
    public WCPDWeeksAndLimits_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ref_WC_PD_WeeksAndLimitsScreen extends PCFElement {
    public ref_WC_PD_WeeksAndLimitsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Edit.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen.Update.class);
    }
    
    public WCPDWeeksAndLimitsLV getWCPDWeeksAndLimitsLV() {
      return getOrCreateProperty("WCPDWeeksAndLimitsLV", "WCPDWeeksAndLimitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WCPDWeeksAndLimitsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WCPDWeeksAndLimits.ref_WC_PD_WeeksAndLimitsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDWeeksAndLimits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}
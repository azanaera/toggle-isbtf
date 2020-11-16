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
import pcftest.WCPDBenefits.WCPDBenefits_UpLink;
import pcftest.WCPDBenefits._Paging;
import pcftest.WCPDBenefits.__crumb__;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Add;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Cancel;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Edit;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Remove;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Update;
import pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCPDBenefits extends PCFLocation {
  public final static String CHECKSUM = "dfe210c1ee79def9604ed4859856f16c";
  
  public WCPDBenefits(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WCPDBenefits"));
  }
  
  public WCPDBenefits_UpLink getWCPDBenefits_UpLink() {
    return getOrCreateProperty("WCPDBenefits_UpLink", "WCPDBenefits_UpLink", null, pcftest.WCPDBenefits.WCPDBenefits_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WCPDBenefits._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WCPDBenefits.__crumb__.class);
  }
  
  public WCParms get_parent() {
    return getOrCreateProperty("_parent", pcftest.WCParms.class);
  }
  
  public ref_WC_PD_BenefitsScreen getref_WC_PD_BenefitsScreen() {
    return getOrCreateProperty("ref_WC_PD_BenefitsScreen", "ref_WC_PD_BenefitsScreen", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCPDBenefits_UpLink extends ClickableActionElement {
    public WCPDBenefits_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ref_WC_PD_BenefitsScreen extends PCFElement {
    public ref_WC_PD_BenefitsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Edit.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen.Update.class);
    }
    
    public WCPDBenefitsLV getWCPDBenefitsLV() {
      return getOrCreateProperty("WCPDBenefitsLV", "WCPDBenefitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WCPDBenefitsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WCPDBenefits.ref_WC_PD_BenefitsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/wcparms/WCPDBenefits.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
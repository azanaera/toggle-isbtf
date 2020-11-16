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
import pcftest.NewNegotiation.NewNegotiationScreen;
import pcftest.NewNegotiation.NewNegotiationScreen.Cancel;
import pcftest.NewNegotiation.NewNegotiationScreen.Edit;
import pcftest.NewNegotiation.NewNegotiationScreen.Update;
import pcftest.NewNegotiation.NewNegotiationScreen._msgs;
import pcftest.NewNegotiation.NewNegotiation_UpLink;
import pcftest.NewNegotiation._Paging;
import pcftest.NewNegotiation.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewNegotiation extends PCFLocation {
  public final static String CHECKSUM = "cd625915d812b285db4793e24340a759";
  
  public NewNegotiation(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewNegotiation"));
  }
  
  public NewNegotiationScreen getNewNegotiationScreen() {
    return getOrCreateProperty("NewNegotiationScreen", "NewNegotiationScreen", null, pcftest.NewNegotiation.NewNegotiationScreen.class);
  }
  
  public NewNegotiation_UpLink getNewNegotiation_UpLink() {
    return getOrCreateProperty("NewNegotiation_UpLink", "NewNegotiation_UpLink", null, pcftest.NewNegotiation.NewNegotiation_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewNegotiation._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewNegotiation.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNegotiationScreen extends PCFElement {
    public NewNegotiationScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewNegotiation.NewNegotiationScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewNegotiation.NewNegotiationScreen.Edit.class);
    }
    
    public NewNegotiationDV getNewNegotiationDV() {
      return getOrCreateProperty("NewNegotiationDV", "NewNegotiationDV", null, pcftest.NewNegotiationDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewNegotiation.NewNegotiationScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewNegotiation.NewNegotiationScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNegotiation_UpLink extends ClickableActionElement {
    public NewNegotiation_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewNegotiation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
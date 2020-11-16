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
import pcftest.NewClaimSaved.NewClaimSavedScreen;
import pcftest.NewClaimSaved.NewClaimSavedScreen._msgs;
import pcftest.NewClaimSaved.NewClaimSaved_UpLink;
import pcftest.NewClaimSaved._Paging;
import pcftest.NewClaimSaved.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSaved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimSaved extends PCFLocation {
  public final static String CHECKSUM = "3e412df2873c7c6a665f001cab96d020";
  
  public NewClaimSaved(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimSaved"));
  }
  
  public NewClaimSavedScreen getNewClaimSavedScreen() {
    return getOrCreateProperty("NewClaimSavedScreen", "NewClaimSavedScreen", null, pcftest.NewClaimSaved.NewClaimSavedScreen.class);
  }
  
  public NewClaimSaved_UpLink getNewClaimSaved_UpLink() {
    return getOrCreateProperty("NewClaimSaved_UpLink", "NewClaimSaved_UpLink", null, pcftest.NewClaimSaved.NewClaimSaved_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimSaved._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimSaved.__crumb__.class);
  }
  
  public ClaimMessage get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMessage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSaved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSavedScreen extends PCFElement {
    public NewClaimSavedScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimSavedDV getNewClaimSavedDV() {
      return getOrCreateProperty("NewClaimSavedDV", "NewClaimSavedDV", null, pcftest.NewClaimSavedDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimSaved.NewClaimSavedScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSaved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSaved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSaved_UpLink extends ClickableActionElement {
    public NewClaimSaved_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSaved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimSaved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
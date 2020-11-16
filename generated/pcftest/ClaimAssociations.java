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
import pcftest.ClaimAssociations.ClaimAssociationsScreen;
import pcftest.ClaimAssociations.ClaimAssociationsScreen.ClaimAssociations_DeleteButton;
import pcftest.ClaimAssociations.ClaimAssociationsScreen.ClaimAssociations_FindButton;
import pcftest.ClaimAssociations.ClaimAssociationsScreen.ClaimAssociations_NewButton;
import pcftest.ClaimAssociations.ClaimAssociationsScreen._msgs;
import pcftest.ClaimAssociations.ClaimAssociations_UpLink;
import pcftest.ClaimAssociations._Paging;
import pcftest.ClaimAssociations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociations extends PCFLocation {
  public final static String CHECKSUM = "55ce66ef566d28a3ea663408aa2a5b67";
  
  public ClaimAssociations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimAssociations"));
  }
  
  public ClaimAssociationsScreen getClaimAssociationsScreen() {
    return getOrCreateProperty("ClaimAssociationsScreen", "ClaimAssociationsScreen", null, pcftest.ClaimAssociations.ClaimAssociationsScreen.class);
  }
  
  public ClaimAssociations_UpLink getClaimAssociations_UpLink() {
    return getOrCreateProperty("ClaimAssociations_UpLink", "ClaimAssociations_UpLink", null, pcftest.ClaimAssociations.ClaimAssociations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimAssociations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimAssociations.__crumb__.class);
  }
  
  public ClaimLossDetailsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetailsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationsScreen extends PCFElement {
    public ClaimAssociationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssociatedClaimsLV getAssociatedClaimsLV() {
      return getOrCreateProperty("AssociatedClaimsLV", "AssociatedClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssociatedClaimsLV.class);
    }
    
    public ClaimAssociations_DeleteButton getClaimAssociations_DeleteButton() {
      return getOrCreateProperty("ClaimAssociations_DeleteButton", "ClaimAssociations_DeleteButton", null, pcftest.ClaimAssociations.ClaimAssociationsScreen.ClaimAssociations_DeleteButton.class);
    }
    
    public ClaimAssociations_FindButton getClaimAssociations_FindButton() {
      return getOrCreateProperty("ClaimAssociations_FindButton", "ClaimAssociations_FindButton", null, pcftest.ClaimAssociations.ClaimAssociationsScreen.ClaimAssociations_FindButton.class);
    }
    
    public ClaimAssociations_NewButton getClaimAssociations_NewButton() {
      return getOrCreateProperty("ClaimAssociations_NewButton", "ClaimAssociations_NewButton", null, pcftest.ClaimAssociations.ClaimAssociationsScreen.ClaimAssociations_NewButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimAssociations.ClaimAssociationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimAssociations_DeleteButton extends ClickableActionElement {
      public ClaimAssociations_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimAssociations_FindButton extends ClickableActionElement {
      public ClaimAssociations_FindButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimAssociationSearchPopup click() {
        return clickThis(pcftest.ClaimAssociationSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimAssociations_NewButton extends ClickableActionElement {
      public ClaimAssociations_NewButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimAssociation click() {
        return clickThis(pcftest.NewClaimAssociation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociations_UpLink extends ClickableActionElement {
    public ClaimAssociations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
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
import pcftest.NewClaimAssociation.ClaimAssociationDetailScreen;
import pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.Cancel;
import pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.Edit;
import pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.Update;
import pcftest.NewClaimAssociation.ClaimAssociationDetailScreen._msgs;
import pcftest.NewClaimAssociation.NewClaimAssociation_UpLink;
import pcftest.NewClaimAssociation._Paging;
import pcftest.NewClaimAssociation.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimAssociation extends PCFLocation {
  public final static String CHECKSUM = "ca21dcc0b880740e85e2350b1f347f65";
  
  public NewClaimAssociation(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimAssociation"));
  }
  
  public ClaimAssociationDetailScreen getClaimAssociationDetailScreen() {
    return getOrCreateProperty("ClaimAssociationDetailScreen", "ClaimAssociationDetailScreen", null, pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.class);
  }
  
  public NewClaimAssociation_UpLink getNewClaimAssociation_UpLink() {
    return getOrCreateProperty("NewClaimAssociation_UpLink", "NewClaimAssociation_UpLink", null, pcftest.NewClaimAssociation.NewClaimAssociation_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimAssociation._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimAssociation.__crumb__.class);
  }
  
  public ClaimAssociations get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimAssociations.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationDetailScreen extends PCFElement {
    public ClaimAssociationDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.Cancel.class);
    }
    
    public ClaimAssociationDetailDV getClaimAssociationDetailDV() {
      return getOrCreateProperty("ClaimAssociationDetailDV", "ClaimAssociationDetailDV", null, pcftest.ClaimAssociationDetailDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimAssociation.ClaimAssociationDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimAssociation.ClaimAssociationDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimAssociation_UpLink extends ClickableActionElement {
    public NewClaimAssociation_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/NewClaimAssociation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
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
import pcftest.ClaimSnapshotCovTermPopup.ClaimSnapshotCovTermPopup_UpLink;
import pcftest.ClaimSnapshotCovTermPopup._Paging;
import pcftest.ClaimSnapshotCovTermPopup.__crumb__;
import pcftest.ClaimSnapshotCovTermPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotCovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotCovTermPopup extends PCFLocation {
  public final static String CHECKSUM = "a17272712f694efc551c3f8385c32547";
  
  public ClaimSnapshotCovTermPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotCovTermPopup"));
  }
  
  public ClaimSnapshotCovTermPopup_UpLink getClaimSnapshotCovTermPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotCovTermPopup_UpLink", "ClaimSnapshotCovTermPopup_UpLink", null, pcftest.ClaimSnapshotCovTermPopup.ClaimSnapshotCovTermPopup_UpLink.class);
  }
  
  public ValueElement getCode() {
    return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCovTermPattern() {
    return getOrCreateProperty("CovTermPattern", "CovTermPattern", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmount() {
    return getOrCreateProperty("FinancialAmount", "FinancialAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getModelAggregation() {
    return getOrCreateProperty("ModelAggregation", "ModelAggregation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getModelRestriction() {
    return getOrCreateProperty("ModelRestriction", "ModelRestriction", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNumericValue() {
    return getOrCreateProperty("NumericValue", "NumericValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getType() {
    return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getUnits() {
    return getOrCreateProperty("Units", "Units", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotCovTermPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotCovTermPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotCovTermPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotCovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotCovTermPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotCovTermPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotCovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotCovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotCovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
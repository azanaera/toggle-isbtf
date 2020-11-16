package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoverySearchRequiredInputSet.CreatedBy;
import pcftest.RecoverySearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem;
import pcftest.RecoverySearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchRequiredInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearchRequiredInputSet extends PCFElement {
  public final static String CHECKSUM = "2c1b7b51b390389172e181648d702e5b";
  
  public RecoverySearchRequiredInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CreatedBy getCreatedBy() {
    return getOrCreateProperty("CreatedBy", "CreatedBy", null, pcftest.RecoverySearchRequiredInputSet.CreatedBy.class);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreatedBy extends SelectElement {
    public CreatedBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreatedByUserSearchMenuItem getCreatedByUserSearchMenuItem() {
      return getOrCreateProperty("CreatedByUserSearchMenuItem", "CreatedByUserSearchMenuItem", null, pcftest.RecoverySearchRequiredInputSet.CreatedBy.CreatedByUserSearchMenuItem.class);
    }
    
    public CreatedByUserSelectMenuItem getCreatedByUserSelectMenuItem() {
      return getOrCreateProperty("CreatedByUserSelectMenuItem", "CreatedByUserSelectMenuItem", null, pcftest.RecoverySearchRequiredInputSet.CreatedBy.CreatedByUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedByUserSearchMenuItem extends ClickableActionElement {
      public CreatedByUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedByUserSelectMenuItem extends ClickableActionElement {
      public CreatedByUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  
}
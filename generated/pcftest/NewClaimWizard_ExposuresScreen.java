package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_ExposuresScreen.NewClaimExposuresLV_tb;
import pcftest.NewClaimWizard_ExposuresScreen.NewClaimExposuresLV_tb.Add;
import pcftest.NewClaimWizard_ExposuresScreen.NewClaimExposuresLV_tb.Remove;
import pcftest.NewClaimWizard_ExposuresScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_ExposuresScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_ExposuresScreen extends PCFElement {
  public final static String CHECKSUM = "103f3343bfc0765bad38e0503ed2f207";
  
  public NewClaimWizard_ExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimExposuresLV getNewClaimExposuresLV() {
    return getOrCreateProperty("NewClaimExposuresLV", "NewClaimExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimExposuresLV.class);
  }
  
  public NewClaimExposuresLV_tb getNewClaimExposuresLV_tb() {
    return getOrCreateProperty("NewClaimExposuresLV_tb", "NewClaimExposuresLV_tb", null, pcftest.NewClaimWizard_ExposuresScreen.NewClaimExposuresLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_ExposuresScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_ExposuresScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposuresLV_tb extends PCFElement {
    public NewClaimExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimWizard_ExposuresScreen.NewClaimExposuresLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimWizard_ExposuresScreen.NewClaimExposuresLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_ExposuresScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_ExposuresScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_ExposuresScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
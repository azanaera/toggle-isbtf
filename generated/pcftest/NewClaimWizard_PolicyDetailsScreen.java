package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimEndorsementsLV_tb;
import pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimStatCodesLV_tb;
import pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimVehiclesLV_tb;
import pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton;
import pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyLocationsLV_tb;
import pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyTripLV_tb;
import pcftest.NewClaimWizard_PolicyDetailsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PolicyDetailsScreen extends PCFElement {
  public final static String CHECKSUM = "ba204cbce1c02a4dac7f9d53699902c3";
  
  public NewClaimWizard_PolicyDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimEndorsementsLV getNewClaimEndorsementsLV() {
    return getOrCreateProperty("NewClaimEndorsementsLV", "NewClaimEndorsementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimEndorsementsLV.class);
  }
  
  public NewClaimEndorsementsLV_tb getNewClaimEndorsementsLV_tb() {
    return getOrCreateProperty("NewClaimEndorsementsLV_tb", "NewClaimEndorsementsLV_tb", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimEndorsementsLV_tb.class);
  }
  
  public NewClaimStatCodesLV getNewClaimStatCodesLV() {
    return getOrCreateProperty("NewClaimStatCodesLV", "NewClaimStatCodesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimStatCodesLV.class);
  }
  
  public NewClaimStatCodesLV_tb getNewClaimStatCodesLV_tb() {
    return getOrCreateProperty("NewClaimStatCodesLV_tb", "NewClaimStatCodesLV_tb", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimStatCodesLV_tb.class);
  }
  
  public NewClaimVehiclesLV getNewClaimVehiclesLV() {
    return getOrCreateProperty("NewClaimVehiclesLV", "NewClaimVehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimVehiclesLV.class);
  }
  
  public NewClaimVehiclesLV_tb getNewClaimVehiclesLV_tb() {
    return getOrCreateProperty("NewClaimVehiclesLV_tb", "NewClaimVehiclesLV_tb", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimVehiclesLV_tb.class);
  }
  
  public NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton getNewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton() {
    return getOrCreateProperty("NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton", "NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton.class);
  }
  
  public PolicyLocationsLV getPolicyLocationsLV() {
    return getOrCreateProperty("PolicyLocationsLV", "PolicyLocationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyLocationsLV.class);
  }
  
  public PolicyLocationsLV_tb getPolicyLocationsLV_tb() {
    return getOrCreateProperty("PolicyLocationsLV_tb", "PolicyLocationsLV_tb", null, pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyLocationsLV_tb.class);
  }
  
  public PolicyTripLV getPolicyTripLV() {
    return getOrCreateProperty("PolicyTripLV", "PolicyTripLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyTripLV.class);
  }
  
  public PolicyTripLV_tb getPolicyTripLV_tb() {
    return getOrCreateProperty("PolicyTripLV_tb", "PolicyTripLV_tb", null, pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyTripLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_PolicyDetailsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimEndorsementsLV_tb extends PCFElement {
    public NewClaimEndorsementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimEndorsementsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimEndorsementsLV_tb.Add.class);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimEndorsementsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimEndorsementsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimStatCodesLV_tb extends PCFElement {
    public NewClaimStatCodesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimStatCodesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimStatCodesLV_tb.Add.class);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimStatCodesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimStatCodesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimVehiclesLV_tb extends PCFElement {
    public NewClaimVehiclesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimVehiclesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimVehiclesLV_tb.Add.class);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimVehiclesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimWizard_PolicyDetailsScreen.NewClaimVehiclesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton extends ClickableActionElement {
    public NewClaimWizard_PolicyDetailsScreen_EditExternalFieldsButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationsLV_tb extends PCFElement {
    public PolicyLocationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyLocationsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyLocationsLV_tb.Add.class);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyLocationsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyLocationsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTripLV_tb extends PCFElement {
    public PolicyTripLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyTripLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyTripLV_tb.Add.class);
    }
    
    public pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyTripLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewClaimWizard_PolicyDetailsScreen.PolicyTripLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
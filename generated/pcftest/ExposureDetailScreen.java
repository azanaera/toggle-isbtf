package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailScreen.Cancel;
import pcftest.ExposureDetailScreen.Edit;
import pcftest.ExposureDetailScreen.ExposureDetailScreen_AssignButton;
import pcftest.ExposureDetailScreen.ExposureDetailScreen_CloseButton;
import pcftest.ExposureDetailScreen.ExposureDetailScreen_CreateReserveButton;
import pcftest.ExposureDetailScreen.ExposureDetailScreen_RefreshButton;
import pcftest.ExposureDetailScreen.ExposureDetailScreen_ReopenButton;
import pcftest.ExposureDetailScreen.ExposureDetailScreen_SendToISOButton;
import pcftest.ExposureDetailScreen.Update;
import pcftest.ExposureDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailScreen extends PCFElement {
  public final static String CHECKSUM = "2411546b5704ea891c4a2b3b6f854b62";
  
  public ExposureDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ExposureDetailScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ExposureDetailScreen.Edit.class);
  }
  
  public ExposureDetailDV_Baggage getExposureDetailDV_Baggage() {
    return getOrCreateProperty("ExposureDetailDV_Baggage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Baggage.class);
  }
  
  public ExposureDetailDV_Bodilyinjurydamage getExposureDetailDV_Bodilyinjurydamage() {
    return getOrCreateProperty("ExposureDetailDV_Bodilyinjurydamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Bodilyinjurydamage.class);
  }
  
  public ExposureDetailDV_Content getExposureDetailDV_Content() {
    return getOrCreateProperty("ExposureDetailDV_Content", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Content.class);
  }
  
  public ExposureDetailDV_Propertydamage getExposureDetailDV_Dwelling() {
    return getOrCreateProperty("ExposureDetailDV_Dwelling", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Propertydamage.class);
  }
  
  public ExposureDetailDV_Employerliability getExposureDetailDV_Employerliability() {
    return getOrCreateProperty("ExposureDetailDV_Employerliability", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Employerliability.class);
  }
  
  public ExposureDetailDV_Generaldamage getExposureDetailDV_Generaldamage() {
    return getOrCreateProperty("ExposureDetailDV_Generaldamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Generaldamage.class);
  }
  
  public ExposureDetailDV_LivingExpenses getExposureDetailDV_LivingExpenses() {
    return getOrCreateProperty("ExposureDetailDV_LivingExpenses", "ExposureDetailDV", null, pcftest.ExposureDetailDV_LivingExpenses.class);
  }
  
  public ExposureDetailDV_Lossofusedamage getExposureDetailDV_Lossofusedamage() {
    return getOrCreateProperty("ExposureDetailDV_Lossofusedamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Lossofusedamage.class);
  }
  
  public ExposureDetailDV_Lostwages getExposureDetailDV_Lostwages() {
    return getOrCreateProperty("ExposureDetailDV_Lostwages", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Lostwages.class);
  }
  
  public ExposureDetailDV_Medpay getExposureDetailDV_Medpay() {
    return getOrCreateProperty("ExposureDetailDV_Medpay", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Medpay.class);
  }
  
  public ExposureDetailDV_OtherStructure getExposureDetailDV_OtherStructure() {
    return getOrCreateProperty("ExposureDetailDV_OtherStructure", "ExposureDetailDV", null, pcftest.ExposureDetailDV_OtherStructure.class);
  }
  
  public ExposureDetailDV_Personalpropertydamage getExposureDetailDV_Personalpropertydamage() {
    return getOrCreateProperty("ExposureDetailDV_Personalpropertydamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Personalpropertydamage.class);
  }
  
  public ExposureDetailDV_Pipdamages getExposureDetailDV_Pipdamages() {
    return getOrCreateProperty("ExposureDetailDV_Pipdamages", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Pipdamages.class);
  }
  
  public ExposureDetailDV_Propertydamage getExposureDetailDV_Propertydamage() {
    return getOrCreateProperty("ExposureDetailDV_Propertydamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Propertydamage.class);
  }
  
  public ExposureDetailDV_Towonly getExposureDetailDV_Towonly() {
    return getOrCreateProperty("ExposureDetailDV_Towonly", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Towonly.class);
  }
  
  public ExposureDetailDV_TripCancellationDelay getExposureDetailDV_TripCancellationDelay() {
    return getOrCreateProperty("ExposureDetailDV_TripCancellationDelay", "ExposureDetailDV", null, pcftest.ExposureDetailDV_TripCancellationDelay.class);
  }
  
  public ExposureDetailDV_Vehicledamage getExposureDetailDV_Vehicledamage() {
    return getOrCreateProperty("ExposureDetailDV_Vehicledamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Vehicledamage.class);
  }
  
  public ExposureDetailDV_Wcinjurydamage getExposureDetailDV_Wcinjurydamage() {
    return getOrCreateProperty("ExposureDetailDV_Wcinjurydamage", "ExposureDetailDV", null, pcftest.ExposureDetailDV_Wcinjurydamage.class);
  }
  
  public ExposureDetailScreen_AssignButton getExposureDetailScreen_AssignButton() {
    return getOrCreateProperty("ExposureDetailScreen_AssignButton", "ExposureDetailScreen_AssignButton", null, pcftest.ExposureDetailScreen.ExposureDetailScreen_AssignButton.class);
  }
  
  public ExposureDetailScreen_CloseButton getExposureDetailScreen_CloseButton() {
    return getOrCreateProperty("ExposureDetailScreen_CloseButton", "ExposureDetailScreen_CloseButton", null, pcftest.ExposureDetailScreen.ExposureDetailScreen_CloseButton.class);
  }
  
  public ExposureDetailScreen_CreateReserveButton getExposureDetailScreen_CreateReserveButton() {
    return getOrCreateProperty("ExposureDetailScreen_CreateReserveButton", "ExposureDetailScreen_CreateReserveButton", null, pcftest.ExposureDetailScreen.ExposureDetailScreen_CreateReserveButton.class);
  }
  
  public ExposureDetailScreen_RefreshButton getExposureDetailScreen_RefreshButton() {
    return getOrCreateProperty("ExposureDetailScreen_RefreshButton", "ExposureDetailScreen_RefreshButton", null, pcftest.ExposureDetailScreen.ExposureDetailScreen_RefreshButton.class);
  }
  
  public ExposureDetailScreen_ReopenButton getExposureDetailScreen_ReopenButton() {
    return getOrCreateProperty("ExposureDetailScreen_ReopenButton", "ExposureDetailScreen_ReopenButton", null, pcftest.ExposureDetailScreen.ExposureDetailScreen_ReopenButton.class);
  }
  
  public ExposureDetailScreen_SendToISOButton getExposureDetailScreen_SendToISOButton() {
    return getOrCreateProperty("ExposureDetailScreen_SendToISOButton", "ExposureDetailScreen_SendToISOButton", null, pcftest.ExposureDetailScreen.ExposureDetailScreen_SendToISOButton.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ExposureDetailScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ExposureDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreen_AssignButton extends ClickableActionElement {
    public ExposureDetailScreen_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreen_CloseButton extends ClickableActionElement {
    public ExposureDetailScreen_CloseButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseExposurePopup click() {
      return clickThis(pcftest.CloseExposurePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreen_CreateReserveButton extends ClickableActionElement {
    public ExposureDetailScreen_CreateReserveButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewReserveSet click() {
      return clickThis(pcftest.NewReserveSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreen_RefreshButton extends ClickableActionElement {
    public ExposureDetailScreen_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreen_ReopenButton extends ClickableActionElement {
    public ExposureDetailScreen_ReopenButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreen_SendToISOButton extends ClickableActionElement {
    public ExposureDetailScreen_SendToISOButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
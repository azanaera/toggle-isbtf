package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailsInputSet.Activity_Importance;
import pcftest.ActivityDetailsInputSet.Activity_Priority;
import pcftest.ActivityDetailsInputSet.Activity_Status;
import pcftest.ActivityDetailsInputSet.ExternalOwner;
import pcftest.ActivityDetailsInputSet.ExternalOwner.MenuItem_Search;
import pcftest.ActivityDetailsInputSet.ExternalOwner.MenuItem_ViewDetails;
import pcftest.ActivityDetailsInputSet.RelatedToLink;
import typekey.ActivityStatus;
import typekey.ImportanceLevel;
import typekey.Priority;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailsInputSet extends PCFElement {
  public final static String CHECKSUM = "13addf3c0afdd5e5a91cb7e827aa14e4";
  
  public ActivityDetailsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getActivity_Description() {
    return getOrCreateProperty("Activity_Description", "Activity_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getActivity_DueDate() {
    return getOrCreateProperty("Activity_DueDate", "Activity_DueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getActivity_EndDate() {
    return getOrCreateProperty("Activity_EndDate", "Activity_EndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getActivity_EscalationDate() {
    return getOrCreateProperty("Activity_EscalationDate", "Activity_EscalationDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Activity_Importance getActivity_Importance() {
    return getOrCreateProperty("Activity_Importance", "Activity_Importance", null, pcftest.ActivityDetailsInputSet.Activity_Importance.class);
  }
  
  public BooleanValueElement getActivity_Mandatory() {
    return getOrCreateProperty("Activity_Mandatory", "Activity_Mandatory", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Activity_Priority getActivity_Priority() {
    return getOrCreateProperty("Activity_Priority", "Activity_Priority", null, pcftest.ActivityDetailsInputSet.Activity_Priority.class);
  }
  
  public DateElement getActivity_StartDate() {
    return getOrCreateProperty("Activity_StartDate", "Activity_StartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Activity_Status getActivity_Status() {
    return getOrCreateProperty("Activity_Status", "Activity_Status", null, pcftest.ActivityDetailsInputSet.Activity_Status.class);
  }
  
  public ValueElement getActivity_Subject() {
    return getOrCreateProperty("Activity_Subject", "Activity_Subject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExternalOwner getExternalOwner() {
    return getOrCreateProperty("ExternalOwner", "ExternalOwner", null, pcftest.ActivityDetailsInputSet.ExternalOwner.class);
  }
  
  public BooleanValueElement getExternallyOwned() {
    return getOrCreateProperty("ExternallyOwned", "ExternallyOwned", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public RelatedToLink getRelatedToLink() {
    return getOrCreateProperty("RelatedToLink", "RelatedToLink", null, pcftest.ActivityDetailsInputSet.RelatedToLink.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activity_Importance extends SelectElement {
    public Activity_Importance(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ImportanceLevel arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ImportanceLevel getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ImportanceLevel.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ImportanceLevel arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activity_Priority extends SelectElement {
    public Activity_Priority(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Priority arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Priority getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Priority.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Priority arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activity_Status extends SelectElement {
    public Activity_Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ActivityStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ActivityStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ActivityStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternalOwner extends SelectElement {
    public ExternalOwner(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ActivityDetailsInputSet.ExternalOwner.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ActivityDetailsInputSet.ExternalOwner.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToLink extends ValueElement {
    public RelatedToLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimServiceRequests click() {
      return clickThis(pcftest.ClaimServiceRequests.class);
    }
    
    
  }
  
  
}
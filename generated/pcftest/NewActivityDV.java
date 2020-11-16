package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewActivityDV.Activity_AssignActivity;
import pcftest.NewActivityDV.Activity_AssignActivity.Activity_AssignActivity_PickerButton;
import pcftest.NewActivityDV.Activity_CreateDocument;
import pcftest.NewActivityDV.Activity_CreateDocument.SelectActivity_CreateDocument;
import pcftest.NewActivityDV.Activity_ExternalOwner;
import pcftest.NewActivityDV.Activity_ExternalOwner.MenuItem_Search;
import pcftest.NewActivityDV.Activity_ExternalOwner.MenuItem_ViewDetails;
import pcftest.NewActivityDV.Activity_Importance;
import pcftest.NewActivityDV.Activity_Priority;
import pcftest.NewActivityDV.EmailTemplate;
import pcftest.NewActivityDV.EmailTemplate.SelectEmailTemplate;
import typekey.ImportanceLevel;
import typekey.Priority;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivityDV extends DetailViewElement {
  public final static String CHECKSUM = "3188adca261d1529033a1605c04acc36";
  
  public NewActivityDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityDocumentInputSet getActivityDocumentInputSet() {
    return getOrCreateProperty("ActivityDocumentInputSet", "ActivityDocumentInputSet", null, pcftest.ActivityDocumentInputSet.class);
  }
  
  public Activity_AssignActivity getActivity_AssignActivity() {
    return getOrCreateProperty("Activity_AssignActivity", "Activity_AssignActivity", null, pcftest.NewActivityDV.Activity_AssignActivity.class);
  }
  
  public Activity_CreateDocument getActivity_CreateDocument() {
    return getOrCreateProperty("Activity_CreateDocument", "Activity_CreateDocument", null, pcftest.NewActivityDV.Activity_CreateDocument.class);
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
  
  public Activity_ExternalOwner getActivity_ExternalOwner() {
    return getOrCreateProperty("Activity_ExternalOwner", "Activity_ExternalOwner", null, pcftest.NewActivityDV.Activity_ExternalOwner.class);
  }
  
  public BooleanValueElement getActivity_ExternallyOwned() {
    return getOrCreateProperty("Activity_ExternallyOwned", "Activity_ExternallyOwned", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Activity_Importance getActivity_Importance() {
    return getOrCreateProperty("Activity_Importance", "Activity_Importance", null, pcftest.NewActivityDV.Activity_Importance.class);
  }
  
  public BooleanValueElement getActivity_Mandatory() {
    return getOrCreateProperty("Activity_Mandatory", "Activity_Mandatory", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Activity_Priority getActivity_Priority() {
    return getOrCreateProperty("Activity_Priority", "Activity_Priority", null, pcftest.NewActivityDV.Activity_Priority.class);
  }
  
  public BooleanValueElement getActivity_Recurring() {
    return getOrCreateProperty("Activity_Recurring", "Activity_Recurring", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public SelectElement getActivity_RelatedTo() {
    return getOrCreateProperty("Activity_RelatedTo", "Activity_RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DateElement getActivity_StartDate() {
    return getOrCreateProperty("Activity_StartDate", "Activity_StartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getActivity_Subject() {
    return getOrCreateProperty("Activity_Subject", "Activity_Subject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmailTemplate getEmailTemplate() {
    return getOrCreateProperty("EmailTemplate", "EmailTemplate", null, pcftest.NewActivityDV.EmailTemplate.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activity_AssignActivity extends SelectElement {
    public Activity_AssignActivity(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Activity_AssignActivity_PickerButton getActivity_AssignActivity_PickerButton() {
      return getOrCreateProperty("Activity_AssignActivity_PickerButton", "Activity_AssignActivity_PickerButton", null, pcftest.NewActivityDV.Activity_AssignActivity.Activity_AssignActivity_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Activity_AssignActivity_PickerButton extends ClickableActionElement {
      public Activity_AssignActivity_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activity_CreateDocument extends BasePickerValueElement {
    public Activity_CreateDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectActivity_CreateDocument getSelectActivity_CreateDocument() {
      return getOrCreateProperty("SelectActivity_CreateDocument", "SelectActivity_CreateDocument", null, pcftest.NewActivityDV.Activity_CreateDocument.SelectActivity_CreateDocument.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectActivity_CreateDocument extends ClickableActionElement {
      public SelectActivity_CreateDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentTemplateSearchPopup click() {
        return clickThis(pcftest.DocumentTemplateSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Activity_ExternalOwner extends SelectElement {
    public Activity_ExternalOwner(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewActivityDV.Activity_ExternalOwner.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewActivityDV.Activity_ExternalOwner.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailTemplate extends BasePickerValueElement {
    public EmailTemplate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectEmailTemplate getSelectEmailTemplate() {
      return getOrCreateProperty("SelectEmailTemplate", "SelectEmailTemplate", null, pcftest.NewActivityDV.EmailTemplate.SelectEmailTemplate.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newactivity/NewActivityDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectEmailTemplate extends ClickableActionElement {
      public SelectEmailTemplate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickEmailTemplatePopup click() {
        return clickThis(pcftest.PickEmailTemplatePopup.class);
      }
      
      
    }
    
    
  }
  
  
}
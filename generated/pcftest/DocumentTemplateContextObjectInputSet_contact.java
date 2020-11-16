package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentTemplateContextObjectInputSet_contact.DynamicInput;
import pcftest.DocumentTemplateContextObjectInputSet_contact.DynamicInput.MenuItem_Search;
import pcftest.DocumentTemplateContextObjectInputSet_contact.DynamicInput.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newdocument/DocumentTemplateContextObjectInputSet.contact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateContextObjectInputSet_contact extends DocumentTemplateContextObjectInputSet {
  public final static String CHECKSUM = "21001dda38a317ae30dec02d32dc7c04";
  
  public DocumentTemplateContextObjectInputSet_contact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DynamicInput getDynamicInput() {
    return getOrCreateProperty("DynamicInput", "DynamicInput", null, pcftest.DocumentTemplateContextObjectInputSet_contact.DynamicInput.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DynamicInput extends SelectElement {
    public DynamicInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ContextObjectContactPickerMenuItemSet getContextObjectContactPickerMenuItemSet() {
      return getOrCreateProperty("ContextObjectContactPickerMenuItemSet", "ContextObjectContactPickerMenuItemSet", null, pcftest.ContextObjectContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.DocumentTemplateContextObjectInputSet_contact.DynamicInput.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.DocumentTemplateContextObjectInputSet_contact.DynamicInput.MenuItem_ViewDetails.class);
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
  
  
}
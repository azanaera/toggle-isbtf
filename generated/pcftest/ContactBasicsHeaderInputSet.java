package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactBasicsHeaderInputSet.EditableClaimContactRolesLV_tb;
import pcftest.ContactBasicsHeaderInputSet.EditableClaimContactRolesLV_tb.Add;
import pcftest.ContactBasicsHeaderInputSet.EditableClaimContactRolesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsHeaderInputSet extends PCFElement {
  public final static String CHECKSUM = "ee21dbaa9cd9e57da1887fb26a57b504";
  
  public ContactBasicsHeaderInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableClaimContactRolesLV getEditableClaimContactRolesLV() {
    return getOrCreateProperty("EditableClaimContactRolesLV", "EditableClaimContactRolesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableClaimContactRolesLV.class);
  }
  
  public EditableClaimContactRolesLV_tb getEditableClaimContactRolesLV_tb() {
    return getOrCreateProperty("EditableClaimContactRolesLV_tb", "EditableClaimContactRolesLV_tb", null, pcftest.ContactBasicsHeaderInputSet.EditableClaimContactRolesLV_tb.class);
  }
  
  public ValueElement getLinkStatusMessage() {
    return getOrCreateProperty("LinkStatusMessage", "LinkStatusMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLinkStatusRelationshipsMessage() {
    return getOrCreateProperty("LinkStatusRelationshipsMessage", "LinkStatusRelationshipsMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimContactRolesLV_tb extends PCFElement {
    public EditableClaimContactRolesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ContactBasicsHeaderInputSet.EditableClaimContactRolesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ContactBasicsHeaderInputSet.EditableClaimContactRolesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}
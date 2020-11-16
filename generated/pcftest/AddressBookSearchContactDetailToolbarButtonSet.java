package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookSearchContactDetailToolbarButtonSet.Cancel;
import pcftest.AddressBookSearchContactDetailToolbarButtonSet.Edit;
import pcftest.AddressBookSearchContactDetailToolbarButtonSet.Update;
import pcftest.AddressBookSearchContactDetailToolbarButtonSet.UpdateAndLink;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchContactDetailToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "3377e110b68026a82f1302edac1ae5ed";
  
  public AddressBookSearchContactDetailToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.Update.class);
  }
  
  public UpdateAndLink getUpdateAndLink() {
    return getOrCreateProperty("UpdateAndLink", "UpdateAndLink", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.UpdateAndLink.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateAndLink extends ClickableActionElement {
    public UpdateAndLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
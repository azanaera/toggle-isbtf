package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LinkContactToolbarButtonSet.LinkContactToolbarButtons_LinkButton;
import pcftest.LinkContactToolbarButtonSet.LinkContactToolbarButtons_SyncFromAddressBookButton;
import pcftest.LinkContactToolbarButtonSet.LinkContactToolbarButtons_UnlinkButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LinkContactToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "1884663648cdd91655df0c9857c85b3e";
  
  public LinkContactToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LinkContactToolbarButtons_LinkButton getLinkContactToolbarButtons_LinkButton() {
    return getOrCreateProperty("LinkContactToolbarButtons_LinkButton", "LinkContactToolbarButtons_LinkButton", null, pcftest.LinkContactToolbarButtonSet.LinkContactToolbarButtons_LinkButton.class);
  }
  
  public LinkContactToolbarButtons_SyncFromAddressBookButton getLinkContactToolbarButtons_SyncFromAddressBookButton() {
    return getOrCreateProperty("LinkContactToolbarButtons_SyncFromAddressBookButton", "LinkContactToolbarButtons_SyncFromAddressBookButton", null, pcftest.LinkContactToolbarButtonSet.LinkContactToolbarButtons_SyncFromAddressBookButton.class);
  }
  
  public LinkContactToolbarButtons_UnlinkButton getLinkContactToolbarButtons_UnlinkButton() {
    return getOrCreateProperty("LinkContactToolbarButtons_UnlinkButton", "LinkContactToolbarButtons_UnlinkButton", null, pcftest.LinkContactToolbarButtonSet.LinkContactToolbarButtons_UnlinkButton.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkContactToolbarButtons_LinkButton extends ClickableActionElement {
    public LinkContactToolbarButtons_LinkButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkContactToolbarButtons_SyncFromAddressBookButton extends ClickableActionElement {
    public LinkContactToolbarButtons_SyncFromAddressBookButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkContactToolbarButtons_UnlinkButton extends ClickableActionElement {
    public LinkContactToolbarButtons_UnlinkButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
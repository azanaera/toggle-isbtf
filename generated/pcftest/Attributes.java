package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Attributes.AttributesScreen;
import pcftest.Attributes.AttributesScreen.Attributes_AddAttributeButton;
import pcftest.Attributes.AttributesScreen.Attributes_DeleteButton;
import pcftest.Attributes.AttributesScreen._msgs;
import pcftest.Attributes.Attributes_UpLink;
import pcftest.Attributes._Paging;
import pcftest.Attributes.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Attributes extends PCFLocation {
  public final static String CHECKSUM = "68795d5e3f8469ca559aadb05109c28b";
  
  public Attributes(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Attributes"));
  }
  
  public AttributesScreen getAttributesScreen() {
    return getOrCreateProperty("AttributesScreen", "AttributesScreen", null, pcftest.Attributes.AttributesScreen.class);
  }
  
  public Attributes_UpLink getAttributes_UpLink() {
    return getOrCreateProperty("Attributes_UpLink", "Attributes_UpLink", null, pcftest.Attributes.Attributes_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Attributes._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Attributes.__crumb__.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributesScreen extends PCFElement {
    public AttributesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AttributesLV getAttributesLV() {
      return getOrCreateProperty("AttributesLV", "AttributesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AttributesLV.class);
    }
    
    public Attributes_AddAttributeButton getAttributes_AddAttributeButton() {
      return getOrCreateProperty("Attributes_AddAttributeButton", "Attributes_AddAttributeButton", null, pcftest.Attributes.AttributesScreen.Attributes_AddAttributeButton.class);
    }
    
    public Attributes_DeleteButton getAttributes_DeleteButton() {
      return getOrCreateProperty("Attributes_DeleteButton", "Attributes_DeleteButton", null, pcftest.Attributes.AttributesScreen.Attributes_DeleteButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Attributes.AttributesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Attributes_AddAttributeButton extends ClickableActionElement {
      public Attributes_AddAttributeButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewAttribute click() {
        return clickThis(pcftest.NewAttribute.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Attributes_DeleteButton extends ClickableActionElement {
      public Attributes_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Attributes_UpLink extends ClickableActionElement {
    public Attributes_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Attributes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
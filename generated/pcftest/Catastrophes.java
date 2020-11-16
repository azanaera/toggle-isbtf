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
import pcftest.Catastrophes.CatastrophesScreen;
import pcftest.Catastrophes.CatastrophesScreen.Catastrophes_ActivateButton;
import pcftest.Catastrophes.CatastrophesScreen.Catastrophes_AddCatastropheButton;
import pcftest.Catastrophes.CatastrophesScreen.Catastrophes_DeactivateButton;
import pcftest.Catastrophes.CatastrophesScreen._msgs;
import pcftest.Catastrophes.Catastrophes_UpLink;
import pcftest.Catastrophes._Paging;
import pcftest.Catastrophes.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Catastrophes extends PCFLocation {
  public final static String CHECKSUM = "ee0d469d05363da9dc193638a380ab95";
  
  public Catastrophes(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Catastrophes"));
  }
  
  public CatastrophesScreen getCatastrophesScreen() {
    return getOrCreateProperty("CatastrophesScreen", "CatastrophesScreen", null, pcftest.Catastrophes.CatastrophesScreen.class);
  }
  
  public Catastrophes_UpLink getCatastrophes_UpLink() {
    return getOrCreateProperty("Catastrophes_UpLink", "Catastrophes_UpLink", null, pcftest.Catastrophes.Catastrophes_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Catastrophes._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Catastrophes.__crumb__.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastrophesScreen extends PCFElement {
    public CatastrophesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CatastropheAdminLV getCatastropheAdminLV() {
      return getOrCreateProperty("CatastropheAdminLV", "CatastropheAdminLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CatastropheAdminLV.class);
    }
    
    public Catastrophes_ActivateButton getCatastrophes_ActivateButton() {
      return getOrCreateProperty("Catastrophes_ActivateButton", "Catastrophes_ActivateButton", null, pcftest.Catastrophes.CatastrophesScreen.Catastrophes_ActivateButton.class);
    }
    
    public Catastrophes_AddCatastropheButton getCatastrophes_AddCatastropheButton() {
      return getOrCreateProperty("Catastrophes_AddCatastropheButton", "Catastrophes_AddCatastropheButton", null, pcftest.Catastrophes.CatastrophesScreen.Catastrophes_AddCatastropheButton.class);
    }
    
    public Catastrophes_DeactivateButton getCatastrophes_DeactivateButton() {
      return getOrCreateProperty("Catastrophes_DeactivateButton", "Catastrophes_DeactivateButton", null, pcftest.Catastrophes.CatastrophesScreen.Catastrophes_DeactivateButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Catastrophes.CatastrophesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Catastrophes_ActivateButton extends ClickableActionElement {
      public Catastrophes_ActivateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Catastrophes_AddCatastropheButton extends ClickableActionElement {
      public Catastrophes_AddCatastropheButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewCatastrophe click() {
        return clickThis(pcftest.NewCatastrophe.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Catastrophes_DeactivateButton extends ClickableActionElement {
      public Catastrophes_DeactivateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Catastrophes_UpLink extends ClickableActionElement {
    public Catastrophes_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/catastrophes/Catastrophes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
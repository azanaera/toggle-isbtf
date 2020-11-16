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
import pcftest.NewEvaluation.NewEvaluationScreen;
import pcftest.NewEvaluation.NewEvaluationScreen.Cancel;
import pcftest.NewEvaluation.NewEvaluationScreen.Edit;
import pcftest.NewEvaluation.NewEvaluationScreen.Update;
import pcftest.NewEvaluation.NewEvaluationScreen._msgs;
import pcftest.NewEvaluation.NewEvaluation_UpLink;
import pcftest.NewEvaluation._Paging;
import pcftest.NewEvaluation.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewEvaluation extends PCFLocation {
  public final static String CHECKSUM = "d4c2ae3c0bcd2d9b3194b9aba15f0094";
  
  public NewEvaluation(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewEvaluation"));
  }
  
  public NewEvaluationScreen getNewEvaluationScreen() {
    return getOrCreateProperty("NewEvaluationScreen", "NewEvaluationScreen", null, pcftest.NewEvaluation.NewEvaluationScreen.class);
  }
  
  public NewEvaluation_UpLink getNewEvaluation_UpLink() {
    return getOrCreateProperty("NewEvaluation_UpLink", "NewEvaluation_UpLink", null, pcftest.NewEvaluation.NewEvaluation_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewEvaluation._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewEvaluation.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewEvaluationScreen extends PCFElement {
    public NewEvaluationScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewEvaluation.NewEvaluationScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewEvaluation.NewEvaluationScreen.Edit.class);
    }
    
    public NewEvaluationDV getNewEvaluationDV() {
      return getOrCreateProperty("NewEvaluationDV", "NewEvaluationDV", null, pcftest.NewEvaluationDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewEvaluation.NewEvaluationScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewEvaluation.NewEvaluationScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewEvaluation_UpLink extends ClickableActionElement {
    public NewEvaluation_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewEvaluation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
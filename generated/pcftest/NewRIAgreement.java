package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewRIAgreement.NewRIAgreement_UpLink;
import pcftest.NewRIAgreement._Paging;
import pcftest.NewRIAgreement.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRIAgreement extends PCFLocation {
  public final static String CHECKSUM = "48bcf7162891f58b6e878f377e0a45e9";
  
  public NewRIAgreement(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewRIAgreement"));
  }
  
  public NewRIAgreementScreen getNewRIAgreementScreen() {
    return getOrCreateProperty("NewRIAgreementScreen", "NewRIAgreementScreen", null, pcftest.NewRIAgreementScreen.class);
  }
  
  public NewRIAgreement_UpLink getNewRIAgreement_UpLink() {
    return getOrCreateProperty("NewRIAgreement_UpLink", "NewRIAgreement_UpLink", null, pcftest.NewRIAgreement.NewRIAgreement_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewRIAgreement._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewRIAgreement.__crumb__.class);
  }
  
  public ReinsuranceSummary get_parent() {
    return getOrCreateProperty("_parent", pcftest.ReinsuranceSummary.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRIAgreement_UpLink extends ClickableActionElement {
    public NewRIAgreement_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
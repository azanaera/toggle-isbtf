package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RISubtypeAndGroupInputSet.AgreementGroup;
import pcftest.RISubtypeAndGroupInputSet.AgreementGroup.AgreementGroupMenu_Edit;
import pcftest.RISubtypeAndGroupInputSet.AgreementGroup.AgreementGroupMenu_noNothing;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RISubtypeAndGroupInputSet extends PCFElement {
  public final static String CHECKSUM = "5f122a29956fbe65fe89e48fd28e46bc";
  
  public RISubtypeAndGroupInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AgreementGroup getAgreementGroup() {
    return getOrCreateProperty("AgreementGroup", "AgreementGroup", null, pcftest.RISubtypeAndGroupInputSet.AgreementGroup.class);
  }
  
  public ValueElement getAgreementSubtype() {
    return getOrCreateProperty("AgreementSubtype", "AgreementSubtype", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgreementGroup extends SelectElement {
    public AgreementGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AgreementGroupMenu_Edit getAgreementGroupMenu_Edit() {
      return getOrCreateProperty("AgreementGroupMenu_Edit", "AgreementGroupMenu_Edit", null, pcftest.RISubtypeAndGroupInputSet.AgreementGroup.AgreementGroupMenu_Edit.class);
    }
    
    public AgreementGroupMenu_noNothing getAgreementGroupMenu_noNothing() {
      return getOrCreateProperty("AgreementGroupMenu_noNothing", "AgreementGroupMenu_noNothing", null, pcftest.RISubtypeAndGroupInputSet.AgreementGroup.AgreementGroupMenu_noNothing.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AgreementGroupMenu_Edit extends ClickableActionElement {
      public AgreementGroupMenu_Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RIAgreementGroupPopup click() {
        return clickThis(pcftest.RIAgreementGroupPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AgreementGroupMenu_noNothing extends ClickableActionElement {
      public AgreementGroupMenu_noNothing(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}
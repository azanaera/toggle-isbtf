package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NoClaimDV.CreateNewClaim;
import pcftest.NoClaimDV.Header;
import pcftest.NoClaimDV.SearchForClaim;
import pcftest.NoClaimDV.YouCan;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/NoClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NoClaimDV extends DetailViewElement {
  public final static String CHECKSUM = "21578dc05496defc1f4a27fdcca66155";
  
  public NoClaimDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CreateNewClaim getCreateNewClaim() {
    return getOrCreateProperty("CreateNewClaim", "CreateNewClaim", null, pcftest.NoClaimDV.CreateNewClaim.class);
  }
  
  public Header getHeader() {
    return getOrCreateProperty("Header", "Header", null, pcftest.NoClaimDV.Header.class);
  }
  
  public SearchForClaim getSearchForClaim() {
    return getOrCreateProperty("SearchForClaim", "SearchForClaim", null, pcftest.NoClaimDV.SearchForClaim.class);
  }
  
  public YouCan getYouCan() {
    return getOrCreateProperty("YouCan", "YouCan", null, pcftest.NoClaimDV.YouCan.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateNewClaim extends ValueElement {
    public CreateNewClaim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard click() {
      return clickThis(pcftest.FNOLWizard.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Header extends ValueElement {
    public Header(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchForClaim extends ValueElement {
    public SearchForClaim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSearch click() {
      return clickThis(pcftest.ClaimSearch.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/NoClaimDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class YouCan extends ValueElement {
    public YouCan(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}
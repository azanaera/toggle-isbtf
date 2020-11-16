package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupUserSearchDV.Name;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/GroupUserSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupUserSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "f373f14e25ce3e40d1c29882fe615c6c";
  
  public GroupUserSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Name getName() {
    return getOrCreateProperty("Name", "Name", null, pcftest.GroupUserSearchDV.Name.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/GroupUserSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Name extends PCFElement {
    public Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
      return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
    }
    
    public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
      return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
    }
    
    
  }
  
  
}
package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.TreeViewElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TeamMenuTree.TeamMenuTree2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamMenuTree.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamMenuTree extends PCFElement {
  public final static String CHECKSUM = "fad60dde41f1f375a336cc3992fd5b24";
  
  public TeamMenuTree(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TeamMenuTree2 getTeamMenuTree() {
    return getOrCreateProperty("TeamMenuTree", "TeamMenuTree", null, pcftest.TeamMenuTree.TeamMenuTree2.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamMenuTree.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuTree2 extends TreeViewElement {
    public TeamMenuTree2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}
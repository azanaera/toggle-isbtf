package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserStatisticsScreen.UserStatisticsScreen_CloseErrorWindowButton;
import pcftest.UserStatisticsScreen.UserStatisticsScreen_RefreshButton;
import pcftest.UserStatisticsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserStatisticsScreen extends PCFElement {
  public final static String CHECKSUM = "a94ee996c4c71a071f8d907ba29aa59e";
  
  public UserStatisticsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public UserStatisticsDV getUserStatisticsDV() {
    return getOrCreateProperty("UserStatisticsDV", "UserStatisticsDV", null, pcftest.UserStatisticsDV.class);
  }
  
  public UserStatisticsScreen_CloseErrorWindowButton getUserStatisticsScreen_CloseErrorWindowButton() {
    return getOrCreateProperty("UserStatisticsScreen_CloseErrorWindowButton", "UserStatisticsScreen_CloseErrorWindowButton", null, pcftest.UserStatisticsScreen.UserStatisticsScreen_CloseErrorWindowButton.class);
  }
  
  public UserStatisticsScreen_RefreshButton getUserStatisticsScreen_RefreshButton() {
    return getOrCreateProperty("UserStatisticsScreen_RefreshButton", "UserStatisticsScreen_RefreshButton", null, pcftest.UserStatisticsScreen.UserStatisticsScreen_RefreshButton.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserStatisticsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserStatisticsScreen_CloseErrorWindowButton extends ClickableActionElement {
    public UserStatisticsScreen_CloseErrorWindowButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserStatisticsScreen_RefreshButton extends ClickableActionElement {
    public UserStatisticsScreen_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}
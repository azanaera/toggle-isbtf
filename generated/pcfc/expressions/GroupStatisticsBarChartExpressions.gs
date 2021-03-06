package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/team/summary/GroupStatisticsBarChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupStatisticsBarChartExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/team/summary/GroupStatisticsBarChart.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupStatisticsBarChartExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'categoryLabel' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 27, column 55
    function categoryLabel_0 (value :  gw.api.statistics.Statistics) : java.lang.String {
      return value.Name
    }
    
    // 'dataValues' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 27, column 55
    function dataValues_1 () : java.lang.Object {
      return StatisticsList
    }
    
    // 'value' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 27, column 55
    function value_2 (value :  gw.api.statistics.Statistics) : java.lang.Object {
      return value.OpenClaims - value.FlaggedClaims
    }
    
    // 'value' attribute on DataSeries at GroupStatisticsBarChart.pcf: line 33, column 36
    function value_5 (value :  gw.api.statistics.Statistics) : java.lang.Object {
      return value.FlaggedClaims
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    property get StatisticsList () : gw.api.statistics.Statistics[] {
      return getRequireValue("StatisticsList", 0) as gw.api.statistics.Statistics[]
    }
    
    property set StatisticsList ($arg :  gw.api.statistics.Statistics[]) {
      setRequireValue("StatisticsList", 0, $arg)
    }
    
    
  }
  
  
}
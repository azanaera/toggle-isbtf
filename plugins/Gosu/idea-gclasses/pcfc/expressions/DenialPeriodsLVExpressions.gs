package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DenialPeriodsLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at DenialPeriodsLV.pcf: line 23, column 81
    function pickLocation_34 () : void {
      DenialPeriodPopup.push()
    }
    
    // 'sortBy' attribute on TypeKeyCell (id=JurisdictionState_Cell) at DenialPeriodsLV.pcf: line 33, column 45
    function sortValue_0 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.JurisdictionState
    }
    
    // 'value' attribute on DateCell (id=EffectiveDate_Cell) at DenialPeriodsLV.pcf: line 39, column 49
    function sortValue_1 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=ExpiryDate_Cell) at DenialPeriodsLV.pcf: line 45, column 46
    function sortValue_2 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.ExpiryDate
    }
    
    // 'value' attribute on TypeKeyCell (id=DueDateFormula_Cell) at DenialPeriodsLV.pcf: line 52, column 54
    function sortValue_3 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.DueDateFormula
    }
    
    // 'value' attribute on TextCell (id=TargetDaysFromLoss_Cell) at DenialPeriodsLV.pcf: line 58, column 42
    function sortValue_4 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.TargetDaysFromLoss
    }
    
    // 'value' attribute on TextCell (id=TargetDaysFromNotice_Cell) at DenialPeriodsLV.pcf: line 64, column 42
    function sortValue_5 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.TargetDaysFromNotice
    }
    
    // 'value' attribute on TypeKeyCell (id=TargetIncludeDays_Cell) at DenialPeriodsLV.pcf: line 70, column 48
    function sortValue_6 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.TargetIncludeDays
    }
    
    // 'value' attribute on BooleanRadioCell (id=BenefitPaymentAcceptance_Cell) at DenialPeriodsLV.pcf: line 75, column 60
    function sortValue_7 (WCDenialPeriod :  entity.WCDenialPeriod) : java.lang.Object {
      return WCDenialPeriod.BenefitPaymentAcceptance
    }
    
    // 'toRemove' attribute on RowIterator at DenialPeriodsLV.pcf: line 23, column 81
    function toRemove_35 (WCDenialPeriod :  entity.WCDenialPeriod) : void {
      WCDenialPeriod.remove()
    }
    
    // 'value' attribute on RowIterator at DenialPeriodsLV.pcf: line 23, column 81
    function value_36 () : gw.api.database.IQueryBeanResult<entity.WCDenialPeriod> {
      return WCDenialPeriodList
    }
    
    property get WCDenialPeriodList () : gw.api.database.IQueryBeanResult<WCDenialPeriod> {
      return getRequireValue("WCDenialPeriodList", 0) as gw.api.database.IQueryBeanResult<WCDenialPeriod>
    }
    
    property set WCDenialPeriodList ($arg :  gw.api.database.IQueryBeanResult<WCDenialPeriod>) {
      setRequireValue("WCDenialPeriodList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/admin/statutes/DenialPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DenialPeriodsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TypeKeyCell (id=JurisdictionState_Cell) at DenialPeriodsLV.pcf: line 33, column 45
    function action_8 () : void {
      DenialPeriodPopup.push( WCDenialPeriod, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TypeKeyCell (id=JurisdictionState_Cell) at DenialPeriodsLV.pcf: line 33, column 45
    function action_dest_9 () : pcf.api.Destination {
      return pcf.DenialPeriodPopup.createDestination( WCDenialPeriod, CurrentLocation.InEditMode )
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState_Cell) at DenialPeriodsLV.pcf: line 33, column 45
    function valueRoot_11 () : java.lang.Object {
      return WCDenialPeriod
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState_Cell) at DenialPeriodsLV.pcf: line 33, column 45
    function value_10 () : typekey.Jurisdiction {
      return WCDenialPeriod.JurisdictionState
    }
    
    // 'value' attribute on DateCell (id=EffectiveDate_Cell) at DenialPeriodsLV.pcf: line 39, column 49
    function value_13 () : java.util.Date {
      return WCDenialPeriod.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=ExpiryDate_Cell) at DenialPeriodsLV.pcf: line 45, column 46
    function value_16 () : java.util.Date {
      return WCDenialPeriod.ExpiryDate
    }
    
    // 'value' attribute on TypeKeyCell (id=DueDateFormula_Cell) at DenialPeriodsLV.pcf: line 52, column 54
    function value_19 () : typekey.JurisdictionalFormula {
      return WCDenialPeriod.DueDateFormula
    }
    
    // 'value' attribute on TextCell (id=TargetDaysFromLoss_Cell) at DenialPeriodsLV.pcf: line 58, column 42
    function value_22 () : java.lang.Integer {
      return WCDenialPeriod.TargetDaysFromLoss
    }
    
    // 'value' attribute on TextCell (id=TargetDaysFromNotice_Cell) at DenialPeriodsLV.pcf: line 64, column 42
    function value_25 () : java.lang.Integer {
      return WCDenialPeriod.TargetDaysFromNotice
    }
    
    // 'value' attribute on TypeKeyCell (id=TargetIncludeDays_Cell) at DenialPeriodsLV.pcf: line 70, column 48
    function value_28 () : typekey.IncludeDaysType {
      return WCDenialPeriod.TargetIncludeDays
    }
    
    // 'value' attribute on BooleanRadioCell (id=BenefitPaymentAcceptance_Cell) at DenialPeriodsLV.pcf: line 75, column 60
    function value_31 () : java.lang.Boolean {
      return WCDenialPeriod.BenefitPaymentAcceptance
    }
    
    property get WCDenialPeriod () : entity.WCDenialPeriod {
      return getIteratedValue(1) as entity.WCDenialPeriod
    }
    
    
  }
  
  
}
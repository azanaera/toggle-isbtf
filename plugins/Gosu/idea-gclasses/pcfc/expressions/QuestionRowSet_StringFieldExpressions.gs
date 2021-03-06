package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/question/QuestionRowSet.StringField.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuestionRowSet_StringFieldExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/shared/question/QuestionRowSet.StringField.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuestionRowSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=subQuestionText_Cell) at QuestionRowSet.StringField.pcf: line 41, column 37
    function valueRoot_13 () : java.lang.Object {
      return SubQuestion
    }
    
    // 'value' attribute on TextCell (id=subQuestionText_Cell) at QuestionRowSet.StringField.pcf: line 41, column 37
    function value_12 () : java.lang.String {
      return SubQuestion.Text
    }
    
    property get SubQuestion () : entity.SubQuestion {
      return getIteratedValue(1) as entity.SubQuestion
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/shared/question/QuestionRowSet.StringField.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuestionRowSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=questionStringAnswer_Cell) at QuestionRowSet.StringField.pcf: line 26, column 75
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      AnswerSetContainer.getOrCreateAnswer(Question).TextAnswer = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextCell (id=questionStringAnswer_Cell) at QuestionRowSet.StringField.pcf: line 26, column 75
    function editable_3 () : java.lang.Boolean {
      return !Question.isRetired()
    }
    
    // 'validationLabel' attribute on TextCell (id=questionStringAnswer_Cell) at QuestionRowSet.StringField.pcf: line 26, column 75
    function label_4 () : java.lang.Object {
      return Question.Text
    }
    
    // 'required' attribute on TextCell (id=questionStringAnswer_Cell) at QuestionRowSet.StringField.pcf: line 26, column 75
    function required_5 () : java.lang.Boolean {
      return Question.Required
    }
    
    // 'value' attribute on TextCell (id=questionText_Cell) at QuestionRowSet.StringField.pcf: line 19, column 22
    function valueRoot_1 () : java.lang.Object {
      return Question
    }
    
    // 'value' attribute on TextCell (id=questionStringAnswer_Cell) at QuestionRowSet.StringField.pcf: line 26, column 75
    function valueRoot_8 () : java.lang.Object {
      return AnswerSetContainer.getOrCreateAnswer(Question)
    }
    
    // 'value' attribute on TextCell (id=questionText_Cell) at QuestionRowSet.StringField.pcf: line 19, column 22
    function value_0 () : java.lang.String {
      return Question.IndentedLabel
    }
    
    // 'value' attribute on RowIterator at QuestionRowSet.StringField.pcf: line 35, column 40
    function value_15 () : entity.SubQuestion[] {
      return Question.SubQuestions
    }
    
    // 'value' attribute on TextCell (id=questionStringAnswer_Cell) at QuestionRowSet.StringField.pcf: line 26, column 75
    function value_6 () : java.lang.String {
      return AnswerSetContainer.getOrCreateAnswer(Question).TextAnswer
    }
    
    // 'visible' attribute on Row at QuestionRowSet.StringField.pcf: line 15, column 66
    function visible_11 () : java.lang.Boolean {
      return Question.isQuestionAvailable(AnswerSetContainer)
    }
    
    property get AnswerSetContainer () : gw.api.question.AnswerSetContainer {
      return getRequireValue("AnswerSetContainer", 0) as gw.api.question.AnswerSetContainer
    }
    
    property set AnswerSetContainer ($arg :  gw.api.question.AnswerSetContainer) {
      setRequireValue("AnswerSetContainer", 0, $arg)
    }
    
    property get Question () : Question {
      return getRequireValue("Question", 0) as Question
    }
    
    property set Question ($arg :  Question) {
      setRequireValue("Question", 0, $arg)
    }
    
    
  }
  
  
}
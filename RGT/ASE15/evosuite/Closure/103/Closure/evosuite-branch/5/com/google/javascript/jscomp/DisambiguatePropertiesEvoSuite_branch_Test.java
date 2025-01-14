/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:58:48 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.RecordType;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

 
public class DisambiguatePropertiesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      
      String string0 = "xsYvJ\\=>#gr^";
      TightenTypes tightenTypes0 = null;
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertNotNull(disambiguateProperties0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      
      ConcreteType concreteType0 = ConcreteType.NONE;
      assertNotNull(concreteType0);
      
      ConcreteType.ConcreteUniqueType concreteType_ConcreteUniqueType0 = (ConcreteType.ConcreteUniqueType)disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertNotNull(concreteType_ConcreteUniqueType0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertNotNull(disambiguateProperties0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      String string0 = null;
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0);
      assertNotNull(jSTypeRegistry0);
      
      String string1 = "O(6[R+Z^ ggP!y";
      int int0 = 0;
      NamedType namedType0 = new NamedType(jSTypeRegistry0, string1, string1, int0, int0);
      assertNotNull(namedType0);
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals(false, namedType0.isResolved());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals("O(6[R+Z^ ggP!y", namedType0.getReferenceName());
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(true, namedType0.isNamedType());
      assertEquals("O(6[R+Z^ ggP!y", namedType0.toString());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(false, namedType0.isUnionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(true, namedType0.isNominalType());
      
      NamedType namedType1 = (NamedType)disambiguateProperties0.getTypeWithProperty(string0, namedType0);
      assertNotNull(namedType1);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, namedType1.hasCachedValues());
      assertEquals("O(6[R+Z^ ggP!y", namedType1.toString());
      assertEquals(false, namedType1.isTemplateType());
      assertEquals(false, namedType1.isNoObjectType());
      assertEquals(false, namedType1.isResolved());
      assertEquals(true, namedType1.hasReferenceName());
      assertEquals(false, namedType1.isNumberValueType());
      assertEquals(BooleanLiteralSet.TRUE, namedType1.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType1.isStringValueType());
      assertEquals(false, namedType1.isNullType());
      assertEquals(true, namedType1.isNominalType());
      assertEquals(false, namedType1.isUnionType());
      assertEquals(false, namedType1.isFunctionType());
      assertEquals(false, namedType1.isBooleanValueType());
      assertEquals(false, namedType1.isEmptyType());
      assertEquals(false, namedType1.isNativeObjectType());
      assertEquals(false, namedType1.isVoidType());
      assertEquals(false, namedType1.isAllType());
      assertEquals(true, namedType1.isNamedType());
      assertEquals("O(6[R+Z^ ggP!y", namedType1.getReferenceName());
      assertEquals(false, namedType1.isNoType());
      assertEquals(false, namedType1.isRecordType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals(false, namedType0.isResolved());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals("O(6[R+Z^ ggP!y", namedType0.getReferenceName());
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(true, namedType0.isNamedType());
      assertEquals("O(6[R+Z^ ggP!y", namedType0.toString());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(false, namedType0.isUnionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(true, namedType0.isNominalType());
      assertSame(namedType1, namedType0);
      assertSame(namedType0, namedType1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertNotNull(disambiguateProperties0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      
      String string0 = "J_SC_INVALIDATION";
      ErrorReporter errorReporter0 = null;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      assertNotNull(jSTypeRegistry0);
      
      HashMap<String, JSType> hashMap0 = new HashMap<String, JSType>();
      assertNotNull(hashMap0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      
      RecordType recordType0 = jSTypeRegistry0.createRecordType((Map<String, JSType>) hashMap0);
      assertNotNull(recordType0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals(false, recordType0.isStringValueType());
      assertEquals(false, recordType0.isTemplateType());
      assertEquals(false, recordType0.isUnionType());
      assertEquals(false, recordType0.isNamedType());
      assertEquals(false, recordType0.isNoType());
      assertEquals(BooleanLiteralSet.TRUE, recordType0.getPossibleToBooleanOutcomes());
      assertEquals(false, recordType0.isEmptyType());
      assertEquals(false, recordType0.isAllType());
      assertEquals(false, recordType0.isNoObjectType());
      assertEquals(false, recordType0.isFunctionType());
      assertEquals(false, recordType0.isBooleanValueType());
      assertEquals(false, recordType0.isNullType());
      assertEquals(false, recordType0.isVoidType());
      assertEquals(false, recordType0.isNumberValueType());
      assertEquals(false, recordType0.isResolved());
      assertEquals(true, recordType0.isRecordType());
      
      JSType jSType0 = disambiguateProperties0.getTypeWithProperty(string0, recordType0);
      assertNull(jSType0);
      assertEquals("{}", hashMap0.toString());
      assertEquals(true, hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals(false, recordType0.isStringValueType());
      assertEquals(false, recordType0.isTemplateType());
      assertEquals(false, recordType0.isUnionType());
      assertEquals(false, recordType0.isNamedType());
      assertEquals(false, recordType0.isNoType());
      assertEquals(BooleanLiteralSet.TRUE, recordType0.getPossibleToBooleanOutcomes());
      assertEquals(false, recordType0.isEmptyType());
      assertEquals(false, recordType0.isAllType());
      assertEquals(false, recordType0.isNoObjectType());
      assertEquals(false, recordType0.isFunctionType());
      assertEquals(false, recordType0.isBooleanValueType());
      assertEquals(false, recordType0.isNullType());
      assertEquals(false, recordType0.isVoidType());
      assertEquals(false, recordType0.isNumberValueType());
      assertEquals(false, recordType0.isResolved());
      assertEquals(true, recordType0.isRecordType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      String string0 = "J_SC_INVALIDATION";
      TightenTypes tightenTypes0 = null;
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertNotNull(disambiguateProperties0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      ConcreteType concreteType0 = ConcreteType.ALL;
      assertNotNull(concreteType0);
      
      ConcreteType concreteType1 = disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertNull(concreteType1);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertNotNull(disambiguateProperties0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      
      ErrorReporter errorReporter0 = null;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      assertNotNull(jSTypeRegistry0);
      
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) linkedList0);
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(83, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      disambiguateProperties0.process(node0, node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(83, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertNotNull(tightenTypes0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertNotNull(disambiguateProperties0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      
      // Undeclared exception!
      try {
        compiler0.process(disambiguateProperties0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}

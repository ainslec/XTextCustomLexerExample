package org.consoli.customlexerexample.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.consoli.customlexerexample.attributes.ArrayAttribute;
import org.consoli.customlexerexample.attributes.AttributesPackage;
import org.consoli.customlexerexample.attributes.Model;
import org.consoli.customlexerexample.attributes.SimpleAttribute;
import org.consoli.customlexerexample.services.AttributesGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AttributesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AttributesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AttributesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AttributesPackage.ARRAY_ATTRIBUTE:
				if(context == grammarAccess.getArrayAttributeRule() ||
				   context == grammarAccess.getAttributeRule()) {
					sequence_ArrayAttribute(context, (ArrayAttribute) semanticObject); 
					return; 
				}
				else break;
			case AttributesPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AttributesPackage.SIMPLE_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getSimpleAttributeRule()) {
					sequence_SimpleAttribute(context, (SimpleAttribute) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID items+=STRING? items+=STRING*)
	 */
	protected void sequence_ArrayAttribute(EObject context, ArrayAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributes+=Attribute*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=PROPERTY_VALUE)
	 */
	protected void sequence_SimpleAttribute(EObject context, SimpleAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AttributesPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AttributesPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, AttributesPackage.Literals.SIMPLE_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AttributesPackage.Literals.SIMPLE_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimpleAttributeAccess().getValuePROPERTY_VALUETerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}

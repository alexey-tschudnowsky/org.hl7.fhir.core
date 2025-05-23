package org.hl7.fhir.r4.model;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class Enumerations {

// In here: 
//   AbstractType: A list of the base types defined by this version of the FHIR specification - types that are defined, but for which only specializations actually are created.
//   AdministrativeGender: The gender of a person used for administrative purposes.
//   AgeUnits: A valueSet of UCUM codes for representing age value units.
//   BindingStrength: Indication of the degree of conformance expectations associated with a binding.
//   ConceptMapEquivalence: The degree of equivalence between concepts.
//   DataAbsentReason: Used to specify why the normally expected content of the data element is missing.
//   DataType: A version specific list of the data types defined by the FHIR specification for use as an element  type (any of the FHIR defined data types).
//   DefinitionResourceType: A list of all the definition resource types defined in this version of the FHIR specification.
//   DocumentReferenceStatus: The status of the document reference.
//   EventResourceType: A list of all the event resource types defined in this version of the FHIR specification.
//   FHIRAllTypes: A list of all the concrete types defined in this version of the FHIR specification - Abstract Types, Data Types and Resource Types.
//   FHIRDefinedType: A list of all the concrete types defined in this version of the FHIR specification - Data Types and Resource Types.
//   FHIRVersion: All published FHIR Versions.
//   KnowledgeResourceType: A list of all the knowledge resource types defined in this version of the FHIR specification.
//   MessageEvent: One of the message events defined as part of this version of FHIR.
//   NoteType: The presentation types of notes.
//   PublicationStatus: The lifecycle status of an artifact.
//   RemittanceOutcome: The outcome of the processing.
//   RequestResourceType: A list of all the request resource types defined in this version of the FHIR specification.
//   ResourceType: One of the resource types defined as part of this version of FHIR.
//   SearchParamType: Data types allowed to be used for search parameters.
//   SpecialValues: A set of generally useful codes defined so they can be included in value sets.

  public enum AbstractType {
    /**
     * A place holder that means any kind of data type
     */
    TYPE,
    /**
     * A place holder that means any kind of resource
     */
    ANY,
    /**
     * added to help the parsers
     */
    NULL;

    public static AbstractType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("Type".equals(codeString))
        return TYPE;
      if ("Any".equals(codeString))
        return ANY;
      throw new FHIRException("Unknown AbstractType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case TYPE:
        return "Type";
      case ANY:
        return "Any";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case TYPE:
        return "http://hl7.org/fhir/abstract-types";
      case ANY:
        return "http://hl7.org/fhir/abstract-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case TYPE:
        return "A place holder that means any kind of data type";
      case ANY:
        return "A place holder that means any kind of resource";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case TYPE:
        return "Type";
      case ANY:
        return "Any";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class AbstractTypeEnumFactory implements EnumFactory<AbstractType> {
    public AbstractType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("Type".equals(codeString))
        return AbstractType.TYPE;
      if ("Any".equals(codeString))
        return AbstractType.ANY;
      throw new IllegalArgumentException("Unknown AbstractType code '" + codeString + "'");
    }

    public Enumeration<AbstractType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<AbstractType>(this, AbstractType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<AbstractType>(this, AbstractType.NULL, code);
      if ("Type".equals(codeString))
        return new Enumeration<AbstractType>(this, AbstractType.TYPE, code);
      if ("Any".equals(codeString))
        return new Enumeration<AbstractType>(this, AbstractType.ANY, code);
      throw new FHIRException("Unknown AbstractType code '" + codeString + "'");
    }

    public String toCode(AbstractType code) {
       if (code == AbstractType.NULL)
           return null;
       if (code == AbstractType.TYPE)
        return "Type";
      if (code == AbstractType.ANY)
        return "Any";
      return "?";
   }

    public String toSystem(AbstractType code) {
      return code.getSystem();
    }
  }

  public enum AdministrativeGender {
    /**
     * Male.
     */
    MALE,
    /**
     * Female.
     */
    FEMALE,
    /**
     * Other.
     */
    OTHER,
    /**
     * Unknown.
     */
    UNKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static AdministrativeGender fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("male".equals(codeString))
        return MALE;
      if ("female".equals(codeString))
        return FEMALE;
      if ("other".equals(codeString))
        return OTHER;
      if ("unknown".equals(codeString))
        return UNKNOWN;
      throw new FHIRException("Unknown AdministrativeGender code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case MALE:
        return "male";
      case FEMALE:
        return "female";
      case OTHER:
        return "other";
      case UNKNOWN:
        return "unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case MALE:
        return "http://hl7.org/fhir/administrative-gender";
      case FEMALE:
        return "http://hl7.org/fhir/administrative-gender";
      case OTHER:
        return "http://hl7.org/fhir/administrative-gender";
      case UNKNOWN:
        return "http://hl7.org/fhir/administrative-gender";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case MALE:
        return "Male.";
      case FEMALE:
        return "Female.";
      case OTHER:
        return "Other.";
      case UNKNOWN:
        return "Unknown.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case MALE:
        return "Male";
      case FEMALE:
        return "Female";
      case OTHER:
        return "Other";
      case UNKNOWN:
        return "Unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class AdministrativeGenderEnumFactory implements EnumFactory<AdministrativeGender> {
    public AdministrativeGender fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("male".equals(codeString))
        return AdministrativeGender.MALE;
      if ("female".equals(codeString))
        return AdministrativeGender.FEMALE;
      if ("other".equals(codeString))
        return AdministrativeGender.OTHER;
      if ("unknown".equals(codeString))
        return AdministrativeGender.UNKNOWN;
      throw new IllegalArgumentException("Unknown AdministrativeGender code '" + codeString + "'");
    }

    public Enumeration<AdministrativeGender> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<AdministrativeGender>(this, AdministrativeGender.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<AdministrativeGender>(this, AdministrativeGender.NULL, code);
      if ("male".equals(codeString))
        return new Enumeration<AdministrativeGender>(this, AdministrativeGender.MALE, code);
      if ("female".equals(codeString))
        return new Enumeration<AdministrativeGender>(this, AdministrativeGender.FEMALE, code);
      if ("other".equals(codeString))
        return new Enumeration<AdministrativeGender>(this, AdministrativeGender.OTHER, code);
      if ("unknown".equals(codeString))
        return new Enumeration<AdministrativeGender>(this, AdministrativeGender.UNKNOWN, code);
      throw new FHIRException("Unknown AdministrativeGender code '" + codeString + "'");
    }

    public String toCode(AdministrativeGender code) {
       if (code == AdministrativeGender.NULL)
           return null;
       if (code == AdministrativeGender.MALE)
        return "male";
      if (code == AdministrativeGender.FEMALE)
        return "female";
      if (code == AdministrativeGender.OTHER)
        return "other";
      if (code == AdministrativeGender.UNKNOWN)
        return "unknown";
      return "?";
   }

    public String toSystem(AdministrativeGender code) {
      return code.getSystem();
    }
  }

  public enum AgeUnits {
    /**
     * null
     */
    MIN,
    /**
     * null
     */
    H,
    /**
     * null
     */
    D,
    /**
     * null
     */
    WK,
    /**
     * null
     */
    MO,
    /**
     * null
     */
    A,
    /**
     * added to help the parsers
     */
    NULL;

    public static AgeUnits fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("min".equals(codeString))
        return MIN;
      if ("h".equals(codeString))
        return H;
      if ("d".equals(codeString))
        return D;
      if ("wk".equals(codeString))
        return WK;
      if ("mo".equals(codeString))
        return MO;
      if ("a".equals(codeString))
        return A;
      throw new FHIRException("Unknown AgeUnits code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case MIN:
        return "min";
      case H:
        return "h";
      case D:
        return "d";
      case WK:
        return "wk";
      case MO:
        return "mo";
      case A:
        return "a";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case MIN:
        return "http://unitsofmeasure.org";
      case H:
        return "http://unitsofmeasure.org";
      case D:
        return "http://unitsofmeasure.org";
      case WK:
        return "http://unitsofmeasure.org";
      case MO:
        return "http://unitsofmeasure.org";
      case A:
        return "http://unitsofmeasure.org";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case MIN:
        return "";
      case H:
        return "";
      case D:
        return "";
      case WK:
        return "";
      case MO:
        return "";
      case A:
        return "";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case MIN:
        return "Minute";
      case H:
        return "Hour";
      case D:
        return "Day";
      case WK:
        return "Week";
      case MO:
        return "Month";
      case A:
        return "Year";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class AgeUnitsEnumFactory implements EnumFactory<AgeUnits> {
    public AgeUnits fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("min".equals(codeString))
        return AgeUnits.MIN;
      if ("h".equals(codeString))
        return AgeUnits.H;
      if ("d".equals(codeString))
        return AgeUnits.D;
      if ("wk".equals(codeString))
        return AgeUnits.WK;
      if ("mo".equals(codeString))
        return AgeUnits.MO;
      if ("a".equals(codeString))
        return AgeUnits.A;
      throw new IllegalArgumentException("Unknown AgeUnits code '" + codeString + "'");
    }

    public Enumeration<AgeUnits> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<AgeUnits>(this, AgeUnits.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.NULL, code);
      if ("min".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.MIN, code);
      if ("h".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.H, code);
      if ("d".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.D, code);
      if ("wk".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.WK, code);
      if ("mo".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.MO, code);
      if ("a".equals(codeString))
        return new Enumeration<AgeUnits>(this, AgeUnits.A, code);
      throw new FHIRException("Unknown AgeUnits code '" + codeString + "'");
    }

    public String toCode(AgeUnits code) {
       if (code == AgeUnits.NULL)
           return null;
       if (code == AgeUnits.MIN)
        return "min";
      if (code == AgeUnits.H)
        return "h";
      if (code == AgeUnits.D)
        return "d";
      if (code == AgeUnits.WK)
        return "wk";
      if (code == AgeUnits.MO)
        return "mo";
      if (code == AgeUnits.A)
        return "a";
      return "?";
   }

    public String toSystem(AgeUnits code) {
      return code.getSystem();
    }
  }

  public enum BindingStrength {
    /**
     * To be conformant, the concept in this element SHALL be from the specified
     * value set.
     */
    REQUIRED,
    /**
     * To be conformant, the concept in this element SHALL be from the specified
     * value set if any of the codes within the value set can apply to the concept
     * being communicated. If the value set does not cover the concept (based on
     * human review), alternate codings (or, data type allowing, text) may be
     * included instead.
     */
    EXTENSIBLE,
    /**
     * Instances are encouraged to draw from the specified codes for
     * interoperability purposes but are not required to do so to be considered
     * conformant.
     */
    PREFERRED,
    /**
     * Instances are not expected or even encouraged to draw from the specified
     * value set. The value set merely provides examples of the types of concepts
     * intended to be included.
     */
    EXAMPLE,
    /**
     * added to help the parsers
     */
    NULL;

    public static BindingStrength fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("required".equals(codeString))
        return REQUIRED;
      if ("extensible".equals(codeString))
        return EXTENSIBLE;
      if ("preferred".equals(codeString))
        return PREFERRED;
      if ("example".equals(codeString))
        return EXAMPLE;
      throw new FHIRException("Unknown BindingStrength code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case REQUIRED:
        return "required";
      case EXTENSIBLE:
        return "extensible";
      case PREFERRED:
        return "preferred";
      case EXAMPLE:
        return "example";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case REQUIRED:
        return "http://hl7.org/fhir/binding-strength";
      case EXTENSIBLE:
        return "http://hl7.org/fhir/binding-strength";
      case PREFERRED:
        return "http://hl7.org/fhir/binding-strength";
      case EXAMPLE:
        return "http://hl7.org/fhir/binding-strength";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case REQUIRED:
        return "To be conformant, the concept in this element SHALL be from the specified value set.";
      case EXTENSIBLE:
        return "To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.";
      case PREFERRED:
        return "Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.";
      case EXAMPLE:
        return "Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case REQUIRED:
        return "Required";
      case EXTENSIBLE:
        return "Extensible";
      case PREFERRED:
        return "Preferred";
      case EXAMPLE:
        return "Example";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class BindingStrengthEnumFactory implements EnumFactory<BindingStrength> {
    public BindingStrength fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("required".equals(codeString))
        return BindingStrength.REQUIRED;
      if ("extensible".equals(codeString))
        return BindingStrength.EXTENSIBLE;
      if ("preferred".equals(codeString))
        return BindingStrength.PREFERRED;
      if ("example".equals(codeString))
        return BindingStrength.EXAMPLE;
      throw new IllegalArgumentException("Unknown BindingStrength code '" + codeString + "'");
    }

    public Enumeration<BindingStrength> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<BindingStrength>(this, BindingStrength.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<BindingStrength>(this, BindingStrength.NULL, code);
      if ("required".equals(codeString))
        return new Enumeration<BindingStrength>(this, BindingStrength.REQUIRED, code);
      if ("extensible".equals(codeString))
        return new Enumeration<BindingStrength>(this, BindingStrength.EXTENSIBLE, code);
      if ("preferred".equals(codeString))
        return new Enumeration<BindingStrength>(this, BindingStrength.PREFERRED, code);
      if ("example".equals(codeString))
        return new Enumeration<BindingStrength>(this, BindingStrength.EXAMPLE, code);
      throw new FHIRException("Unknown BindingStrength code '" + codeString + "'");
    }

    public String toCode(BindingStrength code) {
       if (code == BindingStrength.NULL)
           return null;
       if (code == BindingStrength.REQUIRED)
        return "required";
      if (code == BindingStrength.EXTENSIBLE)
        return "extensible";
      if (code == BindingStrength.PREFERRED)
        return "preferred";
      if (code == BindingStrength.EXAMPLE)
        return "example";
      return "?";
   }

    public String toSystem(BindingStrength code) {
      return code.getSystem();
    }
  }

  public enum ConceptMapEquivalence {
    /**
     * The concepts are related to each other, and have at least some overlap in
     * meaning, but the exact relationship is not known.
     */
    RELATEDTO,
    /**
     * The definitions of the concepts mean the same thing (including when
     * structural implications of meaning are considered) (i.e. extensionally
     * identical).
     */
    EQUIVALENT,
    /**
     * The definitions of the concepts are exactly the same (i.e. only grammatical
     * differences) and structural implications of meaning are identical or
     * irrelevant (i.e. intentionally identical).
     */
    EQUAL,
    /**
     * The target mapping is wider in meaning than the source concept.
     */
    WIDER,
    /**
     * The target mapping subsumes the meaning of the source concept (e.g. the
     * source is-a target).
     */
    SUBSUMES,
    /**
     * The target mapping is narrower in meaning than the source concept. The sense
     * in which the mapping is narrower SHALL be described in the comments in this
     * case, and applications should be careful when attempting to use these
     * mappings operationally.
     */
    NARROWER,
    /**
     * The target mapping specializes the meaning of the source concept (e.g. the
     * target is-a source).
     */
    SPECIALIZES,
    /**
     * The target mapping overlaps with the source concept, but both source and
     * target cover additional meaning, or the definitions are imprecise and it is
     * uncertain whether they have the same boundaries to their meaning. The sense
     * in which the mapping is inexact SHALL be described in the comments in this
     * case, and applications should be careful when attempting to use these
     * mappings operationally.
     */
    INEXACT,
    /**
     * There is no match for this concept in the target code system.
     */
    UNMATCHED,
    /**
     * This is an explicit assertion that there is no mapping between the source and
     * target concept.
     */
    DISJOINT,
    /**
     * added to help the parsers
     */
    NULL;

    public static ConceptMapEquivalence fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("relatedto".equals(codeString))
        return RELATEDTO;
      if ("equivalent".equals(codeString))
        return EQUIVALENT;
      if ("equal".equals(codeString))
        return EQUAL;
      if ("wider".equals(codeString))
        return WIDER;
      if ("subsumes".equals(codeString))
        return SUBSUMES;
      if ("narrower".equals(codeString))
        return NARROWER;
      if ("specializes".equals(codeString))
        return SPECIALIZES;
      if ("inexact".equals(codeString))
        return INEXACT;
      if ("unmatched".equals(codeString))
        return UNMATCHED;
      if ("disjoint".equals(codeString))
        return DISJOINT;
      throw new FHIRException("Unknown ConceptMapEquivalence code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case RELATEDTO:
        return "relatedto";
      case EQUIVALENT:
        return "equivalent";
      case EQUAL:
        return "equal";
      case WIDER:
        return "wider";
      case SUBSUMES:
        return "subsumes";
      case NARROWER:
        return "narrower";
      case SPECIALIZES:
        return "specializes";
      case INEXACT:
        return "inexact";
      case UNMATCHED:
        return "unmatched";
      case DISJOINT:
        return "disjoint";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case RELATEDTO:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case EQUIVALENT:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case EQUAL:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case WIDER:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case SUBSUMES:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case NARROWER:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case SPECIALIZES:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case INEXACT:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case UNMATCHED:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case DISJOINT:
        return "http://hl7.org/fhir/concept-map-equivalence";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case RELATEDTO:
        return "The concepts are related to each other, and have at least some overlap in meaning, but the exact relationship is not known.";
      case EQUIVALENT:
        return "The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).";
      case EQUAL:
        return "The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identical or irrelevant (i.e. intentionally identical).";
      case WIDER:
        return "The target mapping is wider in meaning than the source concept.";
      case SUBSUMES:
        return "The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).";
      case NARROWER:
        return "The target mapping is narrower in meaning than the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.";
      case SPECIALIZES:
        return "The target mapping specializes the meaning of the source concept (e.g. the target is-a source).";
      case INEXACT:
        return "The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is inexact SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.";
      case UNMATCHED:
        return "There is no match for this concept in the target code system.";
      case DISJOINT:
        return "This is an explicit assertion that there is no mapping between the source and target concept.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case RELATEDTO:
        return "Related To";
      case EQUIVALENT:
        return "Equivalent";
      case EQUAL:
        return "Equal";
      case WIDER:
        return "Wider";
      case SUBSUMES:
        return "Subsumes";
      case NARROWER:
        return "Narrower";
      case SPECIALIZES:
        return "Specializes";
      case INEXACT:
        return "Inexact";
      case UNMATCHED:
        return "Unmatched";
      case DISJOINT:
        return "Disjoint";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class ConceptMapEquivalenceEnumFactory implements EnumFactory<ConceptMapEquivalence> {
    public ConceptMapEquivalence fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("relatedto".equals(codeString))
        return ConceptMapEquivalence.RELATEDTO;
      if ("equivalent".equals(codeString))
        return ConceptMapEquivalence.EQUIVALENT;
      if ("equal".equals(codeString))
        return ConceptMapEquivalence.EQUAL;
      if ("wider".equals(codeString))
        return ConceptMapEquivalence.WIDER;
      if ("subsumes".equals(codeString))
        return ConceptMapEquivalence.SUBSUMES;
      if ("narrower".equals(codeString))
        return ConceptMapEquivalence.NARROWER;
      if ("specializes".equals(codeString))
        return ConceptMapEquivalence.SPECIALIZES;
      if ("inexact".equals(codeString))
        return ConceptMapEquivalence.INEXACT;
      if ("unmatched".equals(codeString))
        return ConceptMapEquivalence.UNMATCHED;
      if ("disjoint".equals(codeString))
        return ConceptMapEquivalence.DISJOINT;
      throw new IllegalArgumentException("Unknown ConceptMapEquivalence code '" + codeString + "'");
    }

    public Enumeration<ConceptMapEquivalence> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.NULL, code);
      if ("relatedto".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.RELATEDTO, code);
      if ("equivalent".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.EQUIVALENT, code);
      if ("equal".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.EQUAL, code);
      if ("wider".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.WIDER, code);
      if ("subsumes".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.SUBSUMES, code);
      if ("narrower".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.NARROWER, code);
      if ("specializes".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.SPECIALIZES, code);
      if ("inexact".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.INEXACT, code);
      if ("unmatched".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.UNMATCHED, code);
      if ("disjoint".equals(codeString))
        return new Enumeration<ConceptMapEquivalence>(this, ConceptMapEquivalence.DISJOINT, code);
      throw new FHIRException("Unknown ConceptMapEquivalence code '" + codeString + "'");
    }

    public String toCode(ConceptMapEquivalence code) {
       if (code == ConceptMapEquivalence.NULL)
           return null;
       if (code == ConceptMapEquivalence.RELATEDTO)
        return "relatedto";
      if (code == ConceptMapEquivalence.EQUIVALENT)
        return "equivalent";
      if (code == ConceptMapEquivalence.EQUAL)
        return "equal";
      if (code == ConceptMapEquivalence.WIDER)
        return "wider";
      if (code == ConceptMapEquivalence.SUBSUMES)
        return "subsumes";
      if (code == ConceptMapEquivalence.NARROWER)
        return "narrower";
      if (code == ConceptMapEquivalence.SPECIALIZES)
        return "specializes";
      if (code == ConceptMapEquivalence.INEXACT)
        return "inexact";
      if (code == ConceptMapEquivalence.UNMATCHED)
        return "unmatched";
      if (code == ConceptMapEquivalence.DISJOINT)
        return "disjoint";
      return "?";
   }

    public String toSystem(ConceptMapEquivalence code) {
      return code.getSystem();
    }
  }

  public enum DataAbsentReason {
    /**
     * The value is expected to exist but is not known.
     */
    UNKNOWN,
    /**
     * The source was asked but does not know the value.
     */
    ASKEDUNKNOWN,
    /**
     * There is reason to expect (from the workflow) that the value may become
     * known.
     */
    TEMPUNKNOWN,
    /**
     * The workflow didn't lead to this value being known.
     */
    NOTASKED,
    /**
     * The source was asked but declined to answer.
     */
    ASKEDDECLINED,
    /**
     * The information is not available due to security, privacy or related reasons.
     */
    MASKED,
    /**
     * There is no proper value for this element (e.g. last menstrual period for a
     * male).
     */
    NOTAPPLICABLE,
    /**
     * The source system wasn't capable of supporting this element.
     */
    UNSUPPORTED,
    /**
     * The content of the data is represented in the resource narrative.
     */
    ASTEXT,
    /**
     * Some system or workflow process error means that the information is not
     * available.
     */
    ERROR,
    /**
     * The numeric value is undefined or unrepresentable due to a floating point
     * processing error.
     */
    NOTANUMBER,
    /**
     * The numeric value is excessively low and unrepresentable due to a floating
     * point processing error.
     */
    NEGATIVEINFINITY,
    /**
     * The numeric value is excessively high and unrepresentable due to a floating
     * point processing error.
     */
    POSITIVEINFINITY,
    /**
     * The value is not available because the observation procedure (test, etc.) was
     * not performed.
     */
    NOTPERFORMED,
    /**
     * The value is not permitted in this context (e.g. due to profiles, or the base
     * data types).
     */
    NOTPERMITTED,
    /**
     * added to help the parsers
     */
    NULL;

    public static DataAbsentReason fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("unknown".equals(codeString))
        return UNKNOWN;
      if ("asked-unknown".equals(codeString))
        return ASKEDUNKNOWN;
      if ("temp-unknown".equals(codeString))
        return TEMPUNKNOWN;
      if ("not-asked".equals(codeString))
        return NOTASKED;
      if ("asked-declined".equals(codeString))
        return ASKEDDECLINED;
      if ("masked".equals(codeString))
        return MASKED;
      if ("not-applicable".equals(codeString))
        return NOTAPPLICABLE;
      if ("unsupported".equals(codeString))
        return UNSUPPORTED;
      if ("as-text".equals(codeString))
        return ASTEXT;
      if ("error".equals(codeString))
        return ERROR;
      if ("not-a-number".equals(codeString))
        return NOTANUMBER;
      if ("negative-infinity".equals(codeString))
        return NEGATIVEINFINITY;
      if ("positive-infinity".equals(codeString))
        return POSITIVEINFINITY;
      if ("not-performed".equals(codeString))
        return NOTPERFORMED;
      if ("not-permitted".equals(codeString))
        return NOTPERMITTED;
      throw new FHIRException("Unknown DataAbsentReason code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case UNKNOWN:
        return "unknown";
      case ASKEDUNKNOWN:
        return "asked-unknown";
      case TEMPUNKNOWN:
        return "temp-unknown";
      case NOTASKED:
        return "not-asked";
      case ASKEDDECLINED:
        return "asked-declined";
      case MASKED:
        return "masked";
      case NOTAPPLICABLE:
        return "not-applicable";
      case UNSUPPORTED:
        return "unsupported";
      case ASTEXT:
        return "as-text";
      case ERROR:
        return "error";
      case NOTANUMBER:
        return "not-a-number";
      case NEGATIVEINFINITY:
        return "negative-infinity";
      case POSITIVEINFINITY:
        return "positive-infinity";
      case NOTPERFORMED:
        return "not-performed";
      case NOTPERMITTED:
        return "not-permitted";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case UNKNOWN:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case ASKEDUNKNOWN:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case TEMPUNKNOWN:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NOTASKED:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case ASKEDDECLINED:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case MASKED:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NOTAPPLICABLE:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case UNSUPPORTED:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case ASTEXT:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case ERROR:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NOTANUMBER:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NEGATIVEINFINITY:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case POSITIVEINFINITY:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NOTPERFORMED:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NOTPERMITTED:
        return "http://terminology.hl7.org/CodeSystem/data-absent-reason";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case UNKNOWN:
        return "The value is expected to exist but is not known.";
      case ASKEDUNKNOWN:
        return "The source was asked but does not know the value.";
      case TEMPUNKNOWN:
        return "There is reason to expect (from the workflow) that the value may become known.";
      case NOTASKED:
        return "The workflow didn't lead to this value being known.";
      case ASKEDDECLINED:
        return "The source was asked but declined to answer.";
      case MASKED:
        return "The information is not available due to security, privacy or related reasons.";
      case NOTAPPLICABLE:
        return "There is no proper value for this element (e.g. last menstrual period for a male).";
      case UNSUPPORTED:
        return "The source system wasn't capable of supporting this element.";
      case ASTEXT:
        return "The content of the data is represented in the resource narrative.";
      case ERROR:
        return "Some system or workflow process error means that the information is not available.";
      case NOTANUMBER:
        return "The numeric value is undefined or unrepresentable due to a floating point processing error.";
      case NEGATIVEINFINITY:
        return "The numeric value is excessively low and unrepresentable due to a floating point processing error.";
      case POSITIVEINFINITY:
        return "The numeric value is excessively high and unrepresentable due to a floating point processing error.";
      case NOTPERFORMED:
        return "The value is not available because the observation procedure (test, etc.) was not performed.";
      case NOTPERMITTED:
        return "The value is not permitted in this context (e.g. due to profiles, or the base data types).";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case UNKNOWN:
        return "Unknown";
      case ASKEDUNKNOWN:
        return "Asked But Unknown";
      case TEMPUNKNOWN:
        return "Temporarily Unknown";
      case NOTASKED:
        return "Not Asked";
      case ASKEDDECLINED:
        return "Asked But Declined";
      case MASKED:
        return "Masked";
      case NOTAPPLICABLE:
        return "Not Applicable";
      case UNSUPPORTED:
        return "Unsupported";
      case ASTEXT:
        return "As Text";
      case ERROR:
        return "Error";
      case NOTANUMBER:
        return "Not a Number (NaN)";
      case NEGATIVEINFINITY:
        return "Negative Infinity (NINF)";
      case POSITIVEINFINITY:
        return "Positive Infinity (PINF)";
      case NOTPERFORMED:
        return "Not Performed";
      case NOTPERMITTED:
        return "Not Permitted";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class DataAbsentReasonEnumFactory implements EnumFactory<DataAbsentReason> {
    public DataAbsentReason fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("unknown".equals(codeString))
        return DataAbsentReason.UNKNOWN;
      if ("asked-unknown".equals(codeString))
        return DataAbsentReason.ASKEDUNKNOWN;
      if ("temp-unknown".equals(codeString))
        return DataAbsentReason.TEMPUNKNOWN;
      if ("not-asked".equals(codeString))
        return DataAbsentReason.NOTASKED;
      if ("asked-declined".equals(codeString))
        return DataAbsentReason.ASKEDDECLINED;
      if ("masked".equals(codeString))
        return DataAbsentReason.MASKED;
      if ("not-applicable".equals(codeString))
        return DataAbsentReason.NOTAPPLICABLE;
      if ("unsupported".equals(codeString))
        return DataAbsentReason.UNSUPPORTED;
      if ("as-text".equals(codeString))
        return DataAbsentReason.ASTEXT;
      if ("error".equals(codeString))
        return DataAbsentReason.ERROR;
      if ("not-a-number".equals(codeString))
        return DataAbsentReason.NOTANUMBER;
      if ("negative-infinity".equals(codeString))
        return DataAbsentReason.NEGATIVEINFINITY;
      if ("positive-infinity".equals(codeString))
        return DataAbsentReason.POSITIVEINFINITY;
      if ("not-performed".equals(codeString))
        return DataAbsentReason.NOTPERFORMED;
      if ("not-permitted".equals(codeString))
        return DataAbsentReason.NOTPERMITTED;
      throw new IllegalArgumentException("Unknown DataAbsentReason code '" + codeString + "'");
    }

    public Enumeration<DataAbsentReason> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NULL, code);
      if ("unknown".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.UNKNOWN, code);
      if ("asked-unknown".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ASKEDUNKNOWN, code);
      if ("temp-unknown".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.TEMPUNKNOWN, code);
      if ("not-asked".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NOTASKED, code);
      if ("asked-declined".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ASKEDDECLINED, code);
      if ("masked".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.MASKED, code);
      if ("not-applicable".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NOTAPPLICABLE, code);
      if ("unsupported".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.UNSUPPORTED, code);
      if ("as-text".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ASTEXT, code);
      if ("error".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.ERROR, code);
      if ("not-a-number".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NOTANUMBER, code);
      if ("negative-infinity".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NEGATIVEINFINITY, code);
      if ("positive-infinity".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.POSITIVEINFINITY, code);
      if ("not-performed".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NOTPERFORMED, code);
      if ("not-permitted".equals(codeString))
        return new Enumeration<DataAbsentReason>(this, DataAbsentReason.NOTPERMITTED, code);
      throw new FHIRException("Unknown DataAbsentReason code '" + codeString + "'");
    }

    public String toCode(DataAbsentReason code) {
       if (code == DataAbsentReason.NULL)
           return null;
       if (code == DataAbsentReason.UNKNOWN)
        return "unknown";
      if (code == DataAbsentReason.ASKEDUNKNOWN)
        return "asked-unknown";
      if (code == DataAbsentReason.TEMPUNKNOWN)
        return "temp-unknown";
      if (code == DataAbsentReason.NOTASKED)
        return "not-asked";
      if (code == DataAbsentReason.ASKEDDECLINED)
        return "asked-declined";
      if (code == DataAbsentReason.MASKED)
        return "masked";
      if (code == DataAbsentReason.NOTAPPLICABLE)
        return "not-applicable";
      if (code == DataAbsentReason.UNSUPPORTED)
        return "unsupported";
      if (code == DataAbsentReason.ASTEXT)
        return "as-text";
      if (code == DataAbsentReason.ERROR)
        return "error";
      if (code == DataAbsentReason.NOTANUMBER)
        return "not-a-number";
      if (code == DataAbsentReason.NEGATIVEINFINITY)
        return "negative-infinity";
      if (code == DataAbsentReason.POSITIVEINFINITY)
        return "positive-infinity";
      if (code == DataAbsentReason.NOTPERFORMED)
        return "not-performed";
      if (code == DataAbsentReason.NOTPERMITTED)
        return "not-permitted";
      return "?";
   }

    public String toSystem(DataAbsentReason code) {
      return code.getSystem();
    }
  }

  public enum DataType {
    /**
     * An address expressed using postal conventions (as opposed to GPS or other
     * location definition formats). This data type may be used to convey addresses
     * for use in delivering mail as well as for visiting locations which might not
     * be valid for mail delivery. There are a variety of postal address formats
     * defined around the world.
     */
    ADDRESS,
    /**
     * A duration of time during which an organism (or a process) has existed.
     */
    AGE,
    /**
     * A text note which also contains information about who made the statement and
     * when.
     */
    ANNOTATION,
    /**
     * For referring to data content defined in other formats.
     */
    ATTACHMENT,
    /**
     * Base definition for all elements that are defined inside a resource - but not
     * those in a data type.
     */
    BACKBONEELEMENT,
    /**
     * A concept that may be defined by a formal reference to a terminology or
     * ontology or may be provided by text.
     */
    CODEABLECONCEPT,
    /**
     * A reference to a code defined by a terminology system.
     */
    CODING,
    /**
     * Specifies contact information for a person or organization.
     */
    CONTACTDETAIL,
    /**
     * Details for all kinds of technology mediated contact points for a person or
     * organization, including telephone, email, etc.
     */
    CONTACTPOINT,
    /**
     * A contributor to the content of a knowledge asset, including authors,
     * editors, reviewers, and endorsers.
     */
    CONTRIBUTOR,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that
     * measured amounts include amounts that are not precisely quantified, including
     * amounts involving arbitrary units and floating currencies.
     */
    COUNT,
    /**
     * Describes a required data item for evaluation in terms of the type of data,
     * and optional code or date-based filters of the data.
     */
    DATAREQUIREMENT,
    /**
     * A length - a value with a unit that is a physical distance.
     */
    DISTANCE,
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     */
    DOSAGE,
    /**
     * A length of time.
     */
    DURATION,
    /**
     * Base definition for all elements in a resource.
     */
    ELEMENT,
    /**
     * Captures constraints on each element within the resource, profile, or
     * extension.
     */
    ELEMENTDEFINITION,
    /**
     * A expression that is evaluated in a specified context and returns a value.
     * The context of use of the expression must specify the context in which the
     * expression is evaluated, and how the result of the expression is used.
     */
    EXPRESSION,
    /**
     * Optional Extension Element - found in all resources.
     */
    EXTENSION,
    /**
     * A human's name with the ability to identify parts and usage.
     */
    HUMANNAME,
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically
     * this is used for business identifiers.
     */
    IDENTIFIER,
    /**
     * The marketing status describes the date when a medicinal product is actually
     * put on the market or the date as of which it is no longer available.
     */
    MARKETINGSTATUS,
    /**
     * The metadata about a resource. This is content in the resource that is
     * maintained by the infrastructure. Changes to the content might not always be
     * associated with version changes to the resource.
     */
    META,
    /**
     * An amount of economic utility in some recognized currency.
     */
    MONEY,
    /**
     * null
     */
    MONEYQUANTITY,
    /**
     * A human-readable summary of the resource conveying the essential clinical and
     * business information for the resource.
     */
    NARRATIVE,
    /**
     * The parameters to the module. This collection specifies both the input and
     * output parameters. Input parameters are provided by the caller as part of the
     * $evaluate operation. Output parameters are included in the GuidanceResponse.
     */
    PARAMETERDEFINITION,
    /**
     * A time period defined by a start and end date and optionally time.
     */
    PERIOD,
    /**
     * A populatioof people with some set of grouping criteria.
     */
    POPULATION,
    /**
     * The marketing status describes the date when a medicinal product is actually
     * put on the market or the date as of which it is no longer available.
     */
    PRODCHARACTERISTIC,
    /**
     * The shelf-life and storage information for a medicinal product item or
     * container can be described using this class.
     */
    PRODUCTSHELFLIFE,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that
     * measured amounts include amounts that are not precisely quantified, including
     * amounts involving arbitrary units and floating currencies.
     */
    QUANTITY,
    /**
     * A set of ordered Quantities defined by a low and high limit.
     */
    RANGE,
    /**
     * A relationship of two Quantity values - expressed as a numerator and a
     * denominator.
     */
    RATIO,
    /**
     * A reference from one resource to another.
     */
    REFERENCE,
    /**
     * Related artifacts such as additional documentation, justification, or
     * bibliographic references.
     */
    RELATEDARTIFACT,
    /**
     * A series of measurements taken by a device, with upper and lower limits.
     * There may be more than one dimension in the data.
     */
    SAMPLEDDATA,
    /**
     * A signature along with supporting context. The signature may be a digital
     * signature that is cryptographic in nature, or some other signature acceptable
     * to the domain. This other signature may be as simple as a graphical image
     * representing a hand-written signature, or a signature ceremony Different
     * signature approaches have different utilities.
     */
    SIGNATURE,
    /**
     * null
     */
    SIMPLEQUANTITY,
    /**
     * Chemical substances are a single substance type whose primary defining
     * element is the molecular structure. Chemical substances shall be defined on
     * the basis of their complete covalent molecular structure; the presence of a
     * salt (counter-ion) and/or solvates (water, alcohols) is also captured.
     * Purity, grade, physical form or particle size are not taken into account in
     * the definition of a chemical substance or in the assignment of a Substance
     * ID.
     */
    SUBSTANCEAMOUNT,
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used
     * to record when things are planned, expected or requested to occur. The most
     * common usage is in dosage instructions for medications. They are also used
     * when planning care of various kinds, and may be used for reporting the
     * schedule to which past regular activities were carried out.
     */
    TIMING,
    /**
     * A description of a triggering event. Triggering events can be named events,
     * data events, or periodic, as determined by the type element.
     */
    TRIGGERDEFINITION,
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index
     * and/or categorize an artifact. This metadata can either be specific to the
     * applicable population (e.g., age category, DRG) or the specific context of
     * care (e.g., venue, care setting, provider of care).
     */
    USAGECONTEXT,
    /**
     * A stream of bytes
     */
    BASE64BINARY,
    /**
     * Value of "true" or "false"
     */
    BOOLEAN,
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     */
    CANONICAL,
    /**
     * A string which has at least one character and no leading or trailing
     * whitespace and where there is no whitespace other than single spaces in the
     * contents
     */
    CODE,
    /**
     * A date or partial date (e.g. just year or year + month). There is no time
     * zone. The format is a union of the schema types gYear, gYearMonth and date.
     * Dates SHALL be valid dates.
     */
    DATE,
    /**
     * A date, date-time or partial date (e.g. just year or year + month). If hours
     * and minutes are specified, a time zone SHALL be populated. The format is a
     * union of the schema types gYear, gYearMonth, date and dateTime. Seconds must
     * be provided due to schema type constraints but may be zero-filled and may be
     * ignored. Dates SHALL be valid dates.
     */
    DATETIME,
    /**
     * A rational number with implicit precision
     */
    DECIMAL,
    /**
     * Any combination of letters, numerals, "-" and ".", with a length limit of 64
     * characters. (This might be an integer, an unprefixed OID, UUID or any other
     * identifier pattern that meets these constraints.) Ids are case-insensitive.
     */
    ID,
    /**
     * An instant in time - known at least to the second
     */
    INSTANT,
    /**
     * A whole number
     */
    INTEGER,
    /**
     * A string that may contain Github Flavored Markdown syntax for optional
     * processing by a mark down presentation engine
     */
    MARKDOWN,
    /**
     * An OID represented as a URI
     */
    OID,
    /**
     * An integer with a value that is positive (e.g. >0)
     */
    POSITIVEINT,
    /**
     * A sequence of Unicode characters
     */
    STRING,
    /**
     * A time during the day, with no date specified
     */
    TIME,
    /**
     * An integer with a value that is not negative (e.g. >= 0)
     */
    UNSIGNEDINT,
    /**
     * String of characters used to identify a name or a resource
     */
    URI,
    /**
     * A URI that is a literal reference
     */
    URL,
    /**
     * A UUID, represented as a URI
     */
    UUID,
    /**
     * XHTML format, as defined by W3C, but restricted usage (mainly, no active
     * content)
     */
    XHTML,
    /**
     * added to help the parsers
     */
    NULL;

    public static DataType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("Address".equals(codeString))
        return ADDRESS;
      if ("Age".equals(codeString))
        return AGE;
      if ("Annotation".equals(codeString))
        return ANNOTATION;
      if ("Attachment".equals(codeString))
        return ATTACHMENT;
      if ("BackboneElement".equals(codeString))
        return BACKBONEELEMENT;
      if ("CodeableConcept".equals(codeString))
        return CODEABLECONCEPT;
      if ("Coding".equals(codeString))
        return CODING;
      if ("ContactDetail".equals(codeString))
        return CONTACTDETAIL;
      if ("ContactPoint".equals(codeString))
        return CONTACTPOINT;
      if ("Contributor".equals(codeString))
        return CONTRIBUTOR;
      if ("Count".equals(codeString))
        return COUNT;
      if ("DataRequirement".equals(codeString))
        return DATAREQUIREMENT;
      if ("Distance".equals(codeString))
        return DISTANCE;
      if ("Dosage".equals(codeString))
        return DOSAGE;
      if ("Duration".equals(codeString))
        return DURATION;
      if ("Element".equals(codeString))
        return ELEMENT;
      if ("ElementDefinition".equals(codeString))
        return ELEMENTDEFINITION;
      if ("Expression".equals(codeString))
        return EXPRESSION;
      if ("Extension".equals(codeString))
        return EXTENSION;
      if ("HumanName".equals(codeString))
        return HUMANNAME;
      if ("Identifier".equals(codeString))
        return IDENTIFIER;
      if ("MarketingStatus".equals(codeString))
        return MARKETINGSTATUS;
      if ("Meta".equals(codeString))
        return META;
      if ("Money".equals(codeString))
        return MONEY;
      if ("MoneyQuantity".equals(codeString))
        return MONEYQUANTITY;
      if ("Narrative".equals(codeString))
        return NARRATIVE;
      if ("ParameterDefinition".equals(codeString))
        return PARAMETERDEFINITION;
      if ("Period".equals(codeString))
        return PERIOD;
      if ("Population".equals(codeString))
        return POPULATION;
      if ("ProdCharacteristic".equals(codeString))
        return PRODCHARACTERISTIC;
      if ("ProductShelfLife".equals(codeString))
        return PRODUCTSHELFLIFE;
      if ("Quantity".equals(codeString))
        return QUANTITY;
      if ("Range".equals(codeString))
        return RANGE;
      if ("Ratio".equals(codeString))
        return RATIO;
      if ("Reference".equals(codeString))
        return REFERENCE;
      if ("RelatedArtifact".equals(codeString))
        return RELATEDARTIFACT;
      if ("SampledData".equals(codeString))
        return SAMPLEDDATA;
      if ("Signature".equals(codeString))
        return SIGNATURE;
      if ("SimpleQuantity".equals(codeString))
        return SIMPLEQUANTITY;
      if ("SubstanceAmount".equals(codeString))
        return SUBSTANCEAMOUNT;
      if ("Timing".equals(codeString))
        return TIMING;
      if ("TriggerDefinition".equals(codeString))
        return TRIGGERDEFINITION;
      if ("UsageContext".equals(codeString))
        return USAGECONTEXT;
      if ("base64Binary".equals(codeString))
        return BASE64BINARY;
      if ("boolean".equals(codeString))
        return BOOLEAN;
      if ("canonical".equals(codeString))
        return CANONICAL;
      if ("code".equals(codeString))
        return CODE;
      if ("date".equals(codeString))
        return DATE;
      if ("dateTime".equals(codeString))
        return DATETIME;
      if ("decimal".equals(codeString))
        return DECIMAL;
      if ("id".equals(codeString))
        return ID;
      if ("instant".equals(codeString))
        return INSTANT;
      if ("integer".equals(codeString))
        return INTEGER;
      if ("markdown".equals(codeString))
        return MARKDOWN;
      if ("oid".equals(codeString))
        return OID;
      if ("positiveInt".equals(codeString))
        return POSITIVEINT;
      if ("string".equals(codeString))
        return STRING;
      if ("time".equals(codeString))
        return TIME;
      if ("unsignedInt".equals(codeString))
        return UNSIGNEDINT;
      if ("uri".equals(codeString))
        return URI;
      if ("url".equals(codeString))
        return URL;
      if ("uuid".equals(codeString))
        return UUID;
      if ("xhtml".equals(codeString))
        return XHTML;
      throw new FHIRException("Unknown DataType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ADDRESS:
        return "Address";
      case AGE:
        return "Age";
      case ANNOTATION:
        return "Annotation";
      case ATTACHMENT:
        return "Attachment";
      case BACKBONEELEMENT:
        return "BackboneElement";
      case CODEABLECONCEPT:
        return "CodeableConcept";
      case CODING:
        return "Coding";
      case CONTACTDETAIL:
        return "ContactDetail";
      case CONTACTPOINT:
        return "ContactPoint";
      case CONTRIBUTOR:
        return "Contributor";
      case COUNT:
        return "Count";
      case DATAREQUIREMENT:
        return "DataRequirement";
      case DISTANCE:
        return "Distance";
      case DOSAGE:
        return "Dosage";
      case DURATION:
        return "Duration";
      case ELEMENT:
        return "Element";
      case ELEMENTDEFINITION:
        return "ElementDefinition";
      case EXPRESSION:
        return "Expression";
      case EXTENSION:
        return "Extension";
      case HUMANNAME:
        return "HumanName";
      case IDENTIFIER:
        return "Identifier";
      case MARKETINGSTATUS:
        return "MarketingStatus";
      case META:
        return "Meta";
      case MONEY:
        return "Money";
      case MONEYQUANTITY:
        return "MoneyQuantity";
      case NARRATIVE:
        return "Narrative";
      case PARAMETERDEFINITION:
        return "ParameterDefinition";
      case PERIOD:
        return "Period";
      case POPULATION:
        return "Population";
      case PRODCHARACTERISTIC:
        return "ProdCharacteristic";
      case PRODUCTSHELFLIFE:
        return "ProductShelfLife";
      case QUANTITY:
        return "Quantity";
      case RANGE:
        return "Range";
      case RATIO:
        return "Ratio";
      case REFERENCE:
        return "Reference";
      case RELATEDARTIFACT:
        return "RelatedArtifact";
      case SAMPLEDDATA:
        return "SampledData";
      case SIGNATURE:
        return "Signature";
      case SIMPLEQUANTITY:
        return "SimpleQuantity";
      case SUBSTANCEAMOUNT:
        return "SubstanceAmount";
      case TIMING:
        return "Timing";
      case TRIGGERDEFINITION:
        return "TriggerDefinition";
      case USAGECONTEXT:
        return "UsageContext";
      case BASE64BINARY:
        return "base64Binary";
      case BOOLEAN:
        return "boolean";
      case CANONICAL:
        return "canonical";
      case CODE:
        return "code";
      case DATE:
        return "date";
      case DATETIME:
        return "dateTime";
      case DECIMAL:
        return "decimal";
      case ID:
        return "id";
      case INSTANT:
        return "instant";
      case INTEGER:
        return "integer";
      case MARKDOWN:
        return "markdown";
      case OID:
        return "oid";
      case POSITIVEINT:
        return "positiveInt";
      case STRING:
        return "string";
      case TIME:
        return "time";
      case UNSIGNEDINT:
        return "unsignedInt";
      case URI:
        return "uri";
      case URL:
        return "url";
      case UUID:
        return "uuid";
      case XHTML:
        return "xhtml";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ADDRESS:
        return "http://hl7.org/fhir/data-types";
      case AGE:
        return "http://hl7.org/fhir/data-types";
      case ANNOTATION:
        return "http://hl7.org/fhir/data-types";
      case ATTACHMENT:
        return "http://hl7.org/fhir/data-types";
      case BACKBONEELEMENT:
        return "http://hl7.org/fhir/data-types";
      case CODEABLECONCEPT:
        return "http://hl7.org/fhir/data-types";
      case CODING:
        return "http://hl7.org/fhir/data-types";
      case CONTACTDETAIL:
        return "http://hl7.org/fhir/data-types";
      case CONTACTPOINT:
        return "http://hl7.org/fhir/data-types";
      case CONTRIBUTOR:
        return "http://hl7.org/fhir/data-types";
      case COUNT:
        return "http://hl7.org/fhir/data-types";
      case DATAREQUIREMENT:
        return "http://hl7.org/fhir/data-types";
      case DISTANCE:
        return "http://hl7.org/fhir/data-types";
      case DOSAGE:
        return "http://hl7.org/fhir/data-types";
      case DURATION:
        return "http://hl7.org/fhir/data-types";
      case ELEMENT:
        return "http://hl7.org/fhir/data-types";
      case ELEMENTDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case EXPRESSION:
        return "http://hl7.org/fhir/data-types";
      case EXTENSION:
        return "http://hl7.org/fhir/data-types";
      case HUMANNAME:
        return "http://hl7.org/fhir/data-types";
      case IDENTIFIER:
        return "http://hl7.org/fhir/data-types";
      case MARKETINGSTATUS:
        return "http://hl7.org/fhir/data-types";
      case META:
        return "http://hl7.org/fhir/data-types";
      case MONEY:
        return "http://hl7.org/fhir/data-types";
      case MONEYQUANTITY:
        return "http://hl7.org/fhir/data-types";
      case NARRATIVE:
        return "http://hl7.org/fhir/data-types";
      case PARAMETERDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case PERIOD:
        return "http://hl7.org/fhir/data-types";
      case POPULATION:
        return "http://hl7.org/fhir/data-types";
      case PRODCHARACTERISTIC:
        return "http://hl7.org/fhir/data-types";
      case PRODUCTSHELFLIFE:
        return "http://hl7.org/fhir/data-types";
      case QUANTITY:
        return "http://hl7.org/fhir/data-types";
      case RANGE:
        return "http://hl7.org/fhir/data-types";
      case RATIO:
        return "http://hl7.org/fhir/data-types";
      case REFERENCE:
        return "http://hl7.org/fhir/data-types";
      case RELATEDARTIFACT:
        return "http://hl7.org/fhir/data-types";
      case SAMPLEDDATA:
        return "http://hl7.org/fhir/data-types";
      case SIGNATURE:
        return "http://hl7.org/fhir/data-types";
      case SIMPLEQUANTITY:
        return "http://hl7.org/fhir/data-types";
      case SUBSTANCEAMOUNT:
        return "http://hl7.org/fhir/data-types";
      case TIMING:
        return "http://hl7.org/fhir/data-types";
      case TRIGGERDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case USAGECONTEXT:
        return "http://hl7.org/fhir/data-types";
      case BASE64BINARY:
        return "http://hl7.org/fhir/data-types";
      case BOOLEAN:
        return "http://hl7.org/fhir/data-types";
      case CANONICAL:
        return "http://hl7.org/fhir/data-types";
      case CODE:
        return "http://hl7.org/fhir/data-types";
      case DATE:
        return "http://hl7.org/fhir/data-types";
      case DATETIME:
        return "http://hl7.org/fhir/data-types";
      case DECIMAL:
        return "http://hl7.org/fhir/data-types";
      case ID:
        return "http://hl7.org/fhir/data-types";
      case INSTANT:
        return "http://hl7.org/fhir/data-types";
      case INTEGER:
        return "http://hl7.org/fhir/data-types";
      case MARKDOWN:
        return "http://hl7.org/fhir/data-types";
      case OID:
        return "http://hl7.org/fhir/data-types";
      case POSITIVEINT:
        return "http://hl7.org/fhir/data-types";
      case STRING:
        return "http://hl7.org/fhir/data-types";
      case TIME:
        return "http://hl7.org/fhir/data-types";
      case UNSIGNEDINT:
        return "http://hl7.org/fhir/data-types";
      case URI:
        return "http://hl7.org/fhir/data-types";
      case URL:
        return "http://hl7.org/fhir/data-types";
      case UUID:
        return "http://hl7.org/fhir/data-types";
      case XHTML:
        return "http://hl7.org/fhir/data-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ADDRESS:
        return "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.";
      case AGE:
        return "A duration of time during which an organism (or a process) has existed.";
      case ANNOTATION:
        return "A  text note which also  contains information about who made the statement and when.";
      case ATTACHMENT:
        return "For referring to data content defined in other formats.";
      case BACKBONEELEMENT:
        return "Base definition for all elements that are defined inside a resource - but not those in a data type.";
      case CODEABLECONCEPT:
        return "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.";
      case CODING:
        return "A reference to a code defined by a terminology system.";
      case CONTACTDETAIL:
        return "Specifies contact information for a person or organization.";
      case CONTACTPOINT:
        return "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.";
      case CONTRIBUTOR:
        return "A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.";
      case COUNT:
        return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
      case DATAREQUIREMENT:
        return "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.";
      case DISTANCE:
        return "A length - a value with a unit that is a physical distance.";
      case DOSAGE:
        return "Indicates how the medication is/was taken or should be taken by the patient.";
      case DURATION:
        return "A length of time.";
      case ELEMENT:
        return "Base definition for all elements in a resource.";
      case ELEMENTDEFINITION:
        return "Captures constraints on each element within the resource, profile, or extension.";
      case EXPRESSION:
        return "A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.";
      case EXTENSION:
        return "Optional Extension Element - found in all resources.";
      case HUMANNAME:
        return "A human's name with the ability to identify parts and usage.";
      case IDENTIFIER:
        return "An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.";
      case MARKETINGSTATUS:
        return "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.";
      case META:
        return "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.";
      case MONEY:
        return "An amount of economic utility in some recognized currency.";
      case MONEYQUANTITY:
        return "";
      case NARRATIVE:
        return "A human-readable summary of the resource conveying the essential clinical and business information for the resource.";
      case PARAMETERDEFINITION:
        return "The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.";
      case PERIOD:
        return "A time period defined by a start and end date and optionally time.";
      case POPULATION:
        return "A populatioof people with some set of grouping criteria.";
      case PRODCHARACTERISTIC:
        return "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.";
      case PRODUCTSHELFLIFE:
        return "The shelf-life and storage information for a medicinal product item or container can be described using this class.";
      case QUANTITY:
        return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
      case RANGE:
        return "A set of ordered Quantities defined by a low and high limit.";
      case RATIO:
        return "A relationship of two Quantity values - expressed as a numerator and a denominator.";
      case REFERENCE:
        return "A reference from one resource to another.";
      case RELATEDARTIFACT:
        return "Related artifacts such as additional documentation, justification, or bibliographic references.";
      case SAMPLEDDATA:
        return "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.";
      case SIGNATURE:
        return "A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.";
      case SIMPLEQUANTITY:
        return "";
      case SUBSTANCEAMOUNT:
        return "Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.";
      case TIMING:
        return "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.";
      case TRIGGERDEFINITION:
        return "A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.";
      case USAGECONTEXT:
        return "Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).";
      case BASE64BINARY:
        return "A stream of bytes";
      case BOOLEAN:
        return "Value of \"true\" or \"false\"";
      case CANONICAL:
        return "A URI that is a reference to a canonical URL on a FHIR resource";
      case CODE:
        return "A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents";
      case DATE:
        return "A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.";
      case DATETIME:
        return "A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.";
      case DECIMAL:
        return "A rational number with implicit precision";
      case ID:
        return "Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.";
      case INSTANT:
        return "An instant in time - known at least to the second";
      case INTEGER:
        return "A whole number";
      case MARKDOWN:
        return "A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine";
      case OID:
        return "An OID represented as a URI";
      case POSITIVEINT:
        return "An integer with a value that is positive (e.g. >0)";
      case STRING:
        return "A sequence of Unicode characters";
      case TIME:
        return "A time during the day, with no date specified";
      case UNSIGNEDINT:
        return "An integer with a value that is not negative (e.g. >= 0)";
      case URI:
        return "String of characters used to identify a name or a resource";
      case URL:
        return "A URI that is a literal reference";
      case UUID:
        return "A UUID, represented as a URI";
      case XHTML:
        return "XHTML format, as defined by W3C, but restricted usage (mainly, no active content)";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ADDRESS:
        return "Address";
      case AGE:
        return "Age";
      case ANNOTATION:
        return "Annotation";
      case ATTACHMENT:
        return "Attachment";
      case BACKBONEELEMENT:
        return "BackboneElement";
      case CODEABLECONCEPT:
        return "CodeableConcept";
      case CODING:
        return "Coding";
      case CONTACTDETAIL:
        return "ContactDetail";
      case CONTACTPOINT:
        return "ContactPoint";
      case CONTRIBUTOR:
        return "Contributor";
      case COUNT:
        return "Count";
      case DATAREQUIREMENT:
        return "DataRequirement";
      case DISTANCE:
        return "Distance";
      case DOSAGE:
        return "Dosage";
      case DURATION:
        return "Duration";
      case ELEMENT:
        return "Element";
      case ELEMENTDEFINITION:
        return "ElementDefinition";
      case EXPRESSION:
        return "Expression";
      case EXTENSION:
        return "Extension";
      case HUMANNAME:
        return "HumanName";
      case IDENTIFIER:
        return "Identifier";
      case MARKETINGSTATUS:
        return "MarketingStatus";
      case META:
        return "Meta";
      case MONEY:
        return "Money";
      case MONEYQUANTITY:
        return "MoneyQuantity";
      case NARRATIVE:
        return "Narrative";
      case PARAMETERDEFINITION:
        return "ParameterDefinition";
      case PERIOD:
        return "Period";
      case POPULATION:
        return "Population";
      case PRODCHARACTERISTIC:
        return "ProdCharacteristic";
      case PRODUCTSHELFLIFE:
        return "ProductShelfLife";
      case QUANTITY:
        return "Quantity";
      case RANGE:
        return "Range";
      case RATIO:
        return "Ratio";
      case REFERENCE:
        return "Reference";
      case RELATEDARTIFACT:
        return "RelatedArtifact";
      case SAMPLEDDATA:
        return "SampledData";
      case SIGNATURE:
        return "Signature";
      case SIMPLEQUANTITY:
        return "SimpleQuantity";
      case SUBSTANCEAMOUNT:
        return "SubstanceAmount";
      case TIMING:
        return "Timing";
      case TRIGGERDEFINITION:
        return "TriggerDefinition";
      case USAGECONTEXT:
        return "UsageContext";
      case BASE64BINARY:
        return "base64Binary";
      case BOOLEAN:
        return "boolean";
      case CANONICAL:
        return "canonical";
      case CODE:
        return "code";
      case DATE:
        return "date";
      case DATETIME:
        return "dateTime";
      case DECIMAL:
        return "decimal";
      case ID:
        return "id";
      case INSTANT:
        return "instant";
      case INTEGER:
        return "integer";
      case MARKDOWN:
        return "markdown";
      case OID:
        return "oid";
      case POSITIVEINT:
        return "positiveInt";
      case STRING:
        return "string";
      case TIME:
        return "time";
      case UNSIGNEDINT:
        return "unsignedInt";
      case URI:
        return "uri";
      case URL:
        return "url";
      case UUID:
        return "uuid";
      case XHTML:
        return "XHTML";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class DataTypeEnumFactory implements EnumFactory<DataType> {
    public DataType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("Address".equals(codeString))
        return DataType.ADDRESS;
      if ("Age".equals(codeString))
        return DataType.AGE;
      if ("Annotation".equals(codeString))
        return DataType.ANNOTATION;
      if ("Attachment".equals(codeString))
        return DataType.ATTACHMENT;
      if ("BackboneElement".equals(codeString))
        return DataType.BACKBONEELEMENT;
      if ("CodeableConcept".equals(codeString))
        return DataType.CODEABLECONCEPT;
      if ("Coding".equals(codeString))
        return DataType.CODING;
      if ("ContactDetail".equals(codeString))
        return DataType.CONTACTDETAIL;
      if ("ContactPoint".equals(codeString))
        return DataType.CONTACTPOINT;
      if ("Contributor".equals(codeString))
        return DataType.CONTRIBUTOR;
      if ("Count".equals(codeString))
        return DataType.COUNT;
      if ("DataRequirement".equals(codeString))
        return DataType.DATAREQUIREMENT;
      if ("Distance".equals(codeString))
        return DataType.DISTANCE;
      if ("Dosage".equals(codeString))
        return DataType.DOSAGE;
      if ("Duration".equals(codeString))
        return DataType.DURATION;
      if ("Element".equals(codeString))
        return DataType.ELEMENT;
      if ("ElementDefinition".equals(codeString))
        return DataType.ELEMENTDEFINITION;
      if ("Expression".equals(codeString))
        return DataType.EXPRESSION;
      if ("Extension".equals(codeString))
        return DataType.EXTENSION;
      if ("HumanName".equals(codeString))
        return DataType.HUMANNAME;
      if ("Identifier".equals(codeString))
        return DataType.IDENTIFIER;
      if ("MarketingStatus".equals(codeString))
        return DataType.MARKETINGSTATUS;
      if ("Meta".equals(codeString))
        return DataType.META;
      if ("Money".equals(codeString))
        return DataType.MONEY;
      if ("MoneyQuantity".equals(codeString))
        return DataType.MONEYQUANTITY;
      if ("Narrative".equals(codeString))
        return DataType.NARRATIVE;
      if ("ParameterDefinition".equals(codeString))
        return DataType.PARAMETERDEFINITION;
      if ("Period".equals(codeString))
        return DataType.PERIOD;
      if ("Population".equals(codeString))
        return DataType.POPULATION;
      if ("ProdCharacteristic".equals(codeString))
        return DataType.PRODCHARACTERISTIC;
      if ("ProductShelfLife".equals(codeString))
        return DataType.PRODUCTSHELFLIFE;
      if ("Quantity".equals(codeString))
        return DataType.QUANTITY;
      if ("Range".equals(codeString))
        return DataType.RANGE;
      if ("Ratio".equals(codeString))
        return DataType.RATIO;
      if ("Reference".equals(codeString))
        return DataType.REFERENCE;
      if ("RelatedArtifact".equals(codeString))
        return DataType.RELATEDARTIFACT;
      if ("SampledData".equals(codeString))
        return DataType.SAMPLEDDATA;
      if ("Signature".equals(codeString))
        return DataType.SIGNATURE;
      if ("SimpleQuantity".equals(codeString))
        return DataType.SIMPLEQUANTITY;
      if ("SubstanceAmount".equals(codeString))
        return DataType.SUBSTANCEAMOUNT;
      if ("Timing".equals(codeString))
        return DataType.TIMING;
      if ("TriggerDefinition".equals(codeString))
        return DataType.TRIGGERDEFINITION;
      if ("UsageContext".equals(codeString))
        return DataType.USAGECONTEXT;
      if ("base64Binary".equals(codeString))
        return DataType.BASE64BINARY;
      if ("boolean".equals(codeString))
        return DataType.BOOLEAN;
      if ("canonical".equals(codeString))
        return DataType.CANONICAL;
      if ("code".equals(codeString))
        return DataType.CODE;
      if ("date".equals(codeString))
        return DataType.DATE;
      if ("dateTime".equals(codeString))
        return DataType.DATETIME;
      if ("decimal".equals(codeString))
        return DataType.DECIMAL;
      if ("id".equals(codeString))
        return DataType.ID;
      if ("instant".equals(codeString))
        return DataType.INSTANT;
      if ("integer".equals(codeString))
        return DataType.INTEGER;
      if ("markdown".equals(codeString))
        return DataType.MARKDOWN;
      if ("oid".equals(codeString))
        return DataType.OID;
      if ("positiveInt".equals(codeString))
        return DataType.POSITIVEINT;
      if ("string".equals(codeString))
        return DataType.STRING;
      if ("time".equals(codeString))
        return DataType.TIME;
      if ("unsignedInt".equals(codeString))
        return DataType.UNSIGNEDINT;
      if ("uri".equals(codeString))
        return DataType.URI;
      if ("url".equals(codeString))
        return DataType.URL;
      if ("uuid".equals(codeString))
        return DataType.UUID;
      if ("xhtml".equals(codeString))
        return DataType.XHTML;
      throw new IllegalArgumentException("Unknown DataType code '" + codeString + "'");
    }

    public Enumeration<DataType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<DataType>(this, DataType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<DataType>(this, DataType.NULL, code);
      if ("Address".equals(codeString))
        return new Enumeration<DataType>(this, DataType.ADDRESS, code);
      if ("Age".equals(codeString))
        return new Enumeration<DataType>(this, DataType.AGE, code);
      if ("Annotation".equals(codeString))
        return new Enumeration<DataType>(this, DataType.ANNOTATION, code);
      if ("Attachment".equals(codeString))
        return new Enumeration<DataType>(this, DataType.ATTACHMENT, code);
      if ("BackboneElement".equals(codeString))
        return new Enumeration<DataType>(this, DataType.BACKBONEELEMENT, code);
      if ("CodeableConcept".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CODEABLECONCEPT, code);
      if ("Coding".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CODING, code);
      if ("ContactDetail".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CONTACTDETAIL, code);
      if ("ContactPoint".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CONTACTPOINT, code);
      if ("Contributor".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CONTRIBUTOR, code);
      if ("Count".equals(codeString))
        return new Enumeration<DataType>(this, DataType.COUNT, code);
      if ("DataRequirement".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DATAREQUIREMENT, code);
      if ("Distance".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DISTANCE, code);
      if ("Dosage".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DOSAGE, code);
      if ("Duration".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DURATION, code);
      if ("Element".equals(codeString))
        return new Enumeration<DataType>(this, DataType.ELEMENT, code);
      if ("ElementDefinition".equals(codeString))
        return new Enumeration<DataType>(this, DataType.ELEMENTDEFINITION, code);
      if ("Expression".equals(codeString))
        return new Enumeration<DataType>(this, DataType.EXPRESSION, code);
      if ("Extension".equals(codeString))
        return new Enumeration<DataType>(this, DataType.EXTENSION, code);
      if ("HumanName".equals(codeString))
        return new Enumeration<DataType>(this, DataType.HUMANNAME, code);
      if ("Identifier".equals(codeString))
        return new Enumeration<DataType>(this, DataType.IDENTIFIER, code);
      if ("MarketingStatus".equals(codeString))
        return new Enumeration<DataType>(this, DataType.MARKETINGSTATUS, code);
      if ("Meta".equals(codeString))
        return new Enumeration<DataType>(this, DataType.META, code);
      if ("Money".equals(codeString))
        return new Enumeration<DataType>(this, DataType.MONEY, code);
      if ("MoneyQuantity".equals(codeString))
        return new Enumeration<DataType>(this, DataType.MONEYQUANTITY, code);
      if ("Narrative".equals(codeString))
        return new Enumeration<DataType>(this, DataType.NARRATIVE, code);
      if ("ParameterDefinition".equals(codeString))
        return new Enumeration<DataType>(this, DataType.PARAMETERDEFINITION, code);
      if ("Period".equals(codeString))
        return new Enumeration<DataType>(this, DataType.PERIOD, code);
      if ("Population".equals(codeString))
        return new Enumeration<DataType>(this, DataType.POPULATION, code);
      if ("ProdCharacteristic".equals(codeString))
        return new Enumeration<DataType>(this, DataType.PRODCHARACTERISTIC, code);
      if ("ProductShelfLife".equals(codeString))
        return new Enumeration<DataType>(this, DataType.PRODUCTSHELFLIFE, code);
      if ("Quantity".equals(codeString))
        return new Enumeration<DataType>(this, DataType.QUANTITY, code);
      if ("Range".equals(codeString))
        return new Enumeration<DataType>(this, DataType.RANGE, code);
      if ("Ratio".equals(codeString))
        return new Enumeration<DataType>(this, DataType.RATIO, code);
      if ("Reference".equals(codeString))
        return new Enumeration<DataType>(this, DataType.REFERENCE, code);
      if ("RelatedArtifact".equals(codeString))
        return new Enumeration<DataType>(this, DataType.RELATEDARTIFACT, code);
      if ("SampledData".equals(codeString))
        return new Enumeration<DataType>(this, DataType.SAMPLEDDATA, code);
      if ("Signature".equals(codeString))
        return new Enumeration<DataType>(this, DataType.SIGNATURE, code);
      if ("SimpleQuantity".equals(codeString))
        return new Enumeration<DataType>(this, DataType.SIMPLEQUANTITY, code);
      if ("SubstanceAmount".equals(codeString))
        return new Enumeration<DataType>(this, DataType.SUBSTANCEAMOUNT, code);
      if ("Timing".equals(codeString))
        return new Enumeration<DataType>(this, DataType.TIMING, code);
      if ("TriggerDefinition".equals(codeString))
        return new Enumeration<DataType>(this, DataType.TRIGGERDEFINITION, code);
      if ("UsageContext".equals(codeString))
        return new Enumeration<DataType>(this, DataType.USAGECONTEXT, code);
      if ("base64Binary".equals(codeString))
        return new Enumeration<DataType>(this, DataType.BASE64BINARY, code);
      if ("boolean".equals(codeString))
        return new Enumeration<DataType>(this, DataType.BOOLEAN, code);
      if ("canonical".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CANONICAL, code);
      if ("code".equals(codeString))
        return new Enumeration<DataType>(this, DataType.CODE, code);
      if ("date".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DATE, code);
      if ("dateTime".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DATETIME, code);
      if ("decimal".equals(codeString))
        return new Enumeration<DataType>(this, DataType.DECIMAL, code);
      if ("id".equals(codeString))
        return new Enumeration<DataType>(this, DataType.ID, code);
      if ("instant".equals(codeString))
        return new Enumeration<DataType>(this, DataType.INSTANT, code);
      if ("integer".equals(codeString))
        return new Enumeration<DataType>(this, DataType.INTEGER, code);
      if ("markdown".equals(codeString))
        return new Enumeration<DataType>(this, DataType.MARKDOWN, code);
      if ("oid".equals(codeString))
        return new Enumeration<DataType>(this, DataType.OID, code);
      if ("positiveInt".equals(codeString))
        return new Enumeration<DataType>(this, DataType.POSITIVEINT, code);
      if ("string".equals(codeString))
        return new Enumeration<DataType>(this, DataType.STRING, code);
      if ("time".equals(codeString))
        return new Enumeration<DataType>(this, DataType.TIME, code);
      if ("unsignedInt".equals(codeString))
        return new Enumeration<DataType>(this, DataType.UNSIGNEDINT, code);
      if ("uri".equals(codeString))
        return new Enumeration<DataType>(this, DataType.URI, code);
      if ("url".equals(codeString))
        return new Enumeration<DataType>(this, DataType.URL, code);
      if ("uuid".equals(codeString))
        return new Enumeration<DataType>(this, DataType.UUID, code);
      if ("xhtml".equals(codeString))
        return new Enumeration<DataType>(this, DataType.XHTML, code);
      throw new FHIRException("Unknown DataType code '" + codeString + "'");
    }

    public String toCode(DataType code) {
       if (code == DataType.NULL)
           return null;
       if (code == DataType.ADDRESS)
        return "Address";
      if (code == DataType.AGE)
        return "Age";
      if (code == DataType.ANNOTATION)
        return "Annotation";
      if (code == DataType.ATTACHMENT)
        return "Attachment";
      if (code == DataType.BACKBONEELEMENT)
        return "BackboneElement";
      if (code == DataType.CODEABLECONCEPT)
        return "CodeableConcept";
      if (code == DataType.CODING)
        return "Coding";
      if (code == DataType.CONTACTDETAIL)
        return "ContactDetail";
      if (code == DataType.CONTACTPOINT)
        return "ContactPoint";
      if (code == DataType.CONTRIBUTOR)
        return "Contributor";
      if (code == DataType.COUNT)
        return "Count";
      if (code == DataType.DATAREQUIREMENT)
        return "DataRequirement";
      if (code == DataType.DISTANCE)
        return "Distance";
      if (code == DataType.DOSAGE)
        return "Dosage";
      if (code == DataType.DURATION)
        return "Duration";
      if (code == DataType.ELEMENT)
        return "Element";
      if (code == DataType.ELEMENTDEFINITION)
        return "ElementDefinition";
      if (code == DataType.EXPRESSION)
        return "Expression";
      if (code == DataType.EXTENSION)
        return "Extension";
      if (code == DataType.HUMANNAME)
        return "HumanName";
      if (code == DataType.IDENTIFIER)
        return "Identifier";
      if (code == DataType.MARKETINGSTATUS)
        return "MarketingStatus";
      if (code == DataType.META)
        return "Meta";
      if (code == DataType.MONEY)
        return "Money";
      if (code == DataType.MONEYQUANTITY)
        return "MoneyQuantity";
      if (code == DataType.NARRATIVE)
        return "Narrative";
      if (code == DataType.PARAMETERDEFINITION)
        return "ParameterDefinition";
      if (code == DataType.PERIOD)
        return "Period";
      if (code == DataType.POPULATION)
        return "Population";
      if (code == DataType.PRODCHARACTERISTIC)
        return "ProdCharacteristic";
      if (code == DataType.PRODUCTSHELFLIFE)
        return "ProductShelfLife";
      if (code == DataType.QUANTITY)
        return "Quantity";
      if (code == DataType.RANGE)
        return "Range";
      if (code == DataType.RATIO)
        return "Ratio";
      if (code == DataType.REFERENCE)
        return "Reference";
      if (code == DataType.RELATEDARTIFACT)
        return "RelatedArtifact";
      if (code == DataType.SAMPLEDDATA)
        return "SampledData";
      if (code == DataType.SIGNATURE)
        return "Signature";
      if (code == DataType.SIMPLEQUANTITY)
        return "SimpleQuantity";
      if (code == DataType.SUBSTANCEAMOUNT)
        return "SubstanceAmount";
      if (code == DataType.TIMING)
        return "Timing";
      if (code == DataType.TRIGGERDEFINITION)
        return "TriggerDefinition";
      if (code == DataType.USAGECONTEXT)
        return "UsageContext";
      if (code == DataType.BASE64BINARY)
        return "base64Binary";
      if (code == DataType.BOOLEAN)
        return "boolean";
      if (code == DataType.CANONICAL)
        return "canonical";
      if (code == DataType.CODE)
        return "code";
      if (code == DataType.DATE)
        return "date";
      if (code == DataType.DATETIME)
        return "dateTime";
      if (code == DataType.DECIMAL)
        return "decimal";
      if (code == DataType.ID)
        return "id";
      if (code == DataType.INSTANT)
        return "instant";
      if (code == DataType.INTEGER)
        return "integer";
      if (code == DataType.MARKDOWN)
        return "markdown";
      if (code == DataType.OID)
        return "oid";
      if (code == DataType.POSITIVEINT)
        return "positiveInt";
      if (code == DataType.STRING)
        return "string";
      if (code == DataType.TIME)
        return "time";
      if (code == DataType.UNSIGNEDINT)
        return "unsignedInt";
      if (code == DataType.URI)
        return "uri";
      if (code == DataType.URL)
        return "url";
      if (code == DataType.UUID)
        return "uuid";
      if (code == DataType.XHTML)
        return "xhtml";
      return "?";
   }

    public String toSystem(DataType code) {
      return code.getSystem();
    }
  }

  public enum DefinitionResourceType {
    /**
     * This resource allows for the definition of some activity to be performed,
     * independent of a particular patient, practitioner, or other performance
     * context.
     */
    ACTIVITYDEFINITION,
    /**
     * The EventDefinition resource provides a reusable description of when a
     * particular event can occur.
     */
    EVENTDEFINITION,
    /**
     * The Measure resource provides the definition of a quality measure.
     */
    MEASURE,
    /**
     * A formal computable definition of an operation (on the RESTful interface) or
     * a named query (using the search interaction).
     */
    OPERATIONDEFINITION,
    /**
     * This resource allows for the definition of various types of plans as a
     * sharable, consumable, and executable artifact. The resource is general enough
     * to support the description of a broad range of clinical artifacts such as
     * clinical decision support rules, order sets and protocols.
     */
    PLANDEFINITION,
    /**
     * A structured set of questions intended to guide the collection of answers
     * from end-users. Questionnaires provide detailed control over order,
     * presentation, phraseology and grouping to allow coherent, consistent data
     * collection.
     */
    QUESTIONNAIRE,
    /**
     * added to help the parsers
     */
    NULL;

    public static DefinitionResourceType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("ActivityDefinition".equals(codeString))
        return ACTIVITYDEFINITION;
      if ("EventDefinition".equals(codeString))
        return EVENTDEFINITION;
      if ("Measure".equals(codeString))
        return MEASURE;
      if ("OperationDefinition".equals(codeString))
        return OPERATIONDEFINITION;
      if ("PlanDefinition".equals(codeString))
        return PLANDEFINITION;
      if ("Questionnaire".equals(codeString))
        return QUESTIONNAIRE;
      throw new FHIRException("Unknown DefinitionResourceType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case EVENTDEFINITION:
        return "EventDefinition";
      case MEASURE:
        return "Measure";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case PLANDEFINITION:
        return "PlanDefinition";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "http://hl7.org/fhir/definition-resource-types";
      case EVENTDEFINITION:
        return "http://hl7.org/fhir/definition-resource-types";
      case MEASURE:
        return "http://hl7.org/fhir/definition-resource-types";
      case OPERATIONDEFINITION:
        return "http://hl7.org/fhir/definition-resource-types";
      case PLANDEFINITION:
        return "http://hl7.org/fhir/definition-resource-types";
      case QUESTIONNAIRE:
        return "http://hl7.org/fhir/definition-resource-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.";
      case EVENTDEFINITION:
        return "The EventDefinition resource provides a reusable description of when a particular event can occur.";
      case MEASURE:
        return "The Measure resource provides the definition of a quality measure.";
      case OPERATIONDEFINITION:
        return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
      case PLANDEFINITION:
        return "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.";
      case QUESTIONNAIRE:
        return "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case EVENTDEFINITION:
        return "EventDefinition";
      case MEASURE:
        return "Measure";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case PLANDEFINITION:
        return "PlanDefinition";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class DefinitionResourceTypeEnumFactory implements EnumFactory<DefinitionResourceType> {
    public DefinitionResourceType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("ActivityDefinition".equals(codeString))
        return DefinitionResourceType.ACTIVITYDEFINITION;
      if ("EventDefinition".equals(codeString))
        return DefinitionResourceType.EVENTDEFINITION;
      if ("Measure".equals(codeString))
        return DefinitionResourceType.MEASURE;
      if ("OperationDefinition".equals(codeString))
        return DefinitionResourceType.OPERATIONDEFINITION;
      if ("PlanDefinition".equals(codeString))
        return DefinitionResourceType.PLANDEFINITION;
      if ("Questionnaire".equals(codeString))
        return DefinitionResourceType.QUESTIONNAIRE;
      throw new IllegalArgumentException("Unknown DefinitionResourceType code '" + codeString + "'");
    }

    public Enumeration<DefinitionResourceType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.NULL, code);
      if ("ActivityDefinition".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.ACTIVITYDEFINITION, code);
      if ("EventDefinition".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.EVENTDEFINITION, code);
      if ("Measure".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.MEASURE, code);
      if ("OperationDefinition".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.OPERATIONDEFINITION, code);
      if ("PlanDefinition".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.PLANDEFINITION, code);
      if ("Questionnaire".equals(codeString))
        return new Enumeration<DefinitionResourceType>(this, DefinitionResourceType.QUESTIONNAIRE, code);
      throw new FHIRException("Unknown DefinitionResourceType code '" + codeString + "'");
    }

    public String toCode(DefinitionResourceType code) {
       if (code == DefinitionResourceType.NULL)
           return null;
       if (code == DefinitionResourceType.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == DefinitionResourceType.EVENTDEFINITION)
        return "EventDefinition";
      if (code == DefinitionResourceType.MEASURE)
        return "Measure";
      if (code == DefinitionResourceType.OPERATIONDEFINITION)
        return "OperationDefinition";
      if (code == DefinitionResourceType.PLANDEFINITION)
        return "PlanDefinition";
      if (code == DefinitionResourceType.QUESTIONNAIRE)
        return "Questionnaire";
      return "?";
   }

    public String toSystem(DefinitionResourceType code) {
      return code.getSystem();
    }
  }

  public enum DocumentReferenceStatus {
    /**
     * This is the current reference for this document.
     */
    CURRENT,
    /**
     * This reference has been superseded by another reference.
     */
    SUPERSEDED,
    /**
     * This reference was created in error.
     */
    ENTEREDINERROR,
    /**
     * added to help the parsers
     */
    NULL;

    public static DocumentReferenceStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("current".equals(codeString))
        return CURRENT;
      if ("superseded".equals(codeString))
        return SUPERSEDED;
      if ("entered-in-error".equals(codeString))
        return ENTEREDINERROR;
      throw new FHIRException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case CURRENT:
        return "current";
      case SUPERSEDED:
        return "superseded";
      case ENTEREDINERROR:
        return "entered-in-error";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case CURRENT:
        return "http://hl7.org/fhir/document-reference-status";
      case SUPERSEDED:
        return "http://hl7.org/fhir/document-reference-status";
      case ENTEREDINERROR:
        return "http://hl7.org/fhir/document-reference-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case CURRENT:
        return "This is the current reference for this document.";
      case SUPERSEDED:
        return "This reference has been superseded by another reference.";
      case ENTEREDINERROR:
        return "This reference was created in error.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case CURRENT:
        return "Current";
      case SUPERSEDED:
        return "Superseded";
      case ENTEREDINERROR:
        return "Entered in Error";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class DocumentReferenceStatusEnumFactory implements EnumFactory<DocumentReferenceStatus> {
    public DocumentReferenceStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("current".equals(codeString))
        return DocumentReferenceStatus.CURRENT;
      if ("superseded".equals(codeString))
        return DocumentReferenceStatus.SUPERSEDED;
      if ("entered-in-error".equals(codeString))
        return DocumentReferenceStatus.ENTEREDINERROR;
      throw new IllegalArgumentException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public Enumeration<DocumentReferenceStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.NULL, code);
      if ("current".equals(codeString))
        return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.CURRENT, code);
      if ("superseded".equals(codeString))
        return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.SUPERSEDED, code);
      if ("entered-in-error".equals(codeString))
        return new Enumeration<DocumentReferenceStatus>(this, DocumentReferenceStatus.ENTEREDINERROR, code);
      throw new FHIRException("Unknown DocumentReferenceStatus code '" + codeString + "'");
    }

    public String toCode(DocumentReferenceStatus code) {
       if (code == DocumentReferenceStatus.NULL)
           return null;
       if (code == DocumentReferenceStatus.CURRENT)
        return "current";
      if (code == DocumentReferenceStatus.SUPERSEDED)
        return "superseded";
      if (code == DocumentReferenceStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
   }

    public String toSystem(DocumentReferenceStatus code) {
      return code.getSystem();
    }
  }

  public enum EventResourceType {
    /**
     * Item containing charge code(s) associated with the provision of healthcare
     * provider products.
     */
    CHARGEITEM,
    /**
     * Remittance resource.
     */
    CLAIMRESPONSE,
    /**
     * A clinical assessment performed when planning treatments and management
     * strategies for a patient.
     */
    CLINICALIMPRESSION,
    /**
     * A record of information transmitted from a sender to a receiver.
     */
    COMMUNICATION,
    /**
     * A set of resources composed into a single coherent clinical statement with
     * clinical attestation.
     */
    COMPOSITION,
    /**
     * Detailed information about conditions, problems or diagnoses.
     */
    CONDITION,
    /**
     * A healthcare consumer's policy choices to permits or denies recipients or
     * roles to perform actions for specific purposes and periods of time.
     */
    CONSENT,
    /**
     * Insurance or medical plan or a payment agreement.
     */
    COVERAGE,
    /**
     * Record of use of a device.
     */
    DEVICEUSESTATEMENT,
    /**
     * A Diagnostic report - a combination of request information, atomic results,
     * images, interpretation, as well as formatted reports.
     */
    DIAGNOSTICREPORT,
    /**
     * A list that defines a set of documents.
     */
    DOCUMENTMANIFEST,
    /**
     * A reference to a document.
     */
    DOCUMENTREFERENCE,
    /**
     * An interaction during which services are provided to the patient.
     */
    ENCOUNTER,
    /**
     * EnrollmentResponse resource.
     */
    ENROLLMENTRESPONSE,
    /**
     * An association of a Patient with an Organization and Healthcare Provider(s)
     * for a period of time that the Organization assumes some level of
     * responsibility.
     */
    EPISODEOFCARE,
    /**
     * Explanation of Benefit resource.
     */
    EXPLANATIONOFBENEFIT,
    /**
     * Information about patient's relatives, relevant for patient.
     */
    FAMILYMEMBERHISTORY,
    /**
     * The formal response to a guidance request.
     */
    GUIDANCERESPONSE,
    /**
     * A set of images produced in single study (one or more series of references
     * images).
     */
    IMAGINGSTUDY,
    /**
     * Immunization event information.
     */
    IMMUNIZATION,
    /**
     * Results of a measure evaluation.
     */
    MEASUREREPORT,
    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual
     * content may be inline or provided by direct reference.
     */
    MEDIA,
    /**
     * Administration of medication to a patient.
     */
    MEDICATIONADMINISTRATION,
    /**
     * Dispensing a medication to a named patient.
     */
    MEDICATIONDISPENSE,
    /**
     * Record of medication being taken by a patient.
     */
    MEDICATIONSTATEMENT,
    /**
     * Measurements and simple assertions.
     */
    OBSERVATION,
    /**
     * PaymentNotice request.
     */
    PAYMENTNOTICE,
    /**
     * PaymentReconciliation resource.
     */
    PAYMENTRECONCILIATION,
    /**
     * An action that is being or was performed on a patient.
     */
    PROCEDURE,
    /**
     * ProcessResponse resource.
     */
    PROCESSRESPONSE,
    /**
     * A structured set of questions and their answers.
     */
    QUESTIONNAIRERESPONSE,
    /**
     * Potential outcomes for a subject with likelihood.
     */
    RISKASSESSMENT,
    /**
     * Delivery of bulk Supplies.
     */
    SUPPLYDELIVERY,
    /**
     * A task to be performed.
     */
    TASK,
    /**
     * added to help the parsers
     */
    NULL;

    public static EventResourceType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("ChargeItem".equals(codeString))
        return CHARGEITEM;
      if ("ClaimResponse".equals(codeString))
        return CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return CLINICALIMPRESSION;
      if ("Communication".equals(codeString))
        return COMMUNICATION;
      if ("Composition".equals(codeString))
        return COMPOSITION;
      if ("Condition".equals(codeString))
        return CONDITION;
      if ("Consent".equals(codeString))
        return CONSENT;
      if ("Coverage".equals(codeString))
        return COVERAGE;
      if ("DeviceUseStatement".equals(codeString))
        return DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return DOCUMENTREFERENCE;
      if ("Encounter".equals(codeString))
        return ENCOUNTER;
      if ("EnrollmentResponse".equals(codeString))
        return ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return EPISODEOFCARE;
      if ("ExplanationOfBenefit".equals(codeString))
        return EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return FAMILYMEMBERHISTORY;
      if ("GuidanceResponse".equals(codeString))
        return GUIDANCERESPONSE;
      if ("ImagingStudy".equals(codeString))
        return IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return IMMUNIZATION;
      if ("MeasureReport".equals(codeString))
        return MEASUREREPORT;
      if ("Media".equals(codeString))
        return MEDIA;
      if ("MedicationAdministration".equals(codeString))
        return MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return MEDICATIONDISPENSE;
      if ("MedicationStatement".equals(codeString))
        return MEDICATIONSTATEMENT;
      if ("Observation".equals(codeString))
        return OBSERVATION;
      if ("PaymentNotice".equals(codeString))
        return PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return PAYMENTRECONCILIATION;
      if ("Procedure".equals(codeString))
        return PROCEDURE;
      if ("ProcessResponse".equals(codeString))
        return PROCESSRESPONSE;
      if ("QuestionnaireResponse".equals(codeString))
        return QUESTIONNAIRERESPONSE;
      if ("RiskAssessment".equals(codeString))
        return RISKASSESSMENT;
      if ("SupplyDelivery".equals(codeString))
        return SUPPLYDELIVERY;
      if ("Task".equals(codeString))
        return TASK;
      throw new FHIRException("Unknown EventResourceType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case CHARGEITEM:
        return "ChargeItem";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case COMMUNICATION:
        return "Communication";
      case COMPOSITION:
        return "Composition";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case COVERAGE:
        return "Coverage";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case ENCOUNTER:
        return "Encounter";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case OBSERVATION:
        return "Observation";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PROCEDURE:
        return "Procedure";
      case PROCESSRESPONSE:
        return "ProcessResponse";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case TASK:
        return "Task";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case CHARGEITEM:
        return "http://hl7.org/fhir/event-resource-types";
      case CLAIMRESPONSE:
        return "http://hl7.org/fhir/event-resource-types";
      case CLINICALIMPRESSION:
        return "http://hl7.org/fhir/event-resource-types";
      case COMMUNICATION:
        return "http://hl7.org/fhir/event-resource-types";
      case COMPOSITION:
        return "http://hl7.org/fhir/event-resource-types";
      case CONDITION:
        return "http://hl7.org/fhir/event-resource-types";
      case CONSENT:
        return "http://hl7.org/fhir/event-resource-types";
      case COVERAGE:
        return "http://hl7.org/fhir/event-resource-types";
      case DEVICEUSESTATEMENT:
        return "http://hl7.org/fhir/event-resource-types";
      case DIAGNOSTICREPORT:
        return "http://hl7.org/fhir/event-resource-types";
      case DOCUMENTMANIFEST:
        return "http://hl7.org/fhir/event-resource-types";
      case DOCUMENTREFERENCE:
        return "http://hl7.org/fhir/event-resource-types";
      case ENCOUNTER:
        return "http://hl7.org/fhir/event-resource-types";
      case ENROLLMENTRESPONSE:
        return "http://hl7.org/fhir/event-resource-types";
      case EPISODEOFCARE:
        return "http://hl7.org/fhir/event-resource-types";
      case EXPLANATIONOFBENEFIT:
        return "http://hl7.org/fhir/event-resource-types";
      case FAMILYMEMBERHISTORY:
        return "http://hl7.org/fhir/event-resource-types";
      case GUIDANCERESPONSE:
        return "http://hl7.org/fhir/event-resource-types";
      case IMAGINGSTUDY:
        return "http://hl7.org/fhir/event-resource-types";
      case IMMUNIZATION:
        return "http://hl7.org/fhir/event-resource-types";
      case MEASUREREPORT:
        return "http://hl7.org/fhir/event-resource-types";
      case MEDIA:
        return "http://hl7.org/fhir/event-resource-types";
      case MEDICATIONADMINISTRATION:
        return "http://hl7.org/fhir/event-resource-types";
      case MEDICATIONDISPENSE:
        return "http://hl7.org/fhir/event-resource-types";
      case MEDICATIONSTATEMENT:
        return "http://hl7.org/fhir/event-resource-types";
      case OBSERVATION:
        return "http://hl7.org/fhir/event-resource-types";
      case PAYMENTNOTICE:
        return "http://hl7.org/fhir/event-resource-types";
      case PAYMENTRECONCILIATION:
        return "http://hl7.org/fhir/event-resource-types";
      case PROCEDURE:
        return "http://hl7.org/fhir/event-resource-types";
      case PROCESSRESPONSE:
        return "http://hl7.org/fhir/event-resource-types";
      case QUESTIONNAIRERESPONSE:
        return "http://hl7.org/fhir/event-resource-types";
      case RISKASSESSMENT:
        return "http://hl7.org/fhir/event-resource-types";
      case SUPPLYDELIVERY:
        return "http://hl7.org/fhir/event-resource-types";
      case TASK:
        return "http://hl7.org/fhir/event-resource-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case CHARGEITEM:
        return "Item containing charge code(s) associated with the provision of healthcare provider products.";
      case CLAIMRESPONSE:
        return "Remittance resource.";
      case CLINICALIMPRESSION:
        return "A clinical assessment performed when planning treatments and management strategies for a patient.";
      case COMMUNICATION:
        return "A record of information transmitted from a sender to a receiver.";
      case COMPOSITION:
        return "A set of resources composed into a single coherent clinical statement with clinical attestation.";
      case CONDITION:
        return "Detailed information about conditions, problems or diagnoses.";
      case CONSENT:
        return "A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time.";
      case COVERAGE:
        return "Insurance or medical plan or a payment agreement.";
      case DEVICEUSESTATEMENT:
        return "Record of use of a device.";
      case DIAGNOSTICREPORT:
        return "A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports.";
      case DOCUMENTMANIFEST:
        return "A list that defines a set of documents.";
      case DOCUMENTREFERENCE:
        return "A reference to a document.";
      case ENCOUNTER:
        return "An interaction during which services are provided to the patient.";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse resource.";
      case EPISODEOFCARE:
        return "An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility.";
      case EXPLANATIONOFBENEFIT:
        return "Explanation of Benefit resource.";
      case FAMILYMEMBERHISTORY:
        return "Information about patient's relatives, relevant for patient.";
      case GUIDANCERESPONSE:
        return "The formal response to a guidance request.";
      case IMAGINGSTUDY:
        return "A set of images produced in single study (one or more series of references images).";
      case IMMUNIZATION:
        return "Immunization event information.";
      case MEASUREREPORT:
        return "Results of a measure evaluation.";
      case MEDIA:
        return "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.";
      case MEDICATIONADMINISTRATION:
        return "Administration of medication to a patient.";
      case MEDICATIONDISPENSE:
        return "Dispensing a medication to a named patient.";
      case MEDICATIONSTATEMENT:
        return "Record of medication being taken by a patient.";
      case OBSERVATION:
        return "Measurements and simple assertions.";
      case PAYMENTNOTICE:
        return "PaymentNotice request.";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation resource.";
      case PROCEDURE:
        return "An action that is being or was performed on a patient.";
      case PROCESSRESPONSE:
        return "ProcessResponse resource.";
      case QUESTIONNAIRERESPONSE:
        return "A structured set of questions and their answers.";
      case RISKASSESSMENT:
        return "Potential outcomes for a subject with likelihood.";
      case SUPPLYDELIVERY:
        return "Delivery of bulk Supplies.";
      case TASK:
        return "A task to be performed.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case CHARGEITEM:
        return "ChargeItem";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case COMMUNICATION:
        return "Communication";
      case COMPOSITION:
        return "Composition";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case COVERAGE:
        return "Coverage";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case ENCOUNTER:
        return "Encounter";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case OBSERVATION:
        return "Observation";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PROCEDURE:
        return "Procedure";
      case PROCESSRESPONSE:
        return "ProcessResponse";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case TASK:
        return "Task";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class EventResourceTypeEnumFactory implements EnumFactory<EventResourceType> {
    public EventResourceType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("ChargeItem".equals(codeString))
        return EventResourceType.CHARGEITEM;
      if ("ClaimResponse".equals(codeString))
        return EventResourceType.CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return EventResourceType.CLINICALIMPRESSION;
      if ("Communication".equals(codeString))
        return EventResourceType.COMMUNICATION;
      if ("Composition".equals(codeString))
        return EventResourceType.COMPOSITION;
      if ("Condition".equals(codeString))
        return EventResourceType.CONDITION;
      if ("Consent".equals(codeString))
        return EventResourceType.CONSENT;
      if ("Coverage".equals(codeString))
        return EventResourceType.COVERAGE;
      if ("DeviceUseStatement".equals(codeString))
        return EventResourceType.DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return EventResourceType.DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return EventResourceType.DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return EventResourceType.DOCUMENTREFERENCE;
      if ("Encounter".equals(codeString))
        return EventResourceType.ENCOUNTER;
      if ("EnrollmentResponse".equals(codeString))
        return EventResourceType.ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return EventResourceType.EPISODEOFCARE;
      if ("ExplanationOfBenefit".equals(codeString))
        return EventResourceType.EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return EventResourceType.FAMILYMEMBERHISTORY;
      if ("GuidanceResponse".equals(codeString))
        return EventResourceType.GUIDANCERESPONSE;
      if ("ImagingStudy".equals(codeString))
        return EventResourceType.IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return EventResourceType.IMMUNIZATION;
      if ("MeasureReport".equals(codeString))
        return EventResourceType.MEASUREREPORT;
      if ("Media".equals(codeString))
        return EventResourceType.MEDIA;
      if ("MedicationAdministration".equals(codeString))
        return EventResourceType.MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return EventResourceType.MEDICATIONDISPENSE;
      if ("MedicationStatement".equals(codeString))
        return EventResourceType.MEDICATIONSTATEMENT;
      if ("Observation".equals(codeString))
        return EventResourceType.OBSERVATION;
      if ("PaymentNotice".equals(codeString))
        return EventResourceType.PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return EventResourceType.PAYMENTRECONCILIATION;
      if ("Procedure".equals(codeString))
        return EventResourceType.PROCEDURE;
      if ("ProcessResponse".equals(codeString))
        return EventResourceType.PROCESSRESPONSE;
      if ("QuestionnaireResponse".equals(codeString))
        return EventResourceType.QUESTIONNAIRERESPONSE;
      if ("RiskAssessment".equals(codeString))
        return EventResourceType.RISKASSESSMENT;
      if ("SupplyDelivery".equals(codeString))
        return EventResourceType.SUPPLYDELIVERY;
      if ("Task".equals(codeString))
        return EventResourceType.TASK;
      throw new IllegalArgumentException("Unknown EventResourceType code '" + codeString + "'");
    }

    public Enumeration<EventResourceType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<EventResourceType>(this, EventResourceType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.NULL, code);
      if ("ChargeItem".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.CHARGEITEM, code);
      if ("ClaimResponse".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.CLAIMRESPONSE, code);
      if ("ClinicalImpression".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.CLINICALIMPRESSION, code);
      if ("Communication".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.COMMUNICATION, code);
      if ("Composition".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.COMPOSITION, code);
      if ("Condition".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.CONDITION, code);
      if ("Consent".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.CONSENT, code);
      if ("Coverage".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.COVERAGE, code);
      if ("DeviceUseStatement".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.DEVICEUSESTATEMENT, code);
      if ("DiagnosticReport".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.DIAGNOSTICREPORT, code);
      if ("DocumentManifest".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.DOCUMENTMANIFEST, code);
      if ("DocumentReference".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.DOCUMENTREFERENCE, code);
      if ("Encounter".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.ENCOUNTER, code);
      if ("EnrollmentResponse".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.ENROLLMENTRESPONSE, code);
      if ("EpisodeOfCare".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.EPISODEOFCARE, code);
      if ("ExplanationOfBenefit".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.EXPLANATIONOFBENEFIT, code);
      if ("FamilyMemberHistory".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.FAMILYMEMBERHISTORY, code);
      if ("GuidanceResponse".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.GUIDANCERESPONSE, code);
      if ("ImagingStudy".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.IMAGINGSTUDY, code);
      if ("Immunization".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.IMMUNIZATION, code);
      if ("MeasureReport".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.MEASUREREPORT, code);
      if ("Media".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.MEDIA, code);
      if ("MedicationAdministration".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.MEDICATIONADMINISTRATION, code);
      if ("MedicationDispense".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.MEDICATIONDISPENSE, code);
      if ("MedicationStatement".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.MEDICATIONSTATEMENT, code);
      if ("Observation".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.OBSERVATION, code);
      if ("PaymentNotice".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.PAYMENTNOTICE, code);
      if ("PaymentReconciliation".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.PAYMENTRECONCILIATION, code);
      if ("Procedure".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.PROCEDURE, code);
      if ("ProcessResponse".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.PROCESSRESPONSE, code);
      if ("QuestionnaireResponse".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.QUESTIONNAIRERESPONSE, code);
      if ("RiskAssessment".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.RISKASSESSMENT, code);
      if ("SupplyDelivery".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.SUPPLYDELIVERY, code);
      if ("Task".equals(codeString))
        return new Enumeration<EventResourceType>(this, EventResourceType.TASK, code);
      throw new FHIRException("Unknown EventResourceType code '" + codeString + "'");
    }

    public String toCode(EventResourceType code) {
       if (code == EventResourceType.NULL)
           return null;
       if (code == EventResourceType.CHARGEITEM)
        return "ChargeItem";
      if (code == EventResourceType.CLAIMRESPONSE)
        return "ClaimResponse";
      if (code == EventResourceType.CLINICALIMPRESSION)
        return "ClinicalImpression";
      if (code == EventResourceType.COMMUNICATION)
        return "Communication";
      if (code == EventResourceType.COMPOSITION)
        return "Composition";
      if (code == EventResourceType.CONDITION)
        return "Condition";
      if (code == EventResourceType.CONSENT)
        return "Consent";
      if (code == EventResourceType.COVERAGE)
        return "Coverage";
      if (code == EventResourceType.DEVICEUSESTATEMENT)
        return "DeviceUseStatement";
      if (code == EventResourceType.DIAGNOSTICREPORT)
        return "DiagnosticReport";
      if (code == EventResourceType.DOCUMENTMANIFEST)
        return "DocumentManifest";
      if (code == EventResourceType.DOCUMENTREFERENCE)
        return "DocumentReference";
      if (code == EventResourceType.ENCOUNTER)
        return "Encounter";
      if (code == EventResourceType.ENROLLMENTRESPONSE)
        return "EnrollmentResponse";
      if (code == EventResourceType.EPISODEOFCARE)
        return "EpisodeOfCare";
      if (code == EventResourceType.EXPLANATIONOFBENEFIT)
        return "ExplanationOfBenefit";
      if (code == EventResourceType.FAMILYMEMBERHISTORY)
        return "FamilyMemberHistory";
      if (code == EventResourceType.GUIDANCERESPONSE)
        return "GuidanceResponse";
      if (code == EventResourceType.IMAGINGSTUDY)
        return "ImagingStudy";
      if (code == EventResourceType.IMMUNIZATION)
        return "Immunization";
      if (code == EventResourceType.MEASUREREPORT)
        return "MeasureReport";
      if (code == EventResourceType.MEDIA)
        return "Media";
      if (code == EventResourceType.MEDICATIONADMINISTRATION)
        return "MedicationAdministration";
      if (code == EventResourceType.MEDICATIONDISPENSE)
        return "MedicationDispense";
      if (code == EventResourceType.MEDICATIONSTATEMENT)
        return "MedicationStatement";
      if (code == EventResourceType.OBSERVATION)
        return "Observation";
      if (code == EventResourceType.PAYMENTNOTICE)
        return "PaymentNotice";
      if (code == EventResourceType.PAYMENTRECONCILIATION)
        return "PaymentReconciliation";
      if (code == EventResourceType.PROCEDURE)
        return "Procedure";
      if (code == EventResourceType.PROCESSRESPONSE)
        return "ProcessResponse";
      if (code == EventResourceType.QUESTIONNAIRERESPONSE)
        return "QuestionnaireResponse";
      if (code == EventResourceType.RISKASSESSMENT)
        return "RiskAssessment";
      if (code == EventResourceType.SUPPLYDELIVERY)
        return "SupplyDelivery";
      if (code == EventResourceType.TASK)
        return "Task";
      return "?";
   }

    public String toSystem(EventResourceType code) {
      return code.getSystem();
    }
  }

  public enum FHIRAllTypes {
    /**
     * An address expressed using postal conventions (as opposed to GPS or other
     * location definition formats). This data type may be used to convey addresses
     * for use in delivering mail as well as for visiting locations which might not
     * be valid for mail delivery. There are a variety of postal address formats
     * defined around the world.
     */
    ADDRESS,
    /**
     * A duration of time during which an organism (or a process) has existed.
     */
    AGE,
    /**
     * A text note which also contains information about who made the statement and
     * when.
     */
    ANNOTATION,
    /**
     * For referring to data content defined in other formats.
     */
    ATTACHMENT,
    /**
     * Base definition for all elements that are defined inside a resource - but not
     * those in a data type.
     */
    BACKBONEELEMENT,
    /**
     * A concept that may be defined by a formal reference to a terminology or
     * ontology or may be provided by text.
     */
    CODEABLECONCEPT,
    /**
     * A reference to a code defined by a terminology system.
     */
    CODING,
    /**
     * Specifies contact information for a person or organization.
     */
    CONTACTDETAIL,
    /**
     * Details for all kinds of technology mediated contact points for a person or
     * organization, including telephone, email, etc.
     */
    CONTACTPOINT,
    /**
     * A contributor to the content of a knowledge asset, including authors,
     * editors, reviewers, and endorsers.
     */
    CONTRIBUTOR,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that
     * measured amounts include amounts that are not precisely quantified, including
     * amounts involving arbitrary units and floating currencies.
     */
    COUNT,
    /**
     * Describes a required data item for evaluation in terms of the type of data,
     * and optional code or date-based filters of the data.
     */
    DATAREQUIREMENT,
    /**
     * A length - a value with a unit that is a physical distance.
     */
    DISTANCE,
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     */
    DOSAGE,
    /**
     * A length of time.
     */
    DURATION,
    /**
     * Base definition for all elements in a resource.
     */
    ELEMENT,
    /**
     * Captures constraints on each element within the resource, profile, or
     * extension.
     */
    ELEMENTDEFINITION,
    /**
     * A expression that is evaluated in a specified context and returns a value.
     * The context of use of the expression must specify the context in which the
     * expression is evaluated, and how the result of the expression is used.
     */
    EXPRESSION,
    /**
     * Optional Extension Element - found in all resources.
     */
    EXTENSION,
    /**
     * A human's name with the ability to identify parts and usage.
     */
    HUMANNAME,
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically
     * this is used for business identifiers.
     */
    IDENTIFIER,
    /**
     * The marketing status describes the date when a medicinal product is actually
     * put on the market or the date as of which it is no longer available.
     */
    MARKETINGSTATUS,
    /**
     * The metadata about a resource. This is content in the resource that is
     * maintained by the infrastructure. Changes to the content might not always be
     * associated with version changes to the resource.
     */
    META,
    /**
     * An amount of economic utility in some recognized currency.
     */
    MONEY,
    /**
     * null
     */
    MONEYQUANTITY,
    /**
     * A human-readable summary of the resource conveying the essential clinical and
     * business information for the resource.
     */
    NARRATIVE,
    /**
     * The parameters to the module. This collection specifies both the input and
     * output parameters. Input parameters are provided by the caller as part of the
     * $evaluate operation. Output parameters are included in the GuidanceResponse.
     */
    PARAMETERDEFINITION,
    /**
     * A time period defined by a start and end date and optionally time.
     */
    PERIOD,
    /**
     * A populatioof people with some set of grouping criteria.
     */
    POPULATION,
    /**
     * The marketing status describes the date when a medicinal product is actually
     * put on the market or the date as of which it is no longer available.
     */
    PRODCHARACTERISTIC,
    /**
     * The shelf-life and storage information for a medicinal product item or
     * container can be described using this class.
     */
    PRODUCTSHELFLIFE,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that
     * measured amounts include amounts that are not precisely quantified, including
     * amounts involving arbitrary units and floating currencies.
     */
    QUANTITY,
    /**
     * A set of ordered Quantities defined by a low and high limit.
     */
    RANGE,
    /**
     * A relationship of two Quantity values - expressed as a numerator and a
     * denominator.
     */
    RATIO,
    /**
     * A reference from one resource to another.
     */
    REFERENCE,
    /**
     * Related artifacts such as additional documentation, justification, or
     * bibliographic references.
     */
    RELATEDARTIFACT,
    /**
     * A series of measurements taken by a device, with upper and lower limits.
     * There may be more than one dimension in the data.
     */
    SAMPLEDDATA,
    /**
     * A signature along with supporting context. The signature may be a digital
     * signature that is cryptographic in nature, or some other signature acceptable
     * to the domain. This other signature may be as simple as a graphical image
     * representing a hand-written signature, or a signature ceremony Different
     * signature approaches have different utilities.
     */
    SIGNATURE,
    /**
     * null
     */
    SIMPLEQUANTITY,
    /**
     * Chemical substances are a single substance type whose primary defining
     * element is the molecular structure. Chemical substances shall be defined on
     * the basis of their complete covalent molecular structure; the presence of a
     * salt (counter-ion) and/or solvates (water, alcohols) is also captured.
     * Purity, grade, physical form or particle size are not taken into account in
     * the definition of a chemical substance or in the assignment of a Substance
     * ID.
     */
    SUBSTANCEAMOUNT,
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used
     * to record when things are planned, expected or requested to occur. The most
     * common usage is in dosage instructions for medications. They are also used
     * when planning care of various kinds, and may be used for reporting the
     * schedule to which past regular activities were carried out.
     */
    TIMING,
    /**
     * A description of a triggering event. Triggering events can be named events,
     * data events, or periodic, as determined by the type element.
     */
    TRIGGERDEFINITION,
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index
     * and/or categorize an artifact. This metadata can either be specific to the
     * applicable population (e.g., age category, DRG) or the specific context of
     * care (e.g., venue, care setting, provider of care).
     */
    USAGECONTEXT,
    /**
     * A stream of bytes
     */
    BASE64BINARY,
    /**
     * Value of "true" or "false"
     */
    BOOLEAN,
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     */
    CANONICAL,
    /**
     * A string which has at least one character and no leading or trailing
     * whitespace and where there is no whitespace other than single spaces in the
     * contents
     */
    CODE,
    /**
     * A date or partial date (e.g. just year or year + month). There is no time
     * zone. The format is a union of the schema types gYear, gYearMonth and date.
     * Dates SHALL be valid dates.
     */
    DATE,
    /**
     * A date, date-time or partial date (e.g. just year or year + month). If hours
     * and minutes are specified, a time zone SHALL be populated. The format is a
     * union of the schema types gYear, gYearMonth, date and dateTime. Seconds must
     * be provided due to schema type constraints but may be zero-filled and may be
     * ignored. Dates SHALL be valid dates.
     */
    DATETIME,
    /**
     * A rational number with implicit precision
     */
    DECIMAL,
    /**
     * Any combination of letters, numerals, "-" and ".", with a length limit of 64
     * characters. (This might be an integer, an unprefixed OID, UUID or any other
     * identifier pattern that meets these constraints.) Ids are case-insensitive.
     */
    ID,
    /**
     * An instant in time - known at least to the second
     */
    INSTANT,
    /**
     * A whole number
     */
    INTEGER,
    /**
     * A string that may contain Github Flavored Markdown syntax for optional
     * processing by a mark down presentation engine
     */
    MARKDOWN,
    /**
     * An OID represented as a URI
     */
    OID,
    /**
     * An integer with a value that is positive (e.g. >0)
     */
    POSITIVEINT,
    /**
     * A sequence of Unicode characters
     */
    STRING,
    /**
     * A time during the day, with no date specified
     */
    TIME,
    /**
     * An integer with a value that is not negative (e.g. >= 0)
     */
    UNSIGNEDINT,
    /**
     * String of characters used to identify a name or a resource
     */
    URI,
    /**
     * A URI that is a literal reference
     */
    URL,
    /**
     * A UUID, represented as a URI
     */
    UUID,
    /**
     * XHTML format, as defined by W3C, but restricted usage (mainly, no active
     * content)
     */
    XHTML,
    /**
     * A financial tool for tracking value accrued for a particular purpose. In the
     * healthcare field, used to track charges for a patient, cost centers, etc.
     */
    ACCOUNT,
    /**
     * This resource allows for the definition of some activity to be performed,
     * independent of a particular patient, practitioner, or other performance
     * context.
     */
    ACTIVITYDEFINITION,
    /**
     * Actual or potential/avoided event causing unintended physical injury
     * resulting from or contributed to by medical care, a research study or other
     * healthcare setting factors that requires additional monitoring, treatment, or
     * hospitalization, or that results in death.
     */
    ADVERSEEVENT,
    /**
     * Risk of harmful or undesirable, physiological response which is unique to an
     * individual and associated with exposure to a substance.
     */
    ALLERGYINTOLERANCE,
    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related
     * person(s) and/or device(s) for a specific date/time. This may result in one
     * or more Encounter(s).
     */
    APPOINTMENT,
    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such
     * as a confirmation or rejection.
     */
    APPOINTMENTRESPONSE,
    /**
     * A record of an event made for purposes of maintaining a security log. Typical
     * uses include detection of intrusion attempts and monitoring for inappropriate
     * usage.
     */
    AUDITEVENT,
    /**
     * Basic is used for handling concepts not yet defined in FHIR, narrative-only
     * resources that don't map to an existing resource, and custom resources not
     * appropriate for inclusion in the FHIR specification.
     */
    BASIC,
    /**
     * A resource that represents the data of a single raw artifact as digital
     * content accessible in its native format. A Binary resource can contain any
     * content, whether text, image, pdf, zip archive, etc.
     */
    BINARY,
    /**
     * A material substance originating from a biological entity intended to be
     * transplanted or infused into another (possibly the same) biological entity.
     */
    BIOLOGICALLYDERIVEDPRODUCT,
    /**
     * Record details about an anatomical structure. This resource may be used when
     * a coded concept does not provide the necessary detail needed for the use
     * case.
     */
    BODYSTRUCTURE,
    /**
     * A container for a collection of resources.
     */
    BUNDLE,
    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR
     * Server for a particular version of FHIR that may be used as a statement of
     * actual server functionality or a statement of required or desired server
     * implementation.
     */
    CAPABILITYSTATEMENT,
    /**
     * Describes the intention of how one or more practitioners intend to deliver
     * care for a particular patient, group or community for a period of time,
     * possibly limited to care for a specific condition or set of conditions.
     */
    CAREPLAN,
    /**
     * The Care Team includes all the people and organizations who plan to
     * participate in the coordination and delivery of care for a patient.
     */
    CARETEAM,
    /**
     * Catalog entries are wrappers that contextualize items included in a catalog.
     */
    CATALOGENTRY,
    /**
     * The resource ChargeItem describes the provision of healthcare provider
     * products for a certain patient, therefore referring not only to the product,
     * but containing in addition details of the provision, like date, time, amounts
     * and participating organizations and persons. Main Usage of the ChargeItem is
     * to enable the billing process and internal cost allocation.
     */
    CHARGEITEM,
    /**
     * The ChargeItemDefinition resource provides the properties that apply to the
     * (billing) codes necessary to calculate costs and prices. The properties may
     * differ largely depending on type and realm, therefore this resource gives
     * only a rough structure and requires profiling for each type of billing code
     * system.
     */
    CHARGEITEMDEFINITION,
    /**
     * A provider issued list of professional services and products which have been
     * provided, or are to be provided, to a patient which is sent to an insurer for
     * reimbursement.
     */
    CLAIM,
    /**
     * This resource provides the adjudication details from the processing of a
     * Claim resource.
     */
    CLAIMRESPONSE,
    /**
     * A record of a clinical assessment performed to determine what problem(s) may
     * affect the patient and before planning the treatments or management
     * strategies that are best to manage a patient's condition. Assessments are
     * often 1:1 with a clinical consultation / encounter, but this varies greatly
     * depending on the clinical workflow. This resource is called
     * "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with
     * the recording of assessment tools such as Apgar score.
     */
    CLINICALIMPRESSION,
    /**
     * The CodeSystem resource is used to declare the existence of and describe a
     * code system or code system supplement and its key properties, and optionally
     * define a part or all of its content.
     */
    CODESYSTEM,
    /**
     * An occurrence of information being transmitted; e.g. an alert that was sent
     * to a responsible provider, a public health agency that was notified about a
     * reportable condition.
     */
    COMMUNICATION,
    /**
     * A request to convey information; e.g. the CDS system proposes that an alert
     * be sent to a responsible provider, the CDS system proposes that the public
     * health agency be notified about a reportable condition.
     */
    COMMUNICATIONREQUEST,
    /**
     * A compartment definition that defines how resources are accessed on a server.
     */
    COMPARTMENTDEFINITION,
    /**
     * A set of healthcare-related information that is assembled together into a
     * single logical package that provides a single coherent statement of meaning,
     * establishes its own context and that has clinical attestation with regard to
     * who is making the statement. A Composition defines the structure and
     * narrative content necessary for a document. However, a Composition alone does
     * not constitute a document. Rather, the Composition must be the first entry in
     * a Bundle where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for example
     * Patient, Practitioner, Encounter, etc.).
     */
    COMPOSITION,
    /**
     * A statement of relationships from one set of concepts to one or more other
     * concepts - either concepts in code systems, or data element/data element
     * concepts, or classes in class models.
     */
    CONCEPTMAP,
    /**
     * A clinical condition, problem, diagnosis, or other event, situation, issue,
     * or clinical concept that has risen to a level of concern.
     */
    CONDITION,
    /**
     * A record of a healthcare consumer’s choices, which permits or denies
     * identified recipient(s) or recipient role(s) to perform one or more actions
     * within a given policy context, for specific purposes and periods of time.
     */
    CONSENT,
    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive
     * i.e., a policy or agreement.
     */
    CONTRACT,
    /**
     * Financial instrument which may be used to reimburse or pay for health care
     * products and services. Includes both insurance and self-payment.
     */
    COVERAGE,
    /**
     * The CoverageEligibilityRequest provides patient and insurance coverage
     * information to an insurer for them to respond, in the form of an
     * CoverageEligibilityResponse, with information regarding whether the stated
     * coverage is valid and in-force and optionally to provide the insurance
     * details of the policy.
     */
    COVERAGEELIGIBILITYREQUEST,
    /**
     * This resource provides eligibility and plan details from the processing of an
     * CoverageEligibilityRequest resource.
     */
    COVERAGEELIGIBILITYRESPONSE,
    /**
     * Indicates an actual or potential clinical issue with or between one or more
     * active or proposed clinical actions for a patient; e.g. Drug-drug
     * interaction, Ineffective treatment frequency, Procedure-condition conflict,
     * etc.
     */
    DETECTEDISSUE,
    /**
     * A type of a manufactured item that is used in the provision of healthcare
     * without being substantially changed through that activity. The device may be
     * a medical or non-medical device.
     */
    DEVICE,
    /**
     * The characteristics, operational status and capabilities of a medical-related
     * component of a medical device.
     */
    DEVICEDEFINITION,
    /**
     * Describes a measurement, calculation or setting capability of a medical
     * device.
     */
    DEVICEMETRIC,
    /**
     * Represents a request for a patient to employ a medical device. The device may
     * be an implantable device, or an external assistive device, such as a walker.
     */
    DEVICEREQUEST,
    /**
     * A record of a device being used by a patient where the record is the result
     * of a report from the patient or another clinician.
     */
    DEVICEUSESTATEMENT,
    /**
     * The findings and interpretation of diagnostic tests performed on patients,
     * groups of patients, devices, and locations, and/or specimens derived from
     * these. The report includes clinical context such as requesting and provider
     * information, and some mix of atomic results, images, textual and coded
     * interpretations, and formatted representation of diagnostic reports.
     */
    DIAGNOSTICREPORT,
    /**
     * A collection of documents compiled for a purpose together with metadata that
     * applies to the collection.
     */
    DOCUMENTMANIFEST,
    /**
     * A reference to a document of any kind for any purpose. Provides metadata
     * about the document so that the document can be discovered and managed. The
     * scope of a document is any seralized object with a mime-type, so includes
     * formal patient centric documents (CDA), cliical notes, scanned paper, and
     * non-patient specific documents like policy text.
     */
    DOCUMENTREFERENCE,
    /**
     * A resource that includes narrative, extensions, and contained resources.
     */
    DOMAINRESOURCE,
    /**
     * The EffectEvidenceSynthesis resource describes the difference in an outcome
     * between exposures states in a population where the effect estimate is derived
     * from a combination of research studies.
     */
    EFFECTEVIDENCESYNTHESIS,
    /**
     * An interaction between a patient and healthcare provider(s) for the purpose
     * of providing healthcare service(s) or assessing the health status of a
     * patient.
     */
    ENCOUNTER,
    /**
     * The technical details of an endpoint that can be used for electronic
     * services, such as for web services providing XDS.b or a REST endpoint for
     * another FHIR server. This may include any security context information.
     */
    ENDPOINT,
    /**
     * This resource provides the insurance enrollment details to the insurer
     * regarding a specified coverage.
     */
    ENROLLMENTREQUEST,
    /**
     * This resource provides enrollment and plan details from the processing of an
     * EnrollmentRequest resource.
     */
    ENROLLMENTRESPONSE,
    /**
     * An association between a patient and an organization / healthcare provider(s)
     * during which time encounters may occur. The managing organization assumes a
     * level of responsibility for the patient during this time.
     */
    EPISODEOFCARE,
    /**
     * The EventDefinition resource provides a reusable description of when a
     * particular event can occur.
     */
    EVENTDEFINITION,
    /**
     * The Evidence resource describes the conditional state (population and any
     * exposures being compared within the population) and outcome (if specified)
     * that the knowledge (evidence, assertion, recommendation) is about.
     */
    EVIDENCE,
    /**
     * The EvidenceVariable resource describes a "PICO" element that knowledge
     * (evidence, assertion, recommendation) is about.
     */
    EVIDENCEVARIABLE,
    /**
     * Example of workflow instance.
     */
    EXAMPLESCENARIO,
    /**
     * This resource provides: the claim details; adjudication details from the
     * processing of a Claim; and optionally account balance information, for
     * informing the subscriber of the benefits provided.
     */
    EXPLANATIONOFBENEFIT,
    /**
     * Significant health conditions for a person related to the patient relevant in
     * the context of care for the patient.
     */
    FAMILYMEMBERHISTORY,
    /**
     * Prospective warnings of potential issues when providing care to the patient.
     */
    FLAG,
    /**
     * Describes the intended objective(s) for a patient, group or organization
     * care, for example, weight loss, restoring an activity of daily living,
     * obtaining herd immunity via immunization, meeting a process improvement
     * objective, etc.
     */
    GOAL,
    /**
     * A formal computable definition of a graph of resources - that is, a coherent
     * set of resources that form a graph by following references. The Graph
     * Definition resource defines a set and makes rules about the set.
     */
    GRAPHDEFINITION,
    /**
     * Represents a defined collection of entities that may be discussed or acted
     * upon collectively but which are not expected to act collectively, and are not
     * formally or legally recognized; i.e. a collection of entities that isn't an
     * Organization.
     */
    GROUP,
    /**
     * A guidance response is the formal response to a guidance request, including
     * any output parameters returned by the evaluation, as well as the description
     * of any proposed actions to be taken.
     */
    GUIDANCERESPONSE,
    /**
     * The details of a healthcare service available at a location.
     */
    HEALTHCARESERVICE,
    /**
     * Representation of the content produced in a DICOM imaging study. A study
     * comprises a set of series, each of which includes a set of Service-Object
     * Pair Instances (SOP Instances - images or other data) acquired or produced in
     * a common context. A series is of only one modality (e.g. X-ray, CT, MR,
     * ultrasound), but a study may have multiple series of different modalities.
     */
    IMAGINGSTUDY,
    /**
     * Describes the event of a patient being administered a vaccine or a record of
     * an immunization as reported by a patient, a clinician or another party.
     */
    IMMUNIZATION,
    /**
     * Describes a comparison of an immunization event against published
     * recommendations to determine if the administration is "valid" in relation to
     * those recommendations.
     */
    IMMUNIZATIONEVALUATION,
    /**
     * A patient's point-in-time set of recommendations (i.e. forecasting) according
     * to a published schedule with optional supporting justification.
     */
    IMMUNIZATIONRECOMMENDATION,
    /**
     * A set of rules of how a particular interoperability or standards problem is
     * solved - typically through the use of FHIR resources. This resource is used
     * to gather all the parts of an implementation guide into a logical whole and
     * to publish a computable definition of all the parts.
     */
    IMPLEMENTATIONGUIDE,
    /**
     * Details of a Health Insurance product/plan provided by an organization.
     */
    INSURANCEPLAN,
    /**
     * Invoice containing collected ChargeItems from an Account with calculated
     * individual and total price for Billing purpose.
     */
    INVOICE,
    /**
     * The Library resource is a general-purpose container for knowledge asset
     * definitions. It can be used to describe and expose existing knowledge assets
     * such as logic libraries and information model descriptions, as well as to
     * describe a collection of knowledge assets.
     */
    LIBRARY,
    /**
     * Identifies two or more records (resource instances) that refer to the same
     * real-world "occurrence".
     */
    LINKAGE,
    /**
     * A list is a curated collection of resources.
     */
    LIST,
    /**
     * Details and position information for a physical place where services are
     * provided and resources and participants may be stored, found, contained, or
     * accommodated.
     */
    LOCATION,
    /**
     * The Measure resource provides the definition of a quality measure.
     */
    MEASURE,
    /**
     * The MeasureReport resource contains the results of the calculation of a
     * measure; and optionally a reference to the resources involved in that
     * calculation.
     */
    MEASUREREPORT,
    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual
     * content may be inline or provided by direct reference.
     */
    MEDIA,
    /**
     * This resource is primarily used for the identification and definition of a
     * medication for the purposes of prescribing, dispensing, and administering a
     * medication as well as for making statements about medication use.
     */
    MEDICATION,
    /**
     * Describes the event of a patient consuming or otherwise being administered a
     * medication. This may be as simple as swallowing a tablet or it may be a long
     * running infusion. Related resources tie this event to the authorizing
     * prescription, and the specific encounter between patient and health care
     * practitioner.
     */
    MEDICATIONADMINISTRATION,
    /**
     * Indicates that a medication product is to be or has been dispensed for a
     * named person/patient. This includes a description of the medication product
     * (supply) provided and the instructions for administering the medication. The
     * medication dispense is the result of a pharmacy system responding to a
     * medication order.
     */
    MEDICATIONDISPENSE,
    /**
     * Information about a medication that is used to support knowledge.
     */
    MEDICATIONKNOWLEDGE,
    /**
     * An order or request for both supply of the medication and the instructions
     * for administration of the medication to a patient. The resource is called
     * "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder"
     * to generalize the use across inpatient and outpatient settings, including
     * care plans, etc., and to harmonize with workflow patterns.
     */
    MEDICATIONREQUEST,
    /**
     * A record of a medication that is being consumed by a patient. A
     * MedicationStatement may indicate that the patient may be taking the
     * medication now or has taken the medication in the past or will be taking the
     * medication in the future. The source of this information can be the patient,
     * significant other (such as a family member or spouse), or a clinician. A
     * common scenario where this information is captured is during the history
     * taking process during a patient visit or stay. The medication information may
     * come from sources such as the patient's memory, from a prescription bottle,
     * or from a list of medications the patient, clinician or other party
     * maintains.
     * 
     * The primary difference between a medication statement and a medication
     * administration is that the medication administration has complete
     * administration information and is based on actual administration information
     * from the person who administered the medication. A medication statement is
     * often, if not always, less specific. There is no required date/time when the
     * medication was administered, in fact we only know that a source has reported
     * the patient is taking this medication, where details such as time, quantity,
     * or rate or even medication product may be incomplete or missing or less
     * precise. As stated earlier, the medication statement information may come
     * from the patient's memory, from a prescription bottle or from a list of
     * medications the patient, clinician or other party maintains. Medication
     * administration is more formal and is not missing detailed information.
     */
    MEDICATIONSTATEMENT,
    /**
     * Detailed definition of a medicinal product, typically for uses other than
     * direct patient care (e.g. regulatory use).
     */
    MEDICINALPRODUCT,
    /**
     * The regulatory authorization of a medicinal product.
     */
    MEDICINALPRODUCTAUTHORIZATION,
    /**
     * The clinical particulars - indications, contraindications etc. of a medicinal
     * product, including for regulatory purposes.
     */
    MEDICINALPRODUCTCONTRAINDICATION,
    /**
     * Indication for the Medicinal Product.
     */
    MEDICINALPRODUCTINDICATION,
    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    MEDICINALPRODUCTINGREDIENT,
    /**
     * The interactions of the medicinal product with other medicinal products, or
     * other forms of interactions.
     */
    MEDICINALPRODUCTINTERACTION,
    /**
     * The manufactured item as contained in the packaged medicinal product.
     */
    MEDICINALPRODUCTMANUFACTURED,
    /**
     * A medicinal product in a container or package.
     */
    MEDICINALPRODUCTPACKAGED,
    /**
     * A pharmaceutical product described in terms of its composition and dose form.
     */
    MEDICINALPRODUCTPHARMACEUTICAL,
    /**
     * Describe the undesirable effects of the medicinal product.
     */
    MEDICINALPRODUCTUNDESIRABLEEFFECT,
    /**
     * Defines the characteristics of a message that can be shared between systems,
     * including the type of event that initiates the message, the content to be
     * transmitted and what response(s), if any, are permitted.
     */
    MESSAGEDEFINITION,
    /**
     * The header for a message exchange that is either requesting or responding to
     * an action. The reference(s) that are the subject of the action as well as
     * other information related to the action are typically transmitted in a bundle
     * in which the MessageHeader resource instance is the first resource in the
     * bundle.
     */
    MESSAGEHEADER,
    /**
     * Raw data describing a biological sequence.
     */
    MOLECULARSEQUENCE,
    /**
     * A curated namespace that issues unique symbols within that namespace for the
     * identification of concepts, people, devices, etc. Represents a "System" used
     * within the Identifier and Coding data types.
     */
    NAMINGSYSTEM,
    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional
     * supplement to a patient/resident.
     */
    NUTRITIONORDER,
    /**
     * Measurements and simple assertions made about a patient, device or other
     * subject.
     */
    OBSERVATION,
    /**
     * Set of definitional characteristics for a kind of observation or measurement
     * produced or consumed by an orderable health care service.
     */
    OBSERVATIONDEFINITION,
    /**
     * A formal computable definition of an operation (on the RESTful interface) or
     * a named query (using the search interaction).
     */
    OPERATIONDEFINITION,
    /**
     * A collection of error, warning, or information messages that result from a
     * system action.
     */
    OPERATIONOUTCOME,
    /**
     * A formally or informally recognized grouping of people or organizations
     * formed for the purpose of achieving some form of collective action. Includes
     * companies, institutions, corporations, departments, community groups,
     * healthcare practice groups, payer/insurer, etc.
     */
    ORGANIZATION,
    /**
     * Defines an affiliation/assotiation/relationship between 2 distinct
     * oganizations, that is not a part-of relationship/sub-division relationship.
     */
    ORGANIZATIONAFFILIATION,
    /**
     * This resource is a non-persisted resource used to pass information into and
     * back from an [operation](operations.html). It has no other use, and there is
     * no RESTful endpoint associated with it.
     */
    PARAMETERS,
    /**
     * Demographics and other administrative information about an individual or
     * animal receiving care or other health-related services.
     */
    PATIENT,
    /**
     * This resource provides the status of the payment for goods and services
     * rendered, and the request and response resource references.
     */
    PAYMENTNOTICE,
    /**
     * This resource provides the details including amount of a payment and
     * allocates the payment items being paid.
     */
    PAYMENTRECONCILIATION,
    /**
     * Demographics and administrative information about a person independent of a
     * specific health-related context.
     */
    PERSON,
    /**
     * This resource allows for the definition of various types of plans as a
     * sharable, consumable, and executable artifact. The resource is general enough
     * to support the description of a broad range of clinical artifacts such as
     * clinical decision support rules, order sets and protocols.
     */
    PLANDEFINITION,
    /**
     * A person who is directly or indirectly involved in the provisioning of
     * healthcare.
     */
    PRACTITIONER,
    /**
     * A specific set of Roles/Locations/specialties/services that a practitioner
     * may perform at an organization for a period of time.
     */
    PRACTITIONERROLE,
    /**
     * An action that is or was performed on or for a patient. This can be a
     * physical intervention like an operation, or less invasive like long term
     * services, counseling, or hypnotherapy.
     */
    PROCEDURE,
    /**
     * Provenance of a resource is a record that describes entities and processes
     * involved in producing and delivering or otherwise influencing that resource.
     * Provenance provides a critical foundation for assessing authenticity,
     * enabling trust, and allowing reproducibility. Provenance assertions are a
     * form of contextual metadata and can themselves become important records with
     * their own provenance. Provenance statement indicates clinical significance in
     * terms of confidence in authenticity, reliability, and trustworthiness,
     * integrity, and stage in lifecycle (e.g. Document Completion - has the
     * artifact been legally authenticated), all of which may impact security,
     * privacy, and trust policies.
     */
    PROVENANCE,
    /**
     * A structured set of questions intended to guide the collection of answers
     * from end-users. Questionnaires provide detailed control over order,
     * presentation, phraseology and grouping to allow coherent, consistent data
     * collection.
     */
    QUESTIONNAIRE,
    /**
     * A structured set of questions and their answers. The questions are ordered
     * and grouped into coherent subsets, corresponding to the structure of the
     * grouping of the questionnaire being responded to.
     */
    QUESTIONNAIRERESPONSE,
    /**
     * Information about a person that is involved in the care for a patient, but
     * who is not the target of healthcare, nor has a formal responsibility in the
     * care process.
     */
    RELATEDPERSON,
    /**
     * A group of related requests that can be used to capture intended activities
     * that have inter-dependencies such as "give this medication after that one".
     */
    REQUESTGROUP,
    /**
     * The ResearchDefinition resource describes the conditional state (population
     * and any exposures being compared within the population) and outcome (if
     * specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    RESEARCHDEFINITION,
    /**
     * The ResearchElementDefinition resource describes a "PICO" element that
     * knowledge (evidence, assertion, recommendation) is about.
     */
    RESEARCHELEMENTDEFINITION,
    /**
     * A process where a researcher or organization plans and then executes a series
     * of steps intended to increase the field of healthcare-related knowledge. This
     * includes studies of safety, efficacy, comparative effectiveness and other
     * information about medications, devices, therapies and other interventional
     * and investigative techniques. A ResearchStudy involves the gathering of
     * information about human or animal subjects.
     */
    RESEARCHSTUDY,
    /**
     * A physical entity which is the primary unit of operational and/or
     * administrative interest in a study.
     */
    RESEARCHSUBJECT,
    /**
     * This is the base resource type for everything.
     */
    RESOURCE,
    /**
     * An assessment of the likely outcome(s) for a patient or other subject as well
     * as the likelihood of each outcome.
     */
    RISKASSESSMENT,
    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in
     * a population plus exposure state where the risk estimate is derived from a
     * combination of research studies.
     */
    RISKEVIDENCESYNTHESIS,
    /**
     * A container for slots of time that may be available for booking appointments.
     */
    SCHEDULE,
    /**
     * A search parameter that defines a named search item that can be used to
     * search/filter on a resource.
     */
    SEARCHPARAMETER,
    /**
     * A record of a request for service such as diagnostic investigations,
     * treatments, or operations to be performed.
     */
    SERVICEREQUEST,
    /**
     * A slot of time on a schedule that may be available for booking appointments.
     */
    SLOT,
    /**
     * A sample to be used for analysis.
     */
    SPECIMEN,
    /**
     * A kind of specimen with associated set of requirements.
     */
    SPECIMENDEFINITION,
    /**
     * A definition of a FHIR structure. This resource is used to describe the
     * underlying resources, data types defined in FHIR, and also for describing
     * extensions and constraints on resources and data types.
     */
    STRUCTUREDEFINITION,
    /**
     * A Map of relationships between 2 structures that can be used to transform
     * data.
     */
    STRUCTUREMAP,
    /**
     * The subscription resource is used to define a push-based subscription from a
     * server to another system. Once a subscription is registered with the server,
     * the server checks every resource that is created or updated, and if the
     * resource matches the given criteria, it sends a message on the defined
     * "channel" so that another system can take an appropriate action.
     */
    SUBSCRIPTION,
    /**
     * A homogeneous material with a definite composition.
     */
    SUBSTANCE,
    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar and
     * linkage. Individual substance/moiety IDs will be created for each of these
     * elements. The nucleotide sequence will be always entered in the 5’-3’
     * direction.
     */
    SUBSTANCENUCLEICACID,
    /**
     * Todo.
     */
    SUBSTANCEPOLYMER,
    /**
     * A SubstanceProtein is defined as a single unit of a linear amino acid
     * sequence, or a combination of subunits that are either covalently linked or
     * have a defined invariant stoichiometric relationship. This includes all
     * synthetic, recombinant and purified SubstanceProteins of defined sequence,
     * whether the use is therapeutic or prophylactic. This set of elements will be
     * used to describe albumins, coagulation factors, cytokines, growth factors,
     * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant
     * vaccines, and immunomodulators.
     */
    SUBSTANCEPROTEIN,
    /**
     * Todo.
     */
    SUBSTANCEREFERENCEINFORMATION,
    /**
     * Source material shall capture information on the taxonomic and anatomical
     * origins as well as the fraction of a material that can result in or can be
     * modified to form a substance. This set of data elements shall be used to
     * define polymer substances isolated from biological matrices. Taxonomic and
     * anatomical origins shall be described using a controlled vocabulary as
     * required. This information is captured for naturally derived polymers ( .
     * starch) and structurally diverse substances. For Organisms belonging to the
     * Kingdom Plantae the Substance level defines the fresh material of a single
     * species or infraspecies, the Herbal Drug and the Herbal preparation. For
     * Herbal preparations, the fraction information will be captured at the
     * Substance information level and additional information for herbal extracts
     * will be captured at the Specified Substance Group 1 information level. See
     * for further explanation the Substance Class: Structurally Diverse and the
     * herbal annex.
     */
    SUBSTANCESOURCEMATERIAL,
    /**
     * The detailed description of a substance, typically at a level beyond what is
     * used for prescribing.
     */
    SUBSTANCESPECIFICATION,
    /**
     * Record of delivery of what is supplied.
     */
    SUPPLYDELIVERY,
    /**
     * A record of a request for a medication, substance or device used in the
     * healthcare setting.
     */
    SUPPLYREQUEST,
    /**
     * A task to be performed.
     */
    TASK,
    /**
     * A Terminology Capabilities documents a set of capabilities (behaviors) of a
     * FHIR Server that may be used as a statement of actual server functionality or
     * a statement of required or desired server implementation.
     */
    TERMINOLOGYCAPABILITIES,
    /**
     * A summary of information based on the results of executing a TestScript.
     */
    TESTREPORT,
    /**
     * A structured set of tests against a FHIR server or client implementation to
     * determine compliance against the FHIR specification.
     */
    TESTSCRIPT,
    /**
     * A ValueSet resource instance specifies a set of codes drawn from one or more
     * code systems, intended for use in a particular context. Value sets link
     * between [[[CodeSystem]]] definitions and their use in [coded
     * elements](terminologies.html).
     */
    VALUESET,
    /**
     * Describes validation requirements, source(s), status and dates for one or
     * more elements.
     */
    VERIFICATIONRESULT,
    /**
     * An authorization for the provision of glasses and/or contact lenses to a
     * patient.
     */
    VISIONPRESCRIPTION,
    /**
     * A place holder that means any kind of data type
     */
    TYPE,
    /**
     * A place holder that means any kind of resource
     */
    ANY,
    /**
     * added to help the parsers
     */
    NULL;

    public static FHIRAllTypes fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("Address".equals(codeString))
        return ADDRESS;
      if ("Age".equals(codeString))
        return AGE;
      if ("Annotation".equals(codeString))
        return ANNOTATION;
      if ("Attachment".equals(codeString))
        return ATTACHMENT;
      if ("BackboneElement".equals(codeString))
        return BACKBONEELEMENT;
      if ("CodeableConcept".equals(codeString))
        return CODEABLECONCEPT;
      if ("Coding".equals(codeString))
        return CODING;
      if ("ContactDetail".equals(codeString))
        return CONTACTDETAIL;
      if ("ContactPoint".equals(codeString))
        return CONTACTPOINT;
      if ("Contributor".equals(codeString))
        return CONTRIBUTOR;
      if ("Count".equals(codeString))
        return COUNT;
      if ("DataRequirement".equals(codeString))
        return DATAREQUIREMENT;
      if ("Distance".equals(codeString))
        return DISTANCE;
      if ("Dosage".equals(codeString))
        return DOSAGE;
      if ("Duration".equals(codeString))
        return DURATION;
      if ("Element".equals(codeString))
        return ELEMENT;
      if ("ElementDefinition".equals(codeString))
        return ELEMENTDEFINITION;
      if ("Expression".equals(codeString))
        return EXPRESSION;
      if ("Extension".equals(codeString))
        return EXTENSION;
      if ("HumanName".equals(codeString))
        return HUMANNAME;
      if ("Identifier".equals(codeString))
        return IDENTIFIER;
      if ("MarketingStatus".equals(codeString))
        return MARKETINGSTATUS;
      if ("Meta".equals(codeString))
        return META;
      if ("Money".equals(codeString))
        return MONEY;
      if ("MoneyQuantity".equals(codeString))
        return MONEYQUANTITY;
      if ("Narrative".equals(codeString))
        return NARRATIVE;
      if ("ParameterDefinition".equals(codeString))
        return PARAMETERDEFINITION;
      if ("Period".equals(codeString))
        return PERIOD;
      if ("Population".equals(codeString))
        return POPULATION;
      if ("ProdCharacteristic".equals(codeString))
        return PRODCHARACTERISTIC;
      if ("ProductShelfLife".equals(codeString))
        return PRODUCTSHELFLIFE;
      if ("Quantity".equals(codeString))
        return QUANTITY;
      if ("Range".equals(codeString))
        return RANGE;
      if ("Ratio".equals(codeString))
        return RATIO;
      if ("Reference".equals(codeString))
        return REFERENCE;
      if ("RelatedArtifact".equals(codeString))
        return RELATEDARTIFACT;
      if ("SampledData".equals(codeString))
        return SAMPLEDDATA;
      if ("Signature".equals(codeString))
        return SIGNATURE;
      if ("SimpleQuantity".equals(codeString))
        return SIMPLEQUANTITY;
      if ("SubstanceAmount".equals(codeString))
        return SUBSTANCEAMOUNT;
      if ("Timing".equals(codeString))
        return TIMING;
      if ("TriggerDefinition".equals(codeString))
        return TRIGGERDEFINITION;
      if ("UsageContext".equals(codeString))
        return USAGECONTEXT;
      if ("base64Binary".equals(codeString))
        return BASE64BINARY;
      if ("boolean".equals(codeString))
        return BOOLEAN;
      if ("canonical".equals(codeString))
        return CANONICAL;
      if ("code".equals(codeString))
        return CODE;
      if ("date".equals(codeString))
        return DATE;
      if ("dateTime".equals(codeString))
        return DATETIME;
      if ("decimal".equals(codeString))
        return DECIMAL;
      if ("id".equals(codeString))
        return ID;
      if ("instant".equals(codeString))
        return INSTANT;
      if ("integer".equals(codeString))
        return INTEGER;
      if ("markdown".equals(codeString))
        return MARKDOWN;
      if ("oid".equals(codeString))
        return OID;
      if ("positiveInt".equals(codeString))
        return POSITIVEINT;
      if ("string".equals(codeString))
        return STRING;
      if ("time".equals(codeString))
        return TIME;
      if ("unsignedInt".equals(codeString))
        return UNSIGNEDINT;
      if ("uri".equals(codeString))
        return URI;
      if ("url".equals(codeString))
        return URL;
      if ("uuid".equals(codeString))
        return UUID;
      if ("xhtml".equals(codeString))
        return XHTML;
      if ("Account".equals(codeString))
        return ACCOUNT;
      if ("ActivityDefinition".equals(codeString))
        return ACTIVITYDEFINITION;
      if ("AdverseEvent".equals(codeString))
        return ADVERSEEVENT;
      if ("AllergyIntolerance".equals(codeString))
        return ALLERGYINTOLERANCE;
      if ("Appointment".equals(codeString))
        return APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return APPOINTMENTRESPONSE;
      if ("AuditEvent".equals(codeString))
        return AUDITEVENT;
      if ("Basic".equals(codeString))
        return BASIC;
      if ("Binary".equals(codeString))
        return BINARY;
      if ("BiologicallyDerivedProduct".equals(codeString))
        return BIOLOGICALLYDERIVEDPRODUCT;
      if ("BodyStructure".equals(codeString))
        return BODYSTRUCTURE;
      if ("Bundle".equals(codeString))
        return BUNDLE;
      if ("CapabilityStatement".equals(codeString))
        return CAPABILITYSTATEMENT;
      if ("CarePlan".equals(codeString))
        return CAREPLAN;
      if ("CareTeam".equals(codeString))
        return CARETEAM;
      if ("CatalogEntry".equals(codeString))
        return CATALOGENTRY;
      if ("ChargeItem".equals(codeString))
        return CHARGEITEM;
      if ("ChargeItemDefinition".equals(codeString))
        return CHARGEITEMDEFINITION;
      if ("Claim".equals(codeString))
        return CLAIM;
      if ("ClaimResponse".equals(codeString))
        return CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return CLINICALIMPRESSION;
      if ("CodeSystem".equals(codeString))
        return CODESYSTEM;
      if ("Communication".equals(codeString))
        return COMMUNICATION;
      if ("CommunicationRequest".equals(codeString))
        return COMMUNICATIONREQUEST;
      if ("CompartmentDefinition".equals(codeString))
        return COMPARTMENTDEFINITION;
      if ("Composition".equals(codeString))
        return COMPOSITION;
      if ("ConceptMap".equals(codeString))
        return CONCEPTMAP;
      if ("Condition".equals(codeString))
        return CONDITION;
      if ("Consent".equals(codeString))
        return CONSENT;
      if ("Contract".equals(codeString))
        return CONTRACT;
      if ("Coverage".equals(codeString))
        return COVERAGE;
      if ("CoverageEligibilityRequest".equals(codeString))
        return COVERAGEELIGIBILITYREQUEST;
      if ("CoverageEligibilityResponse".equals(codeString))
        return COVERAGEELIGIBILITYRESPONSE;
      if ("DetectedIssue".equals(codeString))
        return DETECTEDISSUE;
      if ("Device".equals(codeString))
        return DEVICE;
      if ("DeviceDefinition".equals(codeString))
        return DEVICEDEFINITION;
      if ("DeviceMetric".equals(codeString))
        return DEVICEMETRIC;
      if ("DeviceRequest".equals(codeString))
        return DEVICEREQUEST;
      if ("DeviceUseStatement".equals(codeString))
        return DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return DOCUMENTREFERENCE;
      if ("DomainResource".equals(codeString))
        return DOMAINRESOURCE;
      if ("EffectEvidenceSynthesis".equals(codeString))
        return EFFECTEVIDENCESYNTHESIS;
      if ("Encounter".equals(codeString))
        return ENCOUNTER;
      if ("Endpoint".equals(codeString))
        return ENDPOINT;
      if ("EnrollmentRequest".equals(codeString))
        return ENROLLMENTREQUEST;
      if ("EnrollmentResponse".equals(codeString))
        return ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return EPISODEOFCARE;
      if ("EventDefinition".equals(codeString))
        return EVENTDEFINITION;
      if ("Evidence".equals(codeString))
        return EVIDENCE;
      if ("EvidenceVariable".equals(codeString))
        return EVIDENCEVARIABLE;
      if ("ExampleScenario".equals(codeString))
        return EXAMPLESCENARIO;
      if ("ExplanationOfBenefit".equals(codeString))
        return EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return FAMILYMEMBERHISTORY;
      if ("Flag".equals(codeString))
        return FLAG;
      if ("Goal".equals(codeString))
        return GOAL;
      if ("GraphDefinition".equals(codeString))
        return GRAPHDEFINITION;
      if ("Group".equals(codeString))
        return GROUP;
      if ("GuidanceResponse".equals(codeString))
        return GUIDANCERESPONSE;
      if ("HealthcareService".equals(codeString))
        return HEALTHCARESERVICE;
      if ("ImagingStudy".equals(codeString))
        return IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return IMMUNIZATION;
      if ("ImmunizationEvaluation".equals(codeString))
        return IMMUNIZATIONEVALUATION;
      if ("ImmunizationRecommendation".equals(codeString))
        return IMMUNIZATIONRECOMMENDATION;
      if ("ImplementationGuide".equals(codeString))
        return IMPLEMENTATIONGUIDE;
      if ("InsurancePlan".equals(codeString))
        return INSURANCEPLAN;
      if ("Invoice".equals(codeString))
        return INVOICE;
      if ("Library".equals(codeString))
        return LIBRARY;
      if ("Linkage".equals(codeString))
        return LINKAGE;
      if ("List".equals(codeString))
        return LIST;
      if ("Location".equals(codeString))
        return LOCATION;
      if ("Measure".equals(codeString))
        return MEASURE;
      if ("MeasureReport".equals(codeString))
        return MEASUREREPORT;
      if ("Media".equals(codeString))
        return MEDIA;
      if ("Medication".equals(codeString))
        return MEDICATION;
      if ("MedicationAdministration".equals(codeString))
        return MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return MEDICATIONDISPENSE;
      if ("MedicationKnowledge".equals(codeString))
        return MEDICATIONKNOWLEDGE;
      if ("MedicationRequest".equals(codeString))
        return MEDICATIONREQUEST;
      if ("MedicationStatement".equals(codeString))
        return MEDICATIONSTATEMENT;
      if ("MedicinalProduct".equals(codeString))
        return MEDICINALPRODUCT;
      if ("MedicinalProductAuthorization".equals(codeString))
        return MEDICINALPRODUCTAUTHORIZATION;
      if ("MedicinalProductContraindication".equals(codeString))
        return MEDICINALPRODUCTCONTRAINDICATION;
      if ("MedicinalProductIndication".equals(codeString))
        return MEDICINALPRODUCTINDICATION;
      if ("MedicinalProductIngredient".equals(codeString))
        return MEDICINALPRODUCTINGREDIENT;
      if ("MedicinalProductInteraction".equals(codeString))
        return MEDICINALPRODUCTINTERACTION;
      if ("MedicinalProductManufactured".equals(codeString))
        return MEDICINALPRODUCTMANUFACTURED;
      if ("MedicinalProductPackaged".equals(codeString))
        return MEDICINALPRODUCTPACKAGED;
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return MEDICINALPRODUCTPHARMACEUTICAL;
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return MEDICINALPRODUCTUNDESIRABLEEFFECT;
      if ("MessageDefinition".equals(codeString))
        return MESSAGEDEFINITION;
      if ("MessageHeader".equals(codeString))
        return MESSAGEHEADER;
      if ("MolecularSequence".equals(codeString))
        return MOLECULARSEQUENCE;
      if ("NamingSystem".equals(codeString))
        return NAMINGSYSTEM;
      if ("NutritionOrder".equals(codeString))
        return NUTRITIONORDER;
      if ("Observation".equals(codeString))
        return OBSERVATION;
      if ("ObservationDefinition".equals(codeString))
        return OBSERVATIONDEFINITION;
      if ("OperationDefinition".equals(codeString))
        return OPERATIONDEFINITION;
      if ("OperationOutcome".equals(codeString))
        return OPERATIONOUTCOME;
      if ("Organization".equals(codeString))
        return ORGANIZATION;
      if ("OrganizationAffiliation".equals(codeString))
        return ORGANIZATIONAFFILIATION;
      if ("Parameters".equals(codeString))
        return PARAMETERS;
      if ("Patient".equals(codeString))
        return PATIENT;
      if ("PaymentNotice".equals(codeString))
        return PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return PAYMENTRECONCILIATION;
      if ("Person".equals(codeString))
        return PERSON;
      if ("PlanDefinition".equals(codeString))
        return PLANDEFINITION;
      if ("Practitioner".equals(codeString))
        return PRACTITIONER;
      if ("PractitionerRole".equals(codeString))
        return PRACTITIONERROLE;
      if ("Procedure".equals(codeString))
        return PROCEDURE;
      if ("Provenance".equals(codeString))
        return PROVENANCE;
      if ("Questionnaire".equals(codeString))
        return QUESTIONNAIRE;
      if ("QuestionnaireResponse".equals(codeString))
        return QUESTIONNAIRERESPONSE;
      if ("RelatedPerson".equals(codeString))
        return RELATEDPERSON;
      if ("RequestGroup".equals(codeString))
        return REQUESTGROUP;
      if ("ResearchDefinition".equals(codeString))
        return RESEARCHDEFINITION;
      if ("ResearchElementDefinition".equals(codeString))
        return RESEARCHELEMENTDEFINITION;
      if ("ResearchStudy".equals(codeString))
        return RESEARCHSTUDY;
      if ("ResearchSubject".equals(codeString))
        return RESEARCHSUBJECT;
      if ("Resource".equals(codeString))
        return RESOURCE;
      if ("RiskAssessment".equals(codeString))
        return RISKASSESSMENT;
      if ("RiskEvidenceSynthesis".equals(codeString))
        return RISKEVIDENCESYNTHESIS;
      if ("Schedule".equals(codeString))
        return SCHEDULE;
      if ("SearchParameter".equals(codeString))
        return SEARCHPARAMETER;
      if ("ServiceRequest".equals(codeString))
        return SERVICEREQUEST;
      if ("Slot".equals(codeString))
        return SLOT;
      if ("Specimen".equals(codeString))
        return SPECIMEN;
      if ("SpecimenDefinition".equals(codeString))
        return SPECIMENDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return STRUCTUREMAP;
      if ("Subscription".equals(codeString))
        return SUBSCRIPTION;
      if ("Substance".equals(codeString))
        return SUBSTANCE;
      if ("SubstanceNucleicAcid".equals(codeString))
        return SUBSTANCENUCLEICACID;
      if ("SubstancePolymer".equals(codeString))
        return SUBSTANCEPOLYMER;
      if ("SubstanceProtein".equals(codeString))
        return SUBSTANCEPROTEIN;
      if ("SubstanceReferenceInformation".equals(codeString))
        return SUBSTANCEREFERENCEINFORMATION;
      if ("SubstanceSourceMaterial".equals(codeString))
        return SUBSTANCESOURCEMATERIAL;
      if ("SubstanceSpecification".equals(codeString))
        return SUBSTANCESPECIFICATION;
      if ("SupplyDelivery".equals(codeString))
        return SUPPLYDELIVERY;
      if ("SupplyRequest".equals(codeString))
        return SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return TASK;
      if ("TerminologyCapabilities".equals(codeString))
        return TERMINOLOGYCAPABILITIES;
      if ("TestReport".equals(codeString))
        return TESTREPORT;
      if ("TestScript".equals(codeString))
        return TESTSCRIPT;
      if ("ValueSet".equals(codeString))
        return VALUESET;
      if ("VerificationResult".equals(codeString))
        return VERIFICATIONRESULT;
      if ("VisionPrescription".equals(codeString))
        return VISIONPRESCRIPTION;
      if ("Type".equals(codeString))
        return TYPE;
      if ("Any".equals(codeString))
        return ANY;
      throw new FHIRException("Unknown FHIRAllTypes code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ADDRESS:
        return "Address";
      case AGE:
        return "Age";
      case ANNOTATION:
        return "Annotation";
      case ATTACHMENT:
        return "Attachment";
      case BACKBONEELEMENT:
        return "BackboneElement";
      case CODEABLECONCEPT:
        return "CodeableConcept";
      case CODING:
        return "Coding";
      case CONTACTDETAIL:
        return "ContactDetail";
      case CONTACTPOINT:
        return "ContactPoint";
      case CONTRIBUTOR:
        return "Contributor";
      case COUNT:
        return "Count";
      case DATAREQUIREMENT:
        return "DataRequirement";
      case DISTANCE:
        return "Distance";
      case DOSAGE:
        return "Dosage";
      case DURATION:
        return "Duration";
      case ELEMENT:
        return "Element";
      case ELEMENTDEFINITION:
        return "ElementDefinition";
      case EXPRESSION:
        return "Expression";
      case EXTENSION:
        return "Extension";
      case HUMANNAME:
        return "HumanName";
      case IDENTIFIER:
        return "Identifier";
      case MARKETINGSTATUS:
        return "MarketingStatus";
      case META:
        return "Meta";
      case MONEY:
        return "Money";
      case MONEYQUANTITY:
        return "MoneyQuantity";
      case NARRATIVE:
        return "Narrative";
      case PARAMETERDEFINITION:
        return "ParameterDefinition";
      case PERIOD:
        return "Period";
      case POPULATION:
        return "Population";
      case PRODCHARACTERISTIC:
        return "ProdCharacteristic";
      case PRODUCTSHELFLIFE:
        return "ProductShelfLife";
      case QUANTITY:
        return "Quantity";
      case RANGE:
        return "Range";
      case RATIO:
        return "Ratio";
      case REFERENCE:
        return "Reference";
      case RELATEDARTIFACT:
        return "RelatedArtifact";
      case SAMPLEDDATA:
        return "SampledData";
      case SIGNATURE:
        return "Signature";
      case SIMPLEQUANTITY:
        return "SimpleQuantity";
      case SUBSTANCEAMOUNT:
        return "SubstanceAmount";
      case TIMING:
        return "Timing";
      case TRIGGERDEFINITION:
        return "TriggerDefinition";
      case USAGECONTEXT:
        return "UsageContext";
      case BASE64BINARY:
        return "base64Binary";
      case BOOLEAN:
        return "boolean";
      case CANONICAL:
        return "canonical";
      case CODE:
        return "code";
      case DATE:
        return "date";
      case DATETIME:
        return "dateTime";
      case DECIMAL:
        return "decimal";
      case ID:
        return "id";
      case INSTANT:
        return "instant";
      case INTEGER:
        return "integer";
      case MARKDOWN:
        return "markdown";
      case OID:
        return "oid";
      case POSITIVEINT:
        return "positiveInt";
      case STRING:
        return "string";
      case TIME:
        return "time";
      case UNSIGNEDINT:
        return "unsignedInt";
      case URI:
        return "uri";
      case URL:
        return "url";
      case UUID:
        return "uuid";
      case XHTML:
        return "xhtml";
      case ACCOUNT:
        return "Account";
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case ADVERSEEVENT:
        return "AdverseEvent";
      case ALLERGYINTOLERANCE:
        return "AllergyIntolerance";
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case AUDITEVENT:
        return "AuditEvent";
      case BASIC:
        return "Basic";
      case BINARY:
        return "Binary";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "BiologicallyDerivedProduct";
      case BODYSTRUCTURE:
        return "BodyStructure";
      case BUNDLE:
        return "Bundle";
      case CAPABILITYSTATEMENT:
        return "CapabilityStatement";
      case CAREPLAN:
        return "CarePlan";
      case CARETEAM:
        return "CareTeam";
      case CATALOGENTRY:
        return "CatalogEntry";
      case CHARGEITEM:
        return "ChargeItem";
      case CHARGEITEMDEFINITION:
        return "ChargeItemDefinition";
      case CLAIM:
        return "Claim";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case CODESYSTEM:
        return "CodeSystem";
      case COMMUNICATION:
        return "Communication";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case COMPARTMENTDEFINITION:
        return "CompartmentDefinition";
      case COMPOSITION:
        return "Composition";
      case CONCEPTMAP:
        return "ConceptMap";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case CONTRACT:
        return "Contract";
      case COVERAGE:
        return "Coverage";
      case COVERAGEELIGIBILITYREQUEST:
        return "CoverageEligibilityRequest";
      case COVERAGEELIGIBILITYRESPONSE:
        return "CoverageEligibilityResponse";
      case DETECTEDISSUE:
        return "DetectedIssue";
      case DEVICE:
        return "Device";
      case DEVICEDEFINITION:
        return "DeviceDefinition";
      case DEVICEMETRIC:
        return "DeviceMetric";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case DOMAINRESOURCE:
        return "DomainResource";
      case EFFECTEVIDENCESYNTHESIS:
        return "EffectEvidenceSynthesis";
      case ENCOUNTER:
        return "Encounter";
      case ENDPOINT:
        return "Endpoint";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EVENTDEFINITION:
        return "EventDefinition";
      case EVIDENCE:
        return "Evidence";
      case EVIDENCEVARIABLE:
        return "EvidenceVariable";
      case EXAMPLESCENARIO:
        return "ExampleScenario";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case FLAG:
        return "Flag";
      case GOAL:
        return "Goal";
      case GRAPHDEFINITION:
        return "GraphDefinition";
      case GROUP:
        return "Group";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case HEALTHCARESERVICE:
        return "HealthcareService";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case IMMUNIZATIONEVALUATION:
        return "ImmunizationEvaluation";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case IMPLEMENTATIONGUIDE:
        return "ImplementationGuide";
      case INSURANCEPLAN:
        return "InsurancePlan";
      case INVOICE:
        return "Invoice";
      case LIBRARY:
        return "Library";
      case LINKAGE:
        return "Linkage";
      case LIST:
        return "List";
      case LOCATION:
        return "Location";
      case MEASURE:
        return "Measure";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATION:
        return "Medication";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONKNOWLEDGE:
        return "MedicationKnowledge";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case MEDICINALPRODUCT:
        return "MedicinalProduct";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "MedicinalProductAuthorization";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "MedicinalProductContraindication";
      case MEDICINALPRODUCTINDICATION:
        return "MedicinalProductIndication";
      case MEDICINALPRODUCTINGREDIENT:
        return "MedicinalProductIngredient";
      case MEDICINALPRODUCTINTERACTION:
        return "MedicinalProductInteraction";
      case MEDICINALPRODUCTMANUFACTURED:
        return "MedicinalProductManufactured";
      case MEDICINALPRODUCTPACKAGED:
        return "MedicinalProductPackaged";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "MedicinalProductPharmaceutical";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "MedicinalProductUndesirableEffect";
      case MESSAGEDEFINITION:
        return "MessageDefinition";
      case MESSAGEHEADER:
        return "MessageHeader";
      case MOLECULARSEQUENCE:
        return "MolecularSequence";
      case NAMINGSYSTEM:
        return "NamingSystem";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case OBSERVATION:
        return "Observation";
      case OBSERVATIONDEFINITION:
        return "ObservationDefinition";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case OPERATIONOUTCOME:
        return "OperationOutcome";
      case ORGANIZATION:
        return "Organization";
      case ORGANIZATIONAFFILIATION:
        return "OrganizationAffiliation";
      case PARAMETERS:
        return "Parameters";
      case PATIENT:
        return "Patient";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PERSON:
        return "Person";
      case PLANDEFINITION:
        return "PlanDefinition";
      case PRACTITIONER:
        return "Practitioner";
      case PRACTITIONERROLE:
        return "PractitionerRole";
      case PROCEDURE:
        return "Procedure";
      case PROVENANCE:
        return "Provenance";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RELATEDPERSON:
        return "RelatedPerson";
      case REQUESTGROUP:
        return "RequestGroup";
      case RESEARCHDEFINITION:
        return "ResearchDefinition";
      case RESEARCHELEMENTDEFINITION:
        return "ResearchElementDefinition";
      case RESEARCHSTUDY:
        return "ResearchStudy";
      case RESEARCHSUBJECT:
        return "ResearchSubject";
      case RESOURCE:
        return "Resource";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case RISKEVIDENCESYNTHESIS:
        return "RiskEvidenceSynthesis";
      case SCHEDULE:
        return "Schedule";
      case SEARCHPARAMETER:
        return "SearchParameter";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SLOT:
        return "Slot";
      case SPECIMEN:
        return "Specimen";
      case SPECIMENDEFINITION:
        return "SpecimenDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case SUBSCRIPTION:
        return "Subscription";
      case SUBSTANCE:
        return "Substance";
      case SUBSTANCENUCLEICACID:
        return "SubstanceNucleicAcid";
      case SUBSTANCEPOLYMER:
        return "SubstancePolymer";
      case SUBSTANCEPROTEIN:
        return "SubstanceProtein";
      case SUBSTANCEREFERENCEINFORMATION:
        return "SubstanceReferenceInformation";
      case SUBSTANCESOURCEMATERIAL:
        return "SubstanceSourceMaterial";
      case SUBSTANCESPECIFICATION:
        return "SubstanceSpecification";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case TERMINOLOGYCAPABILITIES:
        return "TerminologyCapabilities";
      case TESTREPORT:
        return "TestReport";
      case TESTSCRIPT:
        return "TestScript";
      case VALUESET:
        return "ValueSet";
      case VERIFICATIONRESULT:
        return "VerificationResult";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case TYPE:
        return "Type";
      case ANY:
        return "Any";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ADDRESS:
        return "http://hl7.org/fhir/data-types";
      case AGE:
        return "http://hl7.org/fhir/data-types";
      case ANNOTATION:
        return "http://hl7.org/fhir/data-types";
      case ATTACHMENT:
        return "http://hl7.org/fhir/data-types";
      case BACKBONEELEMENT:
        return "http://hl7.org/fhir/data-types";
      case CODEABLECONCEPT:
        return "http://hl7.org/fhir/data-types";
      case CODING:
        return "http://hl7.org/fhir/data-types";
      case CONTACTDETAIL:
        return "http://hl7.org/fhir/data-types";
      case CONTACTPOINT:
        return "http://hl7.org/fhir/data-types";
      case CONTRIBUTOR:
        return "http://hl7.org/fhir/data-types";
      case COUNT:
        return "http://hl7.org/fhir/data-types";
      case DATAREQUIREMENT:
        return "http://hl7.org/fhir/data-types";
      case DISTANCE:
        return "http://hl7.org/fhir/data-types";
      case DOSAGE:
        return "http://hl7.org/fhir/data-types";
      case DURATION:
        return "http://hl7.org/fhir/data-types";
      case ELEMENT:
        return "http://hl7.org/fhir/data-types";
      case ELEMENTDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case EXPRESSION:
        return "http://hl7.org/fhir/data-types";
      case EXTENSION:
        return "http://hl7.org/fhir/data-types";
      case HUMANNAME:
        return "http://hl7.org/fhir/data-types";
      case IDENTIFIER:
        return "http://hl7.org/fhir/data-types";
      case MARKETINGSTATUS:
        return "http://hl7.org/fhir/data-types";
      case META:
        return "http://hl7.org/fhir/data-types";
      case MONEY:
        return "http://hl7.org/fhir/data-types";
      case MONEYQUANTITY:
        return "http://hl7.org/fhir/data-types";
      case NARRATIVE:
        return "http://hl7.org/fhir/data-types";
      case PARAMETERDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case PERIOD:
        return "http://hl7.org/fhir/data-types";
      case POPULATION:
        return "http://hl7.org/fhir/data-types";
      case PRODCHARACTERISTIC:
        return "http://hl7.org/fhir/data-types";
      case PRODUCTSHELFLIFE:
        return "http://hl7.org/fhir/data-types";
      case QUANTITY:
        return "http://hl7.org/fhir/data-types";
      case RANGE:
        return "http://hl7.org/fhir/data-types";
      case RATIO:
        return "http://hl7.org/fhir/data-types";
      case REFERENCE:
        return "http://hl7.org/fhir/data-types";
      case RELATEDARTIFACT:
        return "http://hl7.org/fhir/data-types";
      case SAMPLEDDATA:
        return "http://hl7.org/fhir/data-types";
      case SIGNATURE:
        return "http://hl7.org/fhir/data-types";
      case SIMPLEQUANTITY:
        return "http://hl7.org/fhir/data-types";
      case SUBSTANCEAMOUNT:
        return "http://hl7.org/fhir/data-types";
      case TIMING:
        return "http://hl7.org/fhir/data-types";
      case TRIGGERDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case USAGECONTEXT:
        return "http://hl7.org/fhir/data-types";
      case BASE64BINARY:
        return "http://hl7.org/fhir/data-types";
      case BOOLEAN:
        return "http://hl7.org/fhir/data-types";
      case CANONICAL:
        return "http://hl7.org/fhir/data-types";
      case CODE:
        return "http://hl7.org/fhir/data-types";
      case DATE:
        return "http://hl7.org/fhir/data-types";
      case DATETIME:
        return "http://hl7.org/fhir/data-types";
      case DECIMAL:
        return "http://hl7.org/fhir/data-types";
      case ID:
        return "http://hl7.org/fhir/data-types";
      case INSTANT:
        return "http://hl7.org/fhir/data-types";
      case INTEGER:
        return "http://hl7.org/fhir/data-types";
      case MARKDOWN:
        return "http://hl7.org/fhir/data-types";
      case OID:
        return "http://hl7.org/fhir/data-types";
      case POSITIVEINT:
        return "http://hl7.org/fhir/data-types";
      case STRING:
        return "http://hl7.org/fhir/data-types";
      case TIME:
        return "http://hl7.org/fhir/data-types";
      case UNSIGNEDINT:
        return "http://hl7.org/fhir/data-types";
      case URI:
        return "http://hl7.org/fhir/data-types";
      case URL:
        return "http://hl7.org/fhir/data-types";
      case UUID:
        return "http://hl7.org/fhir/data-types";
      case XHTML:
        return "http://hl7.org/fhir/data-types";
      case ACCOUNT:
        return "http://hl7.org/fhir/resource-types";
      case ACTIVITYDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case ADVERSEEVENT:
        return "http://hl7.org/fhir/resource-types";
      case ALLERGYINTOLERANCE:
        return "http://hl7.org/fhir/resource-types";
      case APPOINTMENT:
        return "http://hl7.org/fhir/resource-types";
      case APPOINTMENTRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case AUDITEVENT:
        return "http://hl7.org/fhir/resource-types";
      case BASIC:
        return "http://hl7.org/fhir/resource-types";
      case BINARY:
        return "http://hl7.org/fhir/resource-types";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "http://hl7.org/fhir/resource-types";
      case BODYSTRUCTURE:
        return "http://hl7.org/fhir/resource-types";
      case BUNDLE:
        return "http://hl7.org/fhir/resource-types";
      case CAPABILITYSTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case CAREPLAN:
        return "http://hl7.org/fhir/resource-types";
      case CARETEAM:
        return "http://hl7.org/fhir/resource-types";
      case CATALOGENTRY:
        return "http://hl7.org/fhir/resource-types";
      case CHARGEITEM:
        return "http://hl7.org/fhir/resource-types";
      case CHARGEITEMDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case CLAIM:
        return "http://hl7.org/fhir/resource-types";
      case CLAIMRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case CLINICALIMPRESSION:
        return "http://hl7.org/fhir/resource-types";
      case CODESYSTEM:
        return "http://hl7.org/fhir/resource-types";
      case COMMUNICATION:
        return "http://hl7.org/fhir/resource-types";
      case COMMUNICATIONREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case COMPARTMENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case COMPOSITION:
        return "http://hl7.org/fhir/resource-types";
      case CONCEPTMAP:
        return "http://hl7.org/fhir/resource-types";
      case CONDITION:
        return "http://hl7.org/fhir/resource-types";
      case CONSENT:
        return "http://hl7.org/fhir/resource-types";
      case CONTRACT:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGE:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGEELIGIBILITYREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGEELIGIBILITYRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case DETECTEDISSUE:
        return "http://hl7.org/fhir/resource-types";
      case DEVICE:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEMETRIC:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEUSESTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case DIAGNOSTICREPORT:
        return "http://hl7.org/fhir/resource-types";
      case DOCUMENTMANIFEST:
        return "http://hl7.org/fhir/resource-types";
      case DOCUMENTREFERENCE:
        return "http://hl7.org/fhir/resource-types";
      case DOMAINRESOURCE:
        return "http://hl7.org/fhir/resource-types";
      case EFFECTEVIDENCESYNTHESIS:
        return "http://hl7.org/fhir/resource-types";
      case ENCOUNTER:
        return "http://hl7.org/fhir/resource-types";
      case ENDPOINT:
        return "http://hl7.org/fhir/resource-types";
      case ENROLLMENTREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case ENROLLMENTRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case EPISODEOFCARE:
        return "http://hl7.org/fhir/resource-types";
      case EVENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case EVIDENCE:
        return "http://hl7.org/fhir/resource-types";
      case EVIDENCEVARIABLE:
        return "http://hl7.org/fhir/resource-types";
      case EXAMPLESCENARIO:
        return "http://hl7.org/fhir/resource-types";
      case EXPLANATIONOFBENEFIT:
        return "http://hl7.org/fhir/resource-types";
      case FAMILYMEMBERHISTORY:
        return "http://hl7.org/fhir/resource-types";
      case FLAG:
        return "http://hl7.org/fhir/resource-types";
      case GOAL:
        return "http://hl7.org/fhir/resource-types";
      case GRAPHDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case GROUP:
        return "http://hl7.org/fhir/resource-types";
      case GUIDANCERESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case HEALTHCARESERVICE:
        return "http://hl7.org/fhir/resource-types";
      case IMAGINGSTUDY:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATION:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATIONEVALUATION:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATIONRECOMMENDATION:
        return "http://hl7.org/fhir/resource-types";
      case IMPLEMENTATIONGUIDE:
        return "http://hl7.org/fhir/resource-types";
      case INSURANCEPLAN:
        return "http://hl7.org/fhir/resource-types";
      case INVOICE:
        return "http://hl7.org/fhir/resource-types";
      case LIBRARY:
        return "http://hl7.org/fhir/resource-types";
      case LINKAGE:
        return "http://hl7.org/fhir/resource-types";
      case LIST:
        return "http://hl7.org/fhir/resource-types";
      case LOCATION:
        return "http://hl7.org/fhir/resource-types";
      case MEASURE:
        return "http://hl7.org/fhir/resource-types";
      case MEASUREREPORT:
        return "http://hl7.org/fhir/resource-types";
      case MEDIA:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONADMINISTRATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONDISPENSE:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONKNOWLEDGE:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONSTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINGREDIENT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINTERACTION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTMANUFACTURED:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTPACKAGED:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "http://hl7.org/fhir/resource-types";
      case MESSAGEDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case MESSAGEHEADER:
        return "http://hl7.org/fhir/resource-types";
      case MOLECULARSEQUENCE:
        return "http://hl7.org/fhir/resource-types";
      case NAMINGSYSTEM:
        return "http://hl7.org/fhir/resource-types";
      case NUTRITIONORDER:
        return "http://hl7.org/fhir/resource-types";
      case OBSERVATION:
        return "http://hl7.org/fhir/resource-types";
      case OBSERVATIONDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case OPERATIONDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case OPERATIONOUTCOME:
        return "http://hl7.org/fhir/resource-types";
      case ORGANIZATION:
        return "http://hl7.org/fhir/resource-types";
      case ORGANIZATIONAFFILIATION:
        return "http://hl7.org/fhir/resource-types";
      case PARAMETERS:
        return "http://hl7.org/fhir/resource-types";
      case PATIENT:
        return "http://hl7.org/fhir/resource-types";
      case PAYMENTNOTICE:
        return "http://hl7.org/fhir/resource-types";
      case PAYMENTRECONCILIATION:
        return "http://hl7.org/fhir/resource-types";
      case PERSON:
        return "http://hl7.org/fhir/resource-types";
      case PLANDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case PRACTITIONER:
        return "http://hl7.org/fhir/resource-types";
      case PRACTITIONERROLE:
        return "http://hl7.org/fhir/resource-types";
      case PROCEDURE:
        return "http://hl7.org/fhir/resource-types";
      case PROVENANCE:
        return "http://hl7.org/fhir/resource-types";
      case QUESTIONNAIRE:
        return "http://hl7.org/fhir/resource-types";
      case QUESTIONNAIRERESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case RELATEDPERSON:
        return "http://hl7.org/fhir/resource-types";
      case REQUESTGROUP:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHELEMENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHSTUDY:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHSUBJECT:
        return "http://hl7.org/fhir/resource-types";
      case RESOURCE:
        return "http://hl7.org/fhir/resource-types";
      case RISKASSESSMENT:
        return "http://hl7.org/fhir/resource-types";
      case RISKEVIDENCESYNTHESIS:
        return "http://hl7.org/fhir/resource-types";
      case SCHEDULE:
        return "http://hl7.org/fhir/resource-types";
      case SEARCHPARAMETER:
        return "http://hl7.org/fhir/resource-types";
      case SERVICEREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case SLOT:
        return "http://hl7.org/fhir/resource-types";
      case SPECIMEN:
        return "http://hl7.org/fhir/resource-types";
      case SPECIMENDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case STRUCTUREDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case STRUCTUREMAP:
        return "http://hl7.org/fhir/resource-types";
      case SUBSCRIPTION:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCE:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCENUCLEICACID:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEPOLYMER:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEPROTEIN:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEREFERENCEINFORMATION:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCESOURCEMATERIAL:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCESPECIFICATION:
        return "http://hl7.org/fhir/resource-types";
      case SUPPLYDELIVERY:
        return "http://hl7.org/fhir/resource-types";
      case SUPPLYREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case TASK:
        return "http://hl7.org/fhir/resource-types";
      case TERMINOLOGYCAPABILITIES:
        return "http://hl7.org/fhir/resource-types";
      case TESTREPORT:
        return "http://hl7.org/fhir/resource-types";
      case TESTSCRIPT:
        return "http://hl7.org/fhir/resource-types";
      case VALUESET:
        return "http://hl7.org/fhir/resource-types";
      case VERIFICATIONRESULT:
        return "http://hl7.org/fhir/resource-types";
      case VISIONPRESCRIPTION:
        return "http://hl7.org/fhir/resource-types";
      case TYPE:
        return "http://hl7.org/fhir/abstract-types";
      case ANY:
        return "http://hl7.org/fhir/abstract-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ADDRESS:
        return "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.";
      case AGE:
        return "A duration of time during which an organism (or a process) has existed.";
      case ANNOTATION:
        return "A  text note which also  contains information about who made the statement and when.";
      case ATTACHMENT:
        return "For referring to data content defined in other formats.";
      case BACKBONEELEMENT:
        return "Base definition for all elements that are defined inside a resource - but not those in a data type.";
      case CODEABLECONCEPT:
        return "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.";
      case CODING:
        return "A reference to a code defined by a terminology system.";
      case CONTACTDETAIL:
        return "Specifies contact information for a person or organization.";
      case CONTACTPOINT:
        return "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.";
      case CONTRIBUTOR:
        return "A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.";
      case COUNT:
        return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
      case DATAREQUIREMENT:
        return "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.";
      case DISTANCE:
        return "A length - a value with a unit that is a physical distance.";
      case DOSAGE:
        return "Indicates how the medication is/was taken or should be taken by the patient.";
      case DURATION:
        return "A length of time.";
      case ELEMENT:
        return "Base definition for all elements in a resource.";
      case ELEMENTDEFINITION:
        return "Captures constraints on each element within the resource, profile, or extension.";
      case EXPRESSION:
        return "A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.";
      case EXTENSION:
        return "Optional Extension Element - found in all resources.";
      case HUMANNAME:
        return "A human's name with the ability to identify parts and usage.";
      case IDENTIFIER:
        return "An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.";
      case MARKETINGSTATUS:
        return "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.";
      case META:
        return "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.";
      case MONEY:
        return "An amount of economic utility in some recognized currency.";
      case MONEYQUANTITY:
        return "";
      case NARRATIVE:
        return "A human-readable summary of the resource conveying the essential clinical and business information for the resource.";
      case PARAMETERDEFINITION:
        return "The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.";
      case PERIOD:
        return "A time period defined by a start and end date and optionally time.";
      case POPULATION:
        return "A populatioof people with some set of grouping criteria.";
      case PRODCHARACTERISTIC:
        return "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.";
      case PRODUCTSHELFLIFE:
        return "The shelf-life and storage information for a medicinal product item or container can be described using this class.";
      case QUANTITY:
        return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
      case RANGE:
        return "A set of ordered Quantities defined by a low and high limit.";
      case RATIO:
        return "A relationship of two Quantity values - expressed as a numerator and a denominator.";
      case REFERENCE:
        return "A reference from one resource to another.";
      case RELATEDARTIFACT:
        return "Related artifacts such as additional documentation, justification, or bibliographic references.";
      case SAMPLEDDATA:
        return "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.";
      case SIGNATURE:
        return "A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.";
      case SIMPLEQUANTITY:
        return "";
      case SUBSTANCEAMOUNT:
        return "Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.";
      case TIMING:
        return "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.";
      case TRIGGERDEFINITION:
        return "A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.";
      case USAGECONTEXT:
        return "Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).";
      case BASE64BINARY:
        return "A stream of bytes";
      case BOOLEAN:
        return "Value of \"true\" or \"false\"";
      case CANONICAL:
        return "A URI that is a reference to a canonical URL on a FHIR resource";
      case CODE:
        return "A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents";
      case DATE:
        return "A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.";
      case DATETIME:
        return "A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.";
      case DECIMAL:
        return "A rational number with implicit precision";
      case ID:
        return "Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.";
      case INSTANT:
        return "An instant in time - known at least to the second";
      case INTEGER:
        return "A whole number";
      case MARKDOWN:
        return "A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine";
      case OID:
        return "An OID represented as a URI";
      case POSITIVEINT:
        return "An integer with a value that is positive (e.g. >0)";
      case STRING:
        return "A sequence of Unicode characters";
      case TIME:
        return "A time during the day, with no date specified";
      case UNSIGNEDINT:
        return "An integer with a value that is not negative (e.g. >= 0)";
      case URI:
        return "String of characters used to identify a name or a resource";
      case URL:
        return "A URI that is a literal reference";
      case UUID:
        return "A UUID, represented as a URI";
      case XHTML:
        return "XHTML format, as defined by W3C, but restricted usage (mainly, no active content)";
      case ACCOUNT:
        return "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.";
      case ACTIVITYDEFINITION:
        return "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.";
      case ADVERSEEVENT:
        return "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.";
      case ALLERGYINTOLERANCE:
        return "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.";
      case APPOINTMENT:
        return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
      case APPOINTMENTRESPONSE:
        return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
      case AUDITEVENT:
        return "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.";
      case BASIC:
        return "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.";
      case BINARY:
        return "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity.";
      case BODYSTRUCTURE:
        return "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.";
      case BUNDLE:
        return "A container for a collection of resources.";
      case CAPABILITYSTATEMENT:
        return "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
      case CAREPLAN:
        return "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.";
      case CARETEAM:
        return "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.";
      case CATALOGENTRY:
        return "Catalog entries are wrappers that contextualize items included in a catalog.";
      case CHARGEITEM:
        return "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.";
      case CHARGEITEMDEFINITION:
        return "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.";
      case CLAIM:
        return "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.";
      case CLAIMRESPONSE:
        return "This resource provides the adjudication details from the processing of a Claim resource.";
      case CLINICALIMPRESSION:
        return "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score.";
      case CODESYSTEM:
        return "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.";
      case COMMUNICATION:
        return "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.";
      case COMMUNICATIONREQUEST:
        return "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.";
      case COMPARTMENTDEFINITION:
        return "A compartment definition that defines how resources are accessed on a server.";
      case COMPOSITION:
        return "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).";
      case CONCEPTMAP:
        return "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.";
      case CONDITION:
        return "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.";
      case CONSENT:
        return "A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.";
      case CONTRACT:
        return "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.";
      case COVERAGE:
        return "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.";
      case COVERAGEELIGIBILITYREQUEST:
        return "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.";
      case COVERAGEELIGIBILITYRESPONSE:
        return "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.";
      case DETECTEDISSUE:
        return "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.";
      case DEVICE:
        return "A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.";
      case DEVICEDEFINITION:
        return "The characteristics, operational status and capabilities of a medical-related component of a medical device.";
      case DEVICEMETRIC:
        return "Describes a measurement, calculation or setting capability of a medical device.";
      case DEVICEREQUEST:
        return "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.";
      case DEVICEUSESTATEMENT:
        return "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.";
      case DIAGNOSTICREPORT:
        return "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.";
      case DOCUMENTMANIFEST:
        return "A collection of documents compiled for a purpose together with metadata that applies to the collection.";
      case DOCUMENTREFERENCE:
        return "A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.";
      case DOMAINRESOURCE:
        return "A resource that includes narrative, extensions, and contained resources.";
      case EFFECTEVIDENCESYNTHESIS:
        return "The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.";
      case ENCOUNTER:
        return "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.";
      case ENDPOINT:
        return "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.";
      case ENROLLMENTREQUEST:
        return "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.";
      case ENROLLMENTRESPONSE:
        return "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.";
      case EPISODEOFCARE:
        return "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.";
      case EVENTDEFINITION:
        return "The EventDefinition resource provides a reusable description of when a particular event can occur.";
      case EVIDENCE:
        return "The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.";
      case EVIDENCEVARIABLE:
        return "The EvidenceVariable resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.";
      case EXAMPLESCENARIO:
        return "Example of workflow instance.";
      case EXPLANATIONOFBENEFIT:
        return "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.";
      case FAMILYMEMBERHISTORY:
        return "Significant health conditions for a person related to the patient relevant in the context of care for the patient.";
      case FLAG:
        return "Prospective warnings of potential issues when providing care to the patient.";
      case GOAL:
        return "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.";
      case GRAPHDEFINITION:
        return "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.";
      case GROUP:
        return "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.";
      case GUIDANCERESPONSE:
        return "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.";
      case HEALTHCARESERVICE:
        return "The details of a healthcare service available at a location.";
      case IMAGINGSTUDY:
        return "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.";
      case IMMUNIZATION:
        return "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.";
      case IMMUNIZATIONEVALUATION:
        return "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations.";
      case IMMUNIZATIONRECOMMENDATION:
        return "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.";
      case IMPLEMENTATIONGUIDE:
        return "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.";
      case INSURANCEPLAN:
        return "Details of a Health Insurance product/plan provided by an organization.";
      case INVOICE:
        return "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.";
      case LIBRARY:
        return "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.";
      case LINKAGE:
        return "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\".";
      case LIST:
        return "A list is a curated collection of resources.";
      case LOCATION:
        return "Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.";
      case MEASURE:
        return "The Measure resource provides the definition of a quality measure.";
      case MEASUREREPORT:
        return "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.";
      case MEDIA:
        return "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.";
      case MEDICATION:
        return "This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.";
      case MEDICATIONADMINISTRATION:
        return "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.";
      case MEDICATIONDISPENSE:
        return "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.";
      case MEDICATIONKNOWLEDGE:
        return "Information about a medication that is used to support knowledge.";
      case MEDICATIONREQUEST:
        return "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.";
      case MEDICATIONSTATEMENT:
        return "A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. \n\nThe primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.";
      case MEDICINALPRODUCT:
        return "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "The regulatory authorization of a medicinal product.";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.";
      case MEDICINALPRODUCTINDICATION:
        return "Indication for the Medicinal Product.";
      case MEDICINALPRODUCTINGREDIENT:
        return "An ingredient of a manufactured item or pharmaceutical product.";
      case MEDICINALPRODUCTINTERACTION:
        return "The interactions of the medicinal product with other medicinal products, or other forms of interactions.";
      case MEDICINALPRODUCTMANUFACTURED:
        return "The manufactured item as contained in the packaged medicinal product.";
      case MEDICINALPRODUCTPACKAGED:
        return "A medicinal product in a container or package.";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "A pharmaceutical product described in terms of its composition and dose form.";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "Describe the undesirable effects of the medicinal product.";
      case MESSAGEDEFINITION:
        return "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.";
      case MESSAGEHEADER:
        return "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.";
      case MOLECULARSEQUENCE:
        return "Raw data describing a biological sequence.";
      case NAMINGSYSTEM:
        return "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.";
      case NUTRITIONORDER:
        return "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.";
      case OBSERVATION:
        return "Measurements and simple assertions made about a patient, device or other subject.";
      case OBSERVATIONDEFINITION:
        return "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.";
      case OPERATIONDEFINITION:
        return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
      case OPERATIONOUTCOME:
        return "A collection of error, warning, or information messages that result from a system action.";
      case ORGANIZATION:
        return "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.";
      case ORGANIZATIONAFFILIATION:
        return "Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.";
      case PARAMETERS:
        return "This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.";
      case PATIENT:
        return "Demographics and other administrative information about an individual or animal receiving care or other health-related services.";
      case PAYMENTNOTICE:
        return "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.";
      case PAYMENTRECONCILIATION:
        return "This resource provides the details including amount of a payment and allocates the payment items being paid.";
      case PERSON:
        return "Demographics and administrative information about a person independent of a specific health-related context.";
      case PLANDEFINITION:
        return "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.";
      case PRACTITIONER:
        return "A person who is directly or indirectly involved in the provisioning of healthcare.";
      case PRACTITIONERROLE:
        return "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.";
      case PROCEDURE:
        return "An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.";
      case PROVENANCE:
        return "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.";
      case QUESTIONNAIRE:
        return "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.";
      case QUESTIONNAIRERESPONSE:
        return "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.";
      case RELATEDPERSON:
        return "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.";
      case REQUESTGROUP:
        return "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".";
      case RESEARCHDEFINITION:
        return "The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.";
      case RESEARCHELEMENTDEFINITION:
        return "The ResearchElementDefinition resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.";
      case RESEARCHSTUDY:
        return "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.";
      case RESEARCHSUBJECT:
        return "A physical entity which is the primary unit of operational and/or administrative interest in a study.";
      case RESOURCE:
        return "This is the base resource type for everything.";
      case RISKASSESSMENT:
        return "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.";
      case RISKEVIDENCESYNTHESIS:
        return "The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.";
      case SCHEDULE:
        return "A container for slots of time that may be available for booking appointments.";
      case SEARCHPARAMETER:
        return "A search parameter that defines a named search item that can be used to search/filter on a resource.";
      case SERVICEREQUEST:
        return "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.";
      case SLOT:
        return "A slot of time on a schedule that may be available for booking appointments.";
      case SPECIMEN:
        return "A sample to be used for analysis.";
      case SPECIMENDEFINITION:
        return "A kind of specimen with associated set of requirements.";
      case STRUCTUREDEFINITION:
        return "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.";
      case STRUCTUREMAP:
        return "A Map of relationships between 2 structures that can be used to transform data.";
      case SUBSCRIPTION:
        return "The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system can take an appropriate action.";
      case SUBSTANCE:
        return "A homogeneous material with a definite composition.";
      case SUBSTANCENUCLEICACID:
        return "Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.";
      case SUBSTANCEPOLYMER:
        return "Todo.";
      case SUBSTANCEPROTEIN:
        return "A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.";
      case SUBSTANCEREFERENCEINFORMATION:
        return "Todo.";
      case SUBSTANCESOURCEMATERIAL:
        return "Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.";
      case SUBSTANCESPECIFICATION:
        return "The detailed description of a substance, typically at a level beyond what is used for prescribing.";
      case SUPPLYDELIVERY:
        return "Record of delivery of what is supplied.";
      case SUPPLYREQUEST:
        return "A record of a request for a medication, substance or device used in the healthcare setting.";
      case TASK:
        return "A task to be performed.";
      case TERMINOLOGYCAPABILITIES:
        return "A Terminology Capabilities documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
      case TESTREPORT:
        return "A summary of information based on the results of executing a TestScript.";
      case TESTSCRIPT:
        return "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.";
      case VALUESET:
        return "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).";
      case VERIFICATIONRESULT:
        return "Describes validation requirements, source(s), status and dates for one or more elements.";
      case VISIONPRESCRIPTION:
        return "An authorization for the provision of glasses and/or contact lenses to a patient.";
      case TYPE:
        return "A place holder that means any kind of data type";
      case ANY:
        return "A place holder that means any kind of resource";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ADDRESS:
        return "Address";
      case AGE:
        return "Age";
      case ANNOTATION:
        return "Annotation";
      case ATTACHMENT:
        return "Attachment";
      case BACKBONEELEMENT:
        return "BackboneElement";
      case CODEABLECONCEPT:
        return "CodeableConcept";
      case CODING:
        return "Coding";
      case CONTACTDETAIL:
        return "ContactDetail";
      case CONTACTPOINT:
        return "ContactPoint";
      case CONTRIBUTOR:
        return "Contributor";
      case COUNT:
        return "Count";
      case DATAREQUIREMENT:
        return "DataRequirement";
      case DISTANCE:
        return "Distance";
      case DOSAGE:
        return "Dosage";
      case DURATION:
        return "Duration";
      case ELEMENT:
        return "Element";
      case ELEMENTDEFINITION:
        return "ElementDefinition";
      case EXPRESSION:
        return "Expression";
      case EXTENSION:
        return "Extension";
      case HUMANNAME:
        return "HumanName";
      case IDENTIFIER:
        return "Identifier";
      case MARKETINGSTATUS:
        return "MarketingStatus";
      case META:
        return "Meta";
      case MONEY:
        return "Money";
      case MONEYQUANTITY:
        return "MoneyQuantity";
      case NARRATIVE:
        return "Narrative";
      case PARAMETERDEFINITION:
        return "ParameterDefinition";
      case PERIOD:
        return "Period";
      case POPULATION:
        return "Population";
      case PRODCHARACTERISTIC:
        return "ProdCharacteristic";
      case PRODUCTSHELFLIFE:
        return "ProductShelfLife";
      case QUANTITY:
        return "Quantity";
      case RANGE:
        return "Range";
      case RATIO:
        return "Ratio";
      case REFERENCE:
        return "Reference";
      case RELATEDARTIFACT:
        return "RelatedArtifact";
      case SAMPLEDDATA:
        return "SampledData";
      case SIGNATURE:
        return "Signature";
      case SIMPLEQUANTITY:
        return "SimpleQuantity";
      case SUBSTANCEAMOUNT:
        return "SubstanceAmount";
      case TIMING:
        return "Timing";
      case TRIGGERDEFINITION:
        return "TriggerDefinition";
      case USAGECONTEXT:
        return "UsageContext";
      case BASE64BINARY:
        return "base64Binary";
      case BOOLEAN:
        return "boolean";
      case CANONICAL:
        return "canonical";
      case CODE:
        return "code";
      case DATE:
        return "date";
      case DATETIME:
        return "dateTime";
      case DECIMAL:
        return "decimal";
      case ID:
        return "id";
      case INSTANT:
        return "instant";
      case INTEGER:
        return "integer";
      case MARKDOWN:
        return "markdown";
      case OID:
        return "oid";
      case POSITIVEINT:
        return "positiveInt";
      case STRING:
        return "string";
      case TIME:
        return "time";
      case UNSIGNEDINT:
        return "unsignedInt";
      case URI:
        return "uri";
      case URL:
        return "url";
      case UUID:
        return "uuid";
      case XHTML:
        return "XHTML";
      case ACCOUNT:
        return "Account";
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case ADVERSEEVENT:
        return "AdverseEvent";
      case ALLERGYINTOLERANCE:
        return "AllergyIntolerance";
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case AUDITEVENT:
        return "AuditEvent";
      case BASIC:
        return "Basic";
      case BINARY:
        return "Binary";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "BiologicallyDerivedProduct";
      case BODYSTRUCTURE:
        return "BodyStructure";
      case BUNDLE:
        return "Bundle";
      case CAPABILITYSTATEMENT:
        return "CapabilityStatement";
      case CAREPLAN:
        return "CarePlan";
      case CARETEAM:
        return "CareTeam";
      case CATALOGENTRY:
        return "CatalogEntry";
      case CHARGEITEM:
        return "ChargeItem";
      case CHARGEITEMDEFINITION:
        return "ChargeItemDefinition";
      case CLAIM:
        return "Claim";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case CODESYSTEM:
        return "CodeSystem";
      case COMMUNICATION:
        return "Communication";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case COMPARTMENTDEFINITION:
        return "CompartmentDefinition";
      case COMPOSITION:
        return "Composition";
      case CONCEPTMAP:
        return "ConceptMap";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case CONTRACT:
        return "Contract";
      case COVERAGE:
        return "Coverage";
      case COVERAGEELIGIBILITYREQUEST:
        return "CoverageEligibilityRequest";
      case COVERAGEELIGIBILITYRESPONSE:
        return "CoverageEligibilityResponse";
      case DETECTEDISSUE:
        return "DetectedIssue";
      case DEVICE:
        return "Device";
      case DEVICEDEFINITION:
        return "DeviceDefinition";
      case DEVICEMETRIC:
        return "DeviceMetric";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case DOMAINRESOURCE:
        return "DomainResource";
      case EFFECTEVIDENCESYNTHESIS:
        return "EffectEvidenceSynthesis";
      case ENCOUNTER:
        return "Encounter";
      case ENDPOINT:
        return "Endpoint";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EVENTDEFINITION:
        return "EventDefinition";
      case EVIDENCE:
        return "Evidence";
      case EVIDENCEVARIABLE:
        return "EvidenceVariable";
      case EXAMPLESCENARIO:
        return "ExampleScenario";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case FLAG:
        return "Flag";
      case GOAL:
        return "Goal";
      case GRAPHDEFINITION:
        return "GraphDefinition";
      case GROUP:
        return "Group";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case HEALTHCARESERVICE:
        return "HealthcareService";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case IMMUNIZATIONEVALUATION:
        return "ImmunizationEvaluation";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case IMPLEMENTATIONGUIDE:
        return "ImplementationGuide";
      case INSURANCEPLAN:
        return "InsurancePlan";
      case INVOICE:
        return "Invoice";
      case LIBRARY:
        return "Library";
      case LINKAGE:
        return "Linkage";
      case LIST:
        return "List";
      case LOCATION:
        return "Location";
      case MEASURE:
        return "Measure";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATION:
        return "Medication";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONKNOWLEDGE:
        return "MedicationKnowledge";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case MEDICINALPRODUCT:
        return "MedicinalProduct";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "MedicinalProductAuthorization";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "MedicinalProductContraindication";
      case MEDICINALPRODUCTINDICATION:
        return "MedicinalProductIndication";
      case MEDICINALPRODUCTINGREDIENT:
        return "MedicinalProductIngredient";
      case MEDICINALPRODUCTINTERACTION:
        return "MedicinalProductInteraction";
      case MEDICINALPRODUCTMANUFACTURED:
        return "MedicinalProductManufactured";
      case MEDICINALPRODUCTPACKAGED:
        return "MedicinalProductPackaged";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "MedicinalProductPharmaceutical";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "MedicinalProductUndesirableEffect";
      case MESSAGEDEFINITION:
        return "MessageDefinition";
      case MESSAGEHEADER:
        return "MessageHeader";
      case MOLECULARSEQUENCE:
        return "MolecularSequence";
      case NAMINGSYSTEM:
        return "NamingSystem";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case OBSERVATION:
        return "Observation";
      case OBSERVATIONDEFINITION:
        return "ObservationDefinition";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case OPERATIONOUTCOME:
        return "OperationOutcome";
      case ORGANIZATION:
        return "Organization";
      case ORGANIZATIONAFFILIATION:
        return "OrganizationAffiliation";
      case PARAMETERS:
        return "Parameters";
      case PATIENT:
        return "Patient";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PERSON:
        return "Person";
      case PLANDEFINITION:
        return "PlanDefinition";
      case PRACTITIONER:
        return "Practitioner";
      case PRACTITIONERROLE:
        return "PractitionerRole";
      case PROCEDURE:
        return "Procedure";
      case PROVENANCE:
        return "Provenance";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RELATEDPERSON:
        return "RelatedPerson";
      case REQUESTGROUP:
        return "RequestGroup";
      case RESEARCHDEFINITION:
        return "ResearchDefinition";
      case RESEARCHELEMENTDEFINITION:
        return "ResearchElementDefinition";
      case RESEARCHSTUDY:
        return "ResearchStudy";
      case RESEARCHSUBJECT:
        return "ResearchSubject";
      case RESOURCE:
        return "Resource";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case RISKEVIDENCESYNTHESIS:
        return "RiskEvidenceSynthesis";
      case SCHEDULE:
        return "Schedule";
      case SEARCHPARAMETER:
        return "SearchParameter";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SLOT:
        return "Slot";
      case SPECIMEN:
        return "Specimen";
      case SPECIMENDEFINITION:
        return "SpecimenDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case SUBSCRIPTION:
        return "Subscription";
      case SUBSTANCE:
        return "Substance";
      case SUBSTANCENUCLEICACID:
        return "SubstanceNucleicAcid";
      case SUBSTANCEPOLYMER:
        return "SubstancePolymer";
      case SUBSTANCEPROTEIN:
        return "SubstanceProtein";
      case SUBSTANCEREFERENCEINFORMATION:
        return "SubstanceReferenceInformation";
      case SUBSTANCESOURCEMATERIAL:
        return "SubstanceSourceMaterial";
      case SUBSTANCESPECIFICATION:
        return "SubstanceSpecification";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case TERMINOLOGYCAPABILITIES:
        return "TerminologyCapabilities";
      case TESTREPORT:
        return "TestReport";
      case TESTSCRIPT:
        return "TestScript";
      case VALUESET:
        return "ValueSet";
      case VERIFICATIONRESULT:
        return "VerificationResult";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case TYPE:
        return "Type";
      case ANY:
        return "Any";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class FHIRAllTypesEnumFactory implements EnumFactory<FHIRAllTypes> {
    public FHIRAllTypes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("Address".equals(codeString))
        return FHIRAllTypes.ADDRESS;
      if ("Age".equals(codeString))
        return FHIRAllTypes.AGE;
      if ("Annotation".equals(codeString))
        return FHIRAllTypes.ANNOTATION;
      if ("Attachment".equals(codeString))
        return FHIRAllTypes.ATTACHMENT;
      if ("BackboneElement".equals(codeString))
        return FHIRAllTypes.BACKBONEELEMENT;
      if ("CodeableConcept".equals(codeString))
        return FHIRAllTypes.CODEABLECONCEPT;
      if ("Coding".equals(codeString))
        return FHIRAllTypes.CODING;
      if ("ContactDetail".equals(codeString))
        return FHIRAllTypes.CONTACTDETAIL;
      if ("ContactPoint".equals(codeString))
        return FHIRAllTypes.CONTACTPOINT;
      if ("Contributor".equals(codeString))
        return FHIRAllTypes.CONTRIBUTOR;
      if ("Count".equals(codeString))
        return FHIRAllTypes.COUNT;
      if ("DataRequirement".equals(codeString))
        return FHIRAllTypes.DATAREQUIREMENT;
      if ("Distance".equals(codeString))
        return FHIRAllTypes.DISTANCE;
      if ("Dosage".equals(codeString))
        return FHIRAllTypes.DOSAGE;
      if ("Duration".equals(codeString))
        return FHIRAllTypes.DURATION;
      if ("Element".equals(codeString))
        return FHIRAllTypes.ELEMENT;
      if ("ElementDefinition".equals(codeString))
        return FHIRAllTypes.ELEMENTDEFINITION;
      if ("Expression".equals(codeString))
        return FHIRAllTypes.EXPRESSION;
      if ("Extension".equals(codeString))
        return FHIRAllTypes.EXTENSION;
      if ("HumanName".equals(codeString))
        return FHIRAllTypes.HUMANNAME;
      if ("Identifier".equals(codeString))
        return FHIRAllTypes.IDENTIFIER;
      if ("MarketingStatus".equals(codeString))
        return FHIRAllTypes.MARKETINGSTATUS;
      if ("Meta".equals(codeString))
        return FHIRAllTypes.META;
      if ("Money".equals(codeString))
        return FHIRAllTypes.MONEY;
      if ("MoneyQuantity".equals(codeString))
        return FHIRAllTypes.MONEYQUANTITY;
      if ("Narrative".equals(codeString))
        return FHIRAllTypes.NARRATIVE;
      if ("ParameterDefinition".equals(codeString))
        return FHIRAllTypes.PARAMETERDEFINITION;
      if ("Period".equals(codeString))
        return FHIRAllTypes.PERIOD;
      if ("Population".equals(codeString))
        return FHIRAllTypes.POPULATION;
      if ("ProdCharacteristic".equals(codeString))
        return FHIRAllTypes.PRODCHARACTERISTIC;
      if ("ProductShelfLife".equals(codeString))
        return FHIRAllTypes.PRODUCTSHELFLIFE;
      if ("Quantity".equals(codeString))
        return FHIRAllTypes.QUANTITY;
      if ("Range".equals(codeString))
        return FHIRAllTypes.RANGE;
      if ("Ratio".equals(codeString))
        return FHIRAllTypes.RATIO;
      if ("Reference".equals(codeString))
        return FHIRAllTypes.REFERENCE;
      if ("RelatedArtifact".equals(codeString))
        return FHIRAllTypes.RELATEDARTIFACT;
      if ("SampledData".equals(codeString))
        return FHIRAllTypes.SAMPLEDDATA;
      if ("Signature".equals(codeString))
        return FHIRAllTypes.SIGNATURE;
      if ("SimpleQuantity".equals(codeString))
        return FHIRAllTypes.SIMPLEQUANTITY;
      if ("SubstanceAmount".equals(codeString))
        return FHIRAllTypes.SUBSTANCEAMOUNT;
      if ("Timing".equals(codeString))
        return FHIRAllTypes.TIMING;
      if ("TriggerDefinition".equals(codeString))
        return FHIRAllTypes.TRIGGERDEFINITION;
      if ("UsageContext".equals(codeString))
        return FHIRAllTypes.USAGECONTEXT;
      if ("base64Binary".equals(codeString))
        return FHIRAllTypes.BASE64BINARY;
      if ("boolean".equals(codeString))
        return FHIRAllTypes.BOOLEAN;
      if ("canonical".equals(codeString))
        return FHIRAllTypes.CANONICAL;
      if ("code".equals(codeString))
        return FHIRAllTypes.CODE;
      if ("date".equals(codeString))
        return FHIRAllTypes.DATE;
      if ("dateTime".equals(codeString))
        return FHIRAllTypes.DATETIME;
      if ("decimal".equals(codeString))
        return FHIRAllTypes.DECIMAL;
      if ("id".equals(codeString))
        return FHIRAllTypes.ID;
      if ("instant".equals(codeString))
        return FHIRAllTypes.INSTANT;
      if ("integer".equals(codeString))
        return FHIRAllTypes.INTEGER;
      if ("markdown".equals(codeString))
        return FHIRAllTypes.MARKDOWN;
      if ("oid".equals(codeString))
        return FHIRAllTypes.OID;
      if ("positiveInt".equals(codeString))
        return FHIRAllTypes.POSITIVEINT;
      if ("string".equals(codeString))
        return FHIRAllTypes.STRING;
      if ("time".equals(codeString))
        return FHIRAllTypes.TIME;
      if ("unsignedInt".equals(codeString))
        return FHIRAllTypes.UNSIGNEDINT;
      if ("uri".equals(codeString))
        return FHIRAllTypes.URI;
      if ("url".equals(codeString))
        return FHIRAllTypes.URL;
      if ("uuid".equals(codeString))
        return FHIRAllTypes.UUID;
      if ("xhtml".equals(codeString))
        return FHIRAllTypes.XHTML;
      if ("Account".equals(codeString))
        return FHIRAllTypes.ACCOUNT;
      if ("ActivityDefinition".equals(codeString))
        return FHIRAllTypes.ACTIVITYDEFINITION;
      if ("AdverseEvent".equals(codeString))
        return FHIRAllTypes.ADVERSEEVENT;
      if ("AllergyIntolerance".equals(codeString))
        return FHIRAllTypes.ALLERGYINTOLERANCE;
      if ("Appointment".equals(codeString))
        return FHIRAllTypes.APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return FHIRAllTypes.APPOINTMENTRESPONSE;
      if ("AuditEvent".equals(codeString))
        return FHIRAllTypes.AUDITEVENT;
      if ("Basic".equals(codeString))
        return FHIRAllTypes.BASIC;
      if ("Binary".equals(codeString))
        return FHIRAllTypes.BINARY;
      if ("BiologicallyDerivedProduct".equals(codeString))
        return FHIRAllTypes.BIOLOGICALLYDERIVEDPRODUCT;
      if ("BodyStructure".equals(codeString))
        return FHIRAllTypes.BODYSTRUCTURE;
      if ("Bundle".equals(codeString))
        return FHIRAllTypes.BUNDLE;
      if ("CapabilityStatement".equals(codeString))
        return FHIRAllTypes.CAPABILITYSTATEMENT;
      if ("CarePlan".equals(codeString))
        return FHIRAllTypes.CAREPLAN;
      if ("CareTeam".equals(codeString))
        return FHIRAllTypes.CARETEAM;
      if ("CatalogEntry".equals(codeString))
        return FHIRAllTypes.CATALOGENTRY;
      if ("ChargeItem".equals(codeString))
        return FHIRAllTypes.CHARGEITEM;
      if ("ChargeItemDefinition".equals(codeString))
        return FHIRAllTypes.CHARGEITEMDEFINITION;
      if ("Claim".equals(codeString))
        return FHIRAllTypes.CLAIM;
      if ("ClaimResponse".equals(codeString))
        return FHIRAllTypes.CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return FHIRAllTypes.CLINICALIMPRESSION;
      if ("CodeSystem".equals(codeString))
        return FHIRAllTypes.CODESYSTEM;
      if ("Communication".equals(codeString))
        return FHIRAllTypes.COMMUNICATION;
      if ("CommunicationRequest".equals(codeString))
        return FHIRAllTypes.COMMUNICATIONREQUEST;
      if ("CompartmentDefinition".equals(codeString))
        return FHIRAllTypes.COMPARTMENTDEFINITION;
      if ("Composition".equals(codeString))
        return FHIRAllTypes.COMPOSITION;
      if ("ConceptMap".equals(codeString))
        return FHIRAllTypes.CONCEPTMAP;
      if ("Condition".equals(codeString))
        return FHIRAllTypes.CONDITION;
      if ("Consent".equals(codeString))
        return FHIRAllTypes.CONSENT;
      if ("Contract".equals(codeString))
        return FHIRAllTypes.CONTRACT;
      if ("Coverage".equals(codeString))
        return FHIRAllTypes.COVERAGE;
      if ("CoverageEligibilityRequest".equals(codeString))
        return FHIRAllTypes.COVERAGEELIGIBILITYREQUEST;
      if ("CoverageEligibilityResponse".equals(codeString))
        return FHIRAllTypes.COVERAGEELIGIBILITYRESPONSE;
      if ("DetectedIssue".equals(codeString))
        return FHIRAllTypes.DETECTEDISSUE;
      if ("Device".equals(codeString))
        return FHIRAllTypes.DEVICE;
      if ("DeviceDefinition".equals(codeString))
        return FHIRAllTypes.DEVICEDEFINITION;
      if ("DeviceMetric".equals(codeString))
        return FHIRAllTypes.DEVICEMETRIC;
      if ("DeviceRequest".equals(codeString))
        return FHIRAllTypes.DEVICEREQUEST;
      if ("DeviceUseStatement".equals(codeString))
        return FHIRAllTypes.DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return FHIRAllTypes.DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return FHIRAllTypes.DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return FHIRAllTypes.DOCUMENTREFERENCE;
      if ("DomainResource".equals(codeString))
        return FHIRAllTypes.DOMAINRESOURCE;
      if ("EffectEvidenceSynthesis".equals(codeString))
        return FHIRAllTypes.EFFECTEVIDENCESYNTHESIS;
      if ("Encounter".equals(codeString))
        return FHIRAllTypes.ENCOUNTER;
      if ("Endpoint".equals(codeString))
        return FHIRAllTypes.ENDPOINT;
      if ("EnrollmentRequest".equals(codeString))
        return FHIRAllTypes.ENROLLMENTREQUEST;
      if ("EnrollmentResponse".equals(codeString))
        return FHIRAllTypes.ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return FHIRAllTypes.EPISODEOFCARE;
      if ("EventDefinition".equals(codeString))
        return FHIRAllTypes.EVENTDEFINITION;
      if ("Evidence".equals(codeString))
        return FHIRAllTypes.EVIDENCE;
      if ("EvidenceVariable".equals(codeString))
        return FHIRAllTypes.EVIDENCEVARIABLE;
      if ("ExampleScenario".equals(codeString))
        return FHIRAllTypes.EXAMPLESCENARIO;
      if ("ExplanationOfBenefit".equals(codeString))
        return FHIRAllTypes.EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return FHIRAllTypes.FAMILYMEMBERHISTORY;
      if ("Flag".equals(codeString))
        return FHIRAllTypes.FLAG;
      if ("Goal".equals(codeString))
        return FHIRAllTypes.GOAL;
      if ("GraphDefinition".equals(codeString))
        return FHIRAllTypes.GRAPHDEFINITION;
      if ("Group".equals(codeString))
        return FHIRAllTypes.GROUP;
      if ("GuidanceResponse".equals(codeString))
        return FHIRAllTypes.GUIDANCERESPONSE;
      if ("HealthcareService".equals(codeString))
        return FHIRAllTypes.HEALTHCARESERVICE;
      if ("ImagingStudy".equals(codeString))
        return FHIRAllTypes.IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return FHIRAllTypes.IMMUNIZATION;
      if ("ImmunizationEvaluation".equals(codeString))
        return FHIRAllTypes.IMMUNIZATIONEVALUATION;
      if ("ImmunizationRecommendation".equals(codeString))
        return FHIRAllTypes.IMMUNIZATIONRECOMMENDATION;
      if ("ImplementationGuide".equals(codeString))
        return FHIRAllTypes.IMPLEMENTATIONGUIDE;
      if ("InsurancePlan".equals(codeString))
        return FHIRAllTypes.INSURANCEPLAN;
      if ("Invoice".equals(codeString))
        return FHIRAllTypes.INVOICE;
      if ("Library".equals(codeString))
        return FHIRAllTypes.LIBRARY;
      if ("Linkage".equals(codeString))
        return FHIRAllTypes.LINKAGE;
      if ("List".equals(codeString))
        return FHIRAllTypes.LIST;
      if ("Location".equals(codeString))
        return FHIRAllTypes.LOCATION;
      if ("Measure".equals(codeString))
        return FHIRAllTypes.MEASURE;
      if ("MeasureReport".equals(codeString))
        return FHIRAllTypes.MEASUREREPORT;
      if ("Media".equals(codeString))
        return FHIRAllTypes.MEDIA;
      if ("Medication".equals(codeString))
        return FHIRAllTypes.MEDICATION;
      if ("MedicationAdministration".equals(codeString))
        return FHIRAllTypes.MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return FHIRAllTypes.MEDICATIONDISPENSE;
      if ("MedicationKnowledge".equals(codeString))
        return FHIRAllTypes.MEDICATIONKNOWLEDGE;
      if ("MedicationRequest".equals(codeString))
        return FHIRAllTypes.MEDICATIONREQUEST;
      if ("MedicationStatement".equals(codeString))
        return FHIRAllTypes.MEDICATIONSTATEMENT;
      if ("MedicinalProduct".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCT;
      if ("MedicinalProductAuthorization".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTAUTHORIZATION;
      if ("MedicinalProductContraindication".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTCONTRAINDICATION;
      if ("MedicinalProductIndication".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTINDICATION;
      if ("MedicinalProductIngredient".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTINGREDIENT;
      if ("MedicinalProductInteraction".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTINTERACTION;
      if ("MedicinalProductManufactured".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTMANUFACTURED;
      if ("MedicinalProductPackaged".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTPACKAGED;
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTPHARMACEUTICAL;
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return FHIRAllTypes.MEDICINALPRODUCTUNDESIRABLEEFFECT;
      if ("MessageDefinition".equals(codeString))
        return FHIRAllTypes.MESSAGEDEFINITION;
      if ("MessageHeader".equals(codeString))
        return FHIRAllTypes.MESSAGEHEADER;
      if ("MolecularSequence".equals(codeString))
        return FHIRAllTypes.MOLECULARSEQUENCE;
      if ("NamingSystem".equals(codeString))
        return FHIRAllTypes.NAMINGSYSTEM;
      if ("NutritionOrder".equals(codeString))
        return FHIRAllTypes.NUTRITIONORDER;
      if ("Observation".equals(codeString))
        return FHIRAllTypes.OBSERVATION;
      if ("ObservationDefinition".equals(codeString))
        return FHIRAllTypes.OBSERVATIONDEFINITION;
      if ("OperationDefinition".equals(codeString))
        return FHIRAllTypes.OPERATIONDEFINITION;
      if ("OperationOutcome".equals(codeString))
        return FHIRAllTypes.OPERATIONOUTCOME;
      if ("Organization".equals(codeString))
        return FHIRAllTypes.ORGANIZATION;
      if ("OrganizationAffiliation".equals(codeString))
        return FHIRAllTypes.ORGANIZATIONAFFILIATION;
      if ("Parameters".equals(codeString))
        return FHIRAllTypes.PARAMETERS;
      if ("Patient".equals(codeString))
        return FHIRAllTypes.PATIENT;
      if ("PaymentNotice".equals(codeString))
        return FHIRAllTypes.PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return FHIRAllTypes.PAYMENTRECONCILIATION;
      if ("Person".equals(codeString))
        return FHIRAllTypes.PERSON;
      if ("PlanDefinition".equals(codeString))
        return FHIRAllTypes.PLANDEFINITION;
      if ("Practitioner".equals(codeString))
        return FHIRAllTypes.PRACTITIONER;
      if ("PractitionerRole".equals(codeString))
        return FHIRAllTypes.PRACTITIONERROLE;
      if ("Procedure".equals(codeString))
        return FHIRAllTypes.PROCEDURE;
      if ("Provenance".equals(codeString))
        return FHIRAllTypes.PROVENANCE;
      if ("Questionnaire".equals(codeString))
        return FHIRAllTypes.QUESTIONNAIRE;
      if ("QuestionnaireResponse".equals(codeString))
        return FHIRAllTypes.QUESTIONNAIRERESPONSE;
      if ("RelatedPerson".equals(codeString))
        return FHIRAllTypes.RELATEDPERSON;
      if ("RequestGroup".equals(codeString))
        return FHIRAllTypes.REQUESTGROUP;
      if ("ResearchDefinition".equals(codeString))
        return FHIRAllTypes.RESEARCHDEFINITION;
      if ("ResearchElementDefinition".equals(codeString))
        return FHIRAllTypes.RESEARCHELEMENTDEFINITION;
      if ("ResearchStudy".equals(codeString))
        return FHIRAllTypes.RESEARCHSTUDY;
      if ("ResearchSubject".equals(codeString))
        return FHIRAllTypes.RESEARCHSUBJECT;
      if ("Resource".equals(codeString))
        return FHIRAllTypes.RESOURCE;
      if ("RiskAssessment".equals(codeString))
        return FHIRAllTypes.RISKASSESSMENT;
      if ("RiskEvidenceSynthesis".equals(codeString))
        return FHIRAllTypes.RISKEVIDENCESYNTHESIS;
      if ("Schedule".equals(codeString))
        return FHIRAllTypes.SCHEDULE;
      if ("SearchParameter".equals(codeString))
        return FHIRAllTypes.SEARCHPARAMETER;
      if ("ServiceRequest".equals(codeString))
        return FHIRAllTypes.SERVICEREQUEST;
      if ("Slot".equals(codeString))
        return FHIRAllTypes.SLOT;
      if ("Specimen".equals(codeString))
        return FHIRAllTypes.SPECIMEN;
      if ("SpecimenDefinition".equals(codeString))
        return FHIRAllTypes.SPECIMENDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return FHIRAllTypes.STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return FHIRAllTypes.STRUCTUREMAP;
      if ("Subscription".equals(codeString))
        return FHIRAllTypes.SUBSCRIPTION;
      if ("Substance".equals(codeString))
        return FHIRAllTypes.SUBSTANCE;
      if ("SubstanceNucleicAcid".equals(codeString))
        return FHIRAllTypes.SUBSTANCENUCLEICACID;
      if ("SubstancePolymer".equals(codeString))
        return FHIRAllTypes.SUBSTANCEPOLYMER;
      if ("SubstanceProtein".equals(codeString))
        return FHIRAllTypes.SUBSTANCEPROTEIN;
      if ("SubstanceReferenceInformation".equals(codeString))
        return FHIRAllTypes.SUBSTANCEREFERENCEINFORMATION;
      if ("SubstanceSourceMaterial".equals(codeString))
        return FHIRAllTypes.SUBSTANCESOURCEMATERIAL;
      if ("SubstanceSpecification".equals(codeString))
        return FHIRAllTypes.SUBSTANCESPECIFICATION;
      if ("SupplyDelivery".equals(codeString))
        return FHIRAllTypes.SUPPLYDELIVERY;
      if ("SupplyRequest".equals(codeString))
        return FHIRAllTypes.SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return FHIRAllTypes.TASK;
      if ("TerminologyCapabilities".equals(codeString))
        return FHIRAllTypes.TERMINOLOGYCAPABILITIES;
      if ("TestReport".equals(codeString))
        return FHIRAllTypes.TESTREPORT;
      if ("TestScript".equals(codeString))
        return FHIRAllTypes.TESTSCRIPT;
      if ("ValueSet".equals(codeString))
        return FHIRAllTypes.VALUESET;
      if ("VerificationResult".equals(codeString))
        return FHIRAllTypes.VERIFICATIONRESULT;
      if ("VisionPrescription".equals(codeString))
        return FHIRAllTypes.VISIONPRESCRIPTION;
      if ("Type".equals(codeString))
        return FHIRAllTypes.TYPE;
      if ("Any".equals(codeString))
        return FHIRAllTypes.ANY;
      throw new IllegalArgumentException("Unknown FHIRAllTypes code '" + codeString + "'");
    }

    public Enumeration<FHIRAllTypes> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.NULL, code);
      if ("Address".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ADDRESS, code);
      if ("Age".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.AGE, code);
      if ("Annotation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ANNOTATION, code);
      if ("Attachment".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ATTACHMENT, code);
      if ("BackboneElement".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BACKBONEELEMENT, code);
      if ("CodeableConcept".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CODEABLECONCEPT, code);
      if ("Coding".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CODING, code);
      if ("ContactDetail".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONTACTDETAIL, code);
      if ("ContactPoint".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONTACTPOINT, code);
      if ("Contributor".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONTRIBUTOR, code);
      if ("Count".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COUNT, code);
      if ("DataRequirement".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DATAREQUIREMENT, code);
      if ("Distance".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DISTANCE, code);
      if ("Dosage".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DOSAGE, code);
      if ("Duration".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DURATION, code);
      if ("Element".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ELEMENT, code);
      if ("ElementDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ELEMENTDEFINITION, code);
      if ("Expression".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EXPRESSION, code);
      if ("Extension".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EXTENSION, code);
      if ("HumanName".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.HUMANNAME, code);
      if ("Identifier".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.IDENTIFIER, code);
      if ("MarketingStatus".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MARKETINGSTATUS, code);
      if ("Meta".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.META, code);
      if ("Money".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MONEY, code);
      if ("MoneyQuantity".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MONEYQUANTITY, code);
      if ("Narrative".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.NARRATIVE, code);
      if ("ParameterDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PARAMETERDEFINITION, code);
      if ("Period".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PERIOD, code);
      if ("Population".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.POPULATION, code);
      if ("ProdCharacteristic".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PRODCHARACTERISTIC, code);
      if ("ProductShelfLife".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PRODUCTSHELFLIFE, code);
      if ("Quantity".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.QUANTITY, code);
      if ("Range".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RANGE, code);
      if ("Ratio".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RATIO, code);
      if ("Reference".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.REFERENCE, code);
      if ("RelatedArtifact".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RELATEDARTIFACT, code);
      if ("SampledData".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SAMPLEDDATA, code);
      if ("Signature".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SIGNATURE, code);
      if ("SimpleQuantity".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SIMPLEQUANTITY, code);
      if ("SubstanceAmount".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCEAMOUNT, code);
      if ("Timing".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TIMING, code);
      if ("TriggerDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TRIGGERDEFINITION, code);
      if ("UsageContext".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.USAGECONTEXT, code);
      if ("base64Binary".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BASE64BINARY, code);
      if ("boolean".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BOOLEAN, code);
      if ("canonical".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CANONICAL, code);
      if ("code".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CODE, code);
      if ("date".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DATE, code);
      if ("dateTime".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DATETIME, code);
      if ("decimal".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DECIMAL, code);
      if ("id".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ID, code);
      if ("instant".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.INSTANT, code);
      if ("integer".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.INTEGER, code);
      if ("markdown".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MARKDOWN, code);
      if ("oid".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.OID, code);
      if ("positiveInt".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.POSITIVEINT, code);
      if ("string".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.STRING, code);
      if ("time".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TIME, code);
      if ("unsignedInt".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.UNSIGNEDINT, code);
      if ("uri".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.URI, code);
      if ("url".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.URL, code);
      if ("uuid".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.UUID, code);
      if ("xhtml".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.XHTML, code);
      if ("Account".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ACCOUNT, code);
      if ("ActivityDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ACTIVITYDEFINITION, code);
      if ("AdverseEvent".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ADVERSEEVENT, code);
      if ("AllergyIntolerance".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ALLERGYINTOLERANCE, code);
      if ("Appointment".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.APPOINTMENT, code);
      if ("AppointmentResponse".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.APPOINTMENTRESPONSE, code);
      if ("AuditEvent".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.AUDITEVENT, code);
      if ("Basic".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BASIC, code);
      if ("Binary".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BINARY, code);
      if ("BiologicallyDerivedProduct".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BIOLOGICALLYDERIVEDPRODUCT, code);
      if ("BodyStructure".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BODYSTRUCTURE, code);
      if ("Bundle".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.BUNDLE, code);
      if ("CapabilityStatement".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CAPABILITYSTATEMENT, code);
      if ("CarePlan".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CAREPLAN, code);
      if ("CareTeam".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CARETEAM, code);
      if ("CatalogEntry".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CATALOGENTRY, code);
      if ("ChargeItem".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CHARGEITEM, code);
      if ("ChargeItemDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CHARGEITEMDEFINITION, code);
      if ("Claim".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CLAIM, code);
      if ("ClaimResponse".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CLAIMRESPONSE, code);
      if ("ClinicalImpression".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CLINICALIMPRESSION, code);
      if ("CodeSystem".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CODESYSTEM, code);
      if ("Communication".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COMMUNICATION, code);
      if ("CommunicationRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COMMUNICATIONREQUEST, code);
      if ("CompartmentDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COMPARTMENTDEFINITION, code);
      if ("Composition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COMPOSITION, code);
      if ("ConceptMap".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONCEPTMAP, code);
      if ("Condition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONDITION, code);
      if ("Consent".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONSENT, code);
      if ("Contract".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.CONTRACT, code);
      if ("Coverage".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COVERAGE, code);
      if ("CoverageEligibilityRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COVERAGEELIGIBILITYREQUEST, code);
      if ("CoverageEligibilityResponse".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.COVERAGEELIGIBILITYRESPONSE, code);
      if ("DetectedIssue".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DETECTEDISSUE, code);
      if ("Device".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DEVICE, code);
      if ("DeviceDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DEVICEDEFINITION, code);
      if ("DeviceMetric".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DEVICEMETRIC, code);
      if ("DeviceRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DEVICEREQUEST, code);
      if ("DeviceUseStatement".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DEVICEUSESTATEMENT, code);
      if ("DiagnosticReport".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DIAGNOSTICREPORT, code);
      if ("DocumentManifest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DOCUMENTMANIFEST, code);
      if ("DocumentReference".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DOCUMENTREFERENCE, code);
      if ("DomainResource".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.DOMAINRESOURCE, code);
      if ("EffectEvidenceSynthesis".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EFFECTEVIDENCESYNTHESIS, code);
      if ("Encounter".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ENCOUNTER, code);
      if ("Endpoint".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ENDPOINT, code);
      if ("EnrollmentRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ENROLLMENTREQUEST, code);
      if ("EnrollmentResponse".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ENROLLMENTRESPONSE, code);
      if ("EpisodeOfCare".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EPISODEOFCARE, code);
      if ("EventDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EVENTDEFINITION, code);
      if ("Evidence".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EVIDENCE, code);
      if ("EvidenceVariable".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EVIDENCEVARIABLE, code);
      if ("ExampleScenario".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EXAMPLESCENARIO, code);
      if ("ExplanationOfBenefit".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.EXPLANATIONOFBENEFIT, code);
      if ("FamilyMemberHistory".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.FAMILYMEMBERHISTORY, code);
      if ("Flag".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.FLAG, code);
      if ("Goal".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.GOAL, code);
      if ("GraphDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.GRAPHDEFINITION, code);
      if ("Group".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.GROUP, code);
      if ("GuidanceResponse".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.GUIDANCERESPONSE, code);
      if ("HealthcareService".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.HEALTHCARESERVICE, code);
      if ("ImagingStudy".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.IMAGINGSTUDY, code);
      if ("Immunization".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.IMMUNIZATION, code);
      if ("ImmunizationEvaluation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.IMMUNIZATIONEVALUATION, code);
      if ("ImmunizationRecommendation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.IMMUNIZATIONRECOMMENDATION, code);
      if ("ImplementationGuide".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.IMPLEMENTATIONGUIDE, code);
      if ("InsurancePlan".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.INSURANCEPLAN, code);
      if ("Invoice".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.INVOICE, code);
      if ("Library".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.LIBRARY, code);
      if ("Linkage".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.LINKAGE, code);
      if ("List".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.LIST, code);
      if ("Location".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.LOCATION, code);
      if ("Measure".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEASURE, code);
      if ("MeasureReport".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEASUREREPORT, code);
      if ("Media".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDIA, code);
      if ("Medication".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICATION, code);
      if ("MedicationAdministration".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICATIONADMINISTRATION, code);
      if ("MedicationDispense".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICATIONDISPENSE, code);
      if ("MedicationKnowledge".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICATIONKNOWLEDGE, code);
      if ("MedicationRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICATIONREQUEST, code);
      if ("MedicationStatement".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICATIONSTATEMENT, code);
      if ("MedicinalProduct".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCT, code);
      if ("MedicinalProductAuthorization".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTAUTHORIZATION, code);
      if ("MedicinalProductContraindication".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTCONTRAINDICATION, code);
      if ("MedicinalProductIndication".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTINDICATION, code);
      if ("MedicinalProductIngredient".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTINGREDIENT, code);
      if ("MedicinalProductInteraction".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTINTERACTION, code);
      if ("MedicinalProductManufactured".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTMANUFACTURED, code);
      if ("MedicinalProductPackaged".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTPACKAGED, code);
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTPHARMACEUTICAL, code);
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MEDICINALPRODUCTUNDESIRABLEEFFECT, code);
      if ("MessageDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MESSAGEDEFINITION, code);
      if ("MessageHeader".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MESSAGEHEADER, code);
      if ("MolecularSequence".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.MOLECULARSEQUENCE, code);
      if ("NamingSystem".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.NAMINGSYSTEM, code);
      if ("NutritionOrder".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.NUTRITIONORDER, code);
      if ("Observation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.OBSERVATION, code);
      if ("ObservationDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.OBSERVATIONDEFINITION, code);
      if ("OperationDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.OPERATIONDEFINITION, code);
      if ("OperationOutcome".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.OPERATIONOUTCOME, code);
      if ("Organization".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ORGANIZATION, code);
      if ("OrganizationAffiliation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ORGANIZATIONAFFILIATION, code);
      if ("Parameters".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PARAMETERS, code);
      if ("Patient".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PATIENT, code);
      if ("PaymentNotice".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PAYMENTNOTICE, code);
      if ("PaymentReconciliation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PAYMENTRECONCILIATION, code);
      if ("Person".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PERSON, code);
      if ("PlanDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PLANDEFINITION, code);
      if ("Practitioner".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PRACTITIONER, code);
      if ("PractitionerRole".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PRACTITIONERROLE, code);
      if ("Procedure".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PROCEDURE, code);
      if ("Provenance".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.PROVENANCE, code);
      if ("Questionnaire".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.QUESTIONNAIRE, code);
      if ("QuestionnaireResponse".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.QUESTIONNAIRERESPONSE, code);
      if ("RelatedPerson".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RELATEDPERSON, code);
      if ("RequestGroup".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.REQUESTGROUP, code);
      if ("ResearchDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RESEARCHDEFINITION, code);
      if ("ResearchElementDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RESEARCHELEMENTDEFINITION, code);
      if ("ResearchStudy".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RESEARCHSTUDY, code);
      if ("ResearchSubject".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RESEARCHSUBJECT, code);
      if ("Resource".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RESOURCE, code);
      if ("RiskAssessment".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RISKASSESSMENT, code);
      if ("RiskEvidenceSynthesis".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.RISKEVIDENCESYNTHESIS, code);
      if ("Schedule".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SCHEDULE, code);
      if ("SearchParameter".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SEARCHPARAMETER, code);
      if ("ServiceRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SERVICEREQUEST, code);
      if ("Slot".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SLOT, code);
      if ("Specimen".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SPECIMEN, code);
      if ("SpecimenDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SPECIMENDEFINITION, code);
      if ("StructureDefinition".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.STRUCTUREDEFINITION, code);
      if ("StructureMap".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.STRUCTUREMAP, code);
      if ("Subscription".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSCRIPTION, code);
      if ("Substance".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCE, code);
      if ("SubstanceNucleicAcid".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCENUCLEICACID, code);
      if ("SubstancePolymer".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCEPOLYMER, code);
      if ("SubstanceProtein".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCEPROTEIN, code);
      if ("SubstanceReferenceInformation".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCEREFERENCEINFORMATION, code);
      if ("SubstanceSourceMaterial".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCESOURCEMATERIAL, code);
      if ("SubstanceSpecification".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUBSTANCESPECIFICATION, code);
      if ("SupplyDelivery".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUPPLYDELIVERY, code);
      if ("SupplyRequest".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.SUPPLYREQUEST, code);
      if ("Task".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TASK, code);
      if ("TerminologyCapabilities".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TERMINOLOGYCAPABILITIES, code);
      if ("TestReport".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TESTREPORT, code);
      if ("TestScript".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TESTSCRIPT, code);
      if ("ValueSet".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.VALUESET, code);
      if ("VerificationResult".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.VERIFICATIONRESULT, code);
      if ("VisionPrescription".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.VISIONPRESCRIPTION, code);
      if ("Type".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.TYPE, code);
      if ("Any".equals(codeString))
        return new Enumeration<FHIRAllTypes>(this, FHIRAllTypes.ANY, code);
      throw new FHIRException("Unknown FHIRAllTypes code '" + codeString + "'");
    }

    public String toCode(FHIRAllTypes code) {
       if (code == FHIRAllTypes.NULL)
           return null;
       if (code == FHIRAllTypes.ADDRESS)
        return "Address";
      if (code == FHIRAllTypes.AGE)
        return "Age";
      if (code == FHIRAllTypes.ANNOTATION)
        return "Annotation";
      if (code == FHIRAllTypes.ATTACHMENT)
        return "Attachment";
      if (code == FHIRAllTypes.BACKBONEELEMENT)
        return "BackboneElement";
      if (code == FHIRAllTypes.CODEABLECONCEPT)
        return "CodeableConcept";
      if (code == FHIRAllTypes.CODING)
        return "Coding";
      if (code == FHIRAllTypes.CONTACTDETAIL)
        return "ContactDetail";
      if (code == FHIRAllTypes.CONTACTPOINT)
        return "ContactPoint";
      if (code == FHIRAllTypes.CONTRIBUTOR)
        return "Contributor";
      if (code == FHIRAllTypes.COUNT)
        return "Count";
      if (code == FHIRAllTypes.DATAREQUIREMENT)
        return "DataRequirement";
      if (code == FHIRAllTypes.DISTANCE)
        return "Distance";
      if (code == FHIRAllTypes.DOSAGE)
        return "Dosage";
      if (code == FHIRAllTypes.DURATION)
        return "Duration";
      if (code == FHIRAllTypes.ELEMENT)
        return "Element";
      if (code == FHIRAllTypes.ELEMENTDEFINITION)
        return "ElementDefinition";
      if (code == FHIRAllTypes.EXPRESSION)
        return "Expression";
      if (code == FHIRAllTypes.EXTENSION)
        return "Extension";
      if (code == FHIRAllTypes.HUMANNAME)
        return "HumanName";
      if (code == FHIRAllTypes.IDENTIFIER)
        return "Identifier";
      if (code == FHIRAllTypes.MARKETINGSTATUS)
        return "MarketingStatus";
      if (code == FHIRAllTypes.META)
        return "Meta";
      if (code == FHIRAllTypes.MONEY)
        return "Money";
      if (code == FHIRAllTypes.MONEYQUANTITY)
        return "MoneyQuantity";
      if (code == FHIRAllTypes.NARRATIVE)
        return "Narrative";
      if (code == FHIRAllTypes.PARAMETERDEFINITION)
        return "ParameterDefinition";
      if (code == FHIRAllTypes.PERIOD)
        return "Period";
      if (code == FHIRAllTypes.POPULATION)
        return "Population";
      if (code == FHIRAllTypes.PRODCHARACTERISTIC)
        return "ProdCharacteristic";
      if (code == FHIRAllTypes.PRODUCTSHELFLIFE)
        return "ProductShelfLife";
      if (code == FHIRAllTypes.QUANTITY)
        return "Quantity";
      if (code == FHIRAllTypes.RANGE)
        return "Range";
      if (code == FHIRAllTypes.RATIO)
        return "Ratio";
      if (code == FHIRAllTypes.REFERENCE)
        return "Reference";
      if (code == FHIRAllTypes.RELATEDARTIFACT)
        return "RelatedArtifact";
      if (code == FHIRAllTypes.SAMPLEDDATA)
        return "SampledData";
      if (code == FHIRAllTypes.SIGNATURE)
        return "Signature";
      if (code == FHIRAllTypes.SIMPLEQUANTITY)
        return "SimpleQuantity";
      if (code == FHIRAllTypes.SUBSTANCEAMOUNT)
        return "SubstanceAmount";
      if (code == FHIRAllTypes.TIMING)
        return "Timing";
      if (code == FHIRAllTypes.TRIGGERDEFINITION)
        return "TriggerDefinition";
      if (code == FHIRAllTypes.USAGECONTEXT)
        return "UsageContext";
      if (code == FHIRAllTypes.BASE64BINARY)
        return "base64Binary";
      if (code == FHIRAllTypes.BOOLEAN)
        return "boolean";
      if (code == FHIRAllTypes.CANONICAL)
        return "canonical";
      if (code == FHIRAllTypes.CODE)
        return "code";
      if (code == FHIRAllTypes.DATE)
        return "date";
      if (code == FHIRAllTypes.DATETIME)
        return "dateTime";
      if (code == FHIRAllTypes.DECIMAL)
        return "decimal";
      if (code == FHIRAllTypes.ID)
        return "id";
      if (code == FHIRAllTypes.INSTANT)
        return "instant";
      if (code == FHIRAllTypes.INTEGER)
        return "integer";
      if (code == FHIRAllTypes.MARKDOWN)
        return "markdown";
      if (code == FHIRAllTypes.OID)
        return "oid";
      if (code == FHIRAllTypes.POSITIVEINT)
        return "positiveInt";
      if (code == FHIRAllTypes.STRING)
        return "string";
      if (code == FHIRAllTypes.TIME)
        return "time";
      if (code == FHIRAllTypes.UNSIGNEDINT)
        return "unsignedInt";
      if (code == FHIRAllTypes.URI)
        return "uri";
      if (code == FHIRAllTypes.URL)
        return "url";
      if (code == FHIRAllTypes.UUID)
        return "uuid";
      if (code == FHIRAllTypes.XHTML)
        return "xhtml";
      if (code == FHIRAllTypes.ACCOUNT)
        return "Account";
      if (code == FHIRAllTypes.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == FHIRAllTypes.ADVERSEEVENT)
        return "AdverseEvent";
      if (code == FHIRAllTypes.ALLERGYINTOLERANCE)
        return "AllergyIntolerance";
      if (code == FHIRAllTypes.APPOINTMENT)
        return "Appointment";
      if (code == FHIRAllTypes.APPOINTMENTRESPONSE)
        return "AppointmentResponse";
      if (code == FHIRAllTypes.AUDITEVENT)
        return "AuditEvent";
      if (code == FHIRAllTypes.BASIC)
        return "Basic";
      if (code == FHIRAllTypes.BINARY)
        return "Binary";
      if (code == FHIRAllTypes.BIOLOGICALLYDERIVEDPRODUCT)
        return "BiologicallyDerivedProduct";
      if (code == FHIRAllTypes.BODYSTRUCTURE)
        return "BodyStructure";
      if (code == FHIRAllTypes.BUNDLE)
        return "Bundle";
      if (code == FHIRAllTypes.CAPABILITYSTATEMENT)
        return "CapabilityStatement";
      if (code == FHIRAllTypes.CAREPLAN)
        return "CarePlan";
      if (code == FHIRAllTypes.CARETEAM)
        return "CareTeam";
      if (code == FHIRAllTypes.CATALOGENTRY)
        return "CatalogEntry";
      if (code == FHIRAllTypes.CHARGEITEM)
        return "ChargeItem";
      if (code == FHIRAllTypes.CHARGEITEMDEFINITION)
        return "ChargeItemDefinition";
      if (code == FHIRAllTypes.CLAIM)
        return "Claim";
      if (code == FHIRAllTypes.CLAIMRESPONSE)
        return "ClaimResponse";
      if (code == FHIRAllTypes.CLINICALIMPRESSION)
        return "ClinicalImpression";
      if (code == FHIRAllTypes.CODESYSTEM)
        return "CodeSystem";
      if (code == FHIRAllTypes.COMMUNICATION)
        return "Communication";
      if (code == FHIRAllTypes.COMMUNICATIONREQUEST)
        return "CommunicationRequest";
      if (code == FHIRAllTypes.COMPARTMENTDEFINITION)
        return "CompartmentDefinition";
      if (code == FHIRAllTypes.COMPOSITION)
        return "Composition";
      if (code == FHIRAllTypes.CONCEPTMAP)
        return "ConceptMap";
      if (code == FHIRAllTypes.CONDITION)
        return "Condition";
      if (code == FHIRAllTypes.CONSENT)
        return "Consent";
      if (code == FHIRAllTypes.CONTRACT)
        return "Contract";
      if (code == FHIRAllTypes.COVERAGE)
        return "Coverage";
      if (code == FHIRAllTypes.COVERAGEELIGIBILITYREQUEST)
        return "CoverageEligibilityRequest";
      if (code == FHIRAllTypes.COVERAGEELIGIBILITYRESPONSE)
        return "CoverageEligibilityResponse";
      if (code == FHIRAllTypes.DETECTEDISSUE)
        return "DetectedIssue";
      if (code == FHIRAllTypes.DEVICE)
        return "Device";
      if (code == FHIRAllTypes.DEVICEDEFINITION)
        return "DeviceDefinition";
      if (code == FHIRAllTypes.DEVICEMETRIC)
        return "DeviceMetric";
      if (code == FHIRAllTypes.DEVICEREQUEST)
        return "DeviceRequest";
      if (code == FHIRAllTypes.DEVICEUSESTATEMENT)
        return "DeviceUseStatement";
      if (code == FHIRAllTypes.DIAGNOSTICREPORT)
        return "DiagnosticReport";
      if (code == FHIRAllTypes.DOCUMENTMANIFEST)
        return "DocumentManifest";
      if (code == FHIRAllTypes.DOCUMENTREFERENCE)
        return "DocumentReference";
      if (code == FHIRAllTypes.DOMAINRESOURCE)
        return "DomainResource";
      if (code == FHIRAllTypes.EFFECTEVIDENCESYNTHESIS)
        return "EffectEvidenceSynthesis";
      if (code == FHIRAllTypes.ENCOUNTER)
        return "Encounter";
      if (code == FHIRAllTypes.ENDPOINT)
        return "Endpoint";
      if (code == FHIRAllTypes.ENROLLMENTREQUEST)
        return "EnrollmentRequest";
      if (code == FHIRAllTypes.ENROLLMENTRESPONSE)
        return "EnrollmentResponse";
      if (code == FHIRAllTypes.EPISODEOFCARE)
        return "EpisodeOfCare";
      if (code == FHIRAllTypes.EVENTDEFINITION)
        return "EventDefinition";
      if (code == FHIRAllTypes.EVIDENCE)
        return "Evidence";
      if (code == FHIRAllTypes.EVIDENCEVARIABLE)
        return "EvidenceVariable";
      if (code == FHIRAllTypes.EXAMPLESCENARIO)
        return "ExampleScenario";
      if (code == FHIRAllTypes.EXPLANATIONOFBENEFIT)
        return "ExplanationOfBenefit";
      if (code == FHIRAllTypes.FAMILYMEMBERHISTORY)
        return "FamilyMemberHistory";
      if (code == FHIRAllTypes.FLAG)
        return "Flag";
      if (code == FHIRAllTypes.GOAL)
        return "Goal";
      if (code == FHIRAllTypes.GRAPHDEFINITION)
        return "GraphDefinition";
      if (code == FHIRAllTypes.GROUP)
        return "Group";
      if (code == FHIRAllTypes.GUIDANCERESPONSE)
        return "GuidanceResponse";
      if (code == FHIRAllTypes.HEALTHCARESERVICE)
        return "HealthcareService";
      if (code == FHIRAllTypes.IMAGINGSTUDY)
        return "ImagingStudy";
      if (code == FHIRAllTypes.IMMUNIZATION)
        return "Immunization";
      if (code == FHIRAllTypes.IMMUNIZATIONEVALUATION)
        return "ImmunizationEvaluation";
      if (code == FHIRAllTypes.IMMUNIZATIONRECOMMENDATION)
        return "ImmunizationRecommendation";
      if (code == FHIRAllTypes.IMPLEMENTATIONGUIDE)
        return "ImplementationGuide";
      if (code == FHIRAllTypes.INSURANCEPLAN)
        return "InsurancePlan";
      if (code == FHIRAllTypes.INVOICE)
        return "Invoice";
      if (code == FHIRAllTypes.LIBRARY)
        return "Library";
      if (code == FHIRAllTypes.LINKAGE)
        return "Linkage";
      if (code == FHIRAllTypes.LIST)
        return "List";
      if (code == FHIRAllTypes.LOCATION)
        return "Location";
      if (code == FHIRAllTypes.MEASURE)
        return "Measure";
      if (code == FHIRAllTypes.MEASUREREPORT)
        return "MeasureReport";
      if (code == FHIRAllTypes.MEDIA)
        return "Media";
      if (code == FHIRAllTypes.MEDICATION)
        return "Medication";
      if (code == FHIRAllTypes.MEDICATIONADMINISTRATION)
        return "MedicationAdministration";
      if (code == FHIRAllTypes.MEDICATIONDISPENSE)
        return "MedicationDispense";
      if (code == FHIRAllTypes.MEDICATIONKNOWLEDGE)
        return "MedicationKnowledge";
      if (code == FHIRAllTypes.MEDICATIONREQUEST)
        return "MedicationRequest";
      if (code == FHIRAllTypes.MEDICATIONSTATEMENT)
        return "MedicationStatement";
      if (code == FHIRAllTypes.MEDICINALPRODUCT)
        return "MedicinalProduct";
      if (code == FHIRAllTypes.MEDICINALPRODUCTAUTHORIZATION)
        return "MedicinalProductAuthorization";
      if (code == FHIRAllTypes.MEDICINALPRODUCTCONTRAINDICATION)
        return "MedicinalProductContraindication";
      if (code == FHIRAllTypes.MEDICINALPRODUCTINDICATION)
        return "MedicinalProductIndication";
      if (code == FHIRAllTypes.MEDICINALPRODUCTINGREDIENT)
        return "MedicinalProductIngredient";
      if (code == FHIRAllTypes.MEDICINALPRODUCTINTERACTION)
        return "MedicinalProductInteraction";
      if (code == FHIRAllTypes.MEDICINALPRODUCTMANUFACTURED)
        return "MedicinalProductManufactured";
      if (code == FHIRAllTypes.MEDICINALPRODUCTPACKAGED)
        return "MedicinalProductPackaged";
      if (code == FHIRAllTypes.MEDICINALPRODUCTPHARMACEUTICAL)
        return "MedicinalProductPharmaceutical";
      if (code == FHIRAllTypes.MEDICINALPRODUCTUNDESIRABLEEFFECT)
        return "MedicinalProductUndesirableEffect";
      if (code == FHIRAllTypes.MESSAGEDEFINITION)
        return "MessageDefinition";
      if (code == FHIRAllTypes.MESSAGEHEADER)
        return "MessageHeader";
      if (code == FHIRAllTypes.MOLECULARSEQUENCE)
        return "MolecularSequence";
      if (code == FHIRAllTypes.NAMINGSYSTEM)
        return "NamingSystem";
      if (code == FHIRAllTypes.NUTRITIONORDER)
        return "NutritionOrder";
      if (code == FHIRAllTypes.OBSERVATION)
        return "Observation";
      if (code == FHIRAllTypes.OBSERVATIONDEFINITION)
        return "ObservationDefinition";
      if (code == FHIRAllTypes.OPERATIONDEFINITION)
        return "OperationDefinition";
      if (code == FHIRAllTypes.OPERATIONOUTCOME)
        return "OperationOutcome";
      if (code == FHIRAllTypes.ORGANIZATION)
        return "Organization";
      if (code == FHIRAllTypes.ORGANIZATIONAFFILIATION)
        return "OrganizationAffiliation";
      if (code == FHIRAllTypes.PARAMETERS)
        return "Parameters";
      if (code == FHIRAllTypes.PATIENT)
        return "Patient";
      if (code == FHIRAllTypes.PAYMENTNOTICE)
        return "PaymentNotice";
      if (code == FHIRAllTypes.PAYMENTRECONCILIATION)
        return "PaymentReconciliation";
      if (code == FHIRAllTypes.PERSON)
        return "Person";
      if (code == FHIRAllTypes.PLANDEFINITION)
        return "PlanDefinition";
      if (code == FHIRAllTypes.PRACTITIONER)
        return "Practitioner";
      if (code == FHIRAllTypes.PRACTITIONERROLE)
        return "PractitionerRole";
      if (code == FHIRAllTypes.PROCEDURE)
        return "Procedure";
      if (code == FHIRAllTypes.PROVENANCE)
        return "Provenance";
      if (code == FHIRAllTypes.QUESTIONNAIRE)
        return "Questionnaire";
      if (code == FHIRAllTypes.QUESTIONNAIRERESPONSE)
        return "QuestionnaireResponse";
      if (code == FHIRAllTypes.RELATEDPERSON)
        return "RelatedPerson";
      if (code == FHIRAllTypes.REQUESTGROUP)
        return "RequestGroup";
      if (code == FHIRAllTypes.RESEARCHDEFINITION)
        return "ResearchDefinition";
      if (code == FHIRAllTypes.RESEARCHELEMENTDEFINITION)
        return "ResearchElementDefinition";
      if (code == FHIRAllTypes.RESEARCHSTUDY)
        return "ResearchStudy";
      if (code == FHIRAllTypes.RESEARCHSUBJECT)
        return "ResearchSubject";
      if (code == FHIRAllTypes.RESOURCE)
        return "Resource";
      if (code == FHIRAllTypes.RISKASSESSMENT)
        return "RiskAssessment";
      if (code == FHIRAllTypes.RISKEVIDENCESYNTHESIS)
        return "RiskEvidenceSynthesis";
      if (code == FHIRAllTypes.SCHEDULE)
        return "Schedule";
      if (code == FHIRAllTypes.SEARCHPARAMETER)
        return "SearchParameter";
      if (code == FHIRAllTypes.SERVICEREQUEST)
        return "ServiceRequest";
      if (code == FHIRAllTypes.SLOT)
        return "Slot";
      if (code == FHIRAllTypes.SPECIMEN)
        return "Specimen";
      if (code == FHIRAllTypes.SPECIMENDEFINITION)
        return "SpecimenDefinition";
      if (code == FHIRAllTypes.STRUCTUREDEFINITION)
        return "StructureDefinition";
      if (code == FHIRAllTypes.STRUCTUREMAP)
        return "StructureMap";
      if (code == FHIRAllTypes.SUBSCRIPTION)
        return "Subscription";
      if (code == FHIRAllTypes.SUBSTANCE)
        return "Substance";
      if (code == FHIRAllTypes.SUBSTANCENUCLEICACID)
        return "SubstanceNucleicAcid";
      if (code == FHIRAllTypes.SUBSTANCEPOLYMER)
        return "SubstancePolymer";
      if (code == FHIRAllTypes.SUBSTANCEPROTEIN)
        return "SubstanceProtein";
      if (code == FHIRAllTypes.SUBSTANCEREFERENCEINFORMATION)
        return "SubstanceReferenceInformation";
      if (code == FHIRAllTypes.SUBSTANCESOURCEMATERIAL)
        return "SubstanceSourceMaterial";
      if (code == FHIRAllTypes.SUBSTANCESPECIFICATION)
        return "SubstanceSpecification";
      if (code == FHIRAllTypes.SUPPLYDELIVERY)
        return "SupplyDelivery";
      if (code == FHIRAllTypes.SUPPLYREQUEST)
        return "SupplyRequest";
      if (code == FHIRAllTypes.TASK)
        return "Task";
      if (code == FHIRAllTypes.TERMINOLOGYCAPABILITIES)
        return "TerminologyCapabilities";
      if (code == FHIRAllTypes.TESTREPORT)
        return "TestReport";
      if (code == FHIRAllTypes.TESTSCRIPT)
        return "TestScript";
      if (code == FHIRAllTypes.VALUESET)
        return "ValueSet";
      if (code == FHIRAllTypes.VERIFICATIONRESULT)
        return "VerificationResult";
      if (code == FHIRAllTypes.VISIONPRESCRIPTION)
        return "VisionPrescription";
      if (code == FHIRAllTypes.TYPE)
        return "Type";
      if (code == FHIRAllTypes.ANY)
        return "Any";
      return "?";
   }

    public String toSystem(FHIRAllTypes code) {
      return code.getSystem();
    }
  }

  public enum FHIRDefinedType {
    /**
     * An address expressed using postal conventions (as opposed to GPS or other
     * location definition formats). This data type may be used to convey addresses
     * for use in delivering mail as well as for visiting locations which might not
     * be valid for mail delivery. There are a variety of postal address formats
     * defined around the world.
     */
    ADDRESS,
    /**
     * A duration of time during which an organism (or a process) has existed.
     */
    AGE,
    /**
     * A text note which also contains information about who made the statement and
     * when.
     */
    ANNOTATION,
    /**
     * For referring to data content defined in other formats.
     */
    ATTACHMENT,
    /**
     * Base definition for all elements that are defined inside a resource - but not
     * those in a data type.
     */
    BACKBONEELEMENT,
    /**
     * A concept that may be defined by a formal reference to a terminology or
     * ontology or may be provided by text.
     */
    CODEABLECONCEPT,
    /**
     * A reference to a code defined by a terminology system.
     */
    CODING,
    /**
     * Specifies contact information for a person or organization.
     */
    CONTACTDETAIL,
    /**
     * Details for all kinds of technology mediated contact points for a person or
     * organization, including telephone, email, etc.
     */
    CONTACTPOINT,
    /**
     * A contributor to the content of a knowledge asset, including authors,
     * editors, reviewers, and endorsers.
     */
    CONTRIBUTOR,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that
     * measured amounts include amounts that are not precisely quantified, including
     * amounts involving arbitrary units and floating currencies.
     */
    COUNT,
    /**
     * Describes a required data item for evaluation in terms of the type of data,
     * and optional code or date-based filters of the data.
     */
    DATAREQUIREMENT,
    /**
     * A length - a value with a unit that is a physical distance.
     */
    DISTANCE,
    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     */
    DOSAGE,
    /**
     * A length of time.
     */
    DURATION,
    /**
     * Base definition for all elements in a resource.
     */
    ELEMENT,
    /**
     * Captures constraints on each element within the resource, profile, or
     * extension.
     */
    ELEMENTDEFINITION,
    /**
     * A expression that is evaluated in a specified context and returns a value.
     * The context of use of the expression must specify the context in which the
     * expression is evaluated, and how the result of the expression is used.
     */
    EXPRESSION,
    /**
     * Optional Extension Element - found in all resources.
     */
    EXTENSION,
    /**
     * A human's name with the ability to identify parts and usage.
     */
    HUMANNAME,
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically
     * this is used for business identifiers.
     */
    IDENTIFIER,
    /**
     * The marketing status describes the date when a medicinal product is actually
     * put on the market or the date as of which it is no longer available.
     */
    MARKETINGSTATUS,
    /**
     * The metadata about a resource. This is content in the resource that is
     * maintained by the infrastructure. Changes to the content might not always be
     * associated with version changes to the resource.
     */
    META,
    /**
     * An amount of economic utility in some recognized currency.
     */
    MONEY,
    /**
     * null
     */
    MONEYQUANTITY,
    /**
     * A human-readable summary of the resource conveying the essential clinical and
     * business information for the resource.
     */
    NARRATIVE,
    /**
     * The parameters to the module. This collection specifies both the input and
     * output parameters. Input parameters are provided by the caller as part of the
     * $evaluate operation. Output parameters are included in the GuidanceResponse.
     */
    PARAMETERDEFINITION,
    /**
     * A time period defined by a start and end date and optionally time.
     */
    PERIOD,
    /**
     * A populatioof people with some set of grouping criteria.
     */
    POPULATION,
    /**
     * The marketing status describes the date when a medicinal product is actually
     * put on the market or the date as of which it is no longer available.
     */
    PRODCHARACTERISTIC,
    /**
     * The shelf-life and storage information for a medicinal product item or
     * container can be described using this class.
     */
    PRODUCTSHELFLIFE,
    /**
     * A measured amount (or an amount that can potentially be measured). Note that
     * measured amounts include amounts that are not precisely quantified, including
     * amounts involving arbitrary units and floating currencies.
     */
    QUANTITY,
    /**
     * A set of ordered Quantities defined by a low and high limit.
     */
    RANGE,
    /**
     * A relationship of two Quantity values - expressed as a numerator and a
     * denominator.
     */
    RATIO,
    /**
     * A reference from one resource to another.
     */
    REFERENCE,
    /**
     * Related artifacts such as additional documentation, justification, or
     * bibliographic references.
     */
    RELATEDARTIFACT,
    /**
     * A series of measurements taken by a device, with upper and lower limits.
     * There may be more than one dimension in the data.
     */
    SAMPLEDDATA,
    /**
     * A signature along with supporting context. The signature may be a digital
     * signature that is cryptographic in nature, or some other signature acceptable
     * to the domain. This other signature may be as simple as a graphical image
     * representing a hand-written signature, or a signature ceremony Different
     * signature approaches have different utilities.
     */
    SIGNATURE,
    /**
     * null
     */
    SIMPLEQUANTITY,
    /**
     * Chemical substances are a single substance type whose primary defining
     * element is the molecular structure. Chemical substances shall be defined on
     * the basis of their complete covalent molecular structure; the presence of a
     * salt (counter-ion) and/or solvates (water, alcohols) is also captured.
     * Purity, grade, physical form or particle size are not taken into account in
     * the definition of a chemical substance or in the assignment of a Substance
     * ID.
     */
    SUBSTANCEAMOUNT,
    /**
     * Specifies an event that may occur multiple times. Timing schedules are used
     * to record when things are planned, expected or requested to occur. The most
     * common usage is in dosage instructions for medications. They are also used
     * when planning care of various kinds, and may be used for reporting the
     * schedule to which past regular activities were carried out.
     */
    TIMING,
    /**
     * A description of a triggering event. Triggering events can be named events,
     * data events, or periodic, as determined by the type element.
     */
    TRIGGERDEFINITION,
    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index
     * and/or categorize an artifact. This metadata can either be specific to the
     * applicable population (e.g., age category, DRG) or the specific context of
     * care (e.g., venue, care setting, provider of care).
     */
    USAGECONTEXT,
    /**
     * A stream of bytes
     */
    BASE64BINARY,
    /**
     * Value of "true" or "false"
     */
    BOOLEAN,
    /**
     * A URI that is a reference to a canonical URL on a FHIR resource
     */
    CANONICAL,
    /**
     * A string which has at least one character and no leading or trailing
     * whitespace and where there is no whitespace other than single spaces in the
     * contents
     */
    CODE,
    /**
     * A date or partial date (e.g. just year or year + month). There is no time
     * zone. The format is a union of the schema types gYear, gYearMonth and date.
     * Dates SHALL be valid dates.
     */
    DATE,
    /**
     * A date, date-time or partial date (e.g. just year or year + month). If hours
     * and minutes are specified, a time zone SHALL be populated. The format is a
     * union of the schema types gYear, gYearMonth, date and dateTime. Seconds must
     * be provided due to schema type constraints but may be zero-filled and may be
     * ignored. Dates SHALL be valid dates.
     */
    DATETIME,
    /**
     * A rational number with implicit precision
     */
    DECIMAL,
    /**
     * Any combination of letters, numerals, "-" and ".", with a length limit of 64
     * characters. (This might be an integer, an unprefixed OID, UUID or any other
     * identifier pattern that meets these constraints.) Ids are case-insensitive.
     */
    ID,
    /**
     * An instant in time - known at least to the second
     */
    INSTANT,
    /**
     * A whole number
     */
    INTEGER,
    /**
     * A string that may contain Github Flavored Markdown syntax for optional
     * processing by a mark down presentation engine
     */
    MARKDOWN,
    /**
     * An OID represented as a URI
     */
    OID,
    /**
     * An integer with a value that is positive (e.g. >0)
     */
    POSITIVEINT,
    /**
     * A sequence of Unicode characters
     */
    STRING,
    /**
     * A time during the day, with no date specified
     */
    TIME,
    /**
     * An integer with a value that is not negative (e.g. >= 0)
     */
    UNSIGNEDINT,
    /**
     * String of characters used to identify a name or a resource
     */
    URI,
    /**
     * A URI that is a literal reference
     */
    URL,
    /**
     * A UUID, represented as a URI
     */
    UUID,
    /**
     * XHTML format, as defined by W3C, but restricted usage (mainly, no active
     * content)
     */
    XHTML,
    /**
     * A financial tool for tracking value accrued for a particular purpose. In the
     * healthcare field, used to track charges for a patient, cost centers, etc.
     */
    ACCOUNT,
    /**
     * This resource allows for the definition of some activity to be performed,
     * independent of a particular patient, practitioner, or other performance
     * context.
     */
    ACTIVITYDEFINITION,
    /**
     * Actual or potential/avoided event causing unintended physical injury
     * resulting from or contributed to by medical care, a research study or other
     * healthcare setting factors that requires additional monitoring, treatment, or
     * hospitalization, or that results in death.
     */
    ADVERSEEVENT,
    /**
     * Risk of harmful or undesirable, physiological response which is unique to an
     * individual and associated with exposure to a substance.
     */
    ALLERGYINTOLERANCE,
    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related
     * person(s) and/or device(s) for a specific date/time. This may result in one
     * or more Encounter(s).
     */
    APPOINTMENT,
    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such
     * as a confirmation or rejection.
     */
    APPOINTMENTRESPONSE,
    /**
     * A record of an event made for purposes of maintaining a security log. Typical
     * uses include detection of intrusion attempts and monitoring for inappropriate
     * usage.
     */
    AUDITEVENT,
    /**
     * Basic is used for handling concepts not yet defined in FHIR, narrative-only
     * resources that don't map to an existing resource, and custom resources not
     * appropriate for inclusion in the FHIR specification.
     */
    BASIC,
    /**
     * A resource that represents the data of a single raw artifact as digital
     * content accessible in its native format. A Binary resource can contain any
     * content, whether text, image, pdf, zip archive, etc.
     */
    BINARY,
    /**
     * A material substance originating from a biological entity intended to be
     * transplanted or infused into another (possibly the same) biological entity.
     */
    BIOLOGICALLYDERIVEDPRODUCT,
    /**
     * Record details about an anatomical structure. This resource may be used when
     * a coded concept does not provide the necessary detail needed for the use
     * case.
     */
    BODYSTRUCTURE,
    /**
     * A container for a collection of resources.
     */
    BUNDLE,
    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR
     * Server for a particular version of FHIR that may be used as a statement of
     * actual server functionality or a statement of required or desired server
     * implementation.
     */
    CAPABILITYSTATEMENT,
    /**
     * Describes the intention of how one or more practitioners intend to deliver
     * care for a particular patient, group or community for a period of time,
     * possibly limited to care for a specific condition or set of conditions.
     */
    CAREPLAN,
    /**
     * The Care Team includes all the people and organizations who plan to
     * participate in the coordination and delivery of care for a patient.
     */
    CARETEAM,
    /**
     * Catalog entries are wrappers that contextualize items included in a catalog.
     */
    CATALOGENTRY,
    /**
     * The resource ChargeItem describes the provision of healthcare provider
     * products for a certain patient, therefore referring not only to the product,
     * but containing in addition details of the provision, like date, time, amounts
     * and participating organizations and persons. Main Usage of the ChargeItem is
     * to enable the billing process and internal cost allocation.
     */
    CHARGEITEM,
    /**
     * The ChargeItemDefinition resource provides the properties that apply to the
     * (billing) codes necessary to calculate costs and prices. The properties may
     * differ largely depending on type and realm, therefore this resource gives
     * only a rough structure and requires profiling for each type of billing code
     * system.
     */
    CHARGEITEMDEFINITION,
    /**
     * A provider issued list of professional services and products which have been
     * provided, or are to be provided, to a patient which is sent to an insurer for
     * reimbursement.
     */
    CLAIM,
    /**
     * This resource provides the adjudication details from the processing of a
     * Claim resource.
     */
    CLAIMRESPONSE,
    /**
     * A record of a clinical assessment performed to determine what problem(s) may
     * affect the patient and before planning the treatments or management
     * strategies that are best to manage a patient's condition. Assessments are
     * often 1:1 with a clinical consultation / encounter, but this varies greatly
     * depending on the clinical workflow. This resource is called
     * "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with
     * the recording of assessment tools such as Apgar score.
     */
    CLINICALIMPRESSION,
    /**
     * The CodeSystem resource is used to declare the existence of and describe a
     * code system or code system supplement and its key properties, and optionally
     * define a part or all of its content.
     */
    CODESYSTEM,
    /**
     * An occurrence of information being transmitted; e.g. an alert that was sent
     * to a responsible provider, a public health agency that was notified about a
     * reportable condition.
     */
    COMMUNICATION,
    /**
     * A request to convey information; e.g. the CDS system proposes that an alert
     * be sent to a responsible provider, the CDS system proposes that the public
     * health agency be notified about a reportable condition.
     */
    COMMUNICATIONREQUEST,
    /**
     * A compartment definition that defines how resources are accessed on a server.
     */
    COMPARTMENTDEFINITION,
    /**
     * A set of healthcare-related information that is assembled together into a
     * single logical package that provides a single coherent statement of meaning,
     * establishes its own context and that has clinical attestation with regard to
     * who is making the statement. A Composition defines the structure and
     * narrative content necessary for a document. However, a Composition alone does
     * not constitute a document. Rather, the Composition must be the first entry in
     * a Bundle where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for example
     * Patient, Practitioner, Encounter, etc.).
     */
    COMPOSITION,
    /**
     * A statement of relationships from one set of concepts to one or more other
     * concepts - either concepts in code systems, or data element/data element
     * concepts, or classes in class models.
     */
    CONCEPTMAP,
    /**
     * A clinical condition, problem, diagnosis, or other event, situation, issue,
     * or clinical concept that has risen to a level of concern.
     */
    CONDITION,
    /**
     * A record of a healthcare consumer’s choices, which permits or denies
     * identified recipient(s) or recipient role(s) to perform one or more actions
     * within a given policy context, for specific purposes and periods of time.
     */
    CONSENT,
    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive
     * i.e., a policy or agreement.
     */
    CONTRACT,
    /**
     * Financial instrument which may be used to reimburse or pay for health care
     * products and services. Includes both insurance and self-payment.
     */
    COVERAGE,
    /**
     * The CoverageEligibilityRequest provides patient and insurance coverage
     * information to an insurer for them to respond, in the form of an
     * CoverageEligibilityResponse, with information regarding whether the stated
     * coverage is valid and in-force and optionally to provide the insurance
     * details of the policy.
     */
    COVERAGEELIGIBILITYREQUEST,
    /**
     * This resource provides eligibility and plan details from the processing of an
     * CoverageEligibilityRequest resource.
     */
    COVERAGEELIGIBILITYRESPONSE,
    /**
     * Indicates an actual or potential clinical issue with or between one or more
     * active or proposed clinical actions for a patient; e.g. Drug-drug
     * interaction, Ineffective treatment frequency, Procedure-condition conflict,
     * etc.
     */
    DETECTEDISSUE,
    /**
     * A type of a manufactured item that is used in the provision of healthcare
     * without being substantially changed through that activity. The device may be
     * a medical or non-medical device.
     */
    DEVICE,
    /**
     * The characteristics, operational status and capabilities of a medical-related
     * component of a medical device.
     */
    DEVICEDEFINITION,
    /**
     * Describes a measurement, calculation or setting capability of a medical
     * device.
     */
    DEVICEMETRIC,
    /**
     * Represents a request for a patient to employ a medical device. The device may
     * be an implantable device, or an external assistive device, such as a walker.
     */
    DEVICEREQUEST,
    /**
     * A record of a device being used by a patient where the record is the result
     * of a report from the patient or another clinician.
     */
    DEVICEUSESTATEMENT,
    /**
     * The findings and interpretation of diagnostic tests performed on patients,
     * groups of patients, devices, and locations, and/or specimens derived from
     * these. The report includes clinical context such as requesting and provider
     * information, and some mix of atomic results, images, textual and coded
     * interpretations, and formatted representation of diagnostic reports.
     */
    DIAGNOSTICREPORT,
    /**
     * A collection of documents compiled for a purpose together with metadata that
     * applies to the collection.
     */
    DOCUMENTMANIFEST,
    /**
     * A reference to a document of any kind for any purpose. Provides metadata
     * about the document so that the document can be discovered and managed. The
     * scope of a document is any seralized object with a mime-type, so includes
     * formal patient centric documents (CDA), cliical notes, scanned paper, and
     * non-patient specific documents like policy text.
     */
    DOCUMENTREFERENCE,
    /**
     * A resource that includes narrative, extensions, and contained resources.
     */
    DOMAINRESOURCE,
    /**
     * The EffectEvidenceSynthesis resource describes the difference in an outcome
     * between exposures states in a population where the effect estimate is derived
     * from a combination of research studies.
     */
    EFFECTEVIDENCESYNTHESIS,
    /**
     * An interaction between a patient and healthcare provider(s) for the purpose
     * of providing healthcare service(s) or assessing the health status of a
     * patient.
     */
    ENCOUNTER,
    /**
     * The technical details of an endpoint that can be used for electronic
     * services, such as for web services providing XDS.b or a REST endpoint for
     * another FHIR server. This may include any security context information.
     */
    ENDPOINT,
    /**
     * This resource provides the insurance enrollment details to the insurer
     * regarding a specified coverage.
     */
    ENROLLMENTREQUEST,
    /**
     * This resource provides enrollment and plan details from the processing of an
     * EnrollmentRequest resource.
     */
    ENROLLMENTRESPONSE,
    /**
     * An association between a patient and an organization / healthcare provider(s)
     * during which time encounters may occur. The managing organization assumes a
     * level of responsibility for the patient during this time.
     */
    EPISODEOFCARE,
    /**
     * The EventDefinition resource provides a reusable description of when a
     * particular event can occur.
     */
    EVENTDEFINITION,
    /**
     * The Evidence resource describes the conditional state (population and any
     * exposures being compared within the population) and outcome (if specified)
     * that the knowledge (evidence, assertion, recommendation) is about.
     */
    EVIDENCE,
    /**
     * The EvidenceVariable resource describes a "PICO" element that knowledge
     * (evidence, assertion, recommendation) is about.
     */
    EVIDENCEVARIABLE,
    /**
     * Example of workflow instance.
     */
    EXAMPLESCENARIO,
    /**
     * This resource provides: the claim details; adjudication details from the
     * processing of a Claim; and optionally account balance information, for
     * informing the subscriber of the benefits provided.
     */
    EXPLANATIONOFBENEFIT,
    /**
     * Significant health conditions for a person related to the patient relevant in
     * the context of care for the patient.
     */
    FAMILYMEMBERHISTORY,
    /**
     * Prospective warnings of potential issues when providing care to the patient.
     */
    FLAG,
    /**
     * Describes the intended objective(s) for a patient, group or organization
     * care, for example, weight loss, restoring an activity of daily living,
     * obtaining herd immunity via immunization, meeting a process improvement
     * objective, etc.
     */
    GOAL,
    /**
     * A formal computable definition of a graph of resources - that is, a coherent
     * set of resources that form a graph by following references. The Graph
     * Definition resource defines a set and makes rules about the set.
     */
    GRAPHDEFINITION,
    /**
     * Represents a defined collection of entities that may be discussed or acted
     * upon collectively but which are not expected to act collectively, and are not
     * formally or legally recognized; i.e. a collection of entities that isn't an
     * Organization.
     */
    GROUP,
    /**
     * A guidance response is the formal response to a guidance request, including
     * any output parameters returned by the evaluation, as well as the description
     * of any proposed actions to be taken.
     */
    GUIDANCERESPONSE,
    /**
     * The details of a healthcare service available at a location.
     */
    HEALTHCARESERVICE,
    /**
     * Representation of the content produced in a DICOM imaging study. A study
     * comprises a set of series, each of which includes a set of Service-Object
     * Pair Instances (SOP Instances - images or other data) acquired or produced in
     * a common context. A series is of only one modality (e.g. X-ray, CT, MR,
     * ultrasound), but a study may have multiple series of different modalities.
     */
    IMAGINGSTUDY,
    /**
     * Describes the event of a patient being administered a vaccine or a record of
     * an immunization as reported by a patient, a clinician or another party.
     */
    IMMUNIZATION,
    /**
     * Describes a comparison of an immunization event against published
     * recommendations to determine if the administration is "valid" in relation to
     * those recommendations.
     */
    IMMUNIZATIONEVALUATION,
    /**
     * A patient's point-in-time set of recommendations (i.e. forecasting) according
     * to a published schedule with optional supporting justification.
     */
    IMMUNIZATIONRECOMMENDATION,
    /**
     * A set of rules of how a particular interoperability or standards problem is
     * solved - typically through the use of FHIR resources. This resource is used
     * to gather all the parts of an implementation guide into a logical whole and
     * to publish a computable definition of all the parts.
     */
    IMPLEMENTATIONGUIDE,
    /**
     * Details of a Health Insurance product/plan provided by an organization.
     */
    INSURANCEPLAN,
    /**
     * Invoice containing collected ChargeItems from an Account with calculated
     * individual and total price for Billing purpose.
     */
    INVOICE,
    /**
     * The Library resource is a general-purpose container for knowledge asset
     * definitions. It can be used to describe and expose existing knowledge assets
     * such as logic libraries and information model descriptions, as well as to
     * describe a collection of knowledge assets.
     */
    LIBRARY,
    /**
     * Identifies two or more records (resource instances) that refer to the same
     * real-world "occurrence".
     */
    LINKAGE,
    /**
     * A list is a curated collection of resources.
     */
    LIST,
    /**
     * Details and position information for a physical place where services are
     * provided and resources and participants may be stored, found, contained, or
     * accommodated.
     */
    LOCATION,
    /**
     * The Measure resource provides the definition of a quality measure.
     */
    MEASURE,
    /**
     * The MeasureReport resource contains the results of the calculation of a
     * measure; and optionally a reference to the resources involved in that
     * calculation.
     */
    MEASUREREPORT,
    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual
     * content may be inline or provided by direct reference.
     */
    MEDIA,
    /**
     * This resource is primarily used for the identification and definition of a
     * medication for the purposes of prescribing, dispensing, and administering a
     * medication as well as for making statements about medication use.
     */
    MEDICATION,
    /**
     * Describes the event of a patient consuming or otherwise being administered a
     * medication. This may be as simple as swallowing a tablet or it may be a long
     * running infusion. Related resources tie this event to the authorizing
     * prescription, and the specific encounter between patient and health care
     * practitioner.
     */
    MEDICATIONADMINISTRATION,
    /**
     * Indicates that a medication product is to be or has been dispensed for a
     * named person/patient. This includes a description of the medication product
     * (supply) provided and the instructions for administering the medication. The
     * medication dispense is the result of a pharmacy system responding to a
     * medication order.
     */
    MEDICATIONDISPENSE,
    /**
     * Information about a medication that is used to support knowledge.
     */
    MEDICATIONKNOWLEDGE,
    /**
     * An order or request for both supply of the medication and the instructions
     * for administration of the medication to a patient. The resource is called
     * "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder"
     * to generalize the use across inpatient and outpatient settings, including
     * care plans, etc., and to harmonize with workflow patterns.
     */
    MEDICATIONREQUEST,
    /**
     * A record of a medication that is being consumed by a patient. A
     * MedicationStatement may indicate that the patient may be taking the
     * medication now or has taken the medication in the past or will be taking the
     * medication in the future. The source of this information can be the patient,
     * significant other (such as a family member or spouse), or a clinician. A
     * common scenario where this information is captured is during the history
     * taking process during a patient visit or stay. The medication information may
     * come from sources such as the patient's memory, from a prescription bottle,
     * or from a list of medications the patient, clinician or other party
     * maintains.
     * 
     * The primary difference between a medication statement and a medication
     * administration is that the medication administration has complete
     * administration information and is based on actual administration information
     * from the person who administered the medication. A medication statement is
     * often, if not always, less specific. There is no required date/time when the
     * medication was administered, in fact we only know that a source has reported
     * the patient is taking this medication, where details such as time, quantity,
     * or rate or even medication product may be incomplete or missing or less
     * precise. As stated earlier, the medication statement information may come
     * from the patient's memory, from a prescription bottle or from a list of
     * medications the patient, clinician or other party maintains. Medication
     * administration is more formal and is not missing detailed information.
     */
    MEDICATIONSTATEMENT,
    /**
     * Detailed definition of a medicinal product, typically for uses other than
     * direct patient care (e.g. regulatory use).
     */
    MEDICINALPRODUCT,
    /**
     * The regulatory authorization of a medicinal product.
     */
    MEDICINALPRODUCTAUTHORIZATION,
    /**
     * The clinical particulars - indications, contraindications etc. of a medicinal
     * product, including for regulatory purposes.
     */
    MEDICINALPRODUCTCONTRAINDICATION,
    /**
     * Indication for the Medicinal Product.
     */
    MEDICINALPRODUCTINDICATION,
    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    MEDICINALPRODUCTINGREDIENT,
    /**
     * The interactions of the medicinal product with other medicinal products, or
     * other forms of interactions.
     */
    MEDICINALPRODUCTINTERACTION,
    /**
     * The manufactured item as contained in the packaged medicinal product.
     */
    MEDICINALPRODUCTMANUFACTURED,
    /**
     * A medicinal product in a container or package.
     */
    MEDICINALPRODUCTPACKAGED,
    /**
     * A pharmaceutical product described in terms of its composition and dose form.
     */
    MEDICINALPRODUCTPHARMACEUTICAL,
    /**
     * Describe the undesirable effects of the medicinal product.
     */
    MEDICINALPRODUCTUNDESIRABLEEFFECT,
    /**
     * Defines the characteristics of a message that can be shared between systems,
     * including the type of event that initiates the message, the content to be
     * transmitted and what response(s), if any, are permitted.
     */
    MESSAGEDEFINITION,
    /**
     * The header for a message exchange that is either requesting or responding to
     * an action. The reference(s) that are the subject of the action as well as
     * other information related to the action are typically transmitted in a bundle
     * in which the MessageHeader resource instance is the first resource in the
     * bundle.
     */
    MESSAGEHEADER,
    /**
     * Raw data describing a biological sequence.
     */
    MOLECULARSEQUENCE,
    /**
     * A curated namespace that issues unique symbols within that namespace for the
     * identification of concepts, people, devices, etc. Represents a "System" used
     * within the Identifier and Coding data types.
     */
    NAMINGSYSTEM,
    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional
     * supplement to a patient/resident.
     */
    NUTRITIONORDER,
    /**
     * Measurements and simple assertions made about a patient, device or other
     * subject.
     */
    OBSERVATION,
    /**
     * Set of definitional characteristics for a kind of observation or measurement
     * produced or consumed by an orderable health care service.
     */
    OBSERVATIONDEFINITION,
    /**
     * A formal computable definition of an operation (on the RESTful interface) or
     * a named query (using the search interaction).
     */
    OPERATIONDEFINITION,
    /**
     * A collection of error, warning, or information messages that result from a
     * system action.
     */
    OPERATIONOUTCOME,
    /**
     * A formally or informally recognized grouping of people or organizations
     * formed for the purpose of achieving some form of collective action. Includes
     * companies, institutions, corporations, departments, community groups,
     * healthcare practice groups, payer/insurer, etc.
     */
    ORGANIZATION,
    /**
     * Defines an affiliation/assotiation/relationship between 2 distinct
     * oganizations, that is not a part-of relationship/sub-division relationship.
     */
    ORGANIZATIONAFFILIATION,
    /**
     * This resource is a non-persisted resource used to pass information into and
     * back from an [operation](operations.html). It has no other use, and there is
     * no RESTful endpoint associated with it.
     */
    PARAMETERS,
    /**
     * Demographics and other administrative information about an individual or
     * animal receiving care or other health-related services.
     */
    PATIENT,
    /**
     * This resource provides the status of the payment for goods and services
     * rendered, and the request and response resource references.
     */
    PAYMENTNOTICE,
    /**
     * This resource provides the details including amount of a payment and
     * allocates the payment items being paid.
     */
    PAYMENTRECONCILIATION,
    /**
     * Demographics and administrative information about a person independent of a
     * specific health-related context.
     */
    PERSON,
    /**
     * This resource allows for the definition of various types of plans as a
     * sharable, consumable, and executable artifact. The resource is general enough
     * to support the description of a broad range of clinical artifacts such as
     * clinical decision support rules, order sets and protocols.
     */
    PLANDEFINITION,
    /**
     * A person who is directly or indirectly involved in the provisioning of
     * healthcare.
     */
    PRACTITIONER,
    /**
     * A specific set of Roles/Locations/specialties/services that a practitioner
     * may perform at an organization for a period of time.
     */
    PRACTITIONERROLE,
    /**
     * An action that is or was performed on or for a patient. This can be a
     * physical intervention like an operation, or less invasive like long term
     * services, counseling, or hypnotherapy.
     */
    PROCEDURE,
    /**
     * Provenance of a resource is a record that describes entities and processes
     * involved in producing and delivering or otherwise influencing that resource.
     * Provenance provides a critical foundation for assessing authenticity,
     * enabling trust, and allowing reproducibility. Provenance assertions are a
     * form of contextual metadata and can themselves become important records with
     * their own provenance. Provenance statement indicates clinical significance in
     * terms of confidence in authenticity, reliability, and trustworthiness,
     * integrity, and stage in lifecycle (e.g. Document Completion - has the
     * artifact been legally authenticated), all of which may impact security,
     * privacy, and trust policies.
     */
    PROVENANCE,
    /**
     * A structured set of questions intended to guide the collection of answers
     * from end-users. Questionnaires provide detailed control over order,
     * presentation, phraseology and grouping to allow coherent, consistent data
     * collection.
     */
    QUESTIONNAIRE,
    /**
     * A structured set of questions and their answers. The questions are ordered
     * and grouped into coherent subsets, corresponding to the structure of the
     * grouping of the questionnaire being responded to.
     */
    QUESTIONNAIRERESPONSE,
    /**
     * Information about a person that is involved in the care for a patient, but
     * who is not the target of healthcare, nor has a formal responsibility in the
     * care process.
     */
    RELATEDPERSON,
    /**
     * A group of related requests that can be used to capture intended activities
     * that have inter-dependencies such as "give this medication after that one".
     */
    REQUESTGROUP,
    /**
     * The ResearchDefinition resource describes the conditional state (population
     * and any exposures being compared within the population) and outcome (if
     * specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    RESEARCHDEFINITION,
    /**
     * The ResearchElementDefinition resource describes a "PICO" element that
     * knowledge (evidence, assertion, recommendation) is about.
     */
    RESEARCHELEMENTDEFINITION,
    /**
     * A process where a researcher or organization plans and then executes a series
     * of steps intended to increase the field of healthcare-related knowledge. This
     * includes studies of safety, efficacy, comparative effectiveness and other
     * information about medications, devices, therapies and other interventional
     * and investigative techniques. A ResearchStudy involves the gathering of
     * information about human or animal subjects.
     */
    RESEARCHSTUDY,
    /**
     * A physical entity which is the primary unit of operational and/or
     * administrative interest in a study.
     */
    RESEARCHSUBJECT,
    /**
     * This is the base resource type for everything.
     */
    RESOURCE,
    /**
     * An assessment of the likely outcome(s) for a patient or other subject as well
     * as the likelihood of each outcome.
     */
    RISKASSESSMENT,
    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in
     * a population plus exposure state where the risk estimate is derived from a
     * combination of research studies.
     */
    RISKEVIDENCESYNTHESIS,
    /**
     * A container for slots of time that may be available for booking appointments.
     */
    SCHEDULE,
    /**
     * A search parameter that defines a named search item that can be used to
     * search/filter on a resource.
     */
    SEARCHPARAMETER,
    /**
     * A record of a request for service such as diagnostic investigations,
     * treatments, or operations to be performed.
     */
    SERVICEREQUEST,
    /**
     * A slot of time on a schedule that may be available for booking appointments.
     */
    SLOT,
    /**
     * A sample to be used for analysis.
     */
    SPECIMEN,
    /**
     * A kind of specimen with associated set of requirements.
     */
    SPECIMENDEFINITION,
    /**
     * A definition of a FHIR structure. This resource is used to describe the
     * underlying resources, data types defined in FHIR, and also for describing
     * extensions and constraints on resources and data types.
     */
    STRUCTUREDEFINITION,
    /**
     * A Map of relationships between 2 structures that can be used to transform
     * data.
     */
    STRUCTUREMAP,
    /**
     * The subscription resource is used to define a push-based subscription from a
     * server to another system. Once a subscription is registered with the server,
     * the server checks every resource that is created or updated, and if the
     * resource matches the given criteria, it sends a message on the defined
     * "channel" so that another system can take an appropriate action.
     */
    SUBSCRIPTION,
    /**
     * A homogeneous material with a definite composition.
     */
    SUBSTANCE,
    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar and
     * linkage. Individual substance/moiety IDs will be created for each of these
     * elements. The nucleotide sequence will be always entered in the 5’-3’
     * direction.
     */
    SUBSTANCENUCLEICACID,
    /**
     * Todo.
     */
    SUBSTANCEPOLYMER,
    /**
     * A SubstanceProtein is defined as a single unit of a linear amino acid
     * sequence, or a combination of subunits that are either covalently linked or
     * have a defined invariant stoichiometric relationship. This includes all
     * synthetic, recombinant and purified SubstanceProteins of defined sequence,
     * whether the use is therapeutic or prophylactic. This set of elements will be
     * used to describe albumins, coagulation factors, cytokines, growth factors,
     * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant
     * vaccines, and immunomodulators.
     */
    SUBSTANCEPROTEIN,
    /**
     * Todo.
     */
    SUBSTANCEREFERENCEINFORMATION,
    /**
     * Source material shall capture information on the taxonomic and anatomical
     * origins as well as the fraction of a material that can result in or can be
     * modified to form a substance. This set of data elements shall be used to
     * define polymer substances isolated from biological matrices. Taxonomic and
     * anatomical origins shall be described using a controlled vocabulary as
     * required. This information is captured for naturally derived polymers ( .
     * starch) and structurally diverse substances. For Organisms belonging to the
     * Kingdom Plantae the Substance level defines the fresh material of a single
     * species or infraspecies, the Herbal Drug and the Herbal preparation. For
     * Herbal preparations, the fraction information will be captured at the
     * Substance information level and additional information for herbal extracts
     * will be captured at the Specified Substance Group 1 information level. See
     * for further explanation the Substance Class: Structurally Diverse and the
     * herbal annex.
     */
    SUBSTANCESOURCEMATERIAL,
    /**
     * The detailed description of a substance, typically at a level beyond what is
     * used for prescribing.
     */
    SUBSTANCESPECIFICATION,
    /**
     * Record of delivery of what is supplied.
     */
    SUPPLYDELIVERY,
    /**
     * A record of a request for a medication, substance or device used in the
     * healthcare setting.
     */
    SUPPLYREQUEST,
    /**
     * A task to be performed.
     */
    TASK,
    /**
     * A Terminology Capabilities documents a set of capabilities (behaviors) of a
     * FHIR Server that may be used as a statement of actual server functionality or
     * a statement of required or desired server implementation.
     */
    TERMINOLOGYCAPABILITIES,
    /**
     * A summary of information based on the results of executing a TestScript.
     */
    TESTREPORT,
    /**
     * A structured set of tests against a FHIR server or client implementation to
     * determine compliance against the FHIR specification.
     */
    TESTSCRIPT,
    /**
     * A ValueSet resource instance specifies a set of codes drawn from one or more
     * code systems, intended for use in a particular context. Value sets link
     * between [[[CodeSystem]]] definitions and their use in [coded
     * elements](terminologies.html).
     */
    VALUESET,
    /**
     * Describes validation requirements, source(s), status and dates for one or
     * more elements.
     */
    VERIFICATIONRESULT,
    /**
     * An authorization for the provision of glasses and/or contact lenses to a
     * patient.
     */
    VISIONPRESCRIPTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static FHIRDefinedType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("Address".equals(codeString))
        return ADDRESS;
      if ("Age".equals(codeString))
        return AGE;
      if ("Annotation".equals(codeString))
        return ANNOTATION;
      if ("Attachment".equals(codeString))
        return ATTACHMENT;
      if ("BackboneElement".equals(codeString))
        return BACKBONEELEMENT;
      if ("CodeableConcept".equals(codeString))
        return CODEABLECONCEPT;
      if ("Coding".equals(codeString))
        return CODING;
      if ("ContactDetail".equals(codeString))
        return CONTACTDETAIL;
      if ("ContactPoint".equals(codeString))
        return CONTACTPOINT;
      if ("Contributor".equals(codeString))
        return CONTRIBUTOR;
      if ("Count".equals(codeString))
        return COUNT;
      if ("DataRequirement".equals(codeString))
        return DATAREQUIREMENT;
      if ("Distance".equals(codeString))
        return DISTANCE;
      if ("Dosage".equals(codeString))
        return DOSAGE;
      if ("Duration".equals(codeString))
        return DURATION;
      if ("Element".equals(codeString))
        return ELEMENT;
      if ("ElementDefinition".equals(codeString))
        return ELEMENTDEFINITION;
      if ("Expression".equals(codeString))
        return EXPRESSION;
      if ("Extension".equals(codeString))
        return EXTENSION;
      if ("HumanName".equals(codeString))
        return HUMANNAME;
      if ("Identifier".equals(codeString))
        return IDENTIFIER;
      if ("MarketingStatus".equals(codeString))
        return MARKETINGSTATUS;
      if ("Meta".equals(codeString))
        return META;
      if ("Money".equals(codeString))
        return MONEY;
      if ("MoneyQuantity".equals(codeString))
        return MONEYQUANTITY;
      if ("Narrative".equals(codeString))
        return NARRATIVE;
      if ("ParameterDefinition".equals(codeString))
        return PARAMETERDEFINITION;
      if ("Period".equals(codeString))
        return PERIOD;
      if ("Population".equals(codeString))
        return POPULATION;
      if ("ProdCharacteristic".equals(codeString))
        return PRODCHARACTERISTIC;
      if ("ProductShelfLife".equals(codeString))
        return PRODUCTSHELFLIFE;
      if ("Quantity".equals(codeString))
        return QUANTITY;
      if ("Range".equals(codeString))
        return RANGE;
      if ("Ratio".equals(codeString))
        return RATIO;
      if ("Reference".equals(codeString))
        return REFERENCE;
      if ("RelatedArtifact".equals(codeString))
        return RELATEDARTIFACT;
      if ("SampledData".equals(codeString))
        return SAMPLEDDATA;
      if ("Signature".equals(codeString))
        return SIGNATURE;
      if ("SimpleQuantity".equals(codeString))
        return SIMPLEQUANTITY;
      if ("SubstanceAmount".equals(codeString))
        return SUBSTANCEAMOUNT;
      if ("Timing".equals(codeString))
        return TIMING;
      if ("TriggerDefinition".equals(codeString))
        return TRIGGERDEFINITION;
      if ("UsageContext".equals(codeString))
        return USAGECONTEXT;
      if ("base64Binary".equals(codeString))
        return BASE64BINARY;
      if ("boolean".equals(codeString))
        return BOOLEAN;
      if ("canonical".equals(codeString))
        return CANONICAL;
      if ("code".equals(codeString))
        return CODE;
      if ("date".equals(codeString))
        return DATE;
      if ("dateTime".equals(codeString))
        return DATETIME;
      if ("decimal".equals(codeString))
        return DECIMAL;
      if ("id".equals(codeString))
        return ID;
      if ("instant".equals(codeString))
        return INSTANT;
      if ("integer".equals(codeString))
        return INTEGER;
      if ("markdown".equals(codeString))
        return MARKDOWN;
      if ("oid".equals(codeString))
        return OID;
      if ("positiveInt".equals(codeString))
        return POSITIVEINT;
      if ("string".equals(codeString))
        return STRING;
      if ("time".equals(codeString))
        return TIME;
      if ("unsignedInt".equals(codeString))
        return UNSIGNEDINT;
      if ("uri".equals(codeString))
        return URI;
      if ("url".equals(codeString))
        return URL;
      if ("uuid".equals(codeString))
        return UUID;
      if ("xhtml".equals(codeString))
        return XHTML;
      if ("Account".equals(codeString))
        return ACCOUNT;
      if ("ActivityDefinition".equals(codeString))
        return ACTIVITYDEFINITION;
      if ("AdverseEvent".equals(codeString))
        return ADVERSEEVENT;
      if ("AllergyIntolerance".equals(codeString))
        return ALLERGYINTOLERANCE;
      if ("Appointment".equals(codeString))
        return APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return APPOINTMENTRESPONSE;
      if ("AuditEvent".equals(codeString))
        return AUDITEVENT;
      if ("Basic".equals(codeString))
        return BASIC;
      if ("Binary".equals(codeString))
        return BINARY;
      if ("BiologicallyDerivedProduct".equals(codeString))
        return BIOLOGICALLYDERIVEDPRODUCT;
      if ("BodyStructure".equals(codeString))
        return BODYSTRUCTURE;
      if ("Bundle".equals(codeString))
        return BUNDLE;
      if ("CapabilityStatement".equals(codeString))
        return CAPABILITYSTATEMENT;
      if ("CarePlan".equals(codeString))
        return CAREPLAN;
      if ("CareTeam".equals(codeString))
        return CARETEAM;
      if ("CatalogEntry".equals(codeString))
        return CATALOGENTRY;
      if ("ChargeItem".equals(codeString))
        return CHARGEITEM;
      if ("ChargeItemDefinition".equals(codeString))
        return CHARGEITEMDEFINITION;
      if ("Claim".equals(codeString))
        return CLAIM;
      if ("ClaimResponse".equals(codeString))
        return CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return CLINICALIMPRESSION;
      if ("CodeSystem".equals(codeString))
        return CODESYSTEM;
      if ("Communication".equals(codeString))
        return COMMUNICATION;
      if ("CommunicationRequest".equals(codeString))
        return COMMUNICATIONREQUEST;
      if ("CompartmentDefinition".equals(codeString))
        return COMPARTMENTDEFINITION;
      if ("Composition".equals(codeString))
        return COMPOSITION;
      if ("ConceptMap".equals(codeString))
        return CONCEPTMAP;
      if ("Condition".equals(codeString))
        return CONDITION;
      if ("Consent".equals(codeString))
        return CONSENT;
      if ("Contract".equals(codeString))
        return CONTRACT;
      if ("Coverage".equals(codeString))
        return COVERAGE;
      if ("CoverageEligibilityRequest".equals(codeString))
        return COVERAGEELIGIBILITYREQUEST;
      if ("CoverageEligibilityResponse".equals(codeString))
        return COVERAGEELIGIBILITYRESPONSE;
      if ("DetectedIssue".equals(codeString))
        return DETECTEDISSUE;
      if ("Device".equals(codeString))
        return DEVICE;
      if ("DeviceDefinition".equals(codeString))
        return DEVICEDEFINITION;
      if ("DeviceMetric".equals(codeString))
        return DEVICEMETRIC;
      if ("DeviceRequest".equals(codeString))
        return DEVICEREQUEST;
      if ("DeviceUseStatement".equals(codeString))
        return DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return DOCUMENTREFERENCE;
      if ("DomainResource".equals(codeString))
        return DOMAINRESOURCE;
      if ("EffectEvidenceSynthesis".equals(codeString))
        return EFFECTEVIDENCESYNTHESIS;
      if ("Encounter".equals(codeString))
        return ENCOUNTER;
      if ("Endpoint".equals(codeString))
        return ENDPOINT;
      if ("EnrollmentRequest".equals(codeString))
        return ENROLLMENTREQUEST;
      if ("EnrollmentResponse".equals(codeString))
        return ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return EPISODEOFCARE;
      if ("EventDefinition".equals(codeString))
        return EVENTDEFINITION;
      if ("Evidence".equals(codeString))
        return EVIDENCE;
      if ("EvidenceVariable".equals(codeString))
        return EVIDENCEVARIABLE;
      if ("ExampleScenario".equals(codeString))
        return EXAMPLESCENARIO;
      if ("ExplanationOfBenefit".equals(codeString))
        return EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return FAMILYMEMBERHISTORY;
      if ("Flag".equals(codeString))
        return FLAG;
      if ("Goal".equals(codeString))
        return GOAL;
      if ("GraphDefinition".equals(codeString))
        return GRAPHDEFINITION;
      if ("Group".equals(codeString))
        return GROUP;
      if ("GuidanceResponse".equals(codeString))
        return GUIDANCERESPONSE;
      if ("HealthcareService".equals(codeString))
        return HEALTHCARESERVICE;
      if ("ImagingStudy".equals(codeString))
        return IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return IMMUNIZATION;
      if ("ImmunizationEvaluation".equals(codeString))
        return IMMUNIZATIONEVALUATION;
      if ("ImmunizationRecommendation".equals(codeString))
        return IMMUNIZATIONRECOMMENDATION;
      if ("ImplementationGuide".equals(codeString))
        return IMPLEMENTATIONGUIDE;
      if ("InsurancePlan".equals(codeString))
        return INSURANCEPLAN;
      if ("Invoice".equals(codeString))
        return INVOICE;
      if ("Library".equals(codeString))
        return LIBRARY;
      if ("Linkage".equals(codeString))
        return LINKAGE;
      if ("List".equals(codeString))
        return LIST;
      if ("Location".equals(codeString))
        return LOCATION;
      if ("Measure".equals(codeString))
        return MEASURE;
      if ("MeasureReport".equals(codeString))
        return MEASUREREPORT;
      if ("Media".equals(codeString))
        return MEDIA;
      if ("Medication".equals(codeString))
        return MEDICATION;
      if ("MedicationAdministration".equals(codeString))
        return MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return MEDICATIONDISPENSE;
      if ("MedicationKnowledge".equals(codeString))
        return MEDICATIONKNOWLEDGE;
      if ("MedicationRequest".equals(codeString))
        return MEDICATIONREQUEST;
      if ("MedicationStatement".equals(codeString))
        return MEDICATIONSTATEMENT;
      if ("MedicinalProduct".equals(codeString))
        return MEDICINALPRODUCT;
      if ("MedicinalProductAuthorization".equals(codeString))
        return MEDICINALPRODUCTAUTHORIZATION;
      if ("MedicinalProductContraindication".equals(codeString))
        return MEDICINALPRODUCTCONTRAINDICATION;
      if ("MedicinalProductIndication".equals(codeString))
        return MEDICINALPRODUCTINDICATION;
      if ("MedicinalProductIngredient".equals(codeString))
        return MEDICINALPRODUCTINGREDIENT;
      if ("MedicinalProductInteraction".equals(codeString))
        return MEDICINALPRODUCTINTERACTION;
      if ("MedicinalProductManufactured".equals(codeString))
        return MEDICINALPRODUCTMANUFACTURED;
      if ("MedicinalProductPackaged".equals(codeString))
        return MEDICINALPRODUCTPACKAGED;
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return MEDICINALPRODUCTPHARMACEUTICAL;
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return MEDICINALPRODUCTUNDESIRABLEEFFECT;
      if ("MessageDefinition".equals(codeString))
        return MESSAGEDEFINITION;
      if ("MessageHeader".equals(codeString))
        return MESSAGEHEADER;
      if ("MolecularSequence".equals(codeString))
        return MOLECULARSEQUENCE;
      if ("NamingSystem".equals(codeString))
        return NAMINGSYSTEM;
      if ("NutritionOrder".equals(codeString))
        return NUTRITIONORDER;
      if ("Observation".equals(codeString))
        return OBSERVATION;
      if ("ObservationDefinition".equals(codeString))
        return OBSERVATIONDEFINITION;
      if ("OperationDefinition".equals(codeString))
        return OPERATIONDEFINITION;
      if ("OperationOutcome".equals(codeString))
        return OPERATIONOUTCOME;
      if ("Organization".equals(codeString))
        return ORGANIZATION;
      if ("OrganizationAffiliation".equals(codeString))
        return ORGANIZATIONAFFILIATION;
      if ("Parameters".equals(codeString))
        return PARAMETERS;
      if ("Patient".equals(codeString))
        return PATIENT;
      if ("PaymentNotice".equals(codeString))
        return PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return PAYMENTRECONCILIATION;
      if ("Person".equals(codeString))
        return PERSON;
      if ("PlanDefinition".equals(codeString))
        return PLANDEFINITION;
      if ("Practitioner".equals(codeString))
        return PRACTITIONER;
      if ("PractitionerRole".equals(codeString))
        return PRACTITIONERROLE;
      if ("Procedure".equals(codeString))
        return PROCEDURE;
      if ("Provenance".equals(codeString))
        return PROVENANCE;
      if ("Questionnaire".equals(codeString))
        return QUESTIONNAIRE;
      if ("QuestionnaireResponse".equals(codeString))
        return QUESTIONNAIRERESPONSE;
      if ("RelatedPerson".equals(codeString))
        return RELATEDPERSON;
      if ("RequestGroup".equals(codeString))
        return REQUESTGROUP;
      if ("ResearchDefinition".equals(codeString))
        return RESEARCHDEFINITION;
      if ("ResearchElementDefinition".equals(codeString))
        return RESEARCHELEMENTDEFINITION;
      if ("ResearchStudy".equals(codeString))
        return RESEARCHSTUDY;
      if ("ResearchSubject".equals(codeString))
        return RESEARCHSUBJECT;
      if ("Resource".equals(codeString))
        return RESOURCE;
      if ("RiskAssessment".equals(codeString))
        return RISKASSESSMENT;
      if ("RiskEvidenceSynthesis".equals(codeString))
        return RISKEVIDENCESYNTHESIS;
      if ("Schedule".equals(codeString))
        return SCHEDULE;
      if ("SearchParameter".equals(codeString))
        return SEARCHPARAMETER;
      if ("ServiceRequest".equals(codeString))
        return SERVICEREQUEST;
      if ("Slot".equals(codeString))
        return SLOT;
      if ("Specimen".equals(codeString))
        return SPECIMEN;
      if ("SpecimenDefinition".equals(codeString))
        return SPECIMENDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return STRUCTUREMAP;
      if ("Subscription".equals(codeString))
        return SUBSCRIPTION;
      if ("Substance".equals(codeString))
        return SUBSTANCE;
      if ("SubstanceNucleicAcid".equals(codeString))
        return SUBSTANCENUCLEICACID;
      if ("SubstancePolymer".equals(codeString))
        return SUBSTANCEPOLYMER;
      if ("SubstanceProtein".equals(codeString))
        return SUBSTANCEPROTEIN;
      if ("SubstanceReferenceInformation".equals(codeString))
        return SUBSTANCEREFERENCEINFORMATION;
      if ("SubstanceSourceMaterial".equals(codeString))
        return SUBSTANCESOURCEMATERIAL;
      if ("SubstanceSpecification".equals(codeString))
        return SUBSTANCESPECIFICATION;
      if ("SupplyDelivery".equals(codeString))
        return SUPPLYDELIVERY;
      if ("SupplyRequest".equals(codeString))
        return SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return TASK;
      if ("TerminologyCapabilities".equals(codeString))
        return TERMINOLOGYCAPABILITIES;
      if ("TestReport".equals(codeString))
        return TESTREPORT;
      if ("TestScript".equals(codeString))
        return TESTSCRIPT;
      if ("ValueSet".equals(codeString))
        return VALUESET;
      if ("VerificationResult".equals(codeString))
        return VERIFICATIONRESULT;
      if ("VisionPrescription".equals(codeString))
        return VISIONPRESCRIPTION;
      throw new FHIRException("Unknown FHIRDefinedType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ADDRESS:
        return "Address";
      case AGE:
        return "Age";
      case ANNOTATION:
        return "Annotation";
      case ATTACHMENT:
        return "Attachment";
      case BACKBONEELEMENT:
        return "BackboneElement";
      case CODEABLECONCEPT:
        return "CodeableConcept";
      case CODING:
        return "Coding";
      case CONTACTDETAIL:
        return "ContactDetail";
      case CONTACTPOINT:
        return "ContactPoint";
      case CONTRIBUTOR:
        return "Contributor";
      case COUNT:
        return "Count";
      case DATAREQUIREMENT:
        return "DataRequirement";
      case DISTANCE:
        return "Distance";
      case DOSAGE:
        return "Dosage";
      case DURATION:
        return "Duration";
      case ELEMENT:
        return "Element";
      case ELEMENTDEFINITION:
        return "ElementDefinition";
      case EXPRESSION:
        return "Expression";
      case EXTENSION:
        return "Extension";
      case HUMANNAME:
        return "HumanName";
      case IDENTIFIER:
        return "Identifier";
      case MARKETINGSTATUS:
        return "MarketingStatus";
      case META:
        return "Meta";
      case MONEY:
        return "Money";
      case MONEYQUANTITY:
        return "MoneyQuantity";
      case NARRATIVE:
        return "Narrative";
      case PARAMETERDEFINITION:
        return "ParameterDefinition";
      case PERIOD:
        return "Period";
      case POPULATION:
        return "Population";
      case PRODCHARACTERISTIC:
        return "ProdCharacteristic";
      case PRODUCTSHELFLIFE:
        return "ProductShelfLife";
      case QUANTITY:
        return "Quantity";
      case RANGE:
        return "Range";
      case RATIO:
        return "Ratio";
      case REFERENCE:
        return "Reference";
      case RELATEDARTIFACT:
        return "RelatedArtifact";
      case SAMPLEDDATA:
        return "SampledData";
      case SIGNATURE:
        return "Signature";
      case SIMPLEQUANTITY:
        return "SimpleQuantity";
      case SUBSTANCEAMOUNT:
        return "SubstanceAmount";
      case TIMING:
        return "Timing";
      case TRIGGERDEFINITION:
        return "TriggerDefinition";
      case USAGECONTEXT:
        return "UsageContext";
      case BASE64BINARY:
        return "base64Binary";
      case BOOLEAN:
        return "boolean";
      case CANONICAL:
        return "canonical";
      case CODE:
        return "code";
      case DATE:
        return "date";
      case DATETIME:
        return "dateTime";
      case DECIMAL:
        return "decimal";
      case ID:
        return "id";
      case INSTANT:
        return "instant";
      case INTEGER:
        return "integer";
      case MARKDOWN:
        return "markdown";
      case OID:
        return "oid";
      case POSITIVEINT:
        return "positiveInt";
      case STRING:
        return "string";
      case TIME:
        return "time";
      case UNSIGNEDINT:
        return "unsignedInt";
      case URI:
        return "uri";
      case URL:
        return "url";
      case UUID:
        return "uuid";
      case XHTML:
        return "xhtml";
      case ACCOUNT:
        return "Account";
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case ADVERSEEVENT:
        return "AdverseEvent";
      case ALLERGYINTOLERANCE:
        return "AllergyIntolerance";
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case AUDITEVENT:
        return "AuditEvent";
      case BASIC:
        return "Basic";
      case BINARY:
        return "Binary";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "BiologicallyDerivedProduct";
      case BODYSTRUCTURE:
        return "BodyStructure";
      case BUNDLE:
        return "Bundle";
      case CAPABILITYSTATEMENT:
        return "CapabilityStatement";
      case CAREPLAN:
        return "CarePlan";
      case CARETEAM:
        return "CareTeam";
      case CATALOGENTRY:
        return "CatalogEntry";
      case CHARGEITEM:
        return "ChargeItem";
      case CHARGEITEMDEFINITION:
        return "ChargeItemDefinition";
      case CLAIM:
        return "Claim";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case CODESYSTEM:
        return "CodeSystem";
      case COMMUNICATION:
        return "Communication";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case COMPARTMENTDEFINITION:
        return "CompartmentDefinition";
      case COMPOSITION:
        return "Composition";
      case CONCEPTMAP:
        return "ConceptMap";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case CONTRACT:
        return "Contract";
      case COVERAGE:
        return "Coverage";
      case COVERAGEELIGIBILITYREQUEST:
        return "CoverageEligibilityRequest";
      case COVERAGEELIGIBILITYRESPONSE:
        return "CoverageEligibilityResponse";
      case DETECTEDISSUE:
        return "DetectedIssue";
      case DEVICE:
        return "Device";
      case DEVICEDEFINITION:
        return "DeviceDefinition";
      case DEVICEMETRIC:
        return "DeviceMetric";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case DOMAINRESOURCE:
        return "DomainResource";
      case EFFECTEVIDENCESYNTHESIS:
        return "EffectEvidenceSynthesis";
      case ENCOUNTER:
        return "Encounter";
      case ENDPOINT:
        return "Endpoint";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EVENTDEFINITION:
        return "EventDefinition";
      case EVIDENCE:
        return "Evidence";
      case EVIDENCEVARIABLE:
        return "EvidenceVariable";
      case EXAMPLESCENARIO:
        return "ExampleScenario";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case FLAG:
        return "Flag";
      case GOAL:
        return "Goal";
      case GRAPHDEFINITION:
        return "GraphDefinition";
      case GROUP:
        return "Group";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case HEALTHCARESERVICE:
        return "HealthcareService";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case IMMUNIZATIONEVALUATION:
        return "ImmunizationEvaluation";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case IMPLEMENTATIONGUIDE:
        return "ImplementationGuide";
      case INSURANCEPLAN:
        return "InsurancePlan";
      case INVOICE:
        return "Invoice";
      case LIBRARY:
        return "Library";
      case LINKAGE:
        return "Linkage";
      case LIST:
        return "List";
      case LOCATION:
        return "Location";
      case MEASURE:
        return "Measure";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATION:
        return "Medication";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONKNOWLEDGE:
        return "MedicationKnowledge";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case MEDICINALPRODUCT:
        return "MedicinalProduct";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "MedicinalProductAuthorization";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "MedicinalProductContraindication";
      case MEDICINALPRODUCTINDICATION:
        return "MedicinalProductIndication";
      case MEDICINALPRODUCTINGREDIENT:
        return "MedicinalProductIngredient";
      case MEDICINALPRODUCTINTERACTION:
        return "MedicinalProductInteraction";
      case MEDICINALPRODUCTMANUFACTURED:
        return "MedicinalProductManufactured";
      case MEDICINALPRODUCTPACKAGED:
        return "MedicinalProductPackaged";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "MedicinalProductPharmaceutical";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "MedicinalProductUndesirableEffect";
      case MESSAGEDEFINITION:
        return "MessageDefinition";
      case MESSAGEHEADER:
        return "MessageHeader";
      case MOLECULARSEQUENCE:
        return "MolecularSequence";
      case NAMINGSYSTEM:
        return "NamingSystem";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case OBSERVATION:
        return "Observation";
      case OBSERVATIONDEFINITION:
        return "ObservationDefinition";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case OPERATIONOUTCOME:
        return "OperationOutcome";
      case ORGANIZATION:
        return "Organization";
      case ORGANIZATIONAFFILIATION:
        return "OrganizationAffiliation";
      case PARAMETERS:
        return "Parameters";
      case PATIENT:
        return "Patient";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PERSON:
        return "Person";
      case PLANDEFINITION:
        return "PlanDefinition";
      case PRACTITIONER:
        return "Practitioner";
      case PRACTITIONERROLE:
        return "PractitionerRole";
      case PROCEDURE:
        return "Procedure";
      case PROVENANCE:
        return "Provenance";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RELATEDPERSON:
        return "RelatedPerson";
      case REQUESTGROUP:
        return "RequestGroup";
      case RESEARCHDEFINITION:
        return "ResearchDefinition";
      case RESEARCHELEMENTDEFINITION:
        return "ResearchElementDefinition";
      case RESEARCHSTUDY:
        return "ResearchStudy";
      case RESEARCHSUBJECT:
        return "ResearchSubject";
      case RESOURCE:
        return "Resource";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case RISKEVIDENCESYNTHESIS:
        return "RiskEvidenceSynthesis";
      case SCHEDULE:
        return "Schedule";
      case SEARCHPARAMETER:
        return "SearchParameter";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SLOT:
        return "Slot";
      case SPECIMEN:
        return "Specimen";
      case SPECIMENDEFINITION:
        return "SpecimenDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case SUBSCRIPTION:
        return "Subscription";
      case SUBSTANCE:
        return "Substance";
      case SUBSTANCENUCLEICACID:
        return "SubstanceNucleicAcid";
      case SUBSTANCEPOLYMER:
        return "SubstancePolymer";
      case SUBSTANCEPROTEIN:
        return "SubstanceProtein";
      case SUBSTANCEREFERENCEINFORMATION:
        return "SubstanceReferenceInformation";
      case SUBSTANCESOURCEMATERIAL:
        return "SubstanceSourceMaterial";
      case SUBSTANCESPECIFICATION:
        return "SubstanceSpecification";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case TERMINOLOGYCAPABILITIES:
        return "TerminologyCapabilities";
      case TESTREPORT:
        return "TestReport";
      case TESTSCRIPT:
        return "TestScript";
      case VALUESET:
        return "ValueSet";
      case VERIFICATIONRESULT:
        return "VerificationResult";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ADDRESS:
        return "http://hl7.org/fhir/data-types";
      case AGE:
        return "http://hl7.org/fhir/data-types";
      case ANNOTATION:
        return "http://hl7.org/fhir/data-types";
      case ATTACHMENT:
        return "http://hl7.org/fhir/data-types";
      case BACKBONEELEMENT:
        return "http://hl7.org/fhir/data-types";
      case CODEABLECONCEPT:
        return "http://hl7.org/fhir/data-types";
      case CODING:
        return "http://hl7.org/fhir/data-types";
      case CONTACTDETAIL:
        return "http://hl7.org/fhir/data-types";
      case CONTACTPOINT:
        return "http://hl7.org/fhir/data-types";
      case CONTRIBUTOR:
        return "http://hl7.org/fhir/data-types";
      case COUNT:
        return "http://hl7.org/fhir/data-types";
      case DATAREQUIREMENT:
        return "http://hl7.org/fhir/data-types";
      case DISTANCE:
        return "http://hl7.org/fhir/data-types";
      case DOSAGE:
        return "http://hl7.org/fhir/data-types";
      case DURATION:
        return "http://hl7.org/fhir/data-types";
      case ELEMENT:
        return "http://hl7.org/fhir/data-types";
      case ELEMENTDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case EXPRESSION:
        return "http://hl7.org/fhir/data-types";
      case EXTENSION:
        return "http://hl7.org/fhir/data-types";
      case HUMANNAME:
        return "http://hl7.org/fhir/data-types";
      case IDENTIFIER:
        return "http://hl7.org/fhir/data-types";
      case MARKETINGSTATUS:
        return "http://hl7.org/fhir/data-types";
      case META:
        return "http://hl7.org/fhir/data-types";
      case MONEY:
        return "http://hl7.org/fhir/data-types";
      case MONEYQUANTITY:
        return "http://hl7.org/fhir/data-types";
      case NARRATIVE:
        return "http://hl7.org/fhir/data-types";
      case PARAMETERDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case PERIOD:
        return "http://hl7.org/fhir/data-types";
      case POPULATION:
        return "http://hl7.org/fhir/data-types";
      case PRODCHARACTERISTIC:
        return "http://hl7.org/fhir/data-types";
      case PRODUCTSHELFLIFE:
        return "http://hl7.org/fhir/data-types";
      case QUANTITY:
        return "http://hl7.org/fhir/data-types";
      case RANGE:
        return "http://hl7.org/fhir/data-types";
      case RATIO:
        return "http://hl7.org/fhir/data-types";
      case REFERENCE:
        return "http://hl7.org/fhir/data-types";
      case RELATEDARTIFACT:
        return "http://hl7.org/fhir/data-types";
      case SAMPLEDDATA:
        return "http://hl7.org/fhir/data-types";
      case SIGNATURE:
        return "http://hl7.org/fhir/data-types";
      case SIMPLEQUANTITY:
        return "http://hl7.org/fhir/data-types";
      case SUBSTANCEAMOUNT:
        return "http://hl7.org/fhir/data-types";
      case TIMING:
        return "http://hl7.org/fhir/data-types";
      case TRIGGERDEFINITION:
        return "http://hl7.org/fhir/data-types";
      case USAGECONTEXT:
        return "http://hl7.org/fhir/data-types";
      case BASE64BINARY:
        return "http://hl7.org/fhir/data-types";
      case BOOLEAN:
        return "http://hl7.org/fhir/data-types";
      case CANONICAL:
        return "http://hl7.org/fhir/data-types";
      case CODE:
        return "http://hl7.org/fhir/data-types";
      case DATE:
        return "http://hl7.org/fhir/data-types";
      case DATETIME:
        return "http://hl7.org/fhir/data-types";
      case DECIMAL:
        return "http://hl7.org/fhir/data-types";
      case ID:
        return "http://hl7.org/fhir/data-types";
      case INSTANT:
        return "http://hl7.org/fhir/data-types";
      case INTEGER:
        return "http://hl7.org/fhir/data-types";
      case MARKDOWN:
        return "http://hl7.org/fhir/data-types";
      case OID:
        return "http://hl7.org/fhir/data-types";
      case POSITIVEINT:
        return "http://hl7.org/fhir/data-types";
      case STRING:
        return "http://hl7.org/fhir/data-types";
      case TIME:
        return "http://hl7.org/fhir/data-types";
      case UNSIGNEDINT:
        return "http://hl7.org/fhir/data-types";
      case URI:
        return "http://hl7.org/fhir/data-types";
      case URL:
        return "http://hl7.org/fhir/data-types";
      case UUID:
        return "http://hl7.org/fhir/data-types";
      case XHTML:
        return "http://hl7.org/fhir/data-types";
      case ACCOUNT:
        return "http://hl7.org/fhir/resource-types";
      case ACTIVITYDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case ADVERSEEVENT:
        return "http://hl7.org/fhir/resource-types";
      case ALLERGYINTOLERANCE:
        return "http://hl7.org/fhir/resource-types";
      case APPOINTMENT:
        return "http://hl7.org/fhir/resource-types";
      case APPOINTMENTRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case AUDITEVENT:
        return "http://hl7.org/fhir/resource-types";
      case BASIC:
        return "http://hl7.org/fhir/resource-types";
      case BINARY:
        return "http://hl7.org/fhir/resource-types";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "http://hl7.org/fhir/resource-types";
      case BODYSTRUCTURE:
        return "http://hl7.org/fhir/resource-types";
      case BUNDLE:
        return "http://hl7.org/fhir/resource-types";
      case CAPABILITYSTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case CAREPLAN:
        return "http://hl7.org/fhir/resource-types";
      case CARETEAM:
        return "http://hl7.org/fhir/resource-types";
      case CATALOGENTRY:
        return "http://hl7.org/fhir/resource-types";
      case CHARGEITEM:
        return "http://hl7.org/fhir/resource-types";
      case CHARGEITEMDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case CLAIM:
        return "http://hl7.org/fhir/resource-types";
      case CLAIMRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case CLINICALIMPRESSION:
        return "http://hl7.org/fhir/resource-types";
      case CODESYSTEM:
        return "http://hl7.org/fhir/resource-types";
      case COMMUNICATION:
        return "http://hl7.org/fhir/resource-types";
      case COMMUNICATIONREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case COMPARTMENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case COMPOSITION:
        return "http://hl7.org/fhir/resource-types";
      case CONCEPTMAP:
        return "http://hl7.org/fhir/resource-types";
      case CONDITION:
        return "http://hl7.org/fhir/resource-types";
      case CONSENT:
        return "http://hl7.org/fhir/resource-types";
      case CONTRACT:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGE:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGEELIGIBILITYREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGEELIGIBILITYRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case DETECTEDISSUE:
        return "http://hl7.org/fhir/resource-types";
      case DEVICE:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEMETRIC:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEUSESTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case DIAGNOSTICREPORT:
        return "http://hl7.org/fhir/resource-types";
      case DOCUMENTMANIFEST:
        return "http://hl7.org/fhir/resource-types";
      case DOCUMENTREFERENCE:
        return "http://hl7.org/fhir/resource-types";
      case DOMAINRESOURCE:
        return "http://hl7.org/fhir/resource-types";
      case EFFECTEVIDENCESYNTHESIS:
        return "http://hl7.org/fhir/resource-types";
      case ENCOUNTER:
        return "http://hl7.org/fhir/resource-types";
      case ENDPOINT:
        return "http://hl7.org/fhir/resource-types";
      case ENROLLMENTREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case ENROLLMENTRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case EPISODEOFCARE:
        return "http://hl7.org/fhir/resource-types";
      case EVENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case EVIDENCE:
        return "http://hl7.org/fhir/resource-types";
      case EVIDENCEVARIABLE:
        return "http://hl7.org/fhir/resource-types";
      case EXAMPLESCENARIO:
        return "http://hl7.org/fhir/resource-types";
      case EXPLANATIONOFBENEFIT:
        return "http://hl7.org/fhir/resource-types";
      case FAMILYMEMBERHISTORY:
        return "http://hl7.org/fhir/resource-types";
      case FLAG:
        return "http://hl7.org/fhir/resource-types";
      case GOAL:
        return "http://hl7.org/fhir/resource-types";
      case GRAPHDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case GROUP:
        return "http://hl7.org/fhir/resource-types";
      case GUIDANCERESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case HEALTHCARESERVICE:
        return "http://hl7.org/fhir/resource-types";
      case IMAGINGSTUDY:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATION:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATIONEVALUATION:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATIONRECOMMENDATION:
        return "http://hl7.org/fhir/resource-types";
      case IMPLEMENTATIONGUIDE:
        return "http://hl7.org/fhir/resource-types";
      case INSURANCEPLAN:
        return "http://hl7.org/fhir/resource-types";
      case INVOICE:
        return "http://hl7.org/fhir/resource-types";
      case LIBRARY:
        return "http://hl7.org/fhir/resource-types";
      case LINKAGE:
        return "http://hl7.org/fhir/resource-types";
      case LIST:
        return "http://hl7.org/fhir/resource-types";
      case LOCATION:
        return "http://hl7.org/fhir/resource-types";
      case MEASURE:
        return "http://hl7.org/fhir/resource-types";
      case MEASUREREPORT:
        return "http://hl7.org/fhir/resource-types";
      case MEDIA:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONADMINISTRATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONDISPENSE:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONKNOWLEDGE:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONSTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINGREDIENT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINTERACTION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTMANUFACTURED:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTPACKAGED:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "http://hl7.org/fhir/resource-types";
      case MESSAGEDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case MESSAGEHEADER:
        return "http://hl7.org/fhir/resource-types";
      case MOLECULARSEQUENCE:
        return "http://hl7.org/fhir/resource-types";
      case NAMINGSYSTEM:
        return "http://hl7.org/fhir/resource-types";
      case NUTRITIONORDER:
        return "http://hl7.org/fhir/resource-types";
      case OBSERVATION:
        return "http://hl7.org/fhir/resource-types";
      case OBSERVATIONDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case OPERATIONDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case OPERATIONOUTCOME:
        return "http://hl7.org/fhir/resource-types";
      case ORGANIZATION:
        return "http://hl7.org/fhir/resource-types";
      case ORGANIZATIONAFFILIATION:
        return "http://hl7.org/fhir/resource-types";
      case PARAMETERS:
        return "http://hl7.org/fhir/resource-types";
      case PATIENT:
        return "http://hl7.org/fhir/resource-types";
      case PAYMENTNOTICE:
        return "http://hl7.org/fhir/resource-types";
      case PAYMENTRECONCILIATION:
        return "http://hl7.org/fhir/resource-types";
      case PERSON:
        return "http://hl7.org/fhir/resource-types";
      case PLANDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case PRACTITIONER:
        return "http://hl7.org/fhir/resource-types";
      case PRACTITIONERROLE:
        return "http://hl7.org/fhir/resource-types";
      case PROCEDURE:
        return "http://hl7.org/fhir/resource-types";
      case PROVENANCE:
        return "http://hl7.org/fhir/resource-types";
      case QUESTIONNAIRE:
        return "http://hl7.org/fhir/resource-types";
      case QUESTIONNAIRERESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case RELATEDPERSON:
        return "http://hl7.org/fhir/resource-types";
      case REQUESTGROUP:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHELEMENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHSTUDY:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHSUBJECT:
        return "http://hl7.org/fhir/resource-types";
      case RESOURCE:
        return "http://hl7.org/fhir/resource-types";
      case RISKASSESSMENT:
        return "http://hl7.org/fhir/resource-types";
      case RISKEVIDENCESYNTHESIS:
        return "http://hl7.org/fhir/resource-types";
      case SCHEDULE:
        return "http://hl7.org/fhir/resource-types";
      case SEARCHPARAMETER:
        return "http://hl7.org/fhir/resource-types";
      case SERVICEREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case SLOT:
        return "http://hl7.org/fhir/resource-types";
      case SPECIMEN:
        return "http://hl7.org/fhir/resource-types";
      case SPECIMENDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case STRUCTUREDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case STRUCTUREMAP:
        return "http://hl7.org/fhir/resource-types";
      case SUBSCRIPTION:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCE:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCENUCLEICACID:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEPOLYMER:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEPROTEIN:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEREFERENCEINFORMATION:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCESOURCEMATERIAL:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCESPECIFICATION:
        return "http://hl7.org/fhir/resource-types";
      case SUPPLYDELIVERY:
        return "http://hl7.org/fhir/resource-types";
      case SUPPLYREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case TASK:
        return "http://hl7.org/fhir/resource-types";
      case TERMINOLOGYCAPABILITIES:
        return "http://hl7.org/fhir/resource-types";
      case TESTREPORT:
        return "http://hl7.org/fhir/resource-types";
      case TESTSCRIPT:
        return "http://hl7.org/fhir/resource-types";
      case VALUESET:
        return "http://hl7.org/fhir/resource-types";
      case VERIFICATIONRESULT:
        return "http://hl7.org/fhir/resource-types";
      case VISIONPRESCRIPTION:
        return "http://hl7.org/fhir/resource-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ADDRESS:
        return "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.";
      case AGE:
        return "A duration of time during which an organism (or a process) has existed.";
      case ANNOTATION:
        return "A  text note which also  contains information about who made the statement and when.";
      case ATTACHMENT:
        return "For referring to data content defined in other formats.";
      case BACKBONEELEMENT:
        return "Base definition for all elements that are defined inside a resource - but not those in a data type.";
      case CODEABLECONCEPT:
        return "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.";
      case CODING:
        return "A reference to a code defined by a terminology system.";
      case CONTACTDETAIL:
        return "Specifies contact information for a person or organization.";
      case CONTACTPOINT:
        return "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.";
      case CONTRIBUTOR:
        return "A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.";
      case COUNT:
        return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
      case DATAREQUIREMENT:
        return "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.";
      case DISTANCE:
        return "A length - a value with a unit that is a physical distance.";
      case DOSAGE:
        return "Indicates how the medication is/was taken or should be taken by the patient.";
      case DURATION:
        return "A length of time.";
      case ELEMENT:
        return "Base definition for all elements in a resource.";
      case ELEMENTDEFINITION:
        return "Captures constraints on each element within the resource, profile, or extension.";
      case EXPRESSION:
        return "A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.";
      case EXTENSION:
        return "Optional Extension Element - found in all resources.";
      case HUMANNAME:
        return "A human's name with the ability to identify parts and usage.";
      case IDENTIFIER:
        return "An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.";
      case MARKETINGSTATUS:
        return "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.";
      case META:
        return "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.";
      case MONEY:
        return "An amount of economic utility in some recognized currency.";
      case MONEYQUANTITY:
        return "";
      case NARRATIVE:
        return "A human-readable summary of the resource conveying the essential clinical and business information for the resource.";
      case PARAMETERDEFINITION:
        return "The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.";
      case PERIOD:
        return "A time period defined by a start and end date and optionally time.";
      case POPULATION:
        return "A populatioof people with some set of grouping criteria.";
      case PRODCHARACTERISTIC:
        return "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.";
      case PRODUCTSHELFLIFE:
        return "The shelf-life and storage information for a medicinal product item or container can be described using this class.";
      case QUANTITY:
        return "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.";
      case RANGE:
        return "A set of ordered Quantities defined by a low and high limit.";
      case RATIO:
        return "A relationship of two Quantity values - expressed as a numerator and a denominator.";
      case REFERENCE:
        return "A reference from one resource to another.";
      case RELATEDARTIFACT:
        return "Related artifacts such as additional documentation, justification, or bibliographic references.";
      case SAMPLEDDATA:
        return "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.";
      case SIGNATURE:
        return "A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.";
      case SIMPLEQUANTITY:
        return "";
      case SUBSTANCEAMOUNT:
        return "Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.";
      case TIMING:
        return "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.";
      case TRIGGERDEFINITION:
        return "A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.";
      case USAGECONTEXT:
        return "Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).";
      case BASE64BINARY:
        return "A stream of bytes";
      case BOOLEAN:
        return "Value of \"true\" or \"false\"";
      case CANONICAL:
        return "A URI that is a reference to a canonical URL on a FHIR resource";
      case CODE:
        return "A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents";
      case DATE:
        return "A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.";
      case DATETIME:
        return "A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.";
      case DECIMAL:
        return "A rational number with implicit precision";
      case ID:
        return "Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.";
      case INSTANT:
        return "An instant in time - known at least to the second";
      case INTEGER:
        return "A whole number";
      case MARKDOWN:
        return "A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine";
      case OID:
        return "An OID represented as a URI";
      case POSITIVEINT:
        return "An integer with a value that is positive (e.g. >0)";
      case STRING:
        return "A sequence of Unicode characters";
      case TIME:
        return "A time during the day, with no date specified";
      case UNSIGNEDINT:
        return "An integer with a value that is not negative (e.g. >= 0)";
      case URI:
        return "String of characters used to identify a name or a resource";
      case URL:
        return "A URI that is a literal reference";
      case UUID:
        return "A UUID, represented as a URI";
      case XHTML:
        return "XHTML format, as defined by W3C, but restricted usage (mainly, no active content)";
      case ACCOUNT:
        return "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.";
      case ACTIVITYDEFINITION:
        return "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.";
      case ADVERSEEVENT:
        return "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.";
      case ALLERGYINTOLERANCE:
        return "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.";
      case APPOINTMENT:
        return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
      case APPOINTMENTRESPONSE:
        return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
      case AUDITEVENT:
        return "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.";
      case BASIC:
        return "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.";
      case BINARY:
        return "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity.";
      case BODYSTRUCTURE:
        return "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.";
      case BUNDLE:
        return "A container for a collection of resources.";
      case CAPABILITYSTATEMENT:
        return "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
      case CAREPLAN:
        return "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.";
      case CARETEAM:
        return "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.";
      case CATALOGENTRY:
        return "Catalog entries are wrappers that contextualize items included in a catalog.";
      case CHARGEITEM:
        return "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.";
      case CHARGEITEMDEFINITION:
        return "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.";
      case CLAIM:
        return "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.";
      case CLAIMRESPONSE:
        return "This resource provides the adjudication details from the processing of a Claim resource.";
      case CLINICALIMPRESSION:
        return "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score.";
      case CODESYSTEM:
        return "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.";
      case COMMUNICATION:
        return "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.";
      case COMMUNICATIONREQUEST:
        return "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.";
      case COMPARTMENTDEFINITION:
        return "A compartment definition that defines how resources are accessed on a server.";
      case COMPOSITION:
        return "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).";
      case CONCEPTMAP:
        return "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.";
      case CONDITION:
        return "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.";
      case CONSENT:
        return "A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.";
      case CONTRACT:
        return "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.";
      case COVERAGE:
        return "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.";
      case COVERAGEELIGIBILITYREQUEST:
        return "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.";
      case COVERAGEELIGIBILITYRESPONSE:
        return "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.";
      case DETECTEDISSUE:
        return "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.";
      case DEVICE:
        return "A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.";
      case DEVICEDEFINITION:
        return "The characteristics, operational status and capabilities of a medical-related component of a medical device.";
      case DEVICEMETRIC:
        return "Describes a measurement, calculation or setting capability of a medical device.";
      case DEVICEREQUEST:
        return "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.";
      case DEVICEUSESTATEMENT:
        return "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.";
      case DIAGNOSTICREPORT:
        return "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.";
      case DOCUMENTMANIFEST:
        return "A collection of documents compiled for a purpose together with metadata that applies to the collection.";
      case DOCUMENTREFERENCE:
        return "A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.";
      case DOMAINRESOURCE:
        return "A resource that includes narrative, extensions, and contained resources.";
      case EFFECTEVIDENCESYNTHESIS:
        return "The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.";
      case ENCOUNTER:
        return "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.";
      case ENDPOINT:
        return "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.";
      case ENROLLMENTREQUEST:
        return "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.";
      case ENROLLMENTRESPONSE:
        return "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.";
      case EPISODEOFCARE:
        return "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.";
      case EVENTDEFINITION:
        return "The EventDefinition resource provides a reusable description of when a particular event can occur.";
      case EVIDENCE:
        return "The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.";
      case EVIDENCEVARIABLE:
        return "The EvidenceVariable resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.";
      case EXAMPLESCENARIO:
        return "Example of workflow instance.";
      case EXPLANATIONOFBENEFIT:
        return "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.";
      case FAMILYMEMBERHISTORY:
        return "Significant health conditions for a person related to the patient relevant in the context of care for the patient.";
      case FLAG:
        return "Prospective warnings of potential issues when providing care to the patient.";
      case GOAL:
        return "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.";
      case GRAPHDEFINITION:
        return "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.";
      case GROUP:
        return "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.";
      case GUIDANCERESPONSE:
        return "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.";
      case HEALTHCARESERVICE:
        return "The details of a healthcare service available at a location.";
      case IMAGINGSTUDY:
        return "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.";
      case IMMUNIZATION:
        return "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.";
      case IMMUNIZATIONEVALUATION:
        return "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations.";
      case IMMUNIZATIONRECOMMENDATION:
        return "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.";
      case IMPLEMENTATIONGUIDE:
        return "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.";
      case INSURANCEPLAN:
        return "Details of a Health Insurance product/plan provided by an organization.";
      case INVOICE:
        return "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.";
      case LIBRARY:
        return "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.";
      case LINKAGE:
        return "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\".";
      case LIST:
        return "A list is a curated collection of resources.";
      case LOCATION:
        return "Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.";
      case MEASURE:
        return "The Measure resource provides the definition of a quality measure.";
      case MEASUREREPORT:
        return "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.";
      case MEDIA:
        return "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.";
      case MEDICATION:
        return "This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.";
      case MEDICATIONADMINISTRATION:
        return "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.";
      case MEDICATIONDISPENSE:
        return "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.";
      case MEDICATIONKNOWLEDGE:
        return "Information about a medication that is used to support knowledge.";
      case MEDICATIONREQUEST:
        return "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.";
      case MEDICATIONSTATEMENT:
        return "A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. \n\nThe primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.";
      case MEDICINALPRODUCT:
        return "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "The regulatory authorization of a medicinal product.";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.";
      case MEDICINALPRODUCTINDICATION:
        return "Indication for the Medicinal Product.";
      case MEDICINALPRODUCTINGREDIENT:
        return "An ingredient of a manufactured item or pharmaceutical product.";
      case MEDICINALPRODUCTINTERACTION:
        return "The interactions of the medicinal product with other medicinal products, or other forms of interactions.";
      case MEDICINALPRODUCTMANUFACTURED:
        return "The manufactured item as contained in the packaged medicinal product.";
      case MEDICINALPRODUCTPACKAGED:
        return "A medicinal product in a container or package.";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "A pharmaceutical product described in terms of its composition and dose form.";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "Describe the undesirable effects of the medicinal product.";
      case MESSAGEDEFINITION:
        return "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.";
      case MESSAGEHEADER:
        return "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.";
      case MOLECULARSEQUENCE:
        return "Raw data describing a biological sequence.";
      case NAMINGSYSTEM:
        return "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.";
      case NUTRITIONORDER:
        return "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.";
      case OBSERVATION:
        return "Measurements and simple assertions made about a patient, device or other subject.";
      case OBSERVATIONDEFINITION:
        return "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.";
      case OPERATIONDEFINITION:
        return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
      case OPERATIONOUTCOME:
        return "A collection of error, warning, or information messages that result from a system action.";
      case ORGANIZATION:
        return "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.";
      case ORGANIZATIONAFFILIATION:
        return "Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.";
      case PARAMETERS:
        return "This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.";
      case PATIENT:
        return "Demographics and other administrative information about an individual or animal receiving care or other health-related services.";
      case PAYMENTNOTICE:
        return "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.";
      case PAYMENTRECONCILIATION:
        return "This resource provides the details including amount of a payment and allocates the payment items being paid.";
      case PERSON:
        return "Demographics and administrative information about a person independent of a specific health-related context.";
      case PLANDEFINITION:
        return "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.";
      case PRACTITIONER:
        return "A person who is directly or indirectly involved in the provisioning of healthcare.";
      case PRACTITIONERROLE:
        return "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.";
      case PROCEDURE:
        return "An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.";
      case PROVENANCE:
        return "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.";
      case QUESTIONNAIRE:
        return "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.";
      case QUESTIONNAIRERESPONSE:
        return "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.";
      case RELATEDPERSON:
        return "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.";
      case REQUESTGROUP:
        return "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".";
      case RESEARCHDEFINITION:
        return "The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.";
      case RESEARCHELEMENTDEFINITION:
        return "The ResearchElementDefinition resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.";
      case RESEARCHSTUDY:
        return "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.";
      case RESEARCHSUBJECT:
        return "A physical entity which is the primary unit of operational and/or administrative interest in a study.";
      case RESOURCE:
        return "This is the base resource type for everything.";
      case RISKASSESSMENT:
        return "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.";
      case RISKEVIDENCESYNTHESIS:
        return "The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.";
      case SCHEDULE:
        return "A container for slots of time that may be available for booking appointments.";
      case SEARCHPARAMETER:
        return "A search parameter that defines a named search item that can be used to search/filter on a resource.";
      case SERVICEREQUEST:
        return "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.";
      case SLOT:
        return "A slot of time on a schedule that may be available for booking appointments.";
      case SPECIMEN:
        return "A sample to be used for analysis.";
      case SPECIMENDEFINITION:
        return "A kind of specimen with associated set of requirements.";
      case STRUCTUREDEFINITION:
        return "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.";
      case STRUCTUREMAP:
        return "A Map of relationships between 2 structures that can be used to transform data.";
      case SUBSCRIPTION:
        return "The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system can take an appropriate action.";
      case SUBSTANCE:
        return "A homogeneous material with a definite composition.";
      case SUBSTANCENUCLEICACID:
        return "Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.";
      case SUBSTANCEPOLYMER:
        return "Todo.";
      case SUBSTANCEPROTEIN:
        return "A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.";
      case SUBSTANCEREFERENCEINFORMATION:
        return "Todo.";
      case SUBSTANCESOURCEMATERIAL:
        return "Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.";
      case SUBSTANCESPECIFICATION:
        return "The detailed description of a substance, typically at a level beyond what is used for prescribing.";
      case SUPPLYDELIVERY:
        return "Record of delivery of what is supplied.";
      case SUPPLYREQUEST:
        return "A record of a request for a medication, substance or device used in the healthcare setting.";
      case TASK:
        return "A task to be performed.";
      case TERMINOLOGYCAPABILITIES:
        return "A Terminology Capabilities documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
      case TESTREPORT:
        return "A summary of information based on the results of executing a TestScript.";
      case TESTSCRIPT:
        return "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.";
      case VALUESET:
        return "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).";
      case VERIFICATIONRESULT:
        return "Describes validation requirements, source(s), status and dates for one or more elements.";
      case VISIONPRESCRIPTION:
        return "An authorization for the provision of glasses and/or contact lenses to a patient.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ADDRESS:
        return "Address";
      case AGE:
        return "Age";
      case ANNOTATION:
        return "Annotation";
      case ATTACHMENT:
        return "Attachment";
      case BACKBONEELEMENT:
        return "BackboneElement";
      case CODEABLECONCEPT:
        return "CodeableConcept";
      case CODING:
        return "Coding";
      case CONTACTDETAIL:
        return "ContactDetail";
      case CONTACTPOINT:
        return "ContactPoint";
      case CONTRIBUTOR:
        return "Contributor";
      case COUNT:
        return "Count";
      case DATAREQUIREMENT:
        return "DataRequirement";
      case DISTANCE:
        return "Distance";
      case DOSAGE:
        return "Dosage";
      case DURATION:
        return "Duration";
      case ELEMENT:
        return "Element";
      case ELEMENTDEFINITION:
        return "ElementDefinition";
      case EXPRESSION:
        return "Expression";
      case EXTENSION:
        return "Extension";
      case HUMANNAME:
        return "HumanName";
      case IDENTIFIER:
        return "Identifier";
      case MARKETINGSTATUS:
        return "MarketingStatus";
      case META:
        return "Meta";
      case MONEY:
        return "Money";
      case MONEYQUANTITY:
        return "MoneyQuantity";
      case NARRATIVE:
        return "Narrative";
      case PARAMETERDEFINITION:
        return "ParameterDefinition";
      case PERIOD:
        return "Period";
      case POPULATION:
        return "Population";
      case PRODCHARACTERISTIC:
        return "ProdCharacteristic";
      case PRODUCTSHELFLIFE:
        return "ProductShelfLife";
      case QUANTITY:
        return "Quantity";
      case RANGE:
        return "Range";
      case RATIO:
        return "Ratio";
      case REFERENCE:
        return "Reference";
      case RELATEDARTIFACT:
        return "RelatedArtifact";
      case SAMPLEDDATA:
        return "SampledData";
      case SIGNATURE:
        return "Signature";
      case SIMPLEQUANTITY:
        return "SimpleQuantity";
      case SUBSTANCEAMOUNT:
        return "SubstanceAmount";
      case TIMING:
        return "Timing";
      case TRIGGERDEFINITION:
        return "TriggerDefinition";
      case USAGECONTEXT:
        return "UsageContext";
      case BASE64BINARY:
        return "base64Binary";
      case BOOLEAN:
        return "boolean";
      case CANONICAL:
        return "canonical";
      case CODE:
        return "code";
      case DATE:
        return "date";
      case DATETIME:
        return "dateTime";
      case DECIMAL:
        return "decimal";
      case ID:
        return "id";
      case INSTANT:
        return "instant";
      case INTEGER:
        return "integer";
      case MARKDOWN:
        return "markdown";
      case OID:
        return "oid";
      case POSITIVEINT:
        return "positiveInt";
      case STRING:
        return "string";
      case TIME:
        return "time";
      case UNSIGNEDINT:
        return "unsignedInt";
      case URI:
        return "uri";
      case URL:
        return "url";
      case UUID:
        return "uuid";
      case XHTML:
        return "XHTML";
      case ACCOUNT:
        return "Account";
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case ADVERSEEVENT:
        return "AdverseEvent";
      case ALLERGYINTOLERANCE:
        return "AllergyIntolerance";
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case AUDITEVENT:
        return "AuditEvent";
      case BASIC:
        return "Basic";
      case BINARY:
        return "Binary";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "BiologicallyDerivedProduct";
      case BODYSTRUCTURE:
        return "BodyStructure";
      case BUNDLE:
        return "Bundle";
      case CAPABILITYSTATEMENT:
        return "CapabilityStatement";
      case CAREPLAN:
        return "CarePlan";
      case CARETEAM:
        return "CareTeam";
      case CATALOGENTRY:
        return "CatalogEntry";
      case CHARGEITEM:
        return "ChargeItem";
      case CHARGEITEMDEFINITION:
        return "ChargeItemDefinition";
      case CLAIM:
        return "Claim";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case CODESYSTEM:
        return "CodeSystem";
      case COMMUNICATION:
        return "Communication";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case COMPARTMENTDEFINITION:
        return "CompartmentDefinition";
      case COMPOSITION:
        return "Composition";
      case CONCEPTMAP:
        return "ConceptMap";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case CONTRACT:
        return "Contract";
      case COVERAGE:
        return "Coverage";
      case COVERAGEELIGIBILITYREQUEST:
        return "CoverageEligibilityRequest";
      case COVERAGEELIGIBILITYRESPONSE:
        return "CoverageEligibilityResponse";
      case DETECTEDISSUE:
        return "DetectedIssue";
      case DEVICE:
        return "Device";
      case DEVICEDEFINITION:
        return "DeviceDefinition";
      case DEVICEMETRIC:
        return "DeviceMetric";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case DOMAINRESOURCE:
        return "DomainResource";
      case EFFECTEVIDENCESYNTHESIS:
        return "EffectEvidenceSynthesis";
      case ENCOUNTER:
        return "Encounter";
      case ENDPOINT:
        return "Endpoint";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EVENTDEFINITION:
        return "EventDefinition";
      case EVIDENCE:
        return "Evidence";
      case EVIDENCEVARIABLE:
        return "EvidenceVariable";
      case EXAMPLESCENARIO:
        return "ExampleScenario";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case FLAG:
        return "Flag";
      case GOAL:
        return "Goal";
      case GRAPHDEFINITION:
        return "GraphDefinition";
      case GROUP:
        return "Group";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case HEALTHCARESERVICE:
        return "HealthcareService";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case IMMUNIZATIONEVALUATION:
        return "ImmunizationEvaluation";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case IMPLEMENTATIONGUIDE:
        return "ImplementationGuide";
      case INSURANCEPLAN:
        return "InsurancePlan";
      case INVOICE:
        return "Invoice";
      case LIBRARY:
        return "Library";
      case LINKAGE:
        return "Linkage";
      case LIST:
        return "List";
      case LOCATION:
        return "Location";
      case MEASURE:
        return "Measure";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATION:
        return "Medication";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONKNOWLEDGE:
        return "MedicationKnowledge";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case MEDICINALPRODUCT:
        return "MedicinalProduct";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "MedicinalProductAuthorization";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "MedicinalProductContraindication";
      case MEDICINALPRODUCTINDICATION:
        return "MedicinalProductIndication";
      case MEDICINALPRODUCTINGREDIENT:
        return "MedicinalProductIngredient";
      case MEDICINALPRODUCTINTERACTION:
        return "MedicinalProductInteraction";
      case MEDICINALPRODUCTMANUFACTURED:
        return "MedicinalProductManufactured";
      case MEDICINALPRODUCTPACKAGED:
        return "MedicinalProductPackaged";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "MedicinalProductPharmaceutical";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "MedicinalProductUndesirableEffect";
      case MESSAGEDEFINITION:
        return "MessageDefinition";
      case MESSAGEHEADER:
        return "MessageHeader";
      case MOLECULARSEQUENCE:
        return "MolecularSequence";
      case NAMINGSYSTEM:
        return "NamingSystem";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case OBSERVATION:
        return "Observation";
      case OBSERVATIONDEFINITION:
        return "ObservationDefinition";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case OPERATIONOUTCOME:
        return "OperationOutcome";
      case ORGANIZATION:
        return "Organization";
      case ORGANIZATIONAFFILIATION:
        return "OrganizationAffiliation";
      case PARAMETERS:
        return "Parameters";
      case PATIENT:
        return "Patient";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PERSON:
        return "Person";
      case PLANDEFINITION:
        return "PlanDefinition";
      case PRACTITIONER:
        return "Practitioner";
      case PRACTITIONERROLE:
        return "PractitionerRole";
      case PROCEDURE:
        return "Procedure";
      case PROVENANCE:
        return "Provenance";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RELATEDPERSON:
        return "RelatedPerson";
      case REQUESTGROUP:
        return "RequestGroup";
      case RESEARCHDEFINITION:
        return "ResearchDefinition";
      case RESEARCHELEMENTDEFINITION:
        return "ResearchElementDefinition";
      case RESEARCHSTUDY:
        return "ResearchStudy";
      case RESEARCHSUBJECT:
        return "ResearchSubject";
      case RESOURCE:
        return "Resource";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case RISKEVIDENCESYNTHESIS:
        return "RiskEvidenceSynthesis";
      case SCHEDULE:
        return "Schedule";
      case SEARCHPARAMETER:
        return "SearchParameter";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SLOT:
        return "Slot";
      case SPECIMEN:
        return "Specimen";
      case SPECIMENDEFINITION:
        return "SpecimenDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case SUBSCRIPTION:
        return "Subscription";
      case SUBSTANCE:
        return "Substance";
      case SUBSTANCENUCLEICACID:
        return "SubstanceNucleicAcid";
      case SUBSTANCEPOLYMER:
        return "SubstancePolymer";
      case SUBSTANCEPROTEIN:
        return "SubstanceProtein";
      case SUBSTANCEREFERENCEINFORMATION:
        return "SubstanceReferenceInformation";
      case SUBSTANCESOURCEMATERIAL:
        return "SubstanceSourceMaterial";
      case SUBSTANCESPECIFICATION:
        return "SubstanceSpecification";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case TERMINOLOGYCAPABILITIES:
        return "TerminologyCapabilities";
      case TESTREPORT:
        return "TestReport";
      case TESTSCRIPT:
        return "TestScript";
      case VALUESET:
        return "ValueSet";
      case VERIFICATIONRESULT:
        return "VerificationResult";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class FHIRDefinedTypeEnumFactory implements EnumFactory<FHIRDefinedType> {
    public FHIRDefinedType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("Address".equals(codeString))
        return FHIRDefinedType.ADDRESS;
      if ("Age".equals(codeString))
        return FHIRDefinedType.AGE;
      if ("Annotation".equals(codeString))
        return FHIRDefinedType.ANNOTATION;
      if ("Attachment".equals(codeString))
        return FHIRDefinedType.ATTACHMENT;
      if ("BackboneElement".equals(codeString))
        return FHIRDefinedType.BACKBONEELEMENT;
      if ("CodeableConcept".equals(codeString))
        return FHIRDefinedType.CODEABLECONCEPT;
      if ("Coding".equals(codeString))
        return FHIRDefinedType.CODING;
      if ("ContactDetail".equals(codeString))
        return FHIRDefinedType.CONTACTDETAIL;
      if ("ContactPoint".equals(codeString))
        return FHIRDefinedType.CONTACTPOINT;
      if ("Contributor".equals(codeString))
        return FHIRDefinedType.CONTRIBUTOR;
      if ("Count".equals(codeString))
        return FHIRDefinedType.COUNT;
      if ("DataRequirement".equals(codeString))
        return FHIRDefinedType.DATAREQUIREMENT;
      if ("Distance".equals(codeString))
        return FHIRDefinedType.DISTANCE;
      if ("Dosage".equals(codeString))
        return FHIRDefinedType.DOSAGE;
      if ("Duration".equals(codeString))
        return FHIRDefinedType.DURATION;
      if ("Element".equals(codeString))
        return FHIRDefinedType.ELEMENT;
      if ("ElementDefinition".equals(codeString))
        return FHIRDefinedType.ELEMENTDEFINITION;
      if ("Expression".equals(codeString))
        return FHIRDefinedType.EXPRESSION;
      if ("Extension".equals(codeString))
        return FHIRDefinedType.EXTENSION;
      if ("HumanName".equals(codeString))
        return FHIRDefinedType.HUMANNAME;
      if ("Identifier".equals(codeString))
        return FHIRDefinedType.IDENTIFIER;
      if ("MarketingStatus".equals(codeString))
        return FHIRDefinedType.MARKETINGSTATUS;
      if ("Meta".equals(codeString))
        return FHIRDefinedType.META;
      if ("Money".equals(codeString))
        return FHIRDefinedType.MONEY;
      if ("MoneyQuantity".equals(codeString))
        return FHIRDefinedType.MONEYQUANTITY;
      if ("Narrative".equals(codeString))
        return FHIRDefinedType.NARRATIVE;
      if ("ParameterDefinition".equals(codeString))
        return FHIRDefinedType.PARAMETERDEFINITION;
      if ("Period".equals(codeString))
        return FHIRDefinedType.PERIOD;
      if ("Population".equals(codeString))
        return FHIRDefinedType.POPULATION;
      if ("ProdCharacteristic".equals(codeString))
        return FHIRDefinedType.PRODCHARACTERISTIC;
      if ("ProductShelfLife".equals(codeString))
        return FHIRDefinedType.PRODUCTSHELFLIFE;
      if ("Quantity".equals(codeString))
        return FHIRDefinedType.QUANTITY;
      if ("Range".equals(codeString))
        return FHIRDefinedType.RANGE;
      if ("Ratio".equals(codeString))
        return FHIRDefinedType.RATIO;
      if ("Reference".equals(codeString))
        return FHIRDefinedType.REFERENCE;
      if ("RelatedArtifact".equals(codeString))
        return FHIRDefinedType.RELATEDARTIFACT;
      if ("SampledData".equals(codeString))
        return FHIRDefinedType.SAMPLEDDATA;
      if ("Signature".equals(codeString))
        return FHIRDefinedType.SIGNATURE;
      if ("SimpleQuantity".equals(codeString))
        return FHIRDefinedType.SIMPLEQUANTITY;
      if ("SubstanceAmount".equals(codeString))
        return FHIRDefinedType.SUBSTANCEAMOUNT;
      if ("Timing".equals(codeString))
        return FHIRDefinedType.TIMING;
      if ("TriggerDefinition".equals(codeString))
        return FHIRDefinedType.TRIGGERDEFINITION;
      if ("UsageContext".equals(codeString))
        return FHIRDefinedType.USAGECONTEXT;
      if ("base64Binary".equals(codeString))
        return FHIRDefinedType.BASE64BINARY;
      if ("boolean".equals(codeString))
        return FHIRDefinedType.BOOLEAN;
      if ("canonical".equals(codeString))
        return FHIRDefinedType.CANONICAL;
      if ("code".equals(codeString))
        return FHIRDefinedType.CODE;
      if ("date".equals(codeString))
        return FHIRDefinedType.DATE;
      if ("dateTime".equals(codeString))
        return FHIRDefinedType.DATETIME;
      if ("decimal".equals(codeString))
        return FHIRDefinedType.DECIMAL;
      if ("id".equals(codeString))
        return FHIRDefinedType.ID;
      if ("instant".equals(codeString))
        return FHIRDefinedType.INSTANT;
      if ("integer".equals(codeString))
        return FHIRDefinedType.INTEGER;
      if ("markdown".equals(codeString))
        return FHIRDefinedType.MARKDOWN;
      if ("oid".equals(codeString))
        return FHIRDefinedType.OID;
      if ("positiveInt".equals(codeString))
        return FHIRDefinedType.POSITIVEINT;
      if ("string".equals(codeString))
        return FHIRDefinedType.STRING;
      if ("time".equals(codeString))
        return FHIRDefinedType.TIME;
      if ("unsignedInt".equals(codeString))
        return FHIRDefinedType.UNSIGNEDINT;
      if ("uri".equals(codeString))
        return FHIRDefinedType.URI;
      if ("url".equals(codeString))
        return FHIRDefinedType.URL;
      if ("uuid".equals(codeString))
        return FHIRDefinedType.UUID;
      if ("xhtml".equals(codeString))
        return FHIRDefinedType.XHTML;
      if ("Account".equals(codeString))
        return FHIRDefinedType.ACCOUNT;
      if ("ActivityDefinition".equals(codeString))
        return FHIRDefinedType.ACTIVITYDEFINITION;
      if ("AdverseEvent".equals(codeString))
        return FHIRDefinedType.ADVERSEEVENT;
      if ("AllergyIntolerance".equals(codeString))
        return FHIRDefinedType.ALLERGYINTOLERANCE;
      if ("Appointment".equals(codeString))
        return FHIRDefinedType.APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return FHIRDefinedType.APPOINTMENTRESPONSE;
      if ("AuditEvent".equals(codeString))
        return FHIRDefinedType.AUDITEVENT;
      if ("Basic".equals(codeString))
        return FHIRDefinedType.BASIC;
      if ("Binary".equals(codeString))
        return FHIRDefinedType.BINARY;
      if ("BiologicallyDerivedProduct".equals(codeString))
        return FHIRDefinedType.BIOLOGICALLYDERIVEDPRODUCT;
      if ("BodyStructure".equals(codeString))
        return FHIRDefinedType.BODYSTRUCTURE;
      if ("Bundle".equals(codeString))
        return FHIRDefinedType.BUNDLE;
      if ("CapabilityStatement".equals(codeString))
        return FHIRDefinedType.CAPABILITYSTATEMENT;
      if ("CarePlan".equals(codeString))
        return FHIRDefinedType.CAREPLAN;
      if ("CareTeam".equals(codeString))
        return FHIRDefinedType.CARETEAM;
      if ("CatalogEntry".equals(codeString))
        return FHIRDefinedType.CATALOGENTRY;
      if ("ChargeItem".equals(codeString))
        return FHIRDefinedType.CHARGEITEM;
      if ("ChargeItemDefinition".equals(codeString))
        return FHIRDefinedType.CHARGEITEMDEFINITION;
      if ("Claim".equals(codeString))
        return FHIRDefinedType.CLAIM;
      if ("ClaimResponse".equals(codeString))
        return FHIRDefinedType.CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return FHIRDefinedType.CLINICALIMPRESSION;
      if ("CodeSystem".equals(codeString))
        return FHIRDefinedType.CODESYSTEM;
      if ("Communication".equals(codeString))
        return FHIRDefinedType.COMMUNICATION;
      if ("CommunicationRequest".equals(codeString))
        return FHIRDefinedType.COMMUNICATIONREQUEST;
      if ("CompartmentDefinition".equals(codeString))
        return FHIRDefinedType.COMPARTMENTDEFINITION;
      if ("Composition".equals(codeString))
        return FHIRDefinedType.COMPOSITION;
      if ("ConceptMap".equals(codeString))
        return FHIRDefinedType.CONCEPTMAP;
      if ("Condition".equals(codeString))
        return FHIRDefinedType.CONDITION;
      if ("Consent".equals(codeString))
        return FHIRDefinedType.CONSENT;
      if ("Contract".equals(codeString))
        return FHIRDefinedType.CONTRACT;
      if ("Coverage".equals(codeString))
        return FHIRDefinedType.COVERAGE;
      if ("CoverageEligibilityRequest".equals(codeString))
        return FHIRDefinedType.COVERAGEELIGIBILITYREQUEST;
      if ("CoverageEligibilityResponse".equals(codeString))
        return FHIRDefinedType.COVERAGEELIGIBILITYRESPONSE;
      if ("DetectedIssue".equals(codeString))
        return FHIRDefinedType.DETECTEDISSUE;
      if ("Device".equals(codeString))
        return FHIRDefinedType.DEVICE;
      if ("DeviceDefinition".equals(codeString))
        return FHIRDefinedType.DEVICEDEFINITION;
      if ("DeviceMetric".equals(codeString))
        return FHIRDefinedType.DEVICEMETRIC;
      if ("DeviceRequest".equals(codeString))
        return FHIRDefinedType.DEVICEREQUEST;
      if ("DeviceUseStatement".equals(codeString))
        return FHIRDefinedType.DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return FHIRDefinedType.DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return FHIRDefinedType.DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return FHIRDefinedType.DOCUMENTREFERENCE;
      if ("DomainResource".equals(codeString))
        return FHIRDefinedType.DOMAINRESOURCE;
      if ("EffectEvidenceSynthesis".equals(codeString))
        return FHIRDefinedType.EFFECTEVIDENCESYNTHESIS;
      if ("Encounter".equals(codeString))
        return FHIRDefinedType.ENCOUNTER;
      if ("Endpoint".equals(codeString))
        return FHIRDefinedType.ENDPOINT;
      if ("EnrollmentRequest".equals(codeString))
        return FHIRDefinedType.ENROLLMENTREQUEST;
      if ("EnrollmentResponse".equals(codeString))
        return FHIRDefinedType.ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return FHIRDefinedType.EPISODEOFCARE;
      if ("EventDefinition".equals(codeString))
        return FHIRDefinedType.EVENTDEFINITION;
      if ("Evidence".equals(codeString))
        return FHIRDefinedType.EVIDENCE;
      if ("EvidenceVariable".equals(codeString))
        return FHIRDefinedType.EVIDENCEVARIABLE;
      if ("ExampleScenario".equals(codeString))
        return FHIRDefinedType.EXAMPLESCENARIO;
      if ("ExplanationOfBenefit".equals(codeString))
        return FHIRDefinedType.EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return FHIRDefinedType.FAMILYMEMBERHISTORY;
      if ("Flag".equals(codeString))
        return FHIRDefinedType.FLAG;
      if ("Goal".equals(codeString))
        return FHIRDefinedType.GOAL;
      if ("GraphDefinition".equals(codeString))
        return FHIRDefinedType.GRAPHDEFINITION;
      if ("Group".equals(codeString))
        return FHIRDefinedType.GROUP;
      if ("GuidanceResponse".equals(codeString))
        return FHIRDefinedType.GUIDANCERESPONSE;
      if ("HealthcareService".equals(codeString))
        return FHIRDefinedType.HEALTHCARESERVICE;
      if ("ImagingStudy".equals(codeString))
        return FHIRDefinedType.IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return FHIRDefinedType.IMMUNIZATION;
      if ("ImmunizationEvaluation".equals(codeString))
        return FHIRDefinedType.IMMUNIZATIONEVALUATION;
      if ("ImmunizationRecommendation".equals(codeString))
        return FHIRDefinedType.IMMUNIZATIONRECOMMENDATION;
      if ("ImplementationGuide".equals(codeString))
        return FHIRDefinedType.IMPLEMENTATIONGUIDE;
      if ("InsurancePlan".equals(codeString))
        return FHIRDefinedType.INSURANCEPLAN;
      if ("Invoice".equals(codeString))
        return FHIRDefinedType.INVOICE;
      if ("Library".equals(codeString))
        return FHIRDefinedType.LIBRARY;
      if ("Linkage".equals(codeString))
        return FHIRDefinedType.LINKAGE;
      if ("List".equals(codeString))
        return FHIRDefinedType.LIST;
      if ("Location".equals(codeString))
        return FHIRDefinedType.LOCATION;
      if ("Measure".equals(codeString))
        return FHIRDefinedType.MEASURE;
      if ("MeasureReport".equals(codeString))
        return FHIRDefinedType.MEASUREREPORT;
      if ("Media".equals(codeString))
        return FHIRDefinedType.MEDIA;
      if ("Medication".equals(codeString))
        return FHIRDefinedType.MEDICATION;
      if ("MedicationAdministration".equals(codeString))
        return FHIRDefinedType.MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return FHIRDefinedType.MEDICATIONDISPENSE;
      if ("MedicationKnowledge".equals(codeString))
        return FHIRDefinedType.MEDICATIONKNOWLEDGE;
      if ("MedicationRequest".equals(codeString))
        return FHIRDefinedType.MEDICATIONREQUEST;
      if ("MedicationStatement".equals(codeString))
        return FHIRDefinedType.MEDICATIONSTATEMENT;
      if ("MedicinalProduct".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCT;
      if ("MedicinalProductAuthorization".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTAUTHORIZATION;
      if ("MedicinalProductContraindication".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTCONTRAINDICATION;
      if ("MedicinalProductIndication".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTINDICATION;
      if ("MedicinalProductIngredient".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTINGREDIENT;
      if ("MedicinalProductInteraction".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTINTERACTION;
      if ("MedicinalProductManufactured".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTMANUFACTURED;
      if ("MedicinalProductPackaged".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTPACKAGED;
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTPHARMACEUTICAL;
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return FHIRDefinedType.MEDICINALPRODUCTUNDESIRABLEEFFECT;
      if ("MessageDefinition".equals(codeString))
        return FHIRDefinedType.MESSAGEDEFINITION;
      if ("MessageHeader".equals(codeString))
        return FHIRDefinedType.MESSAGEHEADER;
      if ("MolecularSequence".equals(codeString))
        return FHIRDefinedType.MOLECULARSEQUENCE;
      if ("NamingSystem".equals(codeString))
        return FHIRDefinedType.NAMINGSYSTEM;
      if ("NutritionOrder".equals(codeString))
        return FHIRDefinedType.NUTRITIONORDER;
      if ("Observation".equals(codeString))
        return FHIRDefinedType.OBSERVATION;
      if ("ObservationDefinition".equals(codeString))
        return FHIRDefinedType.OBSERVATIONDEFINITION;
      if ("OperationDefinition".equals(codeString))
        return FHIRDefinedType.OPERATIONDEFINITION;
      if ("OperationOutcome".equals(codeString))
        return FHIRDefinedType.OPERATIONOUTCOME;
      if ("Organization".equals(codeString))
        return FHIRDefinedType.ORGANIZATION;
      if ("OrganizationAffiliation".equals(codeString))
        return FHIRDefinedType.ORGANIZATIONAFFILIATION;
      if ("Parameters".equals(codeString))
        return FHIRDefinedType.PARAMETERS;
      if ("Patient".equals(codeString))
        return FHIRDefinedType.PATIENT;
      if ("PaymentNotice".equals(codeString))
        return FHIRDefinedType.PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return FHIRDefinedType.PAYMENTRECONCILIATION;
      if ("Person".equals(codeString))
        return FHIRDefinedType.PERSON;
      if ("PlanDefinition".equals(codeString))
        return FHIRDefinedType.PLANDEFINITION;
      if ("Practitioner".equals(codeString))
        return FHIRDefinedType.PRACTITIONER;
      if ("PractitionerRole".equals(codeString))
        return FHIRDefinedType.PRACTITIONERROLE;
      if ("Procedure".equals(codeString))
        return FHIRDefinedType.PROCEDURE;
      if ("Provenance".equals(codeString))
        return FHIRDefinedType.PROVENANCE;
      if ("Questionnaire".equals(codeString))
        return FHIRDefinedType.QUESTIONNAIRE;
      if ("QuestionnaireResponse".equals(codeString))
        return FHIRDefinedType.QUESTIONNAIRERESPONSE;
      if ("RelatedPerson".equals(codeString))
        return FHIRDefinedType.RELATEDPERSON;
      if ("RequestGroup".equals(codeString))
        return FHIRDefinedType.REQUESTGROUP;
      if ("ResearchDefinition".equals(codeString))
        return FHIRDefinedType.RESEARCHDEFINITION;
      if ("ResearchElementDefinition".equals(codeString))
        return FHIRDefinedType.RESEARCHELEMENTDEFINITION;
      if ("ResearchStudy".equals(codeString))
        return FHIRDefinedType.RESEARCHSTUDY;
      if ("ResearchSubject".equals(codeString))
        return FHIRDefinedType.RESEARCHSUBJECT;
      if ("Resource".equals(codeString))
        return FHIRDefinedType.RESOURCE;
      if ("RiskAssessment".equals(codeString))
        return FHIRDefinedType.RISKASSESSMENT;
      if ("RiskEvidenceSynthesis".equals(codeString))
        return FHIRDefinedType.RISKEVIDENCESYNTHESIS;
      if ("Schedule".equals(codeString))
        return FHIRDefinedType.SCHEDULE;
      if ("SearchParameter".equals(codeString))
        return FHIRDefinedType.SEARCHPARAMETER;
      if ("ServiceRequest".equals(codeString))
        return FHIRDefinedType.SERVICEREQUEST;
      if ("Slot".equals(codeString))
        return FHIRDefinedType.SLOT;
      if ("Specimen".equals(codeString))
        return FHIRDefinedType.SPECIMEN;
      if ("SpecimenDefinition".equals(codeString))
        return FHIRDefinedType.SPECIMENDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return FHIRDefinedType.STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return FHIRDefinedType.STRUCTUREMAP;
      if ("Subscription".equals(codeString))
        return FHIRDefinedType.SUBSCRIPTION;
      if ("Substance".equals(codeString))
        return FHIRDefinedType.SUBSTANCE;
      if ("SubstanceNucleicAcid".equals(codeString))
        return FHIRDefinedType.SUBSTANCENUCLEICACID;
      if ("SubstancePolymer".equals(codeString))
        return FHIRDefinedType.SUBSTANCEPOLYMER;
      if ("SubstanceProtein".equals(codeString))
        return FHIRDefinedType.SUBSTANCEPROTEIN;
      if ("SubstanceReferenceInformation".equals(codeString))
        return FHIRDefinedType.SUBSTANCEREFERENCEINFORMATION;
      if ("SubstanceSourceMaterial".equals(codeString))
        return FHIRDefinedType.SUBSTANCESOURCEMATERIAL;
      if ("SubstanceSpecification".equals(codeString))
        return FHIRDefinedType.SUBSTANCESPECIFICATION;
      if ("SupplyDelivery".equals(codeString))
        return FHIRDefinedType.SUPPLYDELIVERY;
      if ("SupplyRequest".equals(codeString))
        return FHIRDefinedType.SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return FHIRDefinedType.TASK;
      if ("TerminologyCapabilities".equals(codeString))
        return FHIRDefinedType.TERMINOLOGYCAPABILITIES;
      if ("TestReport".equals(codeString))
        return FHIRDefinedType.TESTREPORT;
      if ("TestScript".equals(codeString))
        return FHIRDefinedType.TESTSCRIPT;
      if ("ValueSet".equals(codeString))
        return FHIRDefinedType.VALUESET;
      if ("VerificationResult".equals(codeString))
        return FHIRDefinedType.VERIFICATIONRESULT;
      if ("VisionPrescription".equals(codeString))
        return FHIRDefinedType.VISIONPRESCRIPTION;
      throw new IllegalArgumentException("Unknown FHIRDefinedType code '" + codeString + "'");
    }

    public Enumeration<FHIRDefinedType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NULL, code);
      if ("Address".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ADDRESS, code);
      if ("Age".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.AGE, code);
      if ("Annotation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ANNOTATION, code);
      if ("Attachment".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ATTACHMENT, code);
      if ("BackboneElement".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BACKBONEELEMENT, code);
      if ("CodeableConcept".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODEABLECONCEPT, code);
      if ("Coding".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODING, code);
      if ("ContactDetail".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONTACTDETAIL, code);
      if ("ContactPoint".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONTACTPOINT, code);
      if ("Contributor".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONTRIBUTOR, code);
      if ("Count".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COUNT, code);
      if ("DataRequirement".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DATAREQUIREMENT, code);
      if ("Distance".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DISTANCE, code);
      if ("Dosage".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOSAGE, code);
      if ("Duration".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DURATION, code);
      if ("Element".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ELEMENT, code);
      if ("ElementDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ELEMENTDEFINITION, code);
      if ("Expression".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EXPRESSION, code);
      if ("Extension".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EXTENSION, code);
      if ("HumanName".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.HUMANNAME, code);
      if ("Identifier".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IDENTIFIER, code);
      if ("MarketingStatus".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MARKETINGSTATUS, code);
      if ("Meta".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.META, code);
      if ("Money".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MONEY, code);
      if ("MoneyQuantity".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MONEYQUANTITY, code);
      if ("Narrative".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NARRATIVE, code);
      if ("ParameterDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PARAMETERDEFINITION, code);
      if ("Period".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PERIOD, code);
      if ("Population".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.POPULATION, code);
      if ("ProdCharacteristic".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PRODCHARACTERISTIC, code);
      if ("ProductShelfLife".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PRODUCTSHELFLIFE, code);
      if ("Quantity".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.QUANTITY, code);
      if ("Range".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RANGE, code);
      if ("Ratio".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RATIO, code);
      if ("Reference".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.REFERENCE, code);
      if ("RelatedArtifact".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RELATEDARTIFACT, code);
      if ("SampledData".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SAMPLEDDATA, code);
      if ("Signature".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SIGNATURE, code);
      if ("SimpleQuantity".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SIMPLEQUANTITY, code);
      if ("SubstanceAmount".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCEAMOUNT, code);
      if ("Timing".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TIMING, code);
      if ("TriggerDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TRIGGERDEFINITION, code);
      if ("UsageContext".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.USAGECONTEXT, code);
      if ("base64Binary".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BASE64BINARY, code);
      if ("boolean".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BOOLEAN, code);
      if ("canonical".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CANONICAL, code);
      if ("code".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODE, code);
      if ("date".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DATE, code);
      if ("dateTime".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DATETIME, code);
      if ("decimal".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DECIMAL, code);
      if ("id".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ID, code);
      if ("instant".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.INSTANT, code);
      if ("integer".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.INTEGER, code);
      if ("markdown".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MARKDOWN, code);
      if ("oid".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OID, code);
      if ("positiveInt".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.POSITIVEINT, code);
      if ("string".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.STRING, code);
      if ("time".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TIME, code);
      if ("unsignedInt".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.UNSIGNEDINT, code);
      if ("uri".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.URI, code);
      if ("url".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.URL, code);
      if ("uuid".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.UUID, code);
      if ("xhtml".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.XHTML, code);
      if ("Account".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ACCOUNT, code);
      if ("ActivityDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ACTIVITYDEFINITION, code);
      if ("AdverseEvent".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ADVERSEEVENT, code);
      if ("AllergyIntolerance".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ALLERGYINTOLERANCE, code);
      if ("Appointment".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.APPOINTMENT, code);
      if ("AppointmentResponse".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.APPOINTMENTRESPONSE, code);
      if ("AuditEvent".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.AUDITEVENT, code);
      if ("Basic".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BASIC, code);
      if ("Binary".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BINARY, code);
      if ("BiologicallyDerivedProduct".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BIOLOGICALLYDERIVEDPRODUCT, code);
      if ("BodyStructure".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BODYSTRUCTURE, code);
      if ("Bundle".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.BUNDLE, code);
      if ("CapabilityStatement".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CAPABILITYSTATEMENT, code);
      if ("CarePlan".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CAREPLAN, code);
      if ("CareTeam".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CARETEAM, code);
      if ("CatalogEntry".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CATALOGENTRY, code);
      if ("ChargeItem".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CHARGEITEM, code);
      if ("ChargeItemDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CHARGEITEMDEFINITION, code);
      if ("Claim".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CLAIM, code);
      if ("ClaimResponse".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CLAIMRESPONSE, code);
      if ("ClinicalImpression".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CLINICALIMPRESSION, code);
      if ("CodeSystem".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CODESYSTEM, code);
      if ("Communication".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMMUNICATION, code);
      if ("CommunicationRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMMUNICATIONREQUEST, code);
      if ("CompartmentDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMPARTMENTDEFINITION, code);
      if ("Composition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COMPOSITION, code);
      if ("ConceptMap".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONCEPTMAP, code);
      if ("Condition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONDITION, code);
      if ("Consent".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONSENT, code);
      if ("Contract".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.CONTRACT, code);
      if ("Coverage".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COVERAGE, code);
      if ("CoverageEligibilityRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COVERAGEELIGIBILITYREQUEST, code);
      if ("CoverageEligibilityResponse".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.COVERAGEELIGIBILITYRESPONSE, code);
      if ("DetectedIssue".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DETECTEDISSUE, code);
      if ("Device".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICE, code);
      if ("DeviceDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEDEFINITION, code);
      if ("DeviceMetric".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEMETRIC, code);
      if ("DeviceRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEREQUEST, code);
      if ("DeviceUseStatement".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DEVICEUSESTATEMENT, code);
      if ("DiagnosticReport".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DIAGNOSTICREPORT, code);
      if ("DocumentManifest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOCUMENTMANIFEST, code);
      if ("DocumentReference".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOCUMENTREFERENCE, code);
      if ("DomainResource".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.DOMAINRESOURCE, code);
      if ("EffectEvidenceSynthesis".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EFFECTEVIDENCESYNTHESIS, code);
      if ("Encounter".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENCOUNTER, code);
      if ("Endpoint".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENDPOINT, code);
      if ("EnrollmentRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENROLLMENTREQUEST, code);
      if ("EnrollmentResponse".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ENROLLMENTRESPONSE, code);
      if ("EpisodeOfCare".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EPISODEOFCARE, code);
      if ("EventDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EVENTDEFINITION, code);
      if ("Evidence".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EVIDENCE, code);
      if ("EvidenceVariable".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EVIDENCEVARIABLE, code);
      if ("ExampleScenario".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EXAMPLESCENARIO, code);
      if ("ExplanationOfBenefit".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.EXPLANATIONOFBENEFIT, code);
      if ("FamilyMemberHistory".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.FAMILYMEMBERHISTORY, code);
      if ("Flag".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.FLAG, code);
      if ("Goal".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.GOAL, code);
      if ("GraphDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.GRAPHDEFINITION, code);
      if ("Group".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.GROUP, code);
      if ("GuidanceResponse".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.GUIDANCERESPONSE, code);
      if ("HealthcareService".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.HEALTHCARESERVICE, code);
      if ("ImagingStudy".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMAGINGSTUDY, code);
      if ("Immunization".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMMUNIZATION, code);
      if ("ImmunizationEvaluation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMMUNIZATIONEVALUATION, code);
      if ("ImmunizationRecommendation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMMUNIZATIONRECOMMENDATION, code);
      if ("ImplementationGuide".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.IMPLEMENTATIONGUIDE, code);
      if ("InsurancePlan".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.INSURANCEPLAN, code);
      if ("Invoice".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.INVOICE, code);
      if ("Library".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.LIBRARY, code);
      if ("Linkage".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.LINKAGE, code);
      if ("List".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.LIST, code);
      if ("Location".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.LOCATION, code);
      if ("Measure".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEASURE, code);
      if ("MeasureReport".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEASUREREPORT, code);
      if ("Media".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDIA, code);
      if ("Medication".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATION, code);
      if ("MedicationAdministration".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONADMINISTRATION, code);
      if ("MedicationDispense".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONDISPENSE, code);
      if ("MedicationKnowledge".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONKNOWLEDGE, code);
      if ("MedicationRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONREQUEST, code);
      if ("MedicationStatement".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICATIONSTATEMENT, code);
      if ("MedicinalProduct".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCT, code);
      if ("MedicinalProductAuthorization".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTAUTHORIZATION, code);
      if ("MedicinalProductContraindication".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTCONTRAINDICATION, code);
      if ("MedicinalProductIndication".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTINDICATION, code);
      if ("MedicinalProductIngredient".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTINGREDIENT, code);
      if ("MedicinalProductInteraction".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTINTERACTION, code);
      if ("MedicinalProductManufactured".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTMANUFACTURED, code);
      if ("MedicinalProductPackaged".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTPACKAGED, code);
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTPHARMACEUTICAL, code);
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MEDICINALPRODUCTUNDESIRABLEEFFECT, code);
      if ("MessageDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MESSAGEDEFINITION, code);
      if ("MessageHeader".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MESSAGEHEADER, code);
      if ("MolecularSequence".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.MOLECULARSEQUENCE, code);
      if ("NamingSystem".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NAMINGSYSTEM, code);
      if ("NutritionOrder".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.NUTRITIONORDER, code);
      if ("Observation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OBSERVATION, code);
      if ("ObservationDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OBSERVATIONDEFINITION, code);
      if ("OperationDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OPERATIONDEFINITION, code);
      if ("OperationOutcome".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.OPERATIONOUTCOME, code);
      if ("Organization".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ORGANIZATION, code);
      if ("OrganizationAffiliation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.ORGANIZATIONAFFILIATION, code);
      if ("Parameters".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PARAMETERS, code);
      if ("Patient".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PATIENT, code);
      if ("PaymentNotice".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PAYMENTNOTICE, code);
      if ("PaymentReconciliation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PAYMENTRECONCILIATION, code);
      if ("Person".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PERSON, code);
      if ("PlanDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PLANDEFINITION, code);
      if ("Practitioner".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PRACTITIONER, code);
      if ("PractitionerRole".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PRACTITIONERROLE, code);
      if ("Procedure".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROCEDURE, code);
      if ("Provenance".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.PROVENANCE, code);
      if ("Questionnaire".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.QUESTIONNAIRE, code);
      if ("QuestionnaireResponse".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.QUESTIONNAIRERESPONSE, code);
      if ("RelatedPerson".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RELATEDPERSON, code);
      if ("RequestGroup".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.REQUESTGROUP, code);
      if ("ResearchDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RESEARCHDEFINITION, code);
      if ("ResearchElementDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RESEARCHELEMENTDEFINITION, code);
      if ("ResearchStudy".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RESEARCHSTUDY, code);
      if ("ResearchSubject".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RESEARCHSUBJECT, code);
      if ("Resource".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RESOURCE, code);
      if ("RiskAssessment".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RISKASSESSMENT, code);
      if ("RiskEvidenceSynthesis".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.RISKEVIDENCESYNTHESIS, code);
      if ("Schedule".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SCHEDULE, code);
      if ("SearchParameter".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SEARCHPARAMETER, code);
      if ("ServiceRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SERVICEREQUEST, code);
      if ("Slot".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SLOT, code);
      if ("Specimen".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SPECIMEN, code);
      if ("SpecimenDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SPECIMENDEFINITION, code);
      if ("StructureDefinition".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.STRUCTUREDEFINITION, code);
      if ("StructureMap".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.STRUCTUREMAP, code);
      if ("Subscription".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSCRIPTION, code);
      if ("Substance".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCE, code);
      if ("SubstanceNucleicAcid".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCENUCLEICACID, code);
      if ("SubstancePolymer".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCEPOLYMER, code);
      if ("SubstanceProtein".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCEPROTEIN, code);
      if ("SubstanceReferenceInformation".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCEREFERENCEINFORMATION, code);
      if ("SubstanceSourceMaterial".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCESOURCEMATERIAL, code);
      if ("SubstanceSpecification".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUBSTANCESPECIFICATION, code);
      if ("SupplyDelivery".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUPPLYDELIVERY, code);
      if ("SupplyRequest".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.SUPPLYREQUEST, code);
      if ("Task".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TASK, code);
      if ("TerminologyCapabilities".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TERMINOLOGYCAPABILITIES, code);
      if ("TestReport".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TESTREPORT, code);
      if ("TestScript".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.TESTSCRIPT, code);
      if ("ValueSet".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.VALUESET, code);
      if ("VerificationResult".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.VERIFICATIONRESULT, code);
      if ("VisionPrescription".equals(codeString))
        return new Enumeration<FHIRDefinedType>(this, FHIRDefinedType.VISIONPRESCRIPTION, code);
      throw new FHIRException("Unknown FHIRDefinedType code '" + codeString + "'");
    }

    public String toCode(FHIRDefinedType code) {
       if (code == FHIRDefinedType.NULL)
           return null;
       if (code == FHIRDefinedType.ADDRESS)
        return "Address";
      if (code == FHIRDefinedType.AGE)
        return "Age";
      if (code == FHIRDefinedType.ANNOTATION)
        return "Annotation";
      if (code == FHIRDefinedType.ATTACHMENT)
        return "Attachment";
      if (code == FHIRDefinedType.BACKBONEELEMENT)
        return "BackboneElement";
      if (code == FHIRDefinedType.CODEABLECONCEPT)
        return "CodeableConcept";
      if (code == FHIRDefinedType.CODING)
        return "Coding";
      if (code == FHIRDefinedType.CONTACTDETAIL)
        return "ContactDetail";
      if (code == FHIRDefinedType.CONTACTPOINT)
        return "ContactPoint";
      if (code == FHIRDefinedType.CONTRIBUTOR)
        return "Contributor";
      if (code == FHIRDefinedType.COUNT)
        return "Count";
      if (code == FHIRDefinedType.DATAREQUIREMENT)
        return "DataRequirement";
      if (code == FHIRDefinedType.DISTANCE)
        return "Distance";
      if (code == FHIRDefinedType.DOSAGE)
        return "Dosage";
      if (code == FHIRDefinedType.DURATION)
        return "Duration";
      if (code == FHIRDefinedType.ELEMENT)
        return "Element";
      if (code == FHIRDefinedType.ELEMENTDEFINITION)
        return "ElementDefinition";
      if (code == FHIRDefinedType.EXPRESSION)
        return "Expression";
      if (code == FHIRDefinedType.EXTENSION)
        return "Extension";
      if (code == FHIRDefinedType.HUMANNAME)
        return "HumanName";
      if (code == FHIRDefinedType.IDENTIFIER)
        return "Identifier";
      if (code == FHIRDefinedType.MARKETINGSTATUS)
        return "MarketingStatus";
      if (code == FHIRDefinedType.META)
        return "Meta";
      if (code == FHIRDefinedType.MONEY)
        return "Money";
      if (code == FHIRDefinedType.MONEYQUANTITY)
        return "MoneyQuantity";
      if (code == FHIRDefinedType.NARRATIVE)
        return "Narrative";
      if (code == FHIRDefinedType.PARAMETERDEFINITION)
        return "ParameterDefinition";
      if (code == FHIRDefinedType.PERIOD)
        return "Period";
      if (code == FHIRDefinedType.POPULATION)
        return "Population";
      if (code == FHIRDefinedType.PRODCHARACTERISTIC)
        return "ProdCharacteristic";
      if (code == FHIRDefinedType.PRODUCTSHELFLIFE)
        return "ProductShelfLife";
      if (code == FHIRDefinedType.QUANTITY)
        return "Quantity";
      if (code == FHIRDefinedType.RANGE)
        return "Range";
      if (code == FHIRDefinedType.RATIO)
        return "Ratio";
      if (code == FHIRDefinedType.REFERENCE)
        return "Reference";
      if (code == FHIRDefinedType.RELATEDARTIFACT)
        return "RelatedArtifact";
      if (code == FHIRDefinedType.SAMPLEDDATA)
        return "SampledData";
      if (code == FHIRDefinedType.SIGNATURE)
        return "Signature";
      if (code == FHIRDefinedType.SIMPLEQUANTITY)
        return "SimpleQuantity";
      if (code == FHIRDefinedType.SUBSTANCEAMOUNT)
        return "SubstanceAmount";
      if (code == FHIRDefinedType.TIMING)
        return "Timing";
      if (code == FHIRDefinedType.TRIGGERDEFINITION)
        return "TriggerDefinition";
      if (code == FHIRDefinedType.USAGECONTEXT)
        return "UsageContext";
      if (code == FHIRDefinedType.BASE64BINARY)
        return "base64Binary";
      if (code == FHIRDefinedType.BOOLEAN)
        return "boolean";
      if (code == FHIRDefinedType.CANONICAL)
        return "canonical";
      if (code == FHIRDefinedType.CODE)
        return "code";
      if (code == FHIRDefinedType.DATE)
        return "date";
      if (code == FHIRDefinedType.DATETIME)
        return "dateTime";
      if (code == FHIRDefinedType.DECIMAL)
        return "decimal";
      if (code == FHIRDefinedType.ID)
        return "id";
      if (code == FHIRDefinedType.INSTANT)
        return "instant";
      if (code == FHIRDefinedType.INTEGER)
        return "integer";
      if (code == FHIRDefinedType.MARKDOWN)
        return "markdown";
      if (code == FHIRDefinedType.OID)
        return "oid";
      if (code == FHIRDefinedType.POSITIVEINT)
        return "positiveInt";
      if (code == FHIRDefinedType.STRING)
        return "string";
      if (code == FHIRDefinedType.TIME)
        return "time";
      if (code == FHIRDefinedType.UNSIGNEDINT)
        return "unsignedInt";
      if (code == FHIRDefinedType.URI)
        return "uri";
      if (code == FHIRDefinedType.URL)
        return "url";
      if (code == FHIRDefinedType.UUID)
        return "uuid";
      if (code == FHIRDefinedType.XHTML)
        return "xhtml";
      if (code == FHIRDefinedType.ACCOUNT)
        return "Account";
      if (code == FHIRDefinedType.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == FHIRDefinedType.ADVERSEEVENT)
        return "AdverseEvent";
      if (code == FHIRDefinedType.ALLERGYINTOLERANCE)
        return "AllergyIntolerance";
      if (code == FHIRDefinedType.APPOINTMENT)
        return "Appointment";
      if (code == FHIRDefinedType.APPOINTMENTRESPONSE)
        return "AppointmentResponse";
      if (code == FHIRDefinedType.AUDITEVENT)
        return "AuditEvent";
      if (code == FHIRDefinedType.BASIC)
        return "Basic";
      if (code == FHIRDefinedType.BINARY)
        return "Binary";
      if (code == FHIRDefinedType.BIOLOGICALLYDERIVEDPRODUCT)
        return "BiologicallyDerivedProduct";
      if (code == FHIRDefinedType.BODYSTRUCTURE)
        return "BodyStructure";
      if (code == FHIRDefinedType.BUNDLE)
        return "Bundle";
      if (code == FHIRDefinedType.CAPABILITYSTATEMENT)
        return "CapabilityStatement";
      if (code == FHIRDefinedType.CAREPLAN)
        return "CarePlan";
      if (code == FHIRDefinedType.CARETEAM)
        return "CareTeam";
      if (code == FHIRDefinedType.CATALOGENTRY)
        return "CatalogEntry";
      if (code == FHIRDefinedType.CHARGEITEM)
        return "ChargeItem";
      if (code == FHIRDefinedType.CHARGEITEMDEFINITION)
        return "ChargeItemDefinition";
      if (code == FHIRDefinedType.CLAIM)
        return "Claim";
      if (code == FHIRDefinedType.CLAIMRESPONSE)
        return "ClaimResponse";
      if (code == FHIRDefinedType.CLINICALIMPRESSION)
        return "ClinicalImpression";
      if (code == FHIRDefinedType.CODESYSTEM)
        return "CodeSystem";
      if (code == FHIRDefinedType.COMMUNICATION)
        return "Communication";
      if (code == FHIRDefinedType.COMMUNICATIONREQUEST)
        return "CommunicationRequest";
      if (code == FHIRDefinedType.COMPARTMENTDEFINITION)
        return "CompartmentDefinition";
      if (code == FHIRDefinedType.COMPOSITION)
        return "Composition";
      if (code == FHIRDefinedType.CONCEPTMAP)
        return "ConceptMap";
      if (code == FHIRDefinedType.CONDITION)
        return "Condition";
      if (code == FHIRDefinedType.CONSENT)
        return "Consent";
      if (code == FHIRDefinedType.CONTRACT)
        return "Contract";
      if (code == FHIRDefinedType.COVERAGE)
        return "Coverage";
      if (code == FHIRDefinedType.COVERAGEELIGIBILITYREQUEST)
        return "CoverageEligibilityRequest";
      if (code == FHIRDefinedType.COVERAGEELIGIBILITYRESPONSE)
        return "CoverageEligibilityResponse";
      if (code == FHIRDefinedType.DETECTEDISSUE)
        return "DetectedIssue";
      if (code == FHIRDefinedType.DEVICE)
        return "Device";
      if (code == FHIRDefinedType.DEVICEDEFINITION)
        return "DeviceDefinition";
      if (code == FHIRDefinedType.DEVICEMETRIC)
        return "DeviceMetric";
      if (code == FHIRDefinedType.DEVICEREQUEST)
        return "DeviceRequest";
      if (code == FHIRDefinedType.DEVICEUSESTATEMENT)
        return "DeviceUseStatement";
      if (code == FHIRDefinedType.DIAGNOSTICREPORT)
        return "DiagnosticReport";
      if (code == FHIRDefinedType.DOCUMENTMANIFEST)
        return "DocumentManifest";
      if (code == FHIRDefinedType.DOCUMENTREFERENCE)
        return "DocumentReference";
      if (code == FHIRDefinedType.DOMAINRESOURCE)
        return "DomainResource";
      if (code == FHIRDefinedType.EFFECTEVIDENCESYNTHESIS)
        return "EffectEvidenceSynthesis";
      if (code == FHIRDefinedType.ENCOUNTER)
        return "Encounter";
      if (code == FHIRDefinedType.ENDPOINT)
        return "Endpoint";
      if (code == FHIRDefinedType.ENROLLMENTREQUEST)
        return "EnrollmentRequest";
      if (code == FHIRDefinedType.ENROLLMENTRESPONSE)
        return "EnrollmentResponse";
      if (code == FHIRDefinedType.EPISODEOFCARE)
        return "EpisodeOfCare";
      if (code == FHIRDefinedType.EVENTDEFINITION)
        return "EventDefinition";
      if (code == FHIRDefinedType.EVIDENCE)
        return "Evidence";
      if (code == FHIRDefinedType.EVIDENCEVARIABLE)
        return "EvidenceVariable";
      if (code == FHIRDefinedType.EXAMPLESCENARIO)
        return "ExampleScenario";
      if (code == FHIRDefinedType.EXPLANATIONOFBENEFIT)
        return "ExplanationOfBenefit";
      if (code == FHIRDefinedType.FAMILYMEMBERHISTORY)
        return "FamilyMemberHistory";
      if (code == FHIRDefinedType.FLAG)
        return "Flag";
      if (code == FHIRDefinedType.GOAL)
        return "Goal";
      if (code == FHIRDefinedType.GRAPHDEFINITION)
        return "GraphDefinition";
      if (code == FHIRDefinedType.GROUP)
        return "Group";
      if (code == FHIRDefinedType.GUIDANCERESPONSE)
        return "GuidanceResponse";
      if (code == FHIRDefinedType.HEALTHCARESERVICE)
        return "HealthcareService";
      if (code == FHIRDefinedType.IMAGINGSTUDY)
        return "ImagingStudy";
      if (code == FHIRDefinedType.IMMUNIZATION)
        return "Immunization";
      if (code == FHIRDefinedType.IMMUNIZATIONEVALUATION)
        return "ImmunizationEvaluation";
      if (code == FHIRDefinedType.IMMUNIZATIONRECOMMENDATION)
        return "ImmunizationRecommendation";
      if (code == FHIRDefinedType.IMPLEMENTATIONGUIDE)
        return "ImplementationGuide";
      if (code == FHIRDefinedType.INSURANCEPLAN)
        return "InsurancePlan";
      if (code == FHIRDefinedType.INVOICE)
        return "Invoice";
      if (code == FHIRDefinedType.LIBRARY)
        return "Library";
      if (code == FHIRDefinedType.LINKAGE)
        return "Linkage";
      if (code == FHIRDefinedType.LIST)
        return "List";
      if (code == FHIRDefinedType.LOCATION)
        return "Location";
      if (code == FHIRDefinedType.MEASURE)
        return "Measure";
      if (code == FHIRDefinedType.MEASUREREPORT)
        return "MeasureReport";
      if (code == FHIRDefinedType.MEDIA)
        return "Media";
      if (code == FHIRDefinedType.MEDICATION)
        return "Medication";
      if (code == FHIRDefinedType.MEDICATIONADMINISTRATION)
        return "MedicationAdministration";
      if (code == FHIRDefinedType.MEDICATIONDISPENSE)
        return "MedicationDispense";
      if (code == FHIRDefinedType.MEDICATIONKNOWLEDGE)
        return "MedicationKnowledge";
      if (code == FHIRDefinedType.MEDICATIONREQUEST)
        return "MedicationRequest";
      if (code == FHIRDefinedType.MEDICATIONSTATEMENT)
        return "MedicationStatement";
      if (code == FHIRDefinedType.MEDICINALPRODUCT)
        return "MedicinalProduct";
      if (code == FHIRDefinedType.MEDICINALPRODUCTAUTHORIZATION)
        return "MedicinalProductAuthorization";
      if (code == FHIRDefinedType.MEDICINALPRODUCTCONTRAINDICATION)
        return "MedicinalProductContraindication";
      if (code == FHIRDefinedType.MEDICINALPRODUCTINDICATION)
        return "MedicinalProductIndication";
      if (code == FHIRDefinedType.MEDICINALPRODUCTINGREDIENT)
        return "MedicinalProductIngredient";
      if (code == FHIRDefinedType.MEDICINALPRODUCTINTERACTION)
        return "MedicinalProductInteraction";
      if (code == FHIRDefinedType.MEDICINALPRODUCTMANUFACTURED)
        return "MedicinalProductManufactured";
      if (code == FHIRDefinedType.MEDICINALPRODUCTPACKAGED)
        return "MedicinalProductPackaged";
      if (code == FHIRDefinedType.MEDICINALPRODUCTPHARMACEUTICAL)
        return "MedicinalProductPharmaceutical";
      if (code == FHIRDefinedType.MEDICINALPRODUCTUNDESIRABLEEFFECT)
        return "MedicinalProductUndesirableEffect";
      if (code == FHIRDefinedType.MESSAGEDEFINITION)
        return "MessageDefinition";
      if (code == FHIRDefinedType.MESSAGEHEADER)
        return "MessageHeader";
      if (code == FHIRDefinedType.MOLECULARSEQUENCE)
        return "MolecularSequence";
      if (code == FHIRDefinedType.NAMINGSYSTEM)
        return "NamingSystem";
      if (code == FHIRDefinedType.NUTRITIONORDER)
        return "NutritionOrder";
      if (code == FHIRDefinedType.OBSERVATION)
        return "Observation";
      if (code == FHIRDefinedType.OBSERVATIONDEFINITION)
        return "ObservationDefinition";
      if (code == FHIRDefinedType.OPERATIONDEFINITION)
        return "OperationDefinition";
      if (code == FHIRDefinedType.OPERATIONOUTCOME)
        return "OperationOutcome";
      if (code == FHIRDefinedType.ORGANIZATION)
        return "Organization";
      if (code == FHIRDefinedType.ORGANIZATIONAFFILIATION)
        return "OrganizationAffiliation";
      if (code == FHIRDefinedType.PARAMETERS)
        return "Parameters";
      if (code == FHIRDefinedType.PATIENT)
        return "Patient";
      if (code == FHIRDefinedType.PAYMENTNOTICE)
        return "PaymentNotice";
      if (code == FHIRDefinedType.PAYMENTRECONCILIATION)
        return "PaymentReconciliation";
      if (code == FHIRDefinedType.PERSON)
        return "Person";
      if (code == FHIRDefinedType.PLANDEFINITION)
        return "PlanDefinition";
      if (code == FHIRDefinedType.PRACTITIONER)
        return "Practitioner";
      if (code == FHIRDefinedType.PRACTITIONERROLE)
        return "PractitionerRole";
      if (code == FHIRDefinedType.PROCEDURE)
        return "Procedure";
      if (code == FHIRDefinedType.PROVENANCE)
        return "Provenance";
      if (code == FHIRDefinedType.QUESTIONNAIRE)
        return "Questionnaire";
      if (code == FHIRDefinedType.QUESTIONNAIRERESPONSE)
        return "QuestionnaireResponse";
      if (code == FHIRDefinedType.RELATEDPERSON)
        return "RelatedPerson";
      if (code == FHIRDefinedType.REQUESTGROUP)
        return "RequestGroup";
      if (code == FHIRDefinedType.RESEARCHDEFINITION)
        return "ResearchDefinition";
      if (code == FHIRDefinedType.RESEARCHELEMENTDEFINITION)
        return "ResearchElementDefinition";
      if (code == FHIRDefinedType.RESEARCHSTUDY)
        return "ResearchStudy";
      if (code == FHIRDefinedType.RESEARCHSUBJECT)
        return "ResearchSubject";
      if (code == FHIRDefinedType.RESOURCE)
        return "Resource";
      if (code == FHIRDefinedType.RISKASSESSMENT)
        return "RiskAssessment";
      if (code == FHIRDefinedType.RISKEVIDENCESYNTHESIS)
        return "RiskEvidenceSynthesis";
      if (code == FHIRDefinedType.SCHEDULE)
        return "Schedule";
      if (code == FHIRDefinedType.SEARCHPARAMETER)
        return "SearchParameter";
      if (code == FHIRDefinedType.SERVICEREQUEST)
        return "ServiceRequest";
      if (code == FHIRDefinedType.SLOT)
        return "Slot";
      if (code == FHIRDefinedType.SPECIMEN)
        return "Specimen";
      if (code == FHIRDefinedType.SPECIMENDEFINITION)
        return "SpecimenDefinition";
      if (code == FHIRDefinedType.STRUCTUREDEFINITION)
        return "StructureDefinition";
      if (code == FHIRDefinedType.STRUCTUREMAP)
        return "StructureMap";
      if (code == FHIRDefinedType.SUBSCRIPTION)
        return "Subscription";
      if (code == FHIRDefinedType.SUBSTANCE)
        return "Substance";
      if (code == FHIRDefinedType.SUBSTANCENUCLEICACID)
        return "SubstanceNucleicAcid";
      if (code == FHIRDefinedType.SUBSTANCEPOLYMER)
        return "SubstancePolymer";
      if (code == FHIRDefinedType.SUBSTANCEPROTEIN)
        return "SubstanceProtein";
      if (code == FHIRDefinedType.SUBSTANCEREFERENCEINFORMATION)
        return "SubstanceReferenceInformation";
      if (code == FHIRDefinedType.SUBSTANCESOURCEMATERIAL)
        return "SubstanceSourceMaterial";
      if (code == FHIRDefinedType.SUBSTANCESPECIFICATION)
        return "SubstanceSpecification";
      if (code == FHIRDefinedType.SUPPLYDELIVERY)
        return "SupplyDelivery";
      if (code == FHIRDefinedType.SUPPLYREQUEST)
        return "SupplyRequest";
      if (code == FHIRDefinedType.TASK)
        return "Task";
      if (code == FHIRDefinedType.TERMINOLOGYCAPABILITIES)
        return "TerminologyCapabilities";
      if (code == FHIRDefinedType.TESTREPORT)
        return "TestReport";
      if (code == FHIRDefinedType.TESTSCRIPT)
        return "TestScript";
      if (code == FHIRDefinedType.VALUESET)
        return "ValueSet";
      if (code == FHIRDefinedType.VERIFICATIONRESULT)
        return "VerificationResult";
      if (code == FHIRDefinedType.VISIONPRESCRIPTION)
        return "VisionPrescription";
      return "?";
   }

    public String toSystem(FHIRDefinedType code) {
      return code.getSystem();
    }
  }

    public enum FHIRVersion {
        /**
         * Oldest archived version of FHIR.
         */
        _0_01, 
        /**
         * 1st Draft for Comment (Sept 2012 Ballot).
         */
        _0_05, 
        /**
         * 2nd Draft for Comment (January 2013 Ballot).
         */
        _0_06, 
        /**
         * DSTU 1 Ballot version.
         */
        _0_11, 
        /**
         * DSTU 1 version.
         */
        _0_0, 
        /**
         * DSTU 1 Official version.
         */
        _0_0_80, 
        /**
         * DSTU 1 Official version Technical Errata #1.
         */
        _0_0_81, 
        /**
         * DSTU 1 Official version Technical Errata #2.
         */
        _0_0_82, 
        /**
         * January 2015 Ballot.
         */
        _0_4, 
        /**
         * Draft For Comment (January 2015 Ballot).
         */
        _0_4_0, 
        /**
         * May 2015 Ballot.
         */
        _0_5, 
        /**
         * DSTU 2 Ballot version (May 2015 Ballot).
         */
        _0_5_0, 
        /**
         * DSTU 2 version.
         */
        _1_0, 
        /**
         * DSTU 2 QA Preview + CQIF Ballot (Sep 2015).
         */
        _1_0_0, 
        /**
         * DSTU 2 (Official version).
         */
        _1_0_1, 
        /**
         * DSTU 2 (Official version) with 1 technical errata.
         */
        _1_0_2, 
        /**
         * GAO Ballot version.
         */
        _1_1, 
        /**
         * GAO Ballot + draft changes to main FHIR standard.
         */
        _1_1_0, 
        /**
         * Connectathon 12 (Montreal) version.
         */
        _1_4, 
        /**
         * CQF on FHIR Ballot + Connectathon 12 (Montreal).
         */
        _1_4_0, 
        /**
         * Connectathon 13 (Baltimore) version.
         */
        _1_6, 
        /**
         * FHIR STU3 Ballot + Connectathon 13 (Baltimore).
         */
        _1_6_0, 
        /**
         * Connectathon 14 (San Antonio) version.
         */
        _1_8, 
        /**
         * FHIR STU3 Candidate + Connectathon 14 (San Antonio).
         */
        _1_8_0, 
        /**
         * STU3 version.
         */
        _3_0, 
        /**
         * FHIR Release 3 (STU).
         */
        _3_0_0, 
        /**
         * FHIR Release 3 (STU) with 1 technical errata.
         */
        _3_0_1, 
        /**
         * FHIR Release 3 (STU) with 2 technical errata.
         */
        _3_0_2, 
        /**
         * R4 Ballot #1 version.
         */
        _3_3, 
        /**
         * R4 Ballot #1 + Connectaton 18 (Cologne).
         */
        _3_3_0, 
        /**
         * R4 Ballot #2 version.
         */
        _3_5, 
        /**
         * R4 Ballot #2 + Connectathon 19 (Baltimore).
         */
        _3_5_0, 
        /**
         * R4 version.
         */
        _4_0, 
        /**
         * FHIR Release 4 (Normative + STU).
         */
        _4_0_0, 
        /**
         * FHIR Release 4 (Normative + STU) with 1 technical errata.
         */
        _4_0_1, 
        /**
         * R4B Ballot #1 version.
         */
        _4_1, 
        /**
         * R4B Ballot #1 + Connectathon 27 (Virtual).
         */
        _4_1_0, 
        /**
         * R5 Preview #1 version.
         */
        _4_2, 
        /**
         * R5 Preview #1 + Connectathon 23 (Sydney).
         */
        _4_2_0, 
        /**
         * R4B version.
         */
        _4_3, 
        /**
         * FHIR Release 4B (Normative + STU).
         */
        _4_3_0, 
        /**
         * FHIR Release 4B CI-Builld.
         */
        _4_3_0CIBUILD, 
        /**
         * FHIR Release 4B Snapshot #1.
         */
        _4_3_0SNAPSHOT1, 
        /**
         * R5 Preview #2 version.
         */
        _4_4, 
        /**
         * R5 Preview #2 + Connectathon 24 (Virtual).
         */
        _4_4_0, 
        /**
         * R5 Preview #3 version.
         */
        _4_5, 
        /**
         * R5 Preview #3 + Connectathon 25 (Virtual).
         */
        _4_5_0, 
        /**
         * R5 Draft Ballot version.
         */
        _4_6, 
        /**
         * R5 Draft Ballot + Connectathon 27 (Virtual).
         */
        _4_6_0, 
        /**
         * R5 Versions.
         */
        _5_0, 
        /**
         * R5 Final Version.
         */
        _5_0_0, 
        /**
         * R5 Rolling ci-build.
         */
        _5_0_0CIBUILD, 
        /**
         * R5 Preview #2.
         */
        _5_0_0SNAPSHOT1, 
        /**
         * R5 Interim tooling stage.
         */
        _5_0_0SNAPSHOT2, 
        /**
         * R5 Ballot.
         */
        _5_0_0BALLOT, 
        /**
         * R5 January 2023 Staging Release + Connectathon 32.
         */
        _5_0_0SNAPSHOT3, 
        /**
         * R5 Final QA.
         */
        _5_0_0DRAFTFINAL, 
        /**
         * R6 Rolling ci-build.
         */
        _6_0_0CIBUILD, 
        /**
         * R6 Formal version (does not exist yet)
         */
        _6_0_0, 
        _6_0_0_BALLOT1, 
        _6_0_0_BALLOT2,  
        _6_0_0_BALLOT3, 
        /**
         * added to help the parsers
         */
        NULL;
        public static FHIRVersion fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("0.01".equals(codeString))
          return _0_01;
        if ("0.05".equals(codeString))
          return _0_05;
        if ("0.06".equals(codeString))
          return _0_06;
        if ("0.11".equals(codeString))
          return _0_11;
        if ("0.0".equals(codeString))
          return _0_0;
        if ("0.0.80".equals(codeString))
          return _0_0_80;
        if ("0.0.81".equals(codeString))
          return _0_0_81;
        if ("0.0.82".equals(codeString))
          return _0_0_82;
        if ("0.4".equals(codeString))
          return _0_4;
        if ("0.4.0".equals(codeString))
          return _0_4_0;
        if ("0.5".equals(codeString))
          return _0_5;
        if ("0.5.0".equals(codeString))
          return _0_5_0;
        if ("1.0".equals(codeString))
          return _1_0;
        if ("1.0.0".equals(codeString))
          return _1_0_0;
        if ("1.0.1".equals(codeString))
          return _1_0_1;
        if ("1.0.2".equals(codeString))
          return _1_0_2;
        if ("1.1".equals(codeString))
          return _1_1;
        if ("1.1.0".equals(codeString))
          return _1_1_0;
        if ("1.4".equals(codeString))
          return _1_4;
        if ("1.4.0".equals(codeString))
          return _1_4_0;
        if ("1.6".equals(codeString))
          return _1_6;
        if ("1.6.0".equals(codeString))
          return _1_6_0;
        if ("1.8".equals(codeString))
          return _1_8;
        if ("1.8.0".equals(codeString))
          return _1_8_0;
        if ("3.0".equals(codeString))
          return _3_0;
        if ("3.0.0".equals(codeString))
          return _3_0_0;
        if ("3.0.1".equals(codeString))
          return _3_0_1;
        if ("3.0.2".equals(codeString))
          return _3_0_2;
        if ("3.3".equals(codeString))
          return _3_3;
        if ("3.3.0".equals(codeString))
          return _3_3_0;
        if ("3.5".equals(codeString))
          return _3_5;
        if ("3.5.0".equals(codeString))
          return _3_5_0;
        if ("4.0".equals(codeString))
          return _4_0;
        if ("4.0.0".equals(codeString))
          return _4_0_0;
        if ("4.0.1".equals(codeString))
          return _4_0_1;
        if ("4.1".equals(codeString))
          return _4_1;
        if ("4.1.0".equals(codeString))
          return _4_1_0;
        if ("4.2".equals(codeString))
          return _4_2;
        if ("4.2.0".equals(codeString))
          return _4_2_0;
        if ("4.3".equals(codeString))
          return _4_3;
        if ("4.3.0".equals(codeString))
          return _4_3_0;
        if ("4.3.0-cibuild".equals(codeString))
          return _4_3_0CIBUILD;
        if ("4.3.0-snapshot1".equals(codeString))
          return _4_3_0SNAPSHOT1;
        if ("4.4".equals(codeString))
          return _4_4;
        if ("4.4.0".equals(codeString))
          return _4_4_0;
        if ("4.5".equals(codeString))
          return _4_5;
        if ("4.5.0".equals(codeString))
          return _4_5_0;
        if ("4.6".equals(codeString))
          return _4_6;
        if ("4.6.0".equals(codeString))
          return _4_6_0;
        if ("5.0".equals(codeString))
          return _5_0;
        if ("5.0.0".equals(codeString))
          return _5_0_0;
        if ("5.0.0-cibuild".equals(codeString))
          return _5_0_0CIBUILD;
        if ("5.0.0-snapshot1".equals(codeString))
          return _5_0_0SNAPSHOT1;
        if ("5.0.0-snapshot2".equals(codeString))
          return _5_0_0SNAPSHOT2;
        if ("5.0.0-ballot".equals(codeString))
          return _5_0_0BALLOT;
        if ("5.0.0-snapshot3".equals(codeString))
          return _5_0_0SNAPSHOT3;
        if ("5.0.0-draft-final".equals(codeString))
          return _5_0_0DRAFTFINAL;
        if ("6.0.0-cibuild".equals(codeString))
          return _6_0_0CIBUILD;
        if ("6.0.0".equals(codeString))
          return _6_0_0;
        if ("6.0.0-ballot1".equals(codeString))
          return _6_0_0_BALLOT1;
        if ("6.0.0-ballot2".equals(codeString))
          return _6_0_0_BALLOT2;
        if ("6.0.0-ballot3".equals(codeString))
          return _6_0_0_BALLOT3;
        throw new FHIRException("Unknown FHIRVersion code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "0.01", "0.05", "0.06", "0.11", "0.0", "0.0.80", "0.0.81", "0.0.82", "0.4", "0.4.0", "0.5", "0.5.0", "1.0", "1.0.0", "1.0.1", "1.0.2", "1.1", "1.1.0", "1.4", "1.4.0", "1.6", "1.6.0", "1.8", "1.8.0", "3.0", "3.0.0", "3.0.1", "3.0.2", "3.3", "3.3.0", "3.5", "3.5.0", "4.0", "4.0.0", "4.0.1", "4.1", "4.1.0", "4.2", "4.2.0", "4.3", "4.3.0", "4.3.0-cibuild", "4.3.0-snapshot1", "4.4", "4.4.0", "4.5", "4.5.0", "4.6", "4.6.0", "5.0", "5.0.0", "5.0.0-cibuild", "5.0.0-snapshot1", "5.0.0-snapshot2", "5.0.0-ballot", "5.0.0-snapshot3", "5.0.0-draft-final");
        }
        public String toCode() {
          switch (this) {
            case _0_01: return "0.01";
            case _0_05: return "0.05";
            case _0_06: return "0.06";
            case _0_11: return "0.11";
            case _0_0: return "0.0";
            case _0_0_80: return "0.0.80";
            case _0_0_81: return "0.0.81";
            case _0_0_82: return "0.0.82";
            case _0_4: return "0.4";
            case _0_4_0: return "0.4.0";
            case _0_5: return "0.5";
            case _0_5_0: return "0.5.0";
            case _1_0: return "1.0";
            case _1_0_0: return "1.0.0";
            case _1_0_1: return "1.0.1";
            case _1_0_2: return "1.0.2";
            case _1_1: return "1.1";
            case _1_1_0: return "1.1.0";
            case _1_4: return "1.4";
            case _1_4_0: return "1.4.0";
            case _1_6: return "1.6";
            case _1_6_0: return "1.6.0";
            case _1_8: return "1.8";
            case _1_8_0: return "1.8.0";
            case _3_0: return "3.0";
            case _3_0_0: return "3.0.0";
            case _3_0_1: return "3.0.1";
            case _3_0_2: return "3.0.2";
            case _3_3: return "3.3";
            case _3_3_0: return "3.3.0";
            case _3_5: return "3.5";
            case _3_5_0: return "3.5.0";
            case _4_0: return "4.0";
            case _4_0_0: return "4.0.0";
            case _4_0_1: return "4.0.1";
            case _4_1: return "4.1";
            case _4_1_0: return "4.1.0";
            case _4_2: return "4.2";
            case _4_2_0: return "4.2.0";
            case _4_3: return "4.3";
            case _4_3_0: return "4.3.0";
            case _4_3_0CIBUILD: return "4.3.0-cibuild";
            case _4_3_0SNAPSHOT1: return "4.3.0-snapshot1";
            case _4_4: return "4.4";
            case _4_4_0: return "4.4.0";
            case _4_5: return "4.5";
            case _4_5_0: return "4.5.0";
            case _4_6: return "4.6";
            case _4_6_0: return "4.6.0";
            case _5_0: return "5.0";
            case _5_0_0: return "5.0.0";
            case _5_0_0CIBUILD: return "5.0.0-cibuild";
            case _5_0_0SNAPSHOT1: return "5.0.0-snapshot1";
            case _5_0_0SNAPSHOT2: return "5.0.0-snapshot2";
            case _5_0_0BALLOT: return "5.0.0-ballot";
            case _5_0_0SNAPSHOT3: return "5.0.0-snapshot3";
            case _5_0_0DRAFTFINAL: return "5.0.0-draft-final";
            case _6_0_0CIBUILD: return "6.0.0-cibuild";
            case _6_0_0: return "6.0.0";
            case _6_0_0_BALLOT1: return "6.0.0-ballot1";
            case _6_0_0_BALLOT2: return "6.0.0-ballot2";
            case _6_0_0_BALLOT3: return "6.0.0-ballot3";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case _0_01: return "http://hl7.org/fhir/FHIR-version";
            case _0_05: return "http://hl7.org/fhir/FHIR-version";
            case _0_06: return "http://hl7.org/fhir/FHIR-version";
            case _0_11: return "http://hl7.org/fhir/FHIR-version";
            case _0_0: return "http://hl7.org/fhir/FHIR-version";
            case _0_0_80: return "http://hl7.org/fhir/FHIR-version";
            case _0_0_81: return "http://hl7.org/fhir/FHIR-version";
            case _0_0_82: return "http://hl7.org/fhir/FHIR-version";
            case _0_4: return "http://hl7.org/fhir/FHIR-version";
            case _0_4_0: return "http://hl7.org/fhir/FHIR-version";
            case _0_5: return "http://hl7.org/fhir/FHIR-version";
            case _0_5_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_0_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_0_1: return "http://hl7.org/fhir/FHIR-version";
            case _1_0_2: return "http://hl7.org/fhir/FHIR-version";
            case _1_1: return "http://hl7.org/fhir/FHIR-version";
            case _1_1_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_4: return "http://hl7.org/fhir/FHIR-version";
            case _1_4_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_6: return "http://hl7.org/fhir/FHIR-version";
            case _1_6_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_8: return "http://hl7.org/fhir/FHIR-version";
            case _1_8_0: return "http://hl7.org/fhir/FHIR-version";
            case _3_0: return "http://hl7.org/fhir/FHIR-version";
            case _3_0_0: return "http://hl7.org/fhir/FHIR-version";
            case _3_0_1: return "http://hl7.org/fhir/FHIR-version";
            case _3_0_2: return "http://hl7.org/fhir/FHIR-version";
            case _3_3: return "http://hl7.org/fhir/FHIR-version";
            case _3_3_0: return "http://hl7.org/fhir/FHIR-version";
            case _3_5: return "http://hl7.org/fhir/FHIR-version";
            case _3_5_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_0_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_0_1: return "http://hl7.org/fhir/FHIR-version";
            case _4_1: return "http://hl7.org/fhir/FHIR-version";
            case _4_1_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_2: return "http://hl7.org/fhir/FHIR-version";
            case _4_2_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_3: return "http://hl7.org/fhir/FHIR-version";
            case _4_3_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_3_0CIBUILD: return "http://hl7.org/fhir/FHIR-version";
            case _4_3_0SNAPSHOT1: return "http://hl7.org/fhir/FHIR-version";
            case _4_4: return "http://hl7.org/fhir/FHIR-version";
            case _4_4_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_5: return "http://hl7.org/fhir/FHIR-version";
            case _4_5_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_6: return "http://hl7.org/fhir/FHIR-version";
            case _4_6_0: return "http://hl7.org/fhir/FHIR-version";
            case _5_0: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0CIBUILD: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0SNAPSHOT1: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0SNAPSHOT2: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0BALLOT: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0SNAPSHOT3: return "http://hl7.org/fhir/FHIR-version";
            case _5_0_0DRAFTFINAL: return "http://hl7.org/fhir/FHIR-version";
            case _6_0_0CIBUILD: return "http://hl7.org/fhir/FHIR-version";
            case _6_0_0: return "http://hl7.org/fhir/FHIR-version";
            case _6_0_0_BALLOT1: return "http://hl7.org/fhir/FHIR-version";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case _0_01: return "Oldest archived version of FHIR.";
            case _0_05: return "1st Draft for Comment (Sept 2012 Ballot).";
            case _0_06: return "2nd Draft for Comment (January 2013 Ballot).";
            case _0_11: return "DSTU 1 Ballot version.";
            case _0_0: return "DSTU 1 version.";
            case _0_0_80: return "DSTU 1 Official version.";
            case _0_0_81: return "DSTU 1 Official version Technical Errata #1.";
            case _0_0_82: return "DSTU 1 Official version Technical Errata #2.";
            case _0_4: return "January 2015 Ballot.";
            case _0_4_0: return "Draft For Comment (January 2015 Ballot).";
            case _0_5: return "May 2015 Ballot.";
            case _0_5_0: return "DSTU 2 Ballot version (May 2015 Ballot).";
            case _1_0: return "DSTU 2 version.";
            case _1_0_0: return "DSTU 2 QA Preview + CQIF Ballot (Sep 2015).";
            case _1_0_1: return "DSTU 2 (Official version).";
            case _1_0_2: return "DSTU 2 (Official version) with 1 technical errata.";
            case _1_1: return "GAO Ballot version.";
            case _1_1_0: return "GAO Ballot + draft changes to main FHIR standard.";
            case _1_4: return "Connectathon 12 (Montreal) version.";
            case _1_4_0: return "CQF on FHIR Ballot + Connectathon 12 (Montreal).";
            case _1_6: return "Connectathon 13 (Baltimore) version.";
            case _1_6_0: return "FHIR STU3 Ballot + Connectathon 13 (Baltimore).";
            case _1_8: return "Connectathon 14 (San Antonio) version.";
            case _1_8_0: return "FHIR STU3 Candidate + Connectathon 14 (San Antonio).";
            case _3_0: return "STU3 version.";
            case _3_0_0: return "FHIR Release 3 (STU).";
            case _3_0_1: return "FHIR Release 3 (STU) with 1 technical errata.";
            case _3_0_2: return "FHIR Release 3 (STU) with 2 technical errata.";
            case _3_3: return "R4 Ballot #1 version.";
            case _3_3_0: return "R4 Ballot #1 + Connectaton 18 (Cologne).";
            case _3_5: return "R4 Ballot #2 version.";
            case _3_5_0: return "R4 Ballot #2 + Connectathon 19 (Baltimore).";
            case _4_0: return "R4 version.";
            case _4_0_0: return "FHIR Release 4 (Normative + STU).";
            case _4_0_1: return "FHIR Release 4 (Normative + STU) with 1 technical errata.";
            case _4_1: return "R4B Ballot #1 version.";
            case _4_1_0: return "R4B Ballot #1 + Connectathon 27 (Virtual).";
            case _4_2: return "R5 Preview #1 version.";
            case _4_2_0: return "R5 Preview #1 + Connectathon 23 (Sydney).";
            case _4_3: return "R4B version.";
            case _4_3_0: return "FHIR Release 4B (Normative + STU).";
            case _4_3_0CIBUILD: return "FHIR Release 4B CI-Builld.";
            case _4_3_0SNAPSHOT1: return "FHIR Release 4B Snapshot #1.";
            case _4_4: return "R5 Preview #2 version.";
            case _4_4_0: return "R5 Preview #2 + Connectathon 24 (Virtual).";
            case _4_5: return "R5 Preview #3 version.";
            case _4_5_0: return "R5 Preview #3 + Connectathon 25 (Virtual).";
            case _4_6: return "R5 Draft Ballot version.";
            case _4_6_0: return "R5 Draft Ballot + Connectathon 27 (Virtual).";
            case _5_0: return "R5 Versions.";
            case _5_0_0: return "R5 Final Version.";
            case _5_0_0CIBUILD: return "R5 Rolling ci-build.";
            case _5_0_0SNAPSHOT1: return "R5 Preview #2.";
            case _5_0_0SNAPSHOT2: return "R5 Interim tooling stage.";
            case _5_0_0BALLOT: return "R5 Ballot.";
            case _5_0_0SNAPSHOT3: return "R5 January 2023 Staging Release + Connectathon 32.";
            case _5_0_0DRAFTFINAL: return "R5 Final QA.";
            case _6_0_0CIBUILD: return "R6 Rolling ci-build.";
            case _6_0_0: return "R6 Final Version.";
            case _6_0_0_BALLOT1: return "R6 Ballot #1.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case _0_01: return "0.01";
            case _0_05: return "0.05";
            case _0_06: return "0.06";
            case _0_11: return "0.11";
            case _0_0: return "0.0";
            case _0_0_80: return "0.0.80";
            case _0_0_81: return "0.0.81";
            case _0_0_82: return "0.0.82";
            case _0_4: return "0.4";
            case _0_4_0: return "0.4.0";
            case _0_5: return "0.5";
            case _0_5_0: return "0.5.0";
            case _1_0: return "1.0";
            case _1_0_0: return "1.0.0";
            case _1_0_1: return "1.0.1";
            case _1_0_2: return "1.0.2";
            case _1_1: return "1.1";
            case _1_1_0: return "1.1.0";
            case _1_4: return "1.4";
            case _1_4_0: return "1.4.0";
            case _1_6: return "1.6";
            case _1_6_0: return "1.6.0";
            case _1_8: return "1.8";
            case _1_8_0: return "1.8.0";
            case _3_0: return "3.0";
            case _3_0_0: return "3.0.0";
            case _3_0_1: return "3.0.1";
            case _3_0_2: return "3.0.2";
            case _3_3: return "3.3";
            case _3_3_0: return "3.3.0";
            case _3_5: return "3.5";
            case _3_5_0: return "3.5.0";
            case _4_0: return "4.0";
            case _4_0_0: return "4.0.0";
            case _4_0_1: return "4.0.1";
            case _4_1: return "4.1";
            case _4_1_0: return "4.1.0";
            case _4_2: return "4.2";
            case _4_2_0: return "4.2.0";
            case _4_3: return "4.3";
            case _4_3_0: return "4.3.0";
            case _4_3_0CIBUILD: return "4.3.0-cibuild";
            case _4_3_0SNAPSHOT1: return "4.3.0-snapshot1";
            case _4_4: return "4.4";
            case _4_4_0: return "4.4.0";
            case _4_5: return "4.5";
            case _4_5_0: return "4.5.0";
            case _4_6: return "4.6";
            case _4_6_0: return "4.6.0";
            case _5_0: return "5.0";
            case _5_0_0: return "5.0.0";
            case _5_0_0CIBUILD: return "5.0.0-cibuild";
            case _5_0_0SNAPSHOT1: return "5.0.0-snapshot1";
            case _5_0_0SNAPSHOT2: return "5.0.0-snapshot2";
            case _5_0_0BALLOT: return "5.0.0-ballot";
            case _5_0_0SNAPSHOT3: return "5.0.0-snapshot3";
            case _5_0_0DRAFTFINAL: return "5.0.0-draft-final";
            case _6_0_0CIBUILD: return "6.0.0-cibuild";
            case _6_0_0: return "6.0.0";
            case _6_0_0_BALLOT1: return "6.0.0-ballot1";
            case _6_0_0_BALLOT2: return "6.0.0-ballot2";
            case _6_0_0_BALLOT3: return "6.0.0-ballot3";
            case NULL: return null;
            default: return "?";
          }
        }
// manual code from configuration.txt:
//public String toCode(int len) {
//          return toCode().substring(0, len);
//        }
//
//     
//        @Override
//        public String toString() {
//          return toCode();
//        }
//        
//        
//        public boolean isR4B() {
//          return toCode().startsWith("4.1");
//        }
//        
// end addition
    }

  public static class FHIRVersionEnumFactory implements EnumFactory<FHIRVersion> {
    public FHIRVersion fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("0.01".equals(codeString))
          return FHIRVersion._0_01;
        if ("0.05".equals(codeString))
          return FHIRVersion._0_05;
        if ("0.06".equals(codeString))
          return FHIRVersion._0_06;
        if ("0.11".equals(codeString))
          return FHIRVersion._0_11;
        if ("0.0".equals(codeString))
          return FHIRVersion._0_0;
        if ("0.0.80".equals(codeString))
          return FHIRVersion._0_0_80;
        if ("0.0.81".equals(codeString))
          return FHIRVersion._0_0_81;
        if ("0.0.82".equals(codeString))
          return FHIRVersion._0_0_82;
        if ("0.4".equals(codeString))
          return FHIRVersion._0_4;
        if ("0.4.0".equals(codeString))
          return FHIRVersion._0_4_0;
        if ("0.5".equals(codeString))
          return FHIRVersion._0_5;
        if ("0.5.0".equals(codeString))
          return FHIRVersion._0_5_0;
        if ("1.0".equals(codeString))
          return FHIRVersion._1_0;
        if ("1.0.0".equals(codeString))
          return FHIRVersion._1_0_0;
        if ("1.0.1".equals(codeString))
          return FHIRVersion._1_0_1;
        if ("1.0.2".equals(codeString))
          return FHIRVersion._1_0_2;
        if ("1.1".equals(codeString))
          return FHIRVersion._1_1;
        if ("1.1.0".equals(codeString))
          return FHIRVersion._1_1_0;
        if ("1.4".equals(codeString))
          return FHIRVersion._1_4;
        if ("1.4.0".equals(codeString))
          return FHIRVersion._1_4_0;
        if ("1.6".equals(codeString))
          return FHIRVersion._1_6;
        if ("1.6.0".equals(codeString))
          return FHIRVersion._1_6_0;
        if ("1.8".equals(codeString))
          return FHIRVersion._1_8;
        if ("1.8.0".equals(codeString))
          return FHIRVersion._1_8_0;
        if ("3.0".equals(codeString))
          return FHIRVersion._3_0;
        if ("3.0.0".equals(codeString))
          return FHIRVersion._3_0_0;
        if ("3.0.1".equals(codeString))
          return FHIRVersion._3_0_1;
        if ("3.0.2".equals(codeString))
          return FHIRVersion._3_0_2;
        if ("3.3".equals(codeString))
          return FHIRVersion._3_3;
        if ("3.3.0".equals(codeString))
          return FHIRVersion._3_3_0;
        if ("3.5".equals(codeString))
          return FHIRVersion._3_5;
        if ("3.5.0".equals(codeString))
          return FHIRVersion._3_5_0;
        if ("4.0".equals(codeString))
          return FHIRVersion._4_0;
        if ("4.0.0".equals(codeString))
          return FHIRVersion._4_0_0;
        if ("4.0.1".equals(codeString))
          return FHIRVersion._4_0_1;
        if ("4.1".equals(codeString))
          return FHIRVersion._4_1;
        if ("4.1.0".equals(codeString))
          return FHIRVersion._4_1_0;
        if ("4.2".equals(codeString))
          return FHIRVersion._4_2;
        if ("4.2.0".equals(codeString))
          return FHIRVersion._4_2_0;
        if ("4.3".equals(codeString))
          return FHIRVersion._4_3;
        if ("4.3.0".equals(codeString))
          return FHIRVersion._4_3_0;
        if ("4.3.0-cibuild".equals(codeString))
          return FHIRVersion._4_3_0CIBUILD;
        if ("4.3.0-snapshot1".equals(codeString))
          return FHIRVersion._4_3_0SNAPSHOT1;
        if ("4.4".equals(codeString))
          return FHIRVersion._4_4;
        if ("4.4.0".equals(codeString))
          return FHIRVersion._4_4_0;
        if ("4.5".equals(codeString))
          return FHIRVersion._4_5;
        if ("4.5.0".equals(codeString))
          return FHIRVersion._4_5_0;
        if ("4.6".equals(codeString))
          return FHIRVersion._4_6;
        if ("4.6.0".equals(codeString))
          return FHIRVersion._4_6_0;
        if ("5.0".equals(codeString))
          return FHIRVersion._5_0;
        if ("5.0.0".equals(codeString))
          return FHIRVersion._5_0_0;
        if ("5.0.0-cibuild".equals(codeString))
          return FHIRVersion._5_0_0CIBUILD;
        if ("5.0.0-snapshot1".equals(codeString))
          return FHIRVersion._5_0_0SNAPSHOT1;
        if ("5.0.0-snapshot2".equals(codeString))
          return FHIRVersion._5_0_0SNAPSHOT2;
        if ("5.0.0-ballot".equals(codeString))
          return FHIRVersion._5_0_0BALLOT;
        if ("5.0.0-snapshot3".equals(codeString))
          return FHIRVersion._5_0_0SNAPSHOT3;
        if ("5.0.0-draft-final".equals(codeString))
          return FHIRVersion._5_0_0DRAFTFINAL;
        if ("6.0.0-cibuild".equals(codeString))
          return FHIRVersion._6_0_0CIBUILD;
        if ("6.0.0".equals(codeString))
          return FHIRVersion._6_0_0;
        if ("6.0.0-ballot1".equals(codeString))
          return FHIRVersion._6_0_0_BALLOT1;
        if ("6.0.0-ballot2".equals(codeString))
          return FHIRVersion._6_0_0_BALLOT2;
        if ("6.0.0-ballot3".equals(codeString))
          return FHIRVersion._6_0_0_BALLOT3;
        throw new IllegalArgumentException("Unknown FHIRVersion code '"+codeString+"'");
        }

        public Enumeration<FHIRVersion> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<FHIRVersion>(this, FHIRVersion.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<FHIRVersion>(this, FHIRVersion.NULL, code);
        if ("0.01".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_01, code);
        if ("0.05".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_05, code);
        if ("0.06".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_06, code);
        if ("0.11".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_11, code);
        if ("0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_0, code);
        if ("0.0.80".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_0_80, code);
        if ("0.0.81".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_0_81, code);
        if ("0.0.82".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_0_82, code);
        if ("0.4".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_4, code);
        if ("0.4.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_4_0, code);
        if ("0.5".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_5, code);
        if ("0.5.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_5_0, code);
        if ("1.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_0, code);
        if ("1.0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_0_0, code);
        if ("1.0.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_0_1, code);
        if ("1.0.2".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_0_2, code);
        if ("1.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_1, code);
        if ("1.1.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_1_0, code);
        if ("1.4".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_4, code);
        if ("1.4.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_4_0, code);
        if ("1.6".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_6, code);
        if ("1.6.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_6_0, code);
        if ("1.8".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_8, code);
        if ("1.8.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_8_0, code);
        if ("3.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_0, code);
        if ("3.0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_0_0, code);
        if ("3.0.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_0_1, code);
        if ("3.0.2".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_0_2, code);
        if ("3.3".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_3, code);
        if ("3.3.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_3_0, code);
        if ("3.5".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_5, code);
        if ("3.5.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_5_0, code);
        if ("4.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_0, code);
        if ("4.0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_0_0, code);
        if ("4.0.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_0_1, code);
        if ("4.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_1, code);
        if ("4.1.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_1_0, code);
        if ("4.2".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_2, code);
        if ("4.2.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_2_0, code);
        if ("4.3".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_3, code);
        if ("4.3.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_3_0, code);
        if ("4.3.0-cibuild".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_3_0CIBUILD, code);
        if ("4.3.0-snapshot1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_3_0SNAPSHOT1, code);
        if ("4.4".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_4, code);
        if ("4.4.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_4_0, code);
        if ("4.5".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_5, code);
        if ("4.5.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_5_0, code);
        if ("4.6".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_6, code);
        if ("4.6.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_6_0, code);
        if ("5.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0, code);
        if ("5.0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0, code);
        if ("5.0.0-cibuild".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0CIBUILD, code);
        if ("5.0.0-snapshot1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0SNAPSHOT1, code);
        if ("5.0.0-snapshot2".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0SNAPSHOT2, code);
        if ("5.0.0-ballot".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0BALLOT, code);
        if ("5.0.0-snapshot3".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0SNAPSHOT3, code);
        if ("5.0.0-draft-final".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0_0DRAFTFINAL, code);
        if ("6.0.0-cibuild".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._6_0_0CIBUILD, code);
        if ("6.0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._6_0_0, code);
        if ("6.0.0-ballot1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._6_0_0_BALLOT1, code);
        if ("6.0.0-ballot2".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._6_0_0_BALLOT2, code);
        if ("6.0.0-ballot3".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._6_0_0_BALLOT3, code);
        throw new FHIRException("Unknown FHIRVersion code '"+codeString+"'");        
        }
    public String toCode(FHIRVersion code) {
       if (code == FHIRVersion.NULL)
           return null;
       if (code == FHIRVersion._0_01)
        return "0.01";
      if (code == FHIRVersion._0_05)
        return "0.05";
      if (code == FHIRVersion._0_06)
        return "0.06";
      if (code == FHIRVersion._0_11)
        return "0.11";
      if (code == FHIRVersion._0_0)
        return "0.0";
      if (code == FHIRVersion._0_0_80)
        return "0.0.80";
      if (code == FHIRVersion._0_0_81)
        return "0.0.81";
      if (code == FHIRVersion._0_0_82)
        return "0.0.82";
      if (code == FHIRVersion._0_4)
        return "0.4";
      if (code == FHIRVersion._0_4_0)
        return "0.4.0";
      if (code == FHIRVersion._0_5)
        return "0.5";
      if (code == FHIRVersion._0_5_0)
        return "0.5.0";
      if (code == FHIRVersion._1_0)
        return "1.0";
      if (code == FHIRVersion._1_0_0)
        return "1.0.0";
      if (code == FHIRVersion._1_0_1)
        return "1.0.1";
      if (code == FHIRVersion._1_0_2)
        return "1.0.2";
      if (code == FHIRVersion._1_1)
        return "1.1";
      if (code == FHIRVersion._1_1_0)
        return "1.1.0";
      if (code == FHIRVersion._1_4)
        return "1.4";
      if (code == FHIRVersion._1_4_0)
        return "1.4.0";
      if (code == FHIRVersion._1_6)
        return "1.6";
      if (code == FHIRVersion._1_6_0)
        return "1.6.0";
      if (code == FHIRVersion._1_8)
        return "1.8";
      if (code == FHIRVersion._1_8_0)
        return "1.8.0";
      if (code == FHIRVersion._3_0)
        return "3.0";
      if (code == FHIRVersion._3_0_0)
        return "3.0.0";
      if (code == FHIRVersion._3_0_1)
        return "3.0.1";
      if (code == FHIRVersion._3_0_2)
        return "3.0.2";
      if (code == FHIRVersion._3_3)
        return "3.3";
      if (code == FHIRVersion._3_3_0)
        return "3.3.0";
      if (code == FHIRVersion._3_5)
        return "3.5";
      if (code == FHIRVersion._3_5_0)
        return "3.5.0";
      if (code == FHIRVersion._4_0)
        return "4.0";
      if (code == FHIRVersion._4_0_0)
        return "4.0.0";
      if (code == FHIRVersion._4_0_1)
        return "4.0.1";
      if (code == FHIRVersion._4_1)
        return "4.1";
      if (code == FHIRVersion._4_1_0)
        return "4.1.0";
      if (code == FHIRVersion._4_2)
        return "4.2";
      if (code == FHIRVersion._4_2_0)
        return "4.2.0";
      if (code == FHIRVersion._4_3)
        return "4.3";
      if (code == FHIRVersion._4_3_0)
        return "4.3.0";
      if (code == FHIRVersion._4_3_0CIBUILD)
        return "4.3.0-cibuild";
      if (code == FHIRVersion._4_3_0SNAPSHOT1)
        return "4.3.0-snapshot1";
      if (code == FHIRVersion._4_4)
        return "4.4";
      if (code == FHIRVersion._4_4_0)
        return "4.4.0";
      if (code == FHIRVersion._4_5)
        return "4.5";
      if (code == FHIRVersion._4_5_0)
        return "4.5.0";
      if (code == FHIRVersion._4_6)
        return "4.6";
      if (code == FHIRVersion._4_6_0)
        return "4.6.0";
      if (code == FHIRVersion._5_0)
        return "5.0";
      if (code == FHIRVersion._5_0_0)
        return "5.0.0";
      if (code == FHIRVersion._5_0_0CIBUILD)
        return "5.0.0-cibuild";
      if (code == FHIRVersion._5_0_0SNAPSHOT1)
        return "5.0.0-snapshot1";
      if (code == FHIRVersion._5_0_0SNAPSHOT2)
        return "5.0.0-snapshot2";
      if (code == FHIRVersion._5_0_0BALLOT)
        return "5.0.0-ballot";
      if (code == FHIRVersion._5_0_0SNAPSHOT3)
        return "5.0.0-snapshot3";
      if (code == FHIRVersion._5_0_0DRAFTFINAL)
        return "5.0.0-draft-final";
      if (code == FHIRVersion._6_0_0CIBUILD)
        return "6.0.0-cibuild";
      if (code == FHIRVersion._6_0_0)
        return "6.0.0";
      if (code == FHIRVersion._6_0_0_BALLOT1) {
        return "6.0.0-ballot1";
      }
      if (code == FHIRVersion._6_0_0_BALLOT2) {
        return "6.0.0-ballot2";
      }
      if (code == FHIRVersion._6_0_0_BALLOT3) {
        return "6.0.0-ballot3";
      }
      return "?";
   }

    public String toSystem(FHIRVersion code) {
      return code.getSystem();
    }
  }

  public enum KnowledgeResourceType {
    /**
     * The definition of a specific activity to be taken, independent of any
     * particular patient or context.
     */
    ACTIVITYDEFINITION,
    /**
     * A set of codes drawn from one or more code systems.
     */
    CODESYSTEM,
    /**
     * A map from one set of concepts to one or more other concepts.
     */
    CONCEPTMAP,
    /**
     * Represents a library of quality improvement components.
     */
    LIBRARY,
    /**
     * A quality measure definition.
     */
    MEASURE,
    /**
     * The definition of a plan for a series of actions, independent of any specific
     * patient or context.
     */
    PLANDEFINITION,
    /**
     * Structural Definition.
     */
    STRUCTUREDEFINITION,
    /**
     * A Map of relationships between 2 structures that can be used to transform
     * data.
     */
    STRUCTUREMAP,
    /**
     * A set of codes drawn from one or more code systems.
     */
    VALUESET,
    /**
     * added to help the parsers
     */
    NULL;

    public static KnowledgeResourceType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("ActivityDefinition".equals(codeString))
        return ACTIVITYDEFINITION;
      if ("CodeSystem".equals(codeString))
        return CODESYSTEM;
      if ("ConceptMap".equals(codeString))
        return CONCEPTMAP;
      if ("Library".equals(codeString))
        return LIBRARY;
      if ("Measure".equals(codeString))
        return MEASURE;
      if ("PlanDefinition".equals(codeString))
        return PLANDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return STRUCTUREMAP;
      if ("ValueSet".equals(codeString))
        return VALUESET;
      throw new FHIRException("Unknown KnowledgeResourceType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case CODESYSTEM:
        return "CodeSystem";
      case CONCEPTMAP:
        return "ConceptMap";
      case LIBRARY:
        return "Library";
      case MEASURE:
        return "Measure";
      case PLANDEFINITION:
        return "PlanDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case VALUESET:
        return "ValueSet";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case CODESYSTEM:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case CONCEPTMAP:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case LIBRARY:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case MEASURE:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case PLANDEFINITION:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case STRUCTUREDEFINITION:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case STRUCTUREMAP:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case VALUESET:
        return "http://hl7.org/fhir/knowledge-resource-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "The definition of a specific activity to be taken, independent of any particular patient or context.";
      case CODESYSTEM:
        return "A set of codes drawn from one or more code systems.";
      case CONCEPTMAP:
        return "A map from one set of concepts to one or more other concepts.";
      case LIBRARY:
        return "Represents a library of quality improvement components.";
      case MEASURE:
        return "A quality measure definition.";
      case PLANDEFINITION:
        return "The definition of a plan for a series of actions, independent of any specific patient or context.";
      case STRUCTUREDEFINITION:
        return "Structural Definition.";
      case STRUCTUREMAP:
        return "A Map of relationships between 2 structures that can be used to transform data.";
      case VALUESET:
        return "A set of codes drawn from one or more code systems.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case CODESYSTEM:
        return "CodeSystem";
      case CONCEPTMAP:
        return "ConceptMap";
      case LIBRARY:
        return "Library";
      case MEASURE:
        return "Measure";
      case PLANDEFINITION:
        return "PlanDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case VALUESET:
        return "ValueSet";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class KnowledgeResourceTypeEnumFactory implements EnumFactory<KnowledgeResourceType> {
    public KnowledgeResourceType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("ActivityDefinition".equals(codeString))
        return KnowledgeResourceType.ACTIVITYDEFINITION;
      if ("CodeSystem".equals(codeString))
        return KnowledgeResourceType.CODESYSTEM;
      if ("ConceptMap".equals(codeString))
        return KnowledgeResourceType.CONCEPTMAP;
      if ("Library".equals(codeString))
        return KnowledgeResourceType.LIBRARY;
      if ("Measure".equals(codeString))
        return KnowledgeResourceType.MEASURE;
      if ("PlanDefinition".equals(codeString))
        return KnowledgeResourceType.PLANDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return KnowledgeResourceType.STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return KnowledgeResourceType.STRUCTUREMAP;
      if ("ValueSet".equals(codeString))
        return KnowledgeResourceType.VALUESET;
      throw new IllegalArgumentException("Unknown KnowledgeResourceType code '" + codeString + "'");
    }

    public Enumeration<KnowledgeResourceType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.NULL, code);
      if ("ActivityDefinition".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.ACTIVITYDEFINITION, code);
      if ("CodeSystem".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.CODESYSTEM, code);
      if ("ConceptMap".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.CONCEPTMAP, code);
      if ("Library".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.LIBRARY, code);
      if ("Measure".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.MEASURE, code);
      if ("PlanDefinition".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.PLANDEFINITION, code);
      if ("StructureDefinition".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.STRUCTUREDEFINITION, code);
      if ("StructureMap".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.STRUCTUREMAP, code);
      if ("ValueSet".equals(codeString))
        return new Enumeration<KnowledgeResourceType>(this, KnowledgeResourceType.VALUESET, code);
      throw new FHIRException("Unknown KnowledgeResourceType code '" + codeString + "'");
    }

    public String toCode(KnowledgeResourceType code) {
       if (code == KnowledgeResourceType.NULL)
           return null;
       if (code == KnowledgeResourceType.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == KnowledgeResourceType.CODESYSTEM)
        return "CodeSystem";
      if (code == KnowledgeResourceType.CONCEPTMAP)
        return "ConceptMap";
      if (code == KnowledgeResourceType.LIBRARY)
        return "Library";
      if (code == KnowledgeResourceType.MEASURE)
        return "Measure";
      if (code == KnowledgeResourceType.PLANDEFINITION)
        return "PlanDefinition";
      if (code == KnowledgeResourceType.STRUCTUREDEFINITION)
        return "StructureDefinition";
      if (code == KnowledgeResourceType.STRUCTUREMAP)
        return "StructureMap";
      if (code == KnowledgeResourceType.VALUESET)
        return "ValueSet";
      return "?";
   }

    public String toSystem(KnowledgeResourceType code) {
      return code.getSystem();
    }
  }

  public enum MessageEvent {
    /**
     * added to help the parsers
     */
    NULL;

    public static MessageEvent fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      throw new FHIRException("Unknown MessageEvent code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class MessageEventEnumFactory implements EnumFactory<MessageEvent> {
    public MessageEvent fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      throw new IllegalArgumentException("Unknown MessageEvent code '" + codeString + "'");
    }

    public Enumeration<MessageEvent> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<MessageEvent>(this, MessageEvent.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<MessageEvent>(this, MessageEvent.NULL, code);
      throw new FHIRException("Unknown MessageEvent code '" + codeString + "'");
    }

    public String toCode(MessageEvent code) {
       if (code == MessageEvent.NULL)
           return null;
       return "?";
   }

    public String toSystem(MessageEvent code) {
      return code.getSystem();
    }
  }

  public enum NoteType {
    /**
     * Display the note.
     */
    DISPLAY,
    /**
     * Print the note on the form.
     */
    PRINT,
    /**
     * Print the note for the operator.
     */
    PRINTOPER,
    /**
     * added to help the parsers
     */
    NULL;

    public static NoteType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("display".equals(codeString))
        return DISPLAY;
      if ("print".equals(codeString))
        return PRINT;
      if ("printoper".equals(codeString))
        return PRINTOPER;
      throw new FHIRException("Unknown NoteType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case DISPLAY:
        return "display";
      case PRINT:
        return "print";
      case PRINTOPER:
        return "printoper";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case DISPLAY:
        return "http://hl7.org/fhir/note-type";
      case PRINT:
        return "http://hl7.org/fhir/note-type";
      case PRINTOPER:
        return "http://hl7.org/fhir/note-type";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case DISPLAY:
        return "Display the note.";
      case PRINT:
        return "Print the note on the form.";
      case PRINTOPER:
        return "Print the note for the operator.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case DISPLAY:
        return "Display";
      case PRINT:
        return "Print (Form)";
      case PRINTOPER:
        return "Print (Operator)";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class NoteTypeEnumFactory implements EnumFactory<NoteType> {
    public NoteType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("display".equals(codeString))
        return NoteType.DISPLAY;
      if ("print".equals(codeString))
        return NoteType.PRINT;
      if ("printoper".equals(codeString))
        return NoteType.PRINTOPER;
      throw new IllegalArgumentException("Unknown NoteType code '" + codeString + "'");
    }

    public Enumeration<NoteType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<NoteType>(this, NoteType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<NoteType>(this, NoteType.NULL, code);
      if ("display".equals(codeString))
        return new Enumeration<NoteType>(this, NoteType.DISPLAY, code);
      if ("print".equals(codeString))
        return new Enumeration<NoteType>(this, NoteType.PRINT, code);
      if ("printoper".equals(codeString))
        return new Enumeration<NoteType>(this, NoteType.PRINTOPER, code);
      throw new FHIRException("Unknown NoteType code '" + codeString + "'");
    }

    public String toCode(NoteType code) {
       if (code == NoteType.NULL)
           return null;
       if (code == NoteType.DISPLAY)
        return "display";
      if (code == NoteType.PRINT)
        return "print";
      if (code == NoteType.PRINTOPER)
        return "printoper";
      return "?";
   }

    public String toSystem(NoteType code) {
      return code.getSystem();
    }
  }

  public enum PublicationStatus {
    /**
     * This resource is still under development and is not yet considered to be
     * ready for normal use.
     */
    DRAFT,
    /**
     * This resource is ready for normal use.
     */
    ACTIVE,
    /**
     * This resource has been withdrawn or superseded and should no longer be used.
     */
    RETIRED,
    /**
     * The authoring system does not know which of the status values currently
     * applies for this resource. Note: This concept is not to be used for "other" -
     * one of the listed statuses is presumed to apply, it's just not known which
     * one.
     */
    UNKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static PublicationStatus fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("draft".equals(codeString))
        return DRAFT;
      if ("active".equals(codeString))
        return ACTIVE;
      if ("retired".equals(codeString))
        return RETIRED;
      if ("unknown".equals(codeString))
        return UNKNOWN;
      throw new FHIRException("Unknown PublicationStatus code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case DRAFT:
        return "draft";
      case ACTIVE:
        return "active";
      case RETIRED:
        return "retired";
      case UNKNOWN:
        return "unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case DRAFT:
        return "http://hl7.org/fhir/publication-status";
      case ACTIVE:
        return "http://hl7.org/fhir/publication-status";
      case RETIRED:
        return "http://hl7.org/fhir/publication-status";
      case UNKNOWN:
        return "http://hl7.org/fhir/publication-status";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case DRAFT:
        return "This resource is still under development and is not yet considered to be ready for normal use.";
      case ACTIVE:
        return "This resource is ready for normal use.";
      case RETIRED:
        return "This resource has been withdrawn or superseded and should no longer be used.";
      case UNKNOWN:
        return "The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case DRAFT:
        return "Draft";
      case ACTIVE:
        return "Active";
      case RETIRED:
        return "Retired";
      case UNKNOWN:
        return "Unknown";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class PublicationStatusEnumFactory implements EnumFactory<PublicationStatus> {
    public PublicationStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("draft".equals(codeString))
        return PublicationStatus.DRAFT;
      if ("active".equals(codeString))
        return PublicationStatus.ACTIVE;
      if ("retired".equals(codeString))
        return PublicationStatus.RETIRED;
      if ("unknown".equals(codeString))
        return PublicationStatus.UNKNOWN;
      throw new IllegalArgumentException("Unknown PublicationStatus code '" + codeString + "'");
    }

    public Enumeration<PublicationStatus> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<PublicationStatus>(this, PublicationStatus.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<PublicationStatus>(this, PublicationStatus.NULL, code);
      if ("draft".equals(codeString))
        return new Enumeration<PublicationStatus>(this, PublicationStatus.DRAFT, code);
      if ("active".equals(codeString))
        return new Enumeration<PublicationStatus>(this, PublicationStatus.ACTIVE, code);
      if ("retired".equals(codeString))
        return new Enumeration<PublicationStatus>(this, PublicationStatus.RETIRED, code);
      if ("unknown".equals(codeString))
        return new Enumeration<PublicationStatus>(this, PublicationStatus.UNKNOWN, code);
      throw new FHIRException("Unknown PublicationStatus code '" + codeString + "'");
    }

    public String toCode(PublicationStatus code) {
       if (code == PublicationStatus.NULL)
           return null;
       if (code == PublicationStatus.DRAFT)
        return "draft";
      if (code == PublicationStatus.ACTIVE)
        return "active";
      if (code == PublicationStatus.RETIRED)
        return "retired";
      if (code == PublicationStatus.UNKNOWN)
        return "unknown";
      return "?";
   }

    public String toSystem(PublicationStatus code) {
      return code.getSystem();
    }
  }

  public enum RemittanceOutcome {
    /**
     * The Claim/Pre-authorization/Pre-determination has been received but
     * processing has not begun.
     */
    QUEUED,
    /**
     * The processing has completed without errors
     */
    COMPLETE,
    /**
     * One or more errors have been detected in the Claim
     */
    ERROR,
    /**
     * No errors have been detected in the Claim and some of the adjudication has
     * been performed.
     */
    PARTIAL,
    /**
     * added to help the parsers
     */
    NULL;

    public static RemittanceOutcome fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("queued".equals(codeString))
        return QUEUED;
      if ("complete".equals(codeString))
        return COMPLETE;
      if ("error".equals(codeString))
        return ERROR;
      if ("partial".equals(codeString))
        return PARTIAL;
      throw new FHIRException("Unknown RemittanceOutcome code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case QUEUED:
        return "queued";
      case COMPLETE:
        return "complete";
      case ERROR:
        return "error";
      case PARTIAL:
        return "partial";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case QUEUED:
        return "http://hl7.org/fhir/remittance-outcome";
      case COMPLETE:
        return "http://hl7.org/fhir/remittance-outcome";
      case ERROR:
        return "http://hl7.org/fhir/remittance-outcome";
      case PARTIAL:
        return "http://hl7.org/fhir/remittance-outcome";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case QUEUED:
        return "The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.";
      case COMPLETE:
        return "The processing has completed without errors";
      case ERROR:
        return "One or more errors have been detected in the Claim";
      case PARTIAL:
        return "No errors have been detected in the Claim and some of the adjudication has been performed.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case QUEUED:
        return "Queued";
      case COMPLETE:
        return "Processing Complete";
      case ERROR:
        return "Error";
      case PARTIAL:
        return "Partial Processing";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class RemittanceOutcomeEnumFactory implements EnumFactory<RemittanceOutcome> {
    public RemittanceOutcome fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("queued".equals(codeString))
        return RemittanceOutcome.QUEUED;
      if ("complete".equals(codeString))
        return RemittanceOutcome.COMPLETE;
      if ("error".equals(codeString))
        return RemittanceOutcome.ERROR;
      if ("partial".equals(codeString))
        return RemittanceOutcome.PARTIAL;
      throw new IllegalArgumentException("Unknown RemittanceOutcome code '" + codeString + "'");
    }

    public Enumeration<RemittanceOutcome> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.NULL, code);
      if ("queued".equals(codeString))
        return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.QUEUED, code);
      if ("complete".equals(codeString))
        return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.COMPLETE, code);
      if ("error".equals(codeString))
        return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.ERROR, code);
      if ("partial".equals(codeString))
        return new Enumeration<RemittanceOutcome>(this, RemittanceOutcome.PARTIAL, code);
      throw new FHIRException("Unknown RemittanceOutcome code '" + codeString + "'");
    }

    public String toCode(RemittanceOutcome code) {
       if (code == RemittanceOutcome.NULL)
           return null;
       if (code == RemittanceOutcome.QUEUED)
        return "queued";
      if (code == RemittanceOutcome.COMPLETE)
        return "complete";
      if (code == RemittanceOutcome.ERROR)
        return "error";
      if (code == RemittanceOutcome.PARTIAL)
        return "partial";
      return "?";
   }

    public String toSystem(RemittanceOutcome code) {
      return code.getSystem();
    }
  }

  public enum RequestResourceType {
    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related
     * person(s) and/or device(s) for a specific date/time. This may result in one
     * or more Encounter(s).
     */
    APPOINTMENT,
    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such
     * as a confirmation or rejection.
     */
    APPOINTMENTRESPONSE,
    /**
     * Healthcare plan for patient or group.
     */
    CAREPLAN,
    /**
     * Claim, Pre-determination or Pre-authorization.
     */
    CLAIM,
    /**
     * A request for information to be sent to a receiver.
     */
    COMMUNICATIONREQUEST,
    /**
     * Legal Agreement.
     */
    CONTRACT,
    /**
     * Medical device request.
     */
    DEVICEREQUEST,
    /**
     * Enrollment request.
     */
    ENROLLMENTREQUEST,
    /**
     * Guidance or advice relating to an immunization.
     */
    IMMUNIZATIONRECOMMENDATION,
    /**
     * Ordering of medication for patient or group.
     */
    MEDICATIONREQUEST,
    /**
     * Diet, formula or nutritional supplement request.
     */
    NUTRITIONORDER,
    /**
     * A record of a request for service such as diagnostic investigations,
     * treatments, or operations to be performed.
     */
    SERVICEREQUEST,
    /**
     * Request for a medication, substance or device.
     */
    SUPPLYREQUEST,
    /**
     * A task to be performed.
     */
    TASK,
    /**
     * Prescription for vision correction products for a patient.
     */
    VISIONPRESCRIPTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static RequestResourceType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("Appointment".equals(codeString))
        return APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return APPOINTMENTRESPONSE;
      if ("CarePlan".equals(codeString))
        return CAREPLAN;
      if ("Claim".equals(codeString))
        return CLAIM;
      if ("CommunicationRequest".equals(codeString))
        return COMMUNICATIONREQUEST;
      if ("Contract".equals(codeString))
        return CONTRACT;
      if ("DeviceRequest".equals(codeString))
        return DEVICEREQUEST;
      if ("EnrollmentRequest".equals(codeString))
        return ENROLLMENTREQUEST;
      if ("ImmunizationRecommendation".equals(codeString))
        return IMMUNIZATIONRECOMMENDATION;
      if ("MedicationRequest".equals(codeString))
        return MEDICATIONREQUEST;
      if ("NutritionOrder".equals(codeString))
        return NUTRITIONORDER;
      if ("ServiceRequest".equals(codeString))
        return SERVICEREQUEST;
      if ("SupplyRequest".equals(codeString))
        return SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return TASK;
      if ("VisionPrescription".equals(codeString))
        return VISIONPRESCRIPTION;
      throw new FHIRException("Unknown RequestResourceType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case CAREPLAN:
        return "CarePlan";
      case CLAIM:
        return "Claim";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case CONTRACT:
        return "Contract";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case APPOINTMENT:
        return "http://hl7.org/fhir/request-resource-types";
      case APPOINTMENTRESPONSE:
        return "http://hl7.org/fhir/request-resource-types";
      case CAREPLAN:
        return "http://hl7.org/fhir/request-resource-types";
      case CLAIM:
        return "http://hl7.org/fhir/request-resource-types";
      case COMMUNICATIONREQUEST:
        return "http://hl7.org/fhir/request-resource-types";
      case CONTRACT:
        return "http://hl7.org/fhir/request-resource-types";
      case DEVICEREQUEST:
        return "http://hl7.org/fhir/request-resource-types";
      case ENROLLMENTREQUEST:
        return "http://hl7.org/fhir/request-resource-types";
      case IMMUNIZATIONRECOMMENDATION:
        return "http://hl7.org/fhir/request-resource-types";
      case MEDICATIONREQUEST:
        return "http://hl7.org/fhir/request-resource-types";
      case NUTRITIONORDER:
        return "http://hl7.org/fhir/request-resource-types";
      case SERVICEREQUEST:
        return "http://hl7.org/fhir/request-resource-types";
      case SUPPLYREQUEST:
        return "http://hl7.org/fhir/request-resource-types";
      case TASK:
        return "http://hl7.org/fhir/request-resource-types";
      case VISIONPRESCRIPTION:
        return "http://hl7.org/fhir/request-resource-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case APPOINTMENT:
        return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
      case APPOINTMENTRESPONSE:
        return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
      case CAREPLAN:
        return "Healthcare plan for patient or group.";
      case CLAIM:
        return "Claim, Pre-determination or Pre-authorization.";
      case COMMUNICATIONREQUEST:
        return "A request for information to be sent to a receiver.";
      case CONTRACT:
        return "Legal Agreement.";
      case DEVICEREQUEST:
        return "Medical device request.";
      case ENROLLMENTREQUEST:
        return "Enrollment request.";
      case IMMUNIZATIONRECOMMENDATION:
        return "Guidance or advice relating to an immunization.";
      case MEDICATIONREQUEST:
        return "Ordering of medication for patient or group.";
      case NUTRITIONORDER:
        return "Diet, formula or nutritional supplement request.";
      case SERVICEREQUEST:
        return "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.";
      case SUPPLYREQUEST:
        return "Request for a medication, substance or device.";
      case TASK:
        return "A task to be performed.";
      case VISIONPRESCRIPTION:
        return "Prescription for vision correction products for a patient.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case CAREPLAN:
        return "CarePlan";
      case CLAIM:
        return "Claim";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case CONTRACT:
        return "Contract";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class RequestResourceTypeEnumFactory implements EnumFactory<RequestResourceType> {
    public RequestResourceType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("Appointment".equals(codeString))
        return RequestResourceType.APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return RequestResourceType.APPOINTMENTRESPONSE;
      if ("CarePlan".equals(codeString))
        return RequestResourceType.CAREPLAN;
      if ("Claim".equals(codeString))
        return RequestResourceType.CLAIM;
      if ("CommunicationRequest".equals(codeString))
        return RequestResourceType.COMMUNICATIONREQUEST;
      if ("Contract".equals(codeString))
        return RequestResourceType.CONTRACT;
      if ("DeviceRequest".equals(codeString))
        return RequestResourceType.DEVICEREQUEST;
      if ("EnrollmentRequest".equals(codeString))
        return RequestResourceType.ENROLLMENTREQUEST;
      if ("ImmunizationRecommendation".equals(codeString))
        return RequestResourceType.IMMUNIZATIONRECOMMENDATION;
      if ("MedicationRequest".equals(codeString))
        return RequestResourceType.MEDICATIONREQUEST;
      if ("NutritionOrder".equals(codeString))
        return RequestResourceType.NUTRITIONORDER;
      if ("ServiceRequest".equals(codeString))
        return RequestResourceType.SERVICEREQUEST;
      if ("SupplyRequest".equals(codeString))
        return RequestResourceType.SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return RequestResourceType.TASK;
      if ("VisionPrescription".equals(codeString))
        return RequestResourceType.VISIONPRESCRIPTION;
      throw new IllegalArgumentException("Unknown RequestResourceType code '" + codeString + "'");
    }

    public Enumeration<RequestResourceType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<RequestResourceType>(this, RequestResourceType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.NULL, code);
      if ("Appointment".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.APPOINTMENT, code);
      if ("AppointmentResponse".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.APPOINTMENTRESPONSE, code);
      if ("CarePlan".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.CAREPLAN, code);
      if ("Claim".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.CLAIM, code);
      if ("CommunicationRequest".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.COMMUNICATIONREQUEST, code);
      if ("Contract".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.CONTRACT, code);
      if ("DeviceRequest".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.DEVICEREQUEST, code);
      if ("EnrollmentRequest".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.ENROLLMENTREQUEST, code);
      if ("ImmunizationRecommendation".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.IMMUNIZATIONRECOMMENDATION, code);
      if ("MedicationRequest".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.MEDICATIONREQUEST, code);
      if ("NutritionOrder".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.NUTRITIONORDER, code);
      if ("ServiceRequest".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.SERVICEREQUEST, code);
      if ("SupplyRequest".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.SUPPLYREQUEST, code);
      if ("Task".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.TASK, code);
      if ("VisionPrescription".equals(codeString))
        return new Enumeration<RequestResourceType>(this, RequestResourceType.VISIONPRESCRIPTION, code);
      throw new FHIRException("Unknown RequestResourceType code '" + codeString + "'");
    }

    public String toCode(RequestResourceType code) {
       if (code == RequestResourceType.NULL)
           return null;
       if (code == RequestResourceType.APPOINTMENT)
        return "Appointment";
      if (code == RequestResourceType.APPOINTMENTRESPONSE)
        return "AppointmentResponse";
      if (code == RequestResourceType.CAREPLAN)
        return "CarePlan";
      if (code == RequestResourceType.CLAIM)
        return "Claim";
      if (code == RequestResourceType.COMMUNICATIONREQUEST)
        return "CommunicationRequest";
      if (code == RequestResourceType.CONTRACT)
        return "Contract";
      if (code == RequestResourceType.DEVICEREQUEST)
        return "DeviceRequest";
      if (code == RequestResourceType.ENROLLMENTREQUEST)
        return "EnrollmentRequest";
      if (code == RequestResourceType.IMMUNIZATIONRECOMMENDATION)
        return "ImmunizationRecommendation";
      if (code == RequestResourceType.MEDICATIONREQUEST)
        return "MedicationRequest";
      if (code == RequestResourceType.NUTRITIONORDER)
        return "NutritionOrder";
      if (code == RequestResourceType.SERVICEREQUEST)
        return "ServiceRequest";
      if (code == RequestResourceType.SUPPLYREQUEST)
        return "SupplyRequest";
      if (code == RequestResourceType.TASK)
        return "Task";
      if (code == RequestResourceType.VISIONPRESCRIPTION)
        return "VisionPrescription";
      return "?";
   }

    public String toSystem(RequestResourceType code) {
      return code.getSystem();
    }
  }

  public enum ResourceType {
    /**
     * A financial tool for tracking value accrued for a particular purpose. In the
     * healthcare field, used to track charges for a patient, cost centers, etc.
     */
    ACCOUNT,
    /**
     * This resource allows for the definition of some activity to be performed,
     * independent of a particular patient, practitioner, or other performance
     * context.
     */
    ACTIVITYDEFINITION,
    /**
     * Actual or potential/avoided event causing unintended physical injury
     * resulting from or contributed to by medical care, a research study or other
     * healthcare setting factors that requires additional monitoring, treatment, or
     * hospitalization, or that results in death.
     */
    ADVERSEEVENT,
    /**
     * Risk of harmful or undesirable, physiological response which is unique to an
     * individual and associated with exposure to a substance.
     */
    ALLERGYINTOLERANCE,
    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related
     * person(s) and/or device(s) for a specific date/time. This may result in one
     * or more Encounter(s).
     */
    APPOINTMENT,
    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such
     * as a confirmation or rejection.
     */
    APPOINTMENTRESPONSE,
    /**
     * A record of an event made for purposes of maintaining a security log. Typical
     * uses include detection of intrusion attempts and monitoring for inappropriate
     * usage.
     */
    AUDITEVENT,
    /**
     * Basic is used for handling concepts not yet defined in FHIR, narrative-only
     * resources that don't map to an existing resource, and custom resources not
     * appropriate for inclusion in the FHIR specification.
     */
    BASIC,
    /**
     * A resource that represents the data of a single raw artifact as digital
     * content accessible in its native format. A Binary resource can contain any
     * content, whether text, image, pdf, zip archive, etc.
     */
    BINARY,
    /**
     * A material substance originating from a biological entity intended to be
     * transplanted or infused into another (possibly the same) biological entity.
     */
    BIOLOGICALLYDERIVEDPRODUCT,
    /**
     * Record details about an anatomical structure. This resource may be used when
     * a coded concept does not provide the necessary detail needed for the use
     * case.
     */
    BODYSTRUCTURE,
    /**
     * A container for a collection of resources.
     */
    BUNDLE,
    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR
     * Server for a particular version of FHIR that may be used as a statement of
     * actual server functionality or a statement of required or desired server
     * implementation.
     */
    CAPABILITYSTATEMENT,
    /**
     * Describes the intention of how one or more practitioners intend to deliver
     * care for a particular patient, group or community for a period of time,
     * possibly limited to care for a specific condition or set of conditions.
     */
    CAREPLAN,
    /**
     * The Care Team includes all the people and organizations who plan to
     * participate in the coordination and delivery of care for a patient.
     */
    CARETEAM,
    /**
     * Catalog entries are wrappers that contextualize items included in a catalog.
     */
    CATALOGENTRY,
    /**
     * The resource ChargeItem describes the provision of healthcare provider
     * products for a certain patient, therefore referring not only to the product,
     * but containing in addition details of the provision, like date, time, amounts
     * and participating organizations and persons. Main Usage of the ChargeItem is
     * to enable the billing process and internal cost allocation.
     */
    CHARGEITEM,
    /**
     * The ChargeItemDefinition resource provides the properties that apply to the
     * (billing) codes necessary to calculate costs and prices. The properties may
     * differ largely depending on type and realm, therefore this resource gives
     * only a rough structure and requires profiling for each type of billing code
     * system.
     */
    CHARGEITEMDEFINITION,
    /**
     * A provider issued list of professional services and products which have been
     * provided, or are to be provided, to a patient which is sent to an insurer for
     * reimbursement.
     */
    CLAIM,
    /**
     * This resource provides the adjudication details from the processing of a
     * Claim resource.
     */
    CLAIMRESPONSE,
    /**
     * A record of a clinical assessment performed to determine what problem(s) may
     * affect the patient and before planning the treatments or management
     * strategies that are best to manage a patient's condition. Assessments are
     * often 1:1 with a clinical consultation / encounter, but this varies greatly
     * depending on the clinical workflow. This resource is called
     * "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with
     * the recording of assessment tools such as Apgar score.
     */
    CLINICALIMPRESSION,
    /**
     * The CodeSystem resource is used to declare the existence of and describe a
     * code system or code system supplement and its key properties, and optionally
     * define a part or all of its content.
     */
    CODESYSTEM,
    /**
     * An occurrence of information being transmitted; e.g. an alert that was sent
     * to a responsible provider, a public health agency that was notified about a
     * reportable condition.
     */
    COMMUNICATION,
    /**
     * A request to convey information; e.g. the CDS system proposes that an alert
     * be sent to a responsible provider, the CDS system proposes that the public
     * health agency be notified about a reportable condition.
     */
    COMMUNICATIONREQUEST,
    /**
     * A compartment definition that defines how resources are accessed on a server.
     */
    COMPARTMENTDEFINITION,
    /**
     * A set of healthcare-related information that is assembled together into a
     * single logical package that provides a single coherent statement of meaning,
     * establishes its own context and that has clinical attestation with regard to
     * who is making the statement. A Composition defines the structure and
     * narrative content necessary for a document. However, a Composition alone does
     * not constitute a document. Rather, the Composition must be the first entry in
     * a Bundle where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for example
     * Patient, Practitioner, Encounter, etc.).
     */
    COMPOSITION,
    /**
     * A statement of relationships from one set of concepts to one or more other
     * concepts - either concepts in code systems, or data element/data element
     * concepts, or classes in class models.
     */
    CONCEPTMAP,
    /**
     * A clinical condition, problem, diagnosis, or other event, situation, issue,
     * or clinical concept that has risen to a level of concern.
     */
    CONDITION,
    /**
     * A record of a healthcare consumer’s choices, which permits or denies
     * identified recipient(s) or recipient role(s) to perform one or more actions
     * within a given policy context, for specific purposes and periods of time.
     */
    CONSENT,
    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive
     * i.e., a policy or agreement.
     */
    CONTRACT,
    /**
     * Financial instrument which may be used to reimburse or pay for health care
     * products and services. Includes both insurance and self-payment.
     */
    COVERAGE,
    /**
     * The CoverageEligibilityRequest provides patient and insurance coverage
     * information to an insurer for them to respond, in the form of an
     * CoverageEligibilityResponse, with information regarding whether the stated
     * coverage is valid and in-force and optionally to provide the insurance
     * details of the policy.
     */
    COVERAGEELIGIBILITYREQUEST,
    /**
     * This resource provides eligibility and plan details from the processing of an
     * CoverageEligibilityRequest resource.
     */
    COVERAGEELIGIBILITYRESPONSE,
    /**
     * Indicates an actual or potential clinical issue with or between one or more
     * active or proposed clinical actions for a patient; e.g. Drug-drug
     * interaction, Ineffective treatment frequency, Procedure-condition conflict,
     * etc.
     */
    DETECTEDISSUE,
    /**
     * A type of a manufactured item that is used in the provision of healthcare
     * without being substantially changed through that activity. The device may be
     * a medical or non-medical device.
     */
    DEVICE,
    /**
     * The characteristics, operational status and capabilities of a medical-related
     * component of a medical device.
     */
    DEVICEDEFINITION,
    /**
     * Describes a measurement, calculation or setting capability of a medical
     * device.
     */
    DEVICEMETRIC,
    /**
     * Represents a request for a patient to employ a medical device. The device may
     * be an implantable device, or an external assistive device, such as a walker.
     */
    DEVICEREQUEST,
    /**
     * A record of a device being used by a patient where the record is the result
     * of a report from the patient or another clinician.
     */
    DEVICEUSESTATEMENT,
    /**
     * The findings and interpretation of diagnostic tests performed on patients,
     * groups of patients, devices, and locations, and/or specimens derived from
     * these. The report includes clinical context such as requesting and provider
     * information, and some mix of atomic results, images, textual and coded
     * interpretations, and formatted representation of diagnostic reports.
     */
    DIAGNOSTICREPORT,
    /**
     * A collection of documents compiled for a purpose together with metadata that
     * applies to the collection.
     */
    DOCUMENTMANIFEST,
    /**
     * A reference to a document of any kind for any purpose. Provides metadata
     * about the document so that the document can be discovered and managed. The
     * scope of a document is any seralized object with a mime-type, so includes
     * formal patient centric documents (CDA), cliical notes, scanned paper, and
     * non-patient specific documents like policy text.
     */
    DOCUMENTREFERENCE,
    /**
     * A resource that includes narrative, extensions, and contained resources.
     */
    DOMAINRESOURCE,
    /**
     * The EffectEvidenceSynthesis resource describes the difference in an outcome
     * between exposures states in a population where the effect estimate is derived
     * from a combination of research studies.
     */
    EFFECTEVIDENCESYNTHESIS,
    /**
     * An interaction between a patient and healthcare provider(s) for the purpose
     * of providing healthcare service(s) or assessing the health status of a
     * patient.
     */
    ENCOUNTER,
    /**
     * The technical details of an endpoint that can be used for electronic
     * services, such as for web services providing XDS.b or a REST endpoint for
     * another FHIR server. This may include any security context information.
     */
    ENDPOINT,
    /**
     * This resource provides the insurance enrollment details to the insurer
     * regarding a specified coverage.
     */
    ENROLLMENTREQUEST,
    /**
     * This resource provides enrollment and plan details from the processing of an
     * EnrollmentRequest resource.
     */
    ENROLLMENTRESPONSE,
    /**
     * An association between a patient and an organization / healthcare provider(s)
     * during which time encounters may occur. The managing organization assumes a
     * level of responsibility for the patient during this time.
     */
    EPISODEOFCARE,
    /**
     * The EventDefinition resource provides a reusable description of when a
     * particular event can occur.
     */
    EVENTDEFINITION,
    /**
     * The Evidence resource describes the conditional state (population and any
     * exposures being compared within the population) and outcome (if specified)
     * that the knowledge (evidence, assertion, recommendation) is about.
     */
    EVIDENCE,
    /**
     * The EvidenceVariable resource describes a "PICO" element that knowledge
     * (evidence, assertion, recommendation) is about.
     */
    EVIDENCEVARIABLE,
    /**
     * Example of workflow instance.
     */
    EXAMPLESCENARIO,
    /**
     * This resource provides: the claim details; adjudication details from the
     * processing of a Claim; and optionally account balance information, for
     * informing the subscriber of the benefits provided.
     */
    EXPLANATIONOFBENEFIT,
    /**
     * Significant health conditions for a person related to the patient relevant in
     * the context of care for the patient.
     */
    FAMILYMEMBERHISTORY,
    /**
     * Prospective warnings of potential issues when providing care to the patient.
     */
    FLAG,
    /**
     * Describes the intended objective(s) for a patient, group or organization
     * care, for example, weight loss, restoring an activity of daily living,
     * obtaining herd immunity via immunization, meeting a process improvement
     * objective, etc.
     */
    GOAL,
    /**
     * A formal computable definition of a graph of resources - that is, a coherent
     * set of resources that form a graph by following references. The Graph
     * Definition resource defines a set and makes rules about the set.
     */
    GRAPHDEFINITION,
    /**
     * Represents a defined collection of entities that may be discussed or acted
     * upon collectively but which are not expected to act collectively, and are not
     * formally or legally recognized; i.e. a collection of entities that isn't an
     * Organization.
     */
    GROUP,
    /**
     * A guidance response is the formal response to a guidance request, including
     * any output parameters returned by the evaluation, as well as the description
     * of any proposed actions to be taken.
     */
    GUIDANCERESPONSE,
    /**
     * The details of a healthcare service available at a location.
     */
    HEALTHCARESERVICE,
    /**
     * Representation of the content produced in a DICOM imaging study. A study
     * comprises a set of series, each of which includes a set of Service-Object
     * Pair Instances (SOP Instances - images or other data) acquired or produced in
     * a common context. A series is of only one modality (e.g. X-ray, CT, MR,
     * ultrasound), but a study may have multiple series of different modalities.
     */
    IMAGINGSTUDY,
    /**
     * Describes the event of a patient being administered a vaccine or a record of
     * an immunization as reported by a patient, a clinician or another party.
     */
    IMMUNIZATION,
    /**
     * Describes a comparison of an immunization event against published
     * recommendations to determine if the administration is "valid" in relation to
     * those recommendations.
     */
    IMMUNIZATIONEVALUATION,
    /**
     * A patient's point-in-time set of recommendations (i.e. forecasting) according
     * to a published schedule with optional supporting justification.
     */
    IMMUNIZATIONRECOMMENDATION,
    /**
     * A set of rules of how a particular interoperability or standards problem is
     * solved - typically through the use of FHIR resources. This resource is used
     * to gather all the parts of an implementation guide into a logical whole and
     * to publish a computable definition of all the parts.
     */
    IMPLEMENTATIONGUIDE,
    /**
     * Details of a Health Insurance product/plan provided by an organization.
     */
    INSURANCEPLAN,
    /**
     * Invoice containing collected ChargeItems from an Account with calculated
     * individual and total price for Billing purpose.
     */
    INVOICE,
    /**
     * The Library resource is a general-purpose container for knowledge asset
     * definitions. It can be used to describe and expose existing knowledge assets
     * such as logic libraries and information model descriptions, as well as to
     * describe a collection of knowledge assets.
     */
    LIBRARY,
    /**
     * Identifies two or more records (resource instances) that refer to the same
     * real-world "occurrence".
     */
    LINKAGE,
    /**
     * A list is a curated collection of resources.
     */
    LIST,
    /**
     * Details and position information for a physical place where services are
     * provided and resources and participants may be stored, found, contained, or
     * accommodated.
     */
    LOCATION,
    /**
     * The Measure resource provides the definition of a quality measure.
     */
    MEASURE,
    /**
     * The MeasureReport resource contains the results of the calculation of a
     * measure; and optionally a reference to the resources involved in that
     * calculation.
     */
    MEASUREREPORT,
    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual
     * content may be inline or provided by direct reference.
     */
    MEDIA,
    /**
     * This resource is primarily used for the identification and definition of a
     * medication for the purposes of prescribing, dispensing, and administering a
     * medication as well as for making statements about medication use.
     */
    MEDICATION,
    /**
     * Describes the event of a patient consuming or otherwise being administered a
     * medication. This may be as simple as swallowing a tablet or it may be a long
     * running infusion. Related resources tie this event to the authorizing
     * prescription, and the specific encounter between patient and health care
     * practitioner.
     */
    MEDICATIONADMINISTRATION,
    /**
     * Indicates that a medication product is to be or has been dispensed for a
     * named person/patient. This includes a description of the medication product
     * (supply) provided and the instructions for administering the medication. The
     * medication dispense is the result of a pharmacy system responding to a
     * medication order.
     */
    MEDICATIONDISPENSE,
    /**
     * Information about a medication that is used to support knowledge.
     */
    MEDICATIONKNOWLEDGE,
    /**
     * An order or request for both supply of the medication and the instructions
     * for administration of the medication to a patient. The resource is called
     * "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder"
     * to generalize the use across inpatient and outpatient settings, including
     * care plans, etc., and to harmonize with workflow patterns.
     */
    MEDICATIONREQUEST,
    /**
     * A record of a medication that is being consumed by a patient. A
     * MedicationStatement may indicate that the patient may be taking the
     * medication now or has taken the medication in the past or will be taking the
     * medication in the future. The source of this information can be the patient,
     * significant other (such as a family member or spouse), or a clinician. A
     * common scenario where this information is captured is during the history
     * taking process during a patient visit or stay. The medication information may
     * come from sources such as the patient's memory, from a prescription bottle,
     * or from a list of medications the patient, clinician or other party
     * maintains.
     * 
     * The primary difference between a medication statement and a medication
     * administration is that the medication administration has complete
     * administration information and is based on actual administration information
     * from the person who administered the medication. A medication statement is
     * often, if not always, less specific. There is no required date/time when the
     * medication was administered, in fact we only know that a source has reported
     * the patient is taking this medication, where details such as time, quantity,
     * or rate or even medication product may be incomplete or missing or less
     * precise. As stated earlier, the medication statement information may come
     * from the patient's memory, from a prescription bottle or from a list of
     * medications the patient, clinician or other party maintains. Medication
     * administration is more formal and is not missing detailed information.
     */
    MEDICATIONSTATEMENT,
    /**
     * Detailed definition of a medicinal product, typically for uses other than
     * direct patient care (e.g. regulatory use).
     */
    MEDICINALPRODUCT,
    /**
     * The regulatory authorization of a medicinal product.
     */
    MEDICINALPRODUCTAUTHORIZATION,
    /**
     * The clinical particulars - indications, contraindications etc. of a medicinal
     * product, including for regulatory purposes.
     */
    MEDICINALPRODUCTCONTRAINDICATION,
    /**
     * Indication for the Medicinal Product.
     */
    MEDICINALPRODUCTINDICATION,
    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    MEDICINALPRODUCTINGREDIENT,
    /**
     * The interactions of the medicinal product with other medicinal products, or
     * other forms of interactions.
     */
    MEDICINALPRODUCTINTERACTION,
    /**
     * The manufactured item as contained in the packaged medicinal product.
     */
    MEDICINALPRODUCTMANUFACTURED,
    /**
     * A medicinal product in a container or package.
     */
    MEDICINALPRODUCTPACKAGED,
    /**
     * A pharmaceutical product described in terms of its composition and dose form.
     */
    MEDICINALPRODUCTPHARMACEUTICAL,
    /**
     * Describe the undesirable effects of the medicinal product.
     */
    MEDICINALPRODUCTUNDESIRABLEEFFECT,
    /**
     * Defines the characteristics of a message that can be shared between systems,
     * including the type of event that initiates the message, the content to be
     * transmitted and what response(s), if any, are permitted.
     */
    MESSAGEDEFINITION,
    /**
     * The header for a message exchange that is either requesting or responding to
     * an action. The reference(s) that are the subject of the action as well as
     * other information related to the action are typically transmitted in a bundle
     * in which the MessageHeader resource instance is the first resource in the
     * bundle.
     */
    MESSAGEHEADER,
    /**
     * Raw data describing a biological sequence.
     */
    MOLECULARSEQUENCE,
    /**
     * A curated namespace that issues unique symbols within that namespace for the
     * identification of concepts, people, devices, etc. Represents a "System" used
     * within the Identifier and Coding data types.
     */
    NAMINGSYSTEM,
    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional
     * supplement to a patient/resident.
     */
    NUTRITIONORDER,
    /**
     * Measurements and simple assertions made about a patient, device or other
     * subject.
     */
    OBSERVATION,
    /**
     * Set of definitional characteristics for a kind of observation or measurement
     * produced or consumed by an orderable health care service.
     */
    OBSERVATIONDEFINITION,
    /**
     * A formal computable definition of an operation (on the RESTful interface) or
     * a named query (using the search interaction).
     */
    OPERATIONDEFINITION,
    /**
     * A collection of error, warning, or information messages that result from a
     * system action.
     */
    OPERATIONOUTCOME,
    /**
     * A formally or informally recognized grouping of people or organizations
     * formed for the purpose of achieving some form of collective action. Includes
     * companies, institutions, corporations, departments, community groups,
     * healthcare practice groups, payer/insurer, etc.
     */
    ORGANIZATION,
    /**
     * Defines an affiliation/assotiation/relationship between 2 distinct
     * oganizations, that is not a part-of relationship/sub-division relationship.
     */
    ORGANIZATIONAFFILIATION,
    /**
     * This resource is a non-persisted resource used to pass information into and
     * back from an [operation](operations.html). It has no other use, and there is
     * no RESTful endpoint associated with it.
     */
    PARAMETERS,
    /**
     * Demographics and other administrative information about an individual or
     * animal receiving care or other health-related services.
     */
    PATIENT,
    /**
     * This resource provides the status of the payment for goods and services
     * rendered, and the request and response resource references.
     */
    PAYMENTNOTICE,
    /**
     * This resource provides the details including amount of a payment and
     * allocates the payment items being paid.
     */
    PAYMENTRECONCILIATION,
    /**
     * Demographics and administrative information about a person independent of a
     * specific health-related context.
     */
    PERSON,
    /**
     * This resource allows for the definition of various types of plans as a
     * sharable, consumable, and executable artifact. The resource is general enough
     * to support the description of a broad range of clinical artifacts such as
     * clinical decision support rules, order sets and protocols.
     */
    PLANDEFINITION,
    /**
     * A person who is directly or indirectly involved in the provisioning of
     * healthcare.
     */
    PRACTITIONER,
    /**
     * A specific set of Roles/Locations/specialties/services that a practitioner
     * may perform at an organization for a period of time.
     */
    PRACTITIONERROLE,
    /**
     * An action that is or was performed on or for a patient. This can be a
     * physical intervention like an operation, or less invasive like long term
     * services, counseling, or hypnotherapy.
     */
    PROCEDURE,
    /**
     * Provenance of a resource is a record that describes entities and processes
     * involved in producing and delivering or otherwise influencing that resource.
     * Provenance provides a critical foundation for assessing authenticity,
     * enabling trust, and allowing reproducibility. Provenance assertions are a
     * form of contextual metadata and can themselves become important records with
     * their own provenance. Provenance statement indicates clinical significance in
     * terms of confidence in authenticity, reliability, and trustworthiness,
     * integrity, and stage in lifecycle (e.g. Document Completion - has the
     * artifact been legally authenticated), all of which may impact security,
     * privacy, and trust policies.
     */
    PROVENANCE,
    /**
     * A structured set of questions intended to guide the collection of answers
     * from end-users. Questionnaires provide detailed control over order,
     * presentation, phraseology and grouping to allow coherent, consistent data
     * collection.
     */
    QUESTIONNAIRE,
    /**
     * A structured set of questions and their answers. The questions are ordered
     * and grouped into coherent subsets, corresponding to the structure of the
     * grouping of the questionnaire being responded to.
     */
    QUESTIONNAIRERESPONSE,
    /**
     * Information about a person that is involved in the care for a patient, but
     * who is not the target of healthcare, nor has a formal responsibility in the
     * care process.
     */
    RELATEDPERSON,
    /**
     * A group of related requests that can be used to capture intended activities
     * that have inter-dependencies such as "give this medication after that one".
     */
    REQUESTGROUP,
    /**
     * The ResearchDefinition resource describes the conditional state (population
     * and any exposures being compared within the population) and outcome (if
     * specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    RESEARCHDEFINITION,
    /**
     * The ResearchElementDefinition resource describes a "PICO" element that
     * knowledge (evidence, assertion, recommendation) is about.
     */
    RESEARCHELEMENTDEFINITION,
    /**
     * A process where a researcher or organization plans and then executes a series
     * of steps intended to increase the field of healthcare-related knowledge. This
     * includes studies of safety, efficacy, comparative effectiveness and other
     * information about medications, devices, therapies and other interventional
     * and investigative techniques. A ResearchStudy involves the gathering of
     * information about human or animal subjects.
     */
    RESEARCHSTUDY,
    /**
     * A physical entity which is the primary unit of operational and/or
     * administrative interest in a study.
     */
    RESEARCHSUBJECT,
    /**
     * This is the base resource type for everything.
     */
    RESOURCE,
    /**
     * An assessment of the likely outcome(s) for a patient or other subject as well
     * as the likelihood of each outcome.
     */
    RISKASSESSMENT,
    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in
     * a population plus exposure state where the risk estimate is derived from a
     * combination of research studies.
     */
    RISKEVIDENCESYNTHESIS,
    /**
     * A container for slots of time that may be available for booking appointments.
     */
    SCHEDULE,
    /**
     * A search parameter that defines a named search item that can be used to
     * search/filter on a resource.
     */
    SEARCHPARAMETER,
    /**
     * A record of a request for service such as diagnostic investigations,
     * treatments, or operations to be performed.
     */
    SERVICEREQUEST,
    /**
     * A slot of time on a schedule that may be available for booking appointments.
     */
    SLOT,
    /**
     * A sample to be used for analysis.
     */
    SPECIMEN,
    /**
     * A kind of specimen with associated set of requirements.
     */
    SPECIMENDEFINITION,
    /**
     * A definition of a FHIR structure. This resource is used to describe the
     * underlying resources, data types defined in FHIR, and also for describing
     * extensions and constraints on resources and data types.
     */
    STRUCTUREDEFINITION,
    /**
     * A Map of relationships between 2 structures that can be used to transform
     * data.
     */
    STRUCTUREMAP,
    /**
     * The subscription resource is used to define a push-based subscription from a
     * server to another system. Once a subscription is registered with the server,
     * the server checks every resource that is created or updated, and if the
     * resource matches the given criteria, it sends a message on the defined
     * "channel" so that another system can take an appropriate action.
     */
    SUBSCRIPTION,
    /**
     * A homogeneous material with a definite composition.
     */
    SUBSTANCE,
    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar and
     * linkage. Individual substance/moiety IDs will be created for each of these
     * elements. The nucleotide sequence will be always entered in the 5’-3’
     * direction.
     */
    SUBSTANCENUCLEICACID,
    /**
     * Todo.
     */
    SUBSTANCEPOLYMER,
    /**
     * A SubstanceProtein is defined as a single unit of a linear amino acid
     * sequence, or a combination of subunits that are either covalently linked or
     * have a defined invariant stoichiometric relationship. This includes all
     * synthetic, recombinant and purified SubstanceProteins of defined sequence,
     * whether the use is therapeutic or prophylactic. This set of elements will be
     * used to describe albumins, coagulation factors, cytokines, growth factors,
     * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant
     * vaccines, and immunomodulators.
     */
    SUBSTANCEPROTEIN,
    /**
     * Todo.
     */
    SUBSTANCEREFERENCEINFORMATION,
    /**
     * Source material shall capture information on the taxonomic and anatomical
     * origins as well as the fraction of a material that can result in or can be
     * modified to form a substance. This set of data elements shall be used to
     * define polymer substances isolated from biological matrices. Taxonomic and
     * anatomical origins shall be described using a controlled vocabulary as
     * required. This information is captured for naturally derived polymers ( .
     * starch) and structurally diverse substances. For Organisms belonging to the
     * Kingdom Plantae the Substance level defines the fresh material of a single
     * species or infraspecies, the Herbal Drug and the Herbal preparation. For
     * Herbal preparations, the fraction information will be captured at the
     * Substance information level and additional information for herbal extracts
     * will be captured at the Specified Substance Group 1 information level. See
     * for further explanation the Substance Class: Structurally Diverse and the
     * herbal annex.
     */
    SUBSTANCESOURCEMATERIAL,
    /**
     * The detailed description of a substance, typically at a level beyond what is
     * used for prescribing.
     */
    SUBSTANCESPECIFICATION,
    /**
     * Record of delivery of what is supplied.
     */
    SUPPLYDELIVERY,
    /**
     * A record of a request for a medication, substance or device used in the
     * healthcare setting.
     */
    SUPPLYREQUEST,
    /**
     * A task to be performed.
     */
    TASK,
    /**
     * A Terminology Capabilities documents a set of capabilities (behaviors) of a
     * FHIR Server that may be used as a statement of actual server functionality or
     * a statement of required or desired server implementation.
     */
    TERMINOLOGYCAPABILITIES,
    /**
     * A summary of information based on the results of executing a TestScript.
     */
    TESTREPORT,
    /**
     * A structured set of tests against a FHIR server or client implementation to
     * determine compliance against the FHIR specification.
     */
    TESTSCRIPT,
    /**
     * A ValueSet resource instance specifies a set of codes drawn from one or more
     * code systems, intended for use in a particular context. Value sets link
     * between [[[CodeSystem]]] definitions and their use in [coded
     * elements](terminologies.html).
     */
    VALUESET,
    /**
     * Describes validation requirements, source(s), status and dates for one or
     * more elements.
     */
    VERIFICATIONRESULT,
    /**
     * An authorization for the provision of glasses and/or contact lenses to a
     * patient.
     */
    VISIONPRESCRIPTION,
    /**
     * added to help the parsers
     */
    NULL;

    public static ResourceType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("Account".equals(codeString))
        return ACCOUNT;
      if ("ActivityDefinition".equals(codeString))
        return ACTIVITYDEFINITION;
      if ("AdverseEvent".equals(codeString))
        return ADVERSEEVENT;
      if ("AllergyIntolerance".equals(codeString))
        return ALLERGYINTOLERANCE;
      if ("Appointment".equals(codeString))
        return APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return APPOINTMENTRESPONSE;
      if ("AuditEvent".equals(codeString))
        return AUDITEVENT;
      if ("Basic".equals(codeString))
        return BASIC;
      if ("Binary".equals(codeString))
        return BINARY;
      if ("BiologicallyDerivedProduct".equals(codeString))
        return BIOLOGICALLYDERIVEDPRODUCT;
      if ("BodyStructure".equals(codeString))
        return BODYSTRUCTURE;
      if ("Bundle".equals(codeString))
        return BUNDLE;
      if ("CapabilityStatement".equals(codeString))
        return CAPABILITYSTATEMENT;
      if ("CarePlan".equals(codeString))
        return CAREPLAN;
      if ("CareTeam".equals(codeString))
        return CARETEAM;
      if ("CatalogEntry".equals(codeString))
        return CATALOGENTRY;
      if ("ChargeItem".equals(codeString))
        return CHARGEITEM;
      if ("ChargeItemDefinition".equals(codeString))
        return CHARGEITEMDEFINITION;
      if ("Claim".equals(codeString))
        return CLAIM;
      if ("ClaimResponse".equals(codeString))
        return CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return CLINICALIMPRESSION;
      if ("CodeSystem".equals(codeString))
        return CODESYSTEM;
      if ("Communication".equals(codeString))
        return COMMUNICATION;
      if ("CommunicationRequest".equals(codeString))
        return COMMUNICATIONREQUEST;
      if ("CompartmentDefinition".equals(codeString))
        return COMPARTMENTDEFINITION;
      if ("Composition".equals(codeString))
        return COMPOSITION;
      if ("ConceptMap".equals(codeString))
        return CONCEPTMAP;
      if ("Condition".equals(codeString))
        return CONDITION;
      if ("Consent".equals(codeString))
        return CONSENT;
      if ("Contract".equals(codeString))
        return CONTRACT;
      if ("Coverage".equals(codeString))
        return COVERAGE;
      if ("CoverageEligibilityRequest".equals(codeString))
        return COVERAGEELIGIBILITYREQUEST;
      if ("CoverageEligibilityResponse".equals(codeString))
        return COVERAGEELIGIBILITYRESPONSE;
      if ("DetectedIssue".equals(codeString))
        return DETECTEDISSUE;
      if ("Device".equals(codeString))
        return DEVICE;
      if ("DeviceDefinition".equals(codeString))
        return DEVICEDEFINITION;
      if ("DeviceMetric".equals(codeString))
        return DEVICEMETRIC;
      if ("DeviceRequest".equals(codeString))
        return DEVICEREQUEST;
      if ("DeviceUseStatement".equals(codeString))
        return DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return DOCUMENTREFERENCE;
      if ("DomainResource".equals(codeString))
        return DOMAINRESOURCE;
      if ("EffectEvidenceSynthesis".equals(codeString))
        return EFFECTEVIDENCESYNTHESIS;
      if ("Encounter".equals(codeString))
        return ENCOUNTER;
      if ("Endpoint".equals(codeString))
        return ENDPOINT;
      if ("EnrollmentRequest".equals(codeString))
        return ENROLLMENTREQUEST;
      if ("EnrollmentResponse".equals(codeString))
        return ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return EPISODEOFCARE;
      if ("EventDefinition".equals(codeString))
        return EVENTDEFINITION;
      if ("Evidence".equals(codeString))
        return EVIDENCE;
      if ("EvidenceVariable".equals(codeString))
        return EVIDENCEVARIABLE;
      if ("ExampleScenario".equals(codeString))
        return EXAMPLESCENARIO;
      if ("ExplanationOfBenefit".equals(codeString))
        return EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return FAMILYMEMBERHISTORY;
      if ("Flag".equals(codeString))
        return FLAG;
      if ("Goal".equals(codeString))
        return GOAL;
      if ("GraphDefinition".equals(codeString))
        return GRAPHDEFINITION;
      if ("Group".equals(codeString))
        return GROUP;
      if ("GuidanceResponse".equals(codeString))
        return GUIDANCERESPONSE;
      if ("HealthcareService".equals(codeString))
        return HEALTHCARESERVICE;
      if ("ImagingStudy".equals(codeString))
        return IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return IMMUNIZATION;
      if ("ImmunizationEvaluation".equals(codeString))
        return IMMUNIZATIONEVALUATION;
      if ("ImmunizationRecommendation".equals(codeString))
        return IMMUNIZATIONRECOMMENDATION;
      if ("ImplementationGuide".equals(codeString))
        return IMPLEMENTATIONGUIDE;
      if ("InsurancePlan".equals(codeString))
        return INSURANCEPLAN;
      if ("Invoice".equals(codeString))
        return INVOICE;
      if ("Library".equals(codeString))
        return LIBRARY;
      if ("Linkage".equals(codeString))
        return LINKAGE;
      if ("List".equals(codeString))
        return LIST;
      if ("Location".equals(codeString))
        return LOCATION;
      if ("Measure".equals(codeString))
        return MEASURE;
      if ("MeasureReport".equals(codeString))
        return MEASUREREPORT;
      if ("Media".equals(codeString))
        return MEDIA;
      if ("Medication".equals(codeString))
        return MEDICATION;
      if ("MedicationAdministration".equals(codeString))
        return MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return MEDICATIONDISPENSE;
      if ("MedicationKnowledge".equals(codeString))
        return MEDICATIONKNOWLEDGE;
      if ("MedicationRequest".equals(codeString))
        return MEDICATIONREQUEST;
      if ("MedicationStatement".equals(codeString))
        return MEDICATIONSTATEMENT;
      if ("MedicinalProduct".equals(codeString))
        return MEDICINALPRODUCT;
      if ("MedicinalProductAuthorization".equals(codeString))
        return MEDICINALPRODUCTAUTHORIZATION;
      if ("MedicinalProductContraindication".equals(codeString))
        return MEDICINALPRODUCTCONTRAINDICATION;
      if ("MedicinalProductIndication".equals(codeString))
        return MEDICINALPRODUCTINDICATION;
      if ("MedicinalProductIngredient".equals(codeString))
        return MEDICINALPRODUCTINGREDIENT;
      if ("MedicinalProductInteraction".equals(codeString))
        return MEDICINALPRODUCTINTERACTION;
      if ("MedicinalProductManufactured".equals(codeString))
        return MEDICINALPRODUCTMANUFACTURED;
      if ("MedicinalProductPackaged".equals(codeString))
        return MEDICINALPRODUCTPACKAGED;
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return MEDICINALPRODUCTPHARMACEUTICAL;
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return MEDICINALPRODUCTUNDESIRABLEEFFECT;
      if ("MessageDefinition".equals(codeString))
        return MESSAGEDEFINITION;
      if ("MessageHeader".equals(codeString))
        return MESSAGEHEADER;
      if ("MolecularSequence".equals(codeString))
        return MOLECULARSEQUENCE;
      if ("NamingSystem".equals(codeString))
        return NAMINGSYSTEM;
      if ("NutritionOrder".equals(codeString))
        return NUTRITIONORDER;
      if ("Observation".equals(codeString))
        return OBSERVATION;
      if ("ObservationDefinition".equals(codeString))
        return OBSERVATIONDEFINITION;
      if ("OperationDefinition".equals(codeString))
        return OPERATIONDEFINITION;
      if ("OperationOutcome".equals(codeString))
        return OPERATIONOUTCOME;
      if ("Organization".equals(codeString))
        return ORGANIZATION;
      if ("OrganizationAffiliation".equals(codeString))
        return ORGANIZATIONAFFILIATION;
      if ("Parameters".equals(codeString))
        return PARAMETERS;
      if ("Patient".equals(codeString))
        return PATIENT;
      if ("PaymentNotice".equals(codeString))
        return PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return PAYMENTRECONCILIATION;
      if ("Person".equals(codeString))
        return PERSON;
      if ("PlanDefinition".equals(codeString))
        return PLANDEFINITION;
      if ("Practitioner".equals(codeString))
        return PRACTITIONER;
      if ("PractitionerRole".equals(codeString))
        return PRACTITIONERROLE;
      if ("Procedure".equals(codeString))
        return PROCEDURE;
      if ("Provenance".equals(codeString))
        return PROVENANCE;
      if ("Questionnaire".equals(codeString))
        return QUESTIONNAIRE;
      if ("QuestionnaireResponse".equals(codeString))
        return QUESTIONNAIRERESPONSE;
      if ("RelatedPerson".equals(codeString))
        return RELATEDPERSON;
      if ("RequestGroup".equals(codeString))
        return REQUESTGROUP;
      if ("ResearchDefinition".equals(codeString))
        return RESEARCHDEFINITION;
      if ("ResearchElementDefinition".equals(codeString))
        return RESEARCHELEMENTDEFINITION;
      if ("ResearchStudy".equals(codeString))
        return RESEARCHSTUDY;
      if ("ResearchSubject".equals(codeString))
        return RESEARCHSUBJECT;
      if ("Resource".equals(codeString))
        return RESOURCE;
      if ("RiskAssessment".equals(codeString))
        return RISKASSESSMENT;
      if ("RiskEvidenceSynthesis".equals(codeString))
        return RISKEVIDENCESYNTHESIS;
      if ("Schedule".equals(codeString))
        return SCHEDULE;
      if ("SearchParameter".equals(codeString))
        return SEARCHPARAMETER;
      if ("ServiceRequest".equals(codeString))
        return SERVICEREQUEST;
      if ("Slot".equals(codeString))
        return SLOT;
      if ("Specimen".equals(codeString))
        return SPECIMEN;
      if ("SpecimenDefinition".equals(codeString))
        return SPECIMENDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return STRUCTUREMAP;
      if ("Subscription".equals(codeString))
        return SUBSCRIPTION;
      if ("Substance".equals(codeString))
        return SUBSTANCE;
      if ("SubstanceNucleicAcid".equals(codeString))
        return SUBSTANCENUCLEICACID;
      if ("SubstancePolymer".equals(codeString))
        return SUBSTANCEPOLYMER;
      if ("SubstanceProtein".equals(codeString))
        return SUBSTANCEPROTEIN;
      if ("SubstanceReferenceInformation".equals(codeString))
        return SUBSTANCEREFERENCEINFORMATION;
      if ("SubstanceSourceMaterial".equals(codeString))
        return SUBSTANCESOURCEMATERIAL;
      if ("SubstanceSpecification".equals(codeString))
        return SUBSTANCESPECIFICATION;
      if ("SupplyDelivery".equals(codeString))
        return SUPPLYDELIVERY;
      if ("SupplyRequest".equals(codeString))
        return SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return TASK;
      if ("TerminologyCapabilities".equals(codeString))
        return TERMINOLOGYCAPABILITIES;
      if ("TestReport".equals(codeString))
        return TESTREPORT;
      if ("TestScript".equals(codeString))
        return TESTSCRIPT;
      if ("ValueSet".equals(codeString))
        return VALUESET;
      if ("VerificationResult".equals(codeString))
        return VERIFICATIONRESULT;
      if ("VisionPrescription".equals(codeString))
        return VISIONPRESCRIPTION;
      throw new FHIRException("Unknown ResourceType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case ACCOUNT:
        return "Account";
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case ADVERSEEVENT:
        return "AdverseEvent";
      case ALLERGYINTOLERANCE:
        return "AllergyIntolerance";
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case AUDITEVENT:
        return "AuditEvent";
      case BASIC:
        return "Basic";
      case BINARY:
        return "Binary";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "BiologicallyDerivedProduct";
      case BODYSTRUCTURE:
        return "BodyStructure";
      case BUNDLE:
        return "Bundle";
      case CAPABILITYSTATEMENT:
        return "CapabilityStatement";
      case CAREPLAN:
        return "CarePlan";
      case CARETEAM:
        return "CareTeam";
      case CATALOGENTRY:
        return "CatalogEntry";
      case CHARGEITEM:
        return "ChargeItem";
      case CHARGEITEMDEFINITION:
        return "ChargeItemDefinition";
      case CLAIM:
        return "Claim";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case CODESYSTEM:
        return "CodeSystem";
      case COMMUNICATION:
        return "Communication";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case COMPARTMENTDEFINITION:
        return "CompartmentDefinition";
      case COMPOSITION:
        return "Composition";
      case CONCEPTMAP:
        return "ConceptMap";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case CONTRACT:
        return "Contract";
      case COVERAGE:
        return "Coverage";
      case COVERAGEELIGIBILITYREQUEST:
        return "CoverageEligibilityRequest";
      case COVERAGEELIGIBILITYRESPONSE:
        return "CoverageEligibilityResponse";
      case DETECTEDISSUE:
        return "DetectedIssue";
      case DEVICE:
        return "Device";
      case DEVICEDEFINITION:
        return "DeviceDefinition";
      case DEVICEMETRIC:
        return "DeviceMetric";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case DOMAINRESOURCE:
        return "DomainResource";
      case EFFECTEVIDENCESYNTHESIS:
        return "EffectEvidenceSynthesis";
      case ENCOUNTER:
        return "Encounter";
      case ENDPOINT:
        return "Endpoint";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EVENTDEFINITION:
        return "EventDefinition";
      case EVIDENCE:
        return "Evidence";
      case EVIDENCEVARIABLE:
        return "EvidenceVariable";
      case EXAMPLESCENARIO:
        return "ExampleScenario";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case FLAG:
        return "Flag";
      case GOAL:
        return "Goal";
      case GRAPHDEFINITION:
        return "GraphDefinition";
      case GROUP:
        return "Group";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case HEALTHCARESERVICE:
        return "HealthcareService";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case IMMUNIZATIONEVALUATION:
        return "ImmunizationEvaluation";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case IMPLEMENTATIONGUIDE:
        return "ImplementationGuide";
      case INSURANCEPLAN:
        return "InsurancePlan";
      case INVOICE:
        return "Invoice";
      case LIBRARY:
        return "Library";
      case LINKAGE:
        return "Linkage";
      case LIST:
        return "List";
      case LOCATION:
        return "Location";
      case MEASURE:
        return "Measure";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATION:
        return "Medication";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONKNOWLEDGE:
        return "MedicationKnowledge";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case MEDICINALPRODUCT:
        return "MedicinalProduct";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "MedicinalProductAuthorization";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "MedicinalProductContraindication";
      case MEDICINALPRODUCTINDICATION:
        return "MedicinalProductIndication";
      case MEDICINALPRODUCTINGREDIENT:
        return "MedicinalProductIngredient";
      case MEDICINALPRODUCTINTERACTION:
        return "MedicinalProductInteraction";
      case MEDICINALPRODUCTMANUFACTURED:
        return "MedicinalProductManufactured";
      case MEDICINALPRODUCTPACKAGED:
        return "MedicinalProductPackaged";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "MedicinalProductPharmaceutical";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "MedicinalProductUndesirableEffect";
      case MESSAGEDEFINITION:
        return "MessageDefinition";
      case MESSAGEHEADER:
        return "MessageHeader";
      case MOLECULARSEQUENCE:
        return "MolecularSequence";
      case NAMINGSYSTEM:
        return "NamingSystem";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case OBSERVATION:
        return "Observation";
      case OBSERVATIONDEFINITION:
        return "ObservationDefinition";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case OPERATIONOUTCOME:
        return "OperationOutcome";
      case ORGANIZATION:
        return "Organization";
      case ORGANIZATIONAFFILIATION:
        return "OrganizationAffiliation";
      case PARAMETERS:
        return "Parameters";
      case PATIENT:
        return "Patient";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PERSON:
        return "Person";
      case PLANDEFINITION:
        return "PlanDefinition";
      case PRACTITIONER:
        return "Practitioner";
      case PRACTITIONERROLE:
        return "PractitionerRole";
      case PROCEDURE:
        return "Procedure";
      case PROVENANCE:
        return "Provenance";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RELATEDPERSON:
        return "RelatedPerson";
      case REQUESTGROUP:
        return "RequestGroup";
      case RESEARCHDEFINITION:
        return "ResearchDefinition";
      case RESEARCHELEMENTDEFINITION:
        return "ResearchElementDefinition";
      case RESEARCHSTUDY:
        return "ResearchStudy";
      case RESEARCHSUBJECT:
        return "ResearchSubject";
      case RESOURCE:
        return "Resource";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case RISKEVIDENCESYNTHESIS:
        return "RiskEvidenceSynthesis";
      case SCHEDULE:
        return "Schedule";
      case SEARCHPARAMETER:
        return "SearchParameter";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SLOT:
        return "Slot";
      case SPECIMEN:
        return "Specimen";
      case SPECIMENDEFINITION:
        return "SpecimenDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case SUBSCRIPTION:
        return "Subscription";
      case SUBSTANCE:
        return "Substance";
      case SUBSTANCENUCLEICACID:
        return "SubstanceNucleicAcid";
      case SUBSTANCEPOLYMER:
        return "SubstancePolymer";
      case SUBSTANCEPROTEIN:
        return "SubstanceProtein";
      case SUBSTANCEREFERENCEINFORMATION:
        return "SubstanceReferenceInformation";
      case SUBSTANCESOURCEMATERIAL:
        return "SubstanceSourceMaterial";
      case SUBSTANCESPECIFICATION:
        return "SubstanceSpecification";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case TERMINOLOGYCAPABILITIES:
        return "TerminologyCapabilities";
      case TESTREPORT:
        return "TestReport";
      case TESTSCRIPT:
        return "TestScript";
      case VALUESET:
        return "ValueSet";
      case VERIFICATIONRESULT:
        return "VerificationResult";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case ACCOUNT:
        return "http://hl7.org/fhir/resource-types";
      case ACTIVITYDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case ADVERSEEVENT:
        return "http://hl7.org/fhir/resource-types";
      case ALLERGYINTOLERANCE:
        return "http://hl7.org/fhir/resource-types";
      case APPOINTMENT:
        return "http://hl7.org/fhir/resource-types";
      case APPOINTMENTRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case AUDITEVENT:
        return "http://hl7.org/fhir/resource-types";
      case BASIC:
        return "http://hl7.org/fhir/resource-types";
      case BINARY:
        return "http://hl7.org/fhir/resource-types";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "http://hl7.org/fhir/resource-types";
      case BODYSTRUCTURE:
        return "http://hl7.org/fhir/resource-types";
      case BUNDLE:
        return "http://hl7.org/fhir/resource-types";
      case CAPABILITYSTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case CAREPLAN:
        return "http://hl7.org/fhir/resource-types";
      case CARETEAM:
        return "http://hl7.org/fhir/resource-types";
      case CATALOGENTRY:
        return "http://hl7.org/fhir/resource-types";
      case CHARGEITEM:
        return "http://hl7.org/fhir/resource-types";
      case CHARGEITEMDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case CLAIM:
        return "http://hl7.org/fhir/resource-types";
      case CLAIMRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case CLINICALIMPRESSION:
        return "http://hl7.org/fhir/resource-types";
      case CODESYSTEM:
        return "http://hl7.org/fhir/resource-types";
      case COMMUNICATION:
        return "http://hl7.org/fhir/resource-types";
      case COMMUNICATIONREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case COMPARTMENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case COMPOSITION:
        return "http://hl7.org/fhir/resource-types";
      case CONCEPTMAP:
        return "http://hl7.org/fhir/resource-types";
      case CONDITION:
        return "http://hl7.org/fhir/resource-types";
      case CONSENT:
        return "http://hl7.org/fhir/resource-types";
      case CONTRACT:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGE:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGEELIGIBILITYREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case COVERAGEELIGIBILITYRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case DETECTEDISSUE:
        return "http://hl7.org/fhir/resource-types";
      case DEVICE:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEMETRIC:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case DEVICEUSESTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case DIAGNOSTICREPORT:
        return "http://hl7.org/fhir/resource-types";
      case DOCUMENTMANIFEST:
        return "http://hl7.org/fhir/resource-types";
      case DOCUMENTREFERENCE:
        return "http://hl7.org/fhir/resource-types";
      case DOMAINRESOURCE:
        return "http://hl7.org/fhir/resource-types";
      case EFFECTEVIDENCESYNTHESIS:
        return "http://hl7.org/fhir/resource-types";
      case ENCOUNTER:
        return "http://hl7.org/fhir/resource-types";
      case ENDPOINT:
        return "http://hl7.org/fhir/resource-types";
      case ENROLLMENTREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case ENROLLMENTRESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case EPISODEOFCARE:
        return "http://hl7.org/fhir/resource-types";
      case EVENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case EVIDENCE:
        return "http://hl7.org/fhir/resource-types";
      case EVIDENCEVARIABLE:
        return "http://hl7.org/fhir/resource-types";
      case EXAMPLESCENARIO:
        return "http://hl7.org/fhir/resource-types";
      case EXPLANATIONOFBENEFIT:
        return "http://hl7.org/fhir/resource-types";
      case FAMILYMEMBERHISTORY:
        return "http://hl7.org/fhir/resource-types";
      case FLAG:
        return "http://hl7.org/fhir/resource-types";
      case GOAL:
        return "http://hl7.org/fhir/resource-types";
      case GRAPHDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case GROUP:
        return "http://hl7.org/fhir/resource-types";
      case GUIDANCERESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case HEALTHCARESERVICE:
        return "http://hl7.org/fhir/resource-types";
      case IMAGINGSTUDY:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATION:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATIONEVALUATION:
        return "http://hl7.org/fhir/resource-types";
      case IMMUNIZATIONRECOMMENDATION:
        return "http://hl7.org/fhir/resource-types";
      case IMPLEMENTATIONGUIDE:
        return "http://hl7.org/fhir/resource-types";
      case INSURANCEPLAN:
        return "http://hl7.org/fhir/resource-types";
      case INVOICE:
        return "http://hl7.org/fhir/resource-types";
      case LIBRARY:
        return "http://hl7.org/fhir/resource-types";
      case LINKAGE:
        return "http://hl7.org/fhir/resource-types";
      case LIST:
        return "http://hl7.org/fhir/resource-types";
      case LOCATION:
        return "http://hl7.org/fhir/resource-types";
      case MEASURE:
        return "http://hl7.org/fhir/resource-types";
      case MEASUREREPORT:
        return "http://hl7.org/fhir/resource-types";
      case MEDIA:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONADMINISTRATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONDISPENSE:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONKNOWLEDGE:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case MEDICATIONSTATEMENT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINDICATION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINGREDIENT:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTINTERACTION:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTMANUFACTURED:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTPACKAGED:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "http://hl7.org/fhir/resource-types";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "http://hl7.org/fhir/resource-types";
      case MESSAGEDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case MESSAGEHEADER:
        return "http://hl7.org/fhir/resource-types";
      case MOLECULARSEQUENCE:
        return "http://hl7.org/fhir/resource-types";
      case NAMINGSYSTEM:
        return "http://hl7.org/fhir/resource-types";
      case NUTRITIONORDER:
        return "http://hl7.org/fhir/resource-types";
      case OBSERVATION:
        return "http://hl7.org/fhir/resource-types";
      case OBSERVATIONDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case OPERATIONDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case OPERATIONOUTCOME:
        return "http://hl7.org/fhir/resource-types";
      case ORGANIZATION:
        return "http://hl7.org/fhir/resource-types";
      case ORGANIZATIONAFFILIATION:
        return "http://hl7.org/fhir/resource-types";
      case PARAMETERS:
        return "http://hl7.org/fhir/resource-types";
      case PATIENT:
        return "http://hl7.org/fhir/resource-types";
      case PAYMENTNOTICE:
        return "http://hl7.org/fhir/resource-types";
      case PAYMENTRECONCILIATION:
        return "http://hl7.org/fhir/resource-types";
      case PERSON:
        return "http://hl7.org/fhir/resource-types";
      case PLANDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case PRACTITIONER:
        return "http://hl7.org/fhir/resource-types";
      case PRACTITIONERROLE:
        return "http://hl7.org/fhir/resource-types";
      case PROCEDURE:
        return "http://hl7.org/fhir/resource-types";
      case PROVENANCE:
        return "http://hl7.org/fhir/resource-types";
      case QUESTIONNAIRE:
        return "http://hl7.org/fhir/resource-types";
      case QUESTIONNAIRERESPONSE:
        return "http://hl7.org/fhir/resource-types";
      case RELATEDPERSON:
        return "http://hl7.org/fhir/resource-types";
      case REQUESTGROUP:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHELEMENTDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHSTUDY:
        return "http://hl7.org/fhir/resource-types";
      case RESEARCHSUBJECT:
        return "http://hl7.org/fhir/resource-types";
      case RESOURCE:
        return "http://hl7.org/fhir/resource-types";
      case RISKASSESSMENT:
        return "http://hl7.org/fhir/resource-types";
      case RISKEVIDENCESYNTHESIS:
        return "http://hl7.org/fhir/resource-types";
      case SCHEDULE:
        return "http://hl7.org/fhir/resource-types";
      case SEARCHPARAMETER:
        return "http://hl7.org/fhir/resource-types";
      case SERVICEREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case SLOT:
        return "http://hl7.org/fhir/resource-types";
      case SPECIMEN:
        return "http://hl7.org/fhir/resource-types";
      case SPECIMENDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case STRUCTUREDEFINITION:
        return "http://hl7.org/fhir/resource-types";
      case STRUCTUREMAP:
        return "http://hl7.org/fhir/resource-types";
      case SUBSCRIPTION:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCE:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCENUCLEICACID:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEPOLYMER:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEPROTEIN:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCEREFERENCEINFORMATION:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCESOURCEMATERIAL:
        return "http://hl7.org/fhir/resource-types";
      case SUBSTANCESPECIFICATION:
        return "http://hl7.org/fhir/resource-types";
      case SUPPLYDELIVERY:
        return "http://hl7.org/fhir/resource-types";
      case SUPPLYREQUEST:
        return "http://hl7.org/fhir/resource-types";
      case TASK:
        return "http://hl7.org/fhir/resource-types";
      case TERMINOLOGYCAPABILITIES:
        return "http://hl7.org/fhir/resource-types";
      case TESTREPORT:
        return "http://hl7.org/fhir/resource-types";
      case TESTSCRIPT:
        return "http://hl7.org/fhir/resource-types";
      case VALUESET:
        return "http://hl7.org/fhir/resource-types";
      case VERIFICATIONRESULT:
        return "http://hl7.org/fhir/resource-types";
      case VISIONPRESCRIPTION:
        return "http://hl7.org/fhir/resource-types";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case ACCOUNT:
        return "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.";
      case ACTIVITYDEFINITION:
        return "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.";
      case ADVERSEEVENT:
        return "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.";
      case ALLERGYINTOLERANCE:
        return "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.";
      case APPOINTMENT:
        return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
      case APPOINTMENTRESPONSE:
        return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
      case AUDITEVENT:
        return "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.";
      case BASIC:
        return "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.";
      case BINARY:
        return "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity.";
      case BODYSTRUCTURE:
        return "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.";
      case BUNDLE:
        return "A container for a collection of resources.";
      case CAPABILITYSTATEMENT:
        return "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
      case CAREPLAN:
        return "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.";
      case CARETEAM:
        return "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.";
      case CATALOGENTRY:
        return "Catalog entries are wrappers that contextualize items included in a catalog.";
      case CHARGEITEM:
        return "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.";
      case CHARGEITEMDEFINITION:
        return "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.";
      case CLAIM:
        return "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.";
      case CLAIMRESPONSE:
        return "This resource provides the adjudication details from the processing of a Claim resource.";
      case CLINICALIMPRESSION:
        return "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score.";
      case CODESYSTEM:
        return "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.";
      case COMMUNICATION:
        return "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.";
      case COMMUNICATIONREQUEST:
        return "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.";
      case COMPARTMENTDEFINITION:
        return "A compartment definition that defines how resources are accessed on a server.";
      case COMPOSITION:
        return "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).";
      case CONCEPTMAP:
        return "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.";
      case CONDITION:
        return "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.";
      case CONSENT:
        return "A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.";
      case CONTRACT:
        return "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.";
      case COVERAGE:
        return "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.";
      case COVERAGEELIGIBILITYREQUEST:
        return "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.";
      case COVERAGEELIGIBILITYRESPONSE:
        return "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.";
      case DETECTEDISSUE:
        return "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.";
      case DEVICE:
        return "A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.";
      case DEVICEDEFINITION:
        return "The characteristics, operational status and capabilities of a medical-related component of a medical device.";
      case DEVICEMETRIC:
        return "Describes a measurement, calculation or setting capability of a medical device.";
      case DEVICEREQUEST:
        return "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.";
      case DEVICEUSESTATEMENT:
        return "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.";
      case DIAGNOSTICREPORT:
        return "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.";
      case DOCUMENTMANIFEST:
        return "A collection of documents compiled for a purpose together with metadata that applies to the collection.";
      case DOCUMENTREFERENCE:
        return "A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.";
      case DOMAINRESOURCE:
        return "A resource that includes narrative, extensions, and contained resources.";
      case EFFECTEVIDENCESYNTHESIS:
        return "The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.";
      case ENCOUNTER:
        return "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.";
      case ENDPOINT:
        return "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.";
      case ENROLLMENTREQUEST:
        return "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.";
      case ENROLLMENTRESPONSE:
        return "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.";
      case EPISODEOFCARE:
        return "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.";
      case EVENTDEFINITION:
        return "The EventDefinition resource provides a reusable description of when a particular event can occur.";
      case EVIDENCE:
        return "The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.";
      case EVIDENCEVARIABLE:
        return "The EvidenceVariable resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.";
      case EXAMPLESCENARIO:
        return "Example of workflow instance.";
      case EXPLANATIONOFBENEFIT:
        return "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.";
      case FAMILYMEMBERHISTORY:
        return "Significant health conditions for a person related to the patient relevant in the context of care for the patient.";
      case FLAG:
        return "Prospective warnings of potential issues when providing care to the patient.";
      case GOAL:
        return "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.";
      case GRAPHDEFINITION:
        return "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.";
      case GROUP:
        return "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.";
      case GUIDANCERESPONSE:
        return "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.";
      case HEALTHCARESERVICE:
        return "The details of a healthcare service available at a location.";
      case IMAGINGSTUDY:
        return "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.";
      case IMMUNIZATION:
        return "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.";
      case IMMUNIZATIONEVALUATION:
        return "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations.";
      case IMMUNIZATIONRECOMMENDATION:
        return "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.";
      case IMPLEMENTATIONGUIDE:
        return "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.";
      case INSURANCEPLAN:
        return "Details of a Health Insurance product/plan provided by an organization.";
      case INVOICE:
        return "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.";
      case LIBRARY:
        return "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.";
      case LINKAGE:
        return "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\".";
      case LIST:
        return "A list is a curated collection of resources.";
      case LOCATION:
        return "Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.";
      case MEASURE:
        return "The Measure resource provides the definition of a quality measure.";
      case MEASUREREPORT:
        return "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.";
      case MEDIA:
        return "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.";
      case MEDICATION:
        return "This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.";
      case MEDICATIONADMINISTRATION:
        return "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.";
      case MEDICATIONDISPENSE:
        return "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.";
      case MEDICATIONKNOWLEDGE:
        return "Information about a medication that is used to support knowledge.";
      case MEDICATIONREQUEST:
        return "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.";
      case MEDICATIONSTATEMENT:
        return "A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. \n\nThe primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.";
      case MEDICINALPRODUCT:
        return "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "The regulatory authorization of a medicinal product.";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.";
      case MEDICINALPRODUCTINDICATION:
        return "Indication for the Medicinal Product.";
      case MEDICINALPRODUCTINGREDIENT:
        return "An ingredient of a manufactured item or pharmaceutical product.";
      case MEDICINALPRODUCTINTERACTION:
        return "The interactions of the medicinal product with other medicinal products, or other forms of interactions.";
      case MEDICINALPRODUCTMANUFACTURED:
        return "The manufactured item as contained in the packaged medicinal product.";
      case MEDICINALPRODUCTPACKAGED:
        return "A medicinal product in a container or package.";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "A pharmaceutical product described in terms of its composition and dose form.";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "Describe the undesirable effects of the medicinal product.";
      case MESSAGEDEFINITION:
        return "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.";
      case MESSAGEHEADER:
        return "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.";
      case MOLECULARSEQUENCE:
        return "Raw data describing a biological sequence.";
      case NAMINGSYSTEM:
        return "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.";
      case NUTRITIONORDER:
        return "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.";
      case OBSERVATION:
        return "Measurements and simple assertions made about a patient, device or other subject.";
      case OBSERVATIONDEFINITION:
        return "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.";
      case OPERATIONDEFINITION:
        return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
      case OPERATIONOUTCOME:
        return "A collection of error, warning, or information messages that result from a system action.";
      case ORGANIZATION:
        return "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.";
      case ORGANIZATIONAFFILIATION:
        return "Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.";
      case PARAMETERS:
        return "This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.";
      case PATIENT:
        return "Demographics and other administrative information about an individual or animal receiving care or other health-related services.";
      case PAYMENTNOTICE:
        return "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.";
      case PAYMENTRECONCILIATION:
        return "This resource provides the details including amount of a payment and allocates the payment items being paid.";
      case PERSON:
        return "Demographics and administrative information about a person independent of a specific health-related context.";
      case PLANDEFINITION:
        return "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.";
      case PRACTITIONER:
        return "A person who is directly or indirectly involved in the provisioning of healthcare.";
      case PRACTITIONERROLE:
        return "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.";
      case PROCEDURE:
        return "An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.";
      case PROVENANCE:
        return "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.";
      case QUESTIONNAIRE:
        return "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.";
      case QUESTIONNAIRERESPONSE:
        return "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.";
      case RELATEDPERSON:
        return "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.";
      case REQUESTGROUP:
        return "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".";
      case RESEARCHDEFINITION:
        return "The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.";
      case RESEARCHELEMENTDEFINITION:
        return "The ResearchElementDefinition resource describes a \"PICO\" element that knowledge (evidence, assertion, recommendation) is about.";
      case RESEARCHSTUDY:
        return "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.";
      case RESEARCHSUBJECT:
        return "A physical entity which is the primary unit of operational and/or administrative interest in a study.";
      case RESOURCE:
        return "This is the base resource type for everything.";
      case RISKASSESSMENT:
        return "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.";
      case RISKEVIDENCESYNTHESIS:
        return "The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.";
      case SCHEDULE:
        return "A container for slots of time that may be available for booking appointments.";
      case SEARCHPARAMETER:
        return "A search parameter that defines a named search item that can be used to search/filter on a resource.";
      case SERVICEREQUEST:
        return "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.";
      case SLOT:
        return "A slot of time on a schedule that may be available for booking appointments.";
      case SPECIMEN:
        return "A sample to be used for analysis.";
      case SPECIMENDEFINITION:
        return "A kind of specimen with associated set of requirements.";
      case STRUCTUREDEFINITION:
        return "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.";
      case STRUCTUREMAP:
        return "A Map of relationships between 2 structures that can be used to transform data.";
      case SUBSCRIPTION:
        return "The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system can take an appropriate action.";
      case SUBSTANCE:
        return "A homogeneous material with a definite composition.";
      case SUBSTANCENUCLEICACID:
        return "Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.";
      case SUBSTANCEPOLYMER:
        return "Todo.";
      case SUBSTANCEPROTEIN:
        return "A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.";
      case SUBSTANCEREFERENCEINFORMATION:
        return "Todo.";
      case SUBSTANCESOURCEMATERIAL:
        return "Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.";
      case SUBSTANCESPECIFICATION:
        return "The detailed description of a substance, typically at a level beyond what is used for prescribing.";
      case SUPPLYDELIVERY:
        return "Record of delivery of what is supplied.";
      case SUPPLYREQUEST:
        return "A record of a request for a medication, substance or device used in the healthcare setting.";
      case TASK:
        return "A task to be performed.";
      case TERMINOLOGYCAPABILITIES:
        return "A Terminology Capabilities documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
      case TESTREPORT:
        return "A summary of information based on the results of executing a TestScript.";
      case TESTSCRIPT:
        return "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.";
      case VALUESET:
        return "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).";
      case VERIFICATIONRESULT:
        return "Describes validation requirements, source(s), status and dates for one or more elements.";
      case VISIONPRESCRIPTION:
        return "An authorization for the provision of glasses and/or contact lenses to a patient.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case ACCOUNT:
        return "Account";
      case ACTIVITYDEFINITION:
        return "ActivityDefinition";
      case ADVERSEEVENT:
        return "AdverseEvent";
      case ALLERGYINTOLERANCE:
        return "AllergyIntolerance";
      case APPOINTMENT:
        return "Appointment";
      case APPOINTMENTRESPONSE:
        return "AppointmentResponse";
      case AUDITEVENT:
        return "AuditEvent";
      case BASIC:
        return "Basic";
      case BINARY:
        return "Binary";
      case BIOLOGICALLYDERIVEDPRODUCT:
        return "BiologicallyDerivedProduct";
      case BODYSTRUCTURE:
        return "BodyStructure";
      case BUNDLE:
        return "Bundle";
      case CAPABILITYSTATEMENT:
        return "CapabilityStatement";
      case CAREPLAN:
        return "CarePlan";
      case CARETEAM:
        return "CareTeam";
      case CATALOGENTRY:
        return "CatalogEntry";
      case CHARGEITEM:
        return "ChargeItem";
      case CHARGEITEMDEFINITION:
        return "ChargeItemDefinition";
      case CLAIM:
        return "Claim";
      case CLAIMRESPONSE:
        return "ClaimResponse";
      case CLINICALIMPRESSION:
        return "ClinicalImpression";
      case CODESYSTEM:
        return "CodeSystem";
      case COMMUNICATION:
        return "Communication";
      case COMMUNICATIONREQUEST:
        return "CommunicationRequest";
      case COMPARTMENTDEFINITION:
        return "CompartmentDefinition";
      case COMPOSITION:
        return "Composition";
      case CONCEPTMAP:
        return "ConceptMap";
      case CONDITION:
        return "Condition";
      case CONSENT:
        return "Consent";
      case CONTRACT:
        return "Contract";
      case COVERAGE:
        return "Coverage";
      case COVERAGEELIGIBILITYREQUEST:
        return "CoverageEligibilityRequest";
      case COVERAGEELIGIBILITYRESPONSE:
        return "CoverageEligibilityResponse";
      case DETECTEDISSUE:
        return "DetectedIssue";
      case DEVICE:
        return "Device";
      case DEVICEDEFINITION:
        return "DeviceDefinition";
      case DEVICEMETRIC:
        return "DeviceMetric";
      case DEVICEREQUEST:
        return "DeviceRequest";
      case DEVICEUSESTATEMENT:
        return "DeviceUseStatement";
      case DIAGNOSTICREPORT:
        return "DiagnosticReport";
      case DOCUMENTMANIFEST:
        return "DocumentManifest";
      case DOCUMENTREFERENCE:
        return "DocumentReference";
      case DOMAINRESOURCE:
        return "DomainResource";
      case EFFECTEVIDENCESYNTHESIS:
        return "EffectEvidenceSynthesis";
      case ENCOUNTER:
        return "Encounter";
      case ENDPOINT:
        return "Endpoint";
      case ENROLLMENTREQUEST:
        return "EnrollmentRequest";
      case ENROLLMENTRESPONSE:
        return "EnrollmentResponse";
      case EPISODEOFCARE:
        return "EpisodeOfCare";
      case EVENTDEFINITION:
        return "EventDefinition";
      case EVIDENCE:
        return "Evidence";
      case EVIDENCEVARIABLE:
        return "EvidenceVariable";
      case EXAMPLESCENARIO:
        return "ExampleScenario";
      case EXPLANATIONOFBENEFIT:
        return "ExplanationOfBenefit";
      case FAMILYMEMBERHISTORY:
        return "FamilyMemberHistory";
      case FLAG:
        return "Flag";
      case GOAL:
        return "Goal";
      case GRAPHDEFINITION:
        return "GraphDefinition";
      case GROUP:
        return "Group";
      case GUIDANCERESPONSE:
        return "GuidanceResponse";
      case HEALTHCARESERVICE:
        return "HealthcareService";
      case IMAGINGSTUDY:
        return "ImagingStudy";
      case IMMUNIZATION:
        return "Immunization";
      case IMMUNIZATIONEVALUATION:
        return "ImmunizationEvaluation";
      case IMMUNIZATIONRECOMMENDATION:
        return "ImmunizationRecommendation";
      case IMPLEMENTATIONGUIDE:
        return "ImplementationGuide";
      case INSURANCEPLAN:
        return "InsurancePlan";
      case INVOICE:
        return "Invoice";
      case LIBRARY:
        return "Library";
      case LINKAGE:
        return "Linkage";
      case LIST:
        return "List";
      case LOCATION:
        return "Location";
      case MEASURE:
        return "Measure";
      case MEASUREREPORT:
        return "MeasureReport";
      case MEDIA:
        return "Media";
      case MEDICATION:
        return "Medication";
      case MEDICATIONADMINISTRATION:
        return "MedicationAdministration";
      case MEDICATIONDISPENSE:
        return "MedicationDispense";
      case MEDICATIONKNOWLEDGE:
        return "MedicationKnowledge";
      case MEDICATIONREQUEST:
        return "MedicationRequest";
      case MEDICATIONSTATEMENT:
        return "MedicationStatement";
      case MEDICINALPRODUCT:
        return "MedicinalProduct";
      case MEDICINALPRODUCTAUTHORIZATION:
        return "MedicinalProductAuthorization";
      case MEDICINALPRODUCTCONTRAINDICATION:
        return "MedicinalProductContraindication";
      case MEDICINALPRODUCTINDICATION:
        return "MedicinalProductIndication";
      case MEDICINALPRODUCTINGREDIENT:
        return "MedicinalProductIngredient";
      case MEDICINALPRODUCTINTERACTION:
        return "MedicinalProductInteraction";
      case MEDICINALPRODUCTMANUFACTURED:
        return "MedicinalProductManufactured";
      case MEDICINALPRODUCTPACKAGED:
        return "MedicinalProductPackaged";
      case MEDICINALPRODUCTPHARMACEUTICAL:
        return "MedicinalProductPharmaceutical";
      case MEDICINALPRODUCTUNDESIRABLEEFFECT:
        return "MedicinalProductUndesirableEffect";
      case MESSAGEDEFINITION:
        return "MessageDefinition";
      case MESSAGEHEADER:
        return "MessageHeader";
      case MOLECULARSEQUENCE:
        return "MolecularSequence";
      case NAMINGSYSTEM:
        return "NamingSystem";
      case NUTRITIONORDER:
        return "NutritionOrder";
      case OBSERVATION:
        return "Observation";
      case OBSERVATIONDEFINITION:
        return "ObservationDefinition";
      case OPERATIONDEFINITION:
        return "OperationDefinition";
      case OPERATIONOUTCOME:
        return "OperationOutcome";
      case ORGANIZATION:
        return "Organization";
      case ORGANIZATIONAFFILIATION:
        return "OrganizationAffiliation";
      case PARAMETERS:
        return "Parameters";
      case PATIENT:
        return "Patient";
      case PAYMENTNOTICE:
        return "PaymentNotice";
      case PAYMENTRECONCILIATION:
        return "PaymentReconciliation";
      case PERSON:
        return "Person";
      case PLANDEFINITION:
        return "PlanDefinition";
      case PRACTITIONER:
        return "Practitioner";
      case PRACTITIONERROLE:
        return "PractitionerRole";
      case PROCEDURE:
        return "Procedure";
      case PROVENANCE:
        return "Provenance";
      case QUESTIONNAIRE:
        return "Questionnaire";
      case QUESTIONNAIRERESPONSE:
        return "QuestionnaireResponse";
      case RELATEDPERSON:
        return "RelatedPerson";
      case REQUESTGROUP:
        return "RequestGroup";
      case RESEARCHDEFINITION:
        return "ResearchDefinition";
      case RESEARCHELEMENTDEFINITION:
        return "ResearchElementDefinition";
      case RESEARCHSTUDY:
        return "ResearchStudy";
      case RESEARCHSUBJECT:
        return "ResearchSubject";
      case RESOURCE:
        return "Resource";
      case RISKASSESSMENT:
        return "RiskAssessment";
      case RISKEVIDENCESYNTHESIS:
        return "RiskEvidenceSynthesis";
      case SCHEDULE:
        return "Schedule";
      case SEARCHPARAMETER:
        return "SearchParameter";
      case SERVICEREQUEST:
        return "ServiceRequest";
      case SLOT:
        return "Slot";
      case SPECIMEN:
        return "Specimen";
      case SPECIMENDEFINITION:
        return "SpecimenDefinition";
      case STRUCTUREDEFINITION:
        return "StructureDefinition";
      case STRUCTUREMAP:
        return "StructureMap";
      case SUBSCRIPTION:
        return "Subscription";
      case SUBSTANCE:
        return "Substance";
      case SUBSTANCENUCLEICACID:
        return "SubstanceNucleicAcid";
      case SUBSTANCEPOLYMER:
        return "SubstancePolymer";
      case SUBSTANCEPROTEIN:
        return "SubstanceProtein";
      case SUBSTANCEREFERENCEINFORMATION:
        return "SubstanceReferenceInformation";
      case SUBSTANCESOURCEMATERIAL:
        return "SubstanceSourceMaterial";
      case SUBSTANCESPECIFICATION:
        return "SubstanceSpecification";
      case SUPPLYDELIVERY:
        return "SupplyDelivery";
      case SUPPLYREQUEST:
        return "SupplyRequest";
      case TASK:
        return "Task";
      case TERMINOLOGYCAPABILITIES:
        return "TerminologyCapabilities";
      case TESTREPORT:
        return "TestReport";
      case TESTSCRIPT:
        return "TestScript";
      case VALUESET:
        return "ValueSet";
      case VERIFICATIONRESULT:
        return "VerificationResult";
      case VISIONPRESCRIPTION:
        return "VisionPrescription";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class ResourceTypeEnumFactory implements EnumFactory<ResourceType> {
    public ResourceType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("Account".equals(codeString))
        return ResourceType.ACCOUNT;
      if ("ActivityDefinition".equals(codeString))
        return ResourceType.ACTIVITYDEFINITION;
      if ("AdverseEvent".equals(codeString))
        return ResourceType.ADVERSEEVENT;
      if ("AllergyIntolerance".equals(codeString))
        return ResourceType.ALLERGYINTOLERANCE;
      if ("Appointment".equals(codeString))
        return ResourceType.APPOINTMENT;
      if ("AppointmentResponse".equals(codeString))
        return ResourceType.APPOINTMENTRESPONSE;
      if ("AuditEvent".equals(codeString))
        return ResourceType.AUDITEVENT;
      if ("Basic".equals(codeString))
        return ResourceType.BASIC;
      if ("Binary".equals(codeString))
        return ResourceType.BINARY;
      if ("BiologicallyDerivedProduct".equals(codeString))
        return ResourceType.BIOLOGICALLYDERIVEDPRODUCT;
      if ("BodyStructure".equals(codeString))
        return ResourceType.BODYSTRUCTURE;
      if ("Bundle".equals(codeString))
        return ResourceType.BUNDLE;
      if ("CapabilityStatement".equals(codeString))
        return ResourceType.CAPABILITYSTATEMENT;
      if ("CarePlan".equals(codeString))
        return ResourceType.CAREPLAN;
      if ("CareTeam".equals(codeString))
        return ResourceType.CARETEAM;
      if ("CatalogEntry".equals(codeString))
        return ResourceType.CATALOGENTRY;
      if ("ChargeItem".equals(codeString))
        return ResourceType.CHARGEITEM;
      if ("ChargeItemDefinition".equals(codeString))
        return ResourceType.CHARGEITEMDEFINITION;
      if ("Claim".equals(codeString))
        return ResourceType.CLAIM;
      if ("ClaimResponse".equals(codeString))
        return ResourceType.CLAIMRESPONSE;
      if ("ClinicalImpression".equals(codeString))
        return ResourceType.CLINICALIMPRESSION;
      if ("CodeSystem".equals(codeString))
        return ResourceType.CODESYSTEM;
      if ("Communication".equals(codeString))
        return ResourceType.COMMUNICATION;
      if ("CommunicationRequest".equals(codeString))
        return ResourceType.COMMUNICATIONREQUEST;
      if ("CompartmentDefinition".equals(codeString))
        return ResourceType.COMPARTMENTDEFINITION;
      if ("Composition".equals(codeString))
        return ResourceType.COMPOSITION;
      if ("ConceptMap".equals(codeString))
        return ResourceType.CONCEPTMAP;
      if ("Condition".equals(codeString))
        return ResourceType.CONDITION;
      if ("Consent".equals(codeString))
        return ResourceType.CONSENT;
      if ("Contract".equals(codeString))
        return ResourceType.CONTRACT;
      if ("Coverage".equals(codeString))
        return ResourceType.COVERAGE;
      if ("CoverageEligibilityRequest".equals(codeString))
        return ResourceType.COVERAGEELIGIBILITYREQUEST;
      if ("CoverageEligibilityResponse".equals(codeString))
        return ResourceType.COVERAGEELIGIBILITYRESPONSE;
      if ("DetectedIssue".equals(codeString))
        return ResourceType.DETECTEDISSUE;
      if ("Device".equals(codeString))
        return ResourceType.DEVICE;
      if ("DeviceDefinition".equals(codeString))
        return ResourceType.DEVICEDEFINITION;
      if ("DeviceMetric".equals(codeString))
        return ResourceType.DEVICEMETRIC;
      if ("DeviceRequest".equals(codeString))
        return ResourceType.DEVICEREQUEST;
      if ("DeviceUseStatement".equals(codeString))
        return ResourceType.DEVICEUSESTATEMENT;
      if ("DiagnosticReport".equals(codeString))
        return ResourceType.DIAGNOSTICREPORT;
      if ("DocumentManifest".equals(codeString))
        return ResourceType.DOCUMENTMANIFEST;
      if ("DocumentReference".equals(codeString))
        return ResourceType.DOCUMENTREFERENCE;
      if ("DomainResource".equals(codeString))
        return ResourceType.DOMAINRESOURCE;
      if ("EffectEvidenceSynthesis".equals(codeString))
        return ResourceType.EFFECTEVIDENCESYNTHESIS;
      if ("Encounter".equals(codeString))
        return ResourceType.ENCOUNTER;
      if ("Endpoint".equals(codeString))
        return ResourceType.ENDPOINT;
      if ("EnrollmentRequest".equals(codeString))
        return ResourceType.ENROLLMENTREQUEST;
      if ("EnrollmentResponse".equals(codeString))
        return ResourceType.ENROLLMENTRESPONSE;
      if ("EpisodeOfCare".equals(codeString))
        return ResourceType.EPISODEOFCARE;
      if ("EventDefinition".equals(codeString))
        return ResourceType.EVENTDEFINITION;
      if ("Evidence".equals(codeString))
        return ResourceType.EVIDENCE;
      if ("EvidenceVariable".equals(codeString))
        return ResourceType.EVIDENCEVARIABLE;
      if ("ExampleScenario".equals(codeString))
        return ResourceType.EXAMPLESCENARIO;
      if ("ExplanationOfBenefit".equals(codeString))
        return ResourceType.EXPLANATIONOFBENEFIT;
      if ("FamilyMemberHistory".equals(codeString))
        return ResourceType.FAMILYMEMBERHISTORY;
      if ("Flag".equals(codeString))
        return ResourceType.FLAG;
      if ("Goal".equals(codeString))
        return ResourceType.GOAL;
      if ("GraphDefinition".equals(codeString))
        return ResourceType.GRAPHDEFINITION;
      if ("Group".equals(codeString))
        return ResourceType.GROUP;
      if ("GuidanceResponse".equals(codeString))
        return ResourceType.GUIDANCERESPONSE;
      if ("HealthcareService".equals(codeString))
        return ResourceType.HEALTHCARESERVICE;
      if ("ImagingStudy".equals(codeString))
        return ResourceType.IMAGINGSTUDY;
      if ("Immunization".equals(codeString))
        return ResourceType.IMMUNIZATION;
      if ("ImmunizationEvaluation".equals(codeString))
        return ResourceType.IMMUNIZATIONEVALUATION;
      if ("ImmunizationRecommendation".equals(codeString))
        return ResourceType.IMMUNIZATIONRECOMMENDATION;
      if ("ImplementationGuide".equals(codeString))
        return ResourceType.IMPLEMENTATIONGUIDE;
      if ("InsurancePlan".equals(codeString))
        return ResourceType.INSURANCEPLAN;
      if ("Invoice".equals(codeString))
        return ResourceType.INVOICE;
      if ("Library".equals(codeString))
        return ResourceType.LIBRARY;
      if ("Linkage".equals(codeString))
        return ResourceType.LINKAGE;
      if ("List".equals(codeString))
        return ResourceType.LIST;
      if ("Location".equals(codeString))
        return ResourceType.LOCATION;
      if ("Measure".equals(codeString))
        return ResourceType.MEASURE;
      if ("MeasureReport".equals(codeString))
        return ResourceType.MEASUREREPORT;
      if ("Media".equals(codeString))
        return ResourceType.MEDIA;
      if ("Medication".equals(codeString))
        return ResourceType.MEDICATION;
      if ("MedicationAdministration".equals(codeString))
        return ResourceType.MEDICATIONADMINISTRATION;
      if ("MedicationDispense".equals(codeString))
        return ResourceType.MEDICATIONDISPENSE;
      if ("MedicationKnowledge".equals(codeString))
        return ResourceType.MEDICATIONKNOWLEDGE;
      if ("MedicationRequest".equals(codeString))
        return ResourceType.MEDICATIONREQUEST;
      if ("MedicationStatement".equals(codeString))
        return ResourceType.MEDICATIONSTATEMENT;
      if ("MedicinalProduct".equals(codeString))
        return ResourceType.MEDICINALPRODUCT;
      if ("MedicinalProductAuthorization".equals(codeString))
        return ResourceType.MEDICINALPRODUCTAUTHORIZATION;
      if ("MedicinalProductContraindication".equals(codeString))
        return ResourceType.MEDICINALPRODUCTCONTRAINDICATION;
      if ("MedicinalProductIndication".equals(codeString))
        return ResourceType.MEDICINALPRODUCTINDICATION;
      if ("MedicinalProductIngredient".equals(codeString))
        return ResourceType.MEDICINALPRODUCTINGREDIENT;
      if ("MedicinalProductInteraction".equals(codeString))
        return ResourceType.MEDICINALPRODUCTINTERACTION;
      if ("MedicinalProductManufactured".equals(codeString))
        return ResourceType.MEDICINALPRODUCTMANUFACTURED;
      if ("MedicinalProductPackaged".equals(codeString))
        return ResourceType.MEDICINALPRODUCTPACKAGED;
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return ResourceType.MEDICINALPRODUCTPHARMACEUTICAL;
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return ResourceType.MEDICINALPRODUCTUNDESIRABLEEFFECT;
      if ("MessageDefinition".equals(codeString))
        return ResourceType.MESSAGEDEFINITION;
      if ("MessageHeader".equals(codeString))
        return ResourceType.MESSAGEHEADER;
      if ("MolecularSequence".equals(codeString))
        return ResourceType.MOLECULARSEQUENCE;
      if ("NamingSystem".equals(codeString))
        return ResourceType.NAMINGSYSTEM;
      if ("NutritionOrder".equals(codeString))
        return ResourceType.NUTRITIONORDER;
      if ("Observation".equals(codeString))
        return ResourceType.OBSERVATION;
      if ("ObservationDefinition".equals(codeString))
        return ResourceType.OBSERVATIONDEFINITION;
      if ("OperationDefinition".equals(codeString))
        return ResourceType.OPERATIONDEFINITION;
      if ("OperationOutcome".equals(codeString))
        return ResourceType.OPERATIONOUTCOME;
      if ("Organization".equals(codeString))
        return ResourceType.ORGANIZATION;
      if ("OrganizationAffiliation".equals(codeString))
        return ResourceType.ORGANIZATIONAFFILIATION;
      if ("Parameters".equals(codeString))
        return ResourceType.PARAMETERS;
      if ("Patient".equals(codeString))
        return ResourceType.PATIENT;
      if ("PaymentNotice".equals(codeString))
        return ResourceType.PAYMENTNOTICE;
      if ("PaymentReconciliation".equals(codeString))
        return ResourceType.PAYMENTRECONCILIATION;
      if ("Person".equals(codeString))
        return ResourceType.PERSON;
      if ("PlanDefinition".equals(codeString))
        return ResourceType.PLANDEFINITION;
      if ("Practitioner".equals(codeString))
        return ResourceType.PRACTITIONER;
      if ("PractitionerRole".equals(codeString))
        return ResourceType.PRACTITIONERROLE;
      if ("Procedure".equals(codeString))
        return ResourceType.PROCEDURE;
      if ("Provenance".equals(codeString))
        return ResourceType.PROVENANCE;
      if ("Questionnaire".equals(codeString))
        return ResourceType.QUESTIONNAIRE;
      if ("QuestionnaireResponse".equals(codeString))
        return ResourceType.QUESTIONNAIRERESPONSE;
      if ("RelatedPerson".equals(codeString))
        return ResourceType.RELATEDPERSON;
      if ("RequestGroup".equals(codeString))
        return ResourceType.REQUESTGROUP;
      if ("ResearchDefinition".equals(codeString))
        return ResourceType.RESEARCHDEFINITION;
      if ("ResearchElementDefinition".equals(codeString))
        return ResourceType.RESEARCHELEMENTDEFINITION;
      if ("ResearchStudy".equals(codeString))
        return ResourceType.RESEARCHSTUDY;
      if ("ResearchSubject".equals(codeString))
        return ResourceType.RESEARCHSUBJECT;
      if ("Resource".equals(codeString))
        return ResourceType.RESOURCE;
      if ("RiskAssessment".equals(codeString))
        return ResourceType.RISKASSESSMENT;
      if ("RiskEvidenceSynthesis".equals(codeString))
        return ResourceType.RISKEVIDENCESYNTHESIS;
      if ("Schedule".equals(codeString))
        return ResourceType.SCHEDULE;
      if ("SearchParameter".equals(codeString))
        return ResourceType.SEARCHPARAMETER;
      if ("ServiceRequest".equals(codeString))
        return ResourceType.SERVICEREQUEST;
      if ("Slot".equals(codeString))
        return ResourceType.SLOT;
      if ("Specimen".equals(codeString))
        return ResourceType.SPECIMEN;
      if ("SpecimenDefinition".equals(codeString))
        return ResourceType.SPECIMENDEFINITION;
      if ("StructureDefinition".equals(codeString))
        return ResourceType.STRUCTUREDEFINITION;
      if ("StructureMap".equals(codeString))
        return ResourceType.STRUCTUREMAP;
      if ("Subscription".equals(codeString))
        return ResourceType.SUBSCRIPTION;
      if ("Substance".equals(codeString))
        return ResourceType.SUBSTANCE;
      if ("SubstanceNucleicAcid".equals(codeString))
        return ResourceType.SUBSTANCENUCLEICACID;
      if ("SubstancePolymer".equals(codeString))
        return ResourceType.SUBSTANCEPOLYMER;
      if ("SubstanceProtein".equals(codeString))
        return ResourceType.SUBSTANCEPROTEIN;
      if ("SubstanceReferenceInformation".equals(codeString))
        return ResourceType.SUBSTANCEREFERENCEINFORMATION;
      if ("SubstanceSourceMaterial".equals(codeString))
        return ResourceType.SUBSTANCESOURCEMATERIAL;
      if ("SubstanceSpecification".equals(codeString))
        return ResourceType.SUBSTANCESPECIFICATION;
      if ("SupplyDelivery".equals(codeString))
        return ResourceType.SUPPLYDELIVERY;
      if ("SupplyRequest".equals(codeString))
        return ResourceType.SUPPLYREQUEST;
      if ("Task".equals(codeString))
        return ResourceType.TASK;
      if ("TerminologyCapabilities".equals(codeString))
        return ResourceType.TERMINOLOGYCAPABILITIES;
      if ("TestReport".equals(codeString))
        return ResourceType.TESTREPORT;
      if ("TestScript".equals(codeString))
        return ResourceType.TESTSCRIPT;
      if ("ValueSet".equals(codeString))
        return ResourceType.VALUESET;
      if ("VerificationResult".equals(codeString))
        return ResourceType.VERIFICATIONRESULT;
      if ("VisionPrescription".equals(codeString))
        return ResourceType.VISIONPRESCRIPTION;
      throw new IllegalArgumentException("Unknown ResourceType code '" + codeString + "'");
    }

    public Enumeration<ResourceType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<ResourceType>(this, ResourceType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.NULL, code);
      if ("Account".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ACCOUNT, code);
      if ("ActivityDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ACTIVITYDEFINITION, code);
      if ("AdverseEvent".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ADVERSEEVENT, code);
      if ("AllergyIntolerance".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ALLERGYINTOLERANCE, code);
      if ("Appointment".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.APPOINTMENT, code);
      if ("AppointmentResponse".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.APPOINTMENTRESPONSE, code);
      if ("AuditEvent".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.AUDITEVENT, code);
      if ("Basic".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.BASIC, code);
      if ("Binary".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.BINARY, code);
      if ("BiologicallyDerivedProduct".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.BIOLOGICALLYDERIVEDPRODUCT, code);
      if ("BodyStructure".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.BODYSTRUCTURE, code);
      if ("Bundle".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.BUNDLE, code);
      if ("CapabilityStatement".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CAPABILITYSTATEMENT, code);
      if ("CarePlan".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CAREPLAN, code);
      if ("CareTeam".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CARETEAM, code);
      if ("CatalogEntry".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CATALOGENTRY, code);
      if ("ChargeItem".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CHARGEITEM, code);
      if ("ChargeItemDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CHARGEITEMDEFINITION, code);
      if ("Claim".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CLAIM, code);
      if ("ClaimResponse".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CLAIMRESPONSE, code);
      if ("ClinicalImpression".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CLINICALIMPRESSION, code);
      if ("CodeSystem".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CODESYSTEM, code);
      if ("Communication".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COMMUNICATION, code);
      if ("CommunicationRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COMMUNICATIONREQUEST, code);
      if ("CompartmentDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COMPARTMENTDEFINITION, code);
      if ("Composition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COMPOSITION, code);
      if ("ConceptMap".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CONCEPTMAP, code);
      if ("Condition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CONDITION, code);
      if ("Consent".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CONSENT, code);
      if ("Contract".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.CONTRACT, code);
      if ("Coverage".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COVERAGE, code);
      if ("CoverageEligibilityRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COVERAGEELIGIBILITYREQUEST, code);
      if ("CoverageEligibilityResponse".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.COVERAGEELIGIBILITYRESPONSE, code);
      if ("DetectedIssue".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DETECTEDISSUE, code);
      if ("Device".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DEVICE, code);
      if ("DeviceDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DEVICEDEFINITION, code);
      if ("DeviceMetric".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DEVICEMETRIC, code);
      if ("DeviceRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DEVICEREQUEST, code);
      if ("DeviceUseStatement".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DEVICEUSESTATEMENT, code);
      if ("DiagnosticReport".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DIAGNOSTICREPORT, code);
      if ("DocumentManifest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DOCUMENTMANIFEST, code);
      if ("DocumentReference".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DOCUMENTREFERENCE, code);
      if ("DomainResource".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.DOMAINRESOURCE, code);
      if ("EffectEvidenceSynthesis".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EFFECTEVIDENCESYNTHESIS, code);
      if ("Encounter".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ENCOUNTER, code);
      if ("Endpoint".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ENDPOINT, code);
      if ("EnrollmentRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ENROLLMENTREQUEST, code);
      if ("EnrollmentResponse".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ENROLLMENTRESPONSE, code);
      if ("EpisodeOfCare".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EPISODEOFCARE, code);
      if ("EventDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EVENTDEFINITION, code);
      if ("Evidence".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EVIDENCE, code);
      if ("EvidenceVariable".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EVIDENCEVARIABLE, code);
      if ("ExampleScenario".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EXAMPLESCENARIO, code);
      if ("ExplanationOfBenefit".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.EXPLANATIONOFBENEFIT, code);
      if ("FamilyMemberHistory".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.FAMILYMEMBERHISTORY, code);
      if ("Flag".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.FLAG, code);
      if ("Goal".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.GOAL, code);
      if ("GraphDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.GRAPHDEFINITION, code);
      if ("Group".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.GROUP, code);
      if ("GuidanceResponse".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.GUIDANCERESPONSE, code);
      if ("HealthcareService".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.HEALTHCARESERVICE, code);
      if ("ImagingStudy".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.IMAGINGSTUDY, code);
      if ("Immunization".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.IMMUNIZATION, code);
      if ("ImmunizationEvaluation".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.IMMUNIZATIONEVALUATION, code);
      if ("ImmunizationRecommendation".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.IMMUNIZATIONRECOMMENDATION, code);
      if ("ImplementationGuide".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.IMPLEMENTATIONGUIDE, code);
      if ("InsurancePlan".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.INSURANCEPLAN, code);
      if ("Invoice".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.INVOICE, code);
      if ("Library".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.LIBRARY, code);
      if ("Linkage".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.LINKAGE, code);
      if ("List".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.LIST, code);
      if ("Location".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.LOCATION, code);
      if ("Measure".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEASURE, code);
      if ("MeasureReport".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEASUREREPORT, code);
      if ("Media".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDIA, code);
      if ("Medication".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICATION, code);
      if ("MedicationAdministration".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONADMINISTRATION, code);
      if ("MedicationDispense".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONDISPENSE, code);
      if ("MedicationKnowledge".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONKNOWLEDGE, code);
      if ("MedicationRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONREQUEST, code);
      if ("MedicationStatement".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICATIONSTATEMENT, code);
      if ("MedicinalProduct".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCT, code);
      if ("MedicinalProductAuthorization".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTAUTHORIZATION, code);
      if ("MedicinalProductContraindication".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTCONTRAINDICATION, code);
      if ("MedicinalProductIndication".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTINDICATION, code);
      if ("MedicinalProductIngredient".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTINGREDIENT, code);
      if ("MedicinalProductInteraction".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTINTERACTION, code);
      if ("MedicinalProductManufactured".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTMANUFACTURED, code);
      if ("MedicinalProductPackaged".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTPACKAGED, code);
      if ("MedicinalProductPharmaceutical".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTPHARMACEUTICAL, code);
      if ("MedicinalProductUndesirableEffect".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MEDICINALPRODUCTUNDESIRABLEEFFECT, code);
      if ("MessageDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MESSAGEDEFINITION, code);
      if ("MessageHeader".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MESSAGEHEADER, code);
      if ("MolecularSequence".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.MOLECULARSEQUENCE, code);
      if ("NamingSystem".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.NAMINGSYSTEM, code);
      if ("NutritionOrder".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.NUTRITIONORDER, code);
      if ("Observation".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.OBSERVATION, code);
      if ("ObservationDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.OBSERVATIONDEFINITION, code);
      if ("OperationDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.OPERATIONDEFINITION, code);
      if ("OperationOutcome".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.OPERATIONOUTCOME, code);
      if ("Organization".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ORGANIZATION, code);
      if ("OrganizationAffiliation".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.ORGANIZATIONAFFILIATION, code);
      if ("Parameters".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PARAMETERS, code);
      if ("Patient".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PATIENT, code);
      if ("PaymentNotice".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PAYMENTNOTICE, code);
      if ("PaymentReconciliation".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PAYMENTRECONCILIATION, code);
      if ("Person".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PERSON, code);
      if ("PlanDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PLANDEFINITION, code);
      if ("Practitioner".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PRACTITIONER, code);
      if ("PractitionerRole".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PRACTITIONERROLE, code);
      if ("Procedure".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PROCEDURE, code);
      if ("Provenance".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.PROVENANCE, code);
      if ("Questionnaire".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.QUESTIONNAIRE, code);
      if ("QuestionnaireResponse".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.QUESTIONNAIRERESPONSE, code);
      if ("RelatedPerson".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RELATEDPERSON, code);
      if ("RequestGroup".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.REQUESTGROUP, code);
      if ("ResearchDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RESEARCHDEFINITION, code);
      if ("ResearchElementDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RESEARCHELEMENTDEFINITION, code);
      if ("ResearchStudy".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RESEARCHSTUDY, code);
      if ("ResearchSubject".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RESEARCHSUBJECT, code);
      if ("Resource".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RESOURCE, code);
      if ("RiskAssessment".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RISKASSESSMENT, code);
      if ("RiskEvidenceSynthesis".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.RISKEVIDENCESYNTHESIS, code);
      if ("Schedule".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SCHEDULE, code);
      if ("SearchParameter".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SEARCHPARAMETER, code);
      if ("ServiceRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SERVICEREQUEST, code);
      if ("Slot".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SLOT, code);
      if ("Specimen".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SPECIMEN, code);
      if ("SpecimenDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SPECIMENDEFINITION, code);
      if ("StructureDefinition".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.STRUCTUREDEFINITION, code);
      if ("StructureMap".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.STRUCTUREMAP, code);
      if ("Subscription".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSCRIPTION, code);
      if ("Substance".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCE, code);
      if ("SubstanceNucleicAcid".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCENUCLEICACID, code);
      if ("SubstancePolymer".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCEPOLYMER, code);
      if ("SubstanceProtein".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCEPROTEIN, code);
      if ("SubstanceReferenceInformation".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCEREFERENCEINFORMATION, code);
      if ("SubstanceSourceMaterial".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCESOURCEMATERIAL, code);
      if ("SubstanceSpecification".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUBSTANCESPECIFICATION, code);
      if ("SupplyDelivery".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUPPLYDELIVERY, code);
      if ("SupplyRequest".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.SUPPLYREQUEST, code);
      if ("Task".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.TASK, code);
      if ("TerminologyCapabilities".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.TERMINOLOGYCAPABILITIES, code);
      if ("TestReport".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.TESTREPORT, code);
      if ("TestScript".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.TESTSCRIPT, code);
      if ("ValueSet".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.VALUESET, code);
      if ("VerificationResult".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.VERIFICATIONRESULT, code);
      if ("VisionPrescription".equals(codeString))
        return new Enumeration<ResourceType>(this, ResourceType.VISIONPRESCRIPTION, code);
      throw new FHIRException("Unknown ResourceType code '" + codeString + "'");
    }

    public String toCode(ResourceType code) {
       if (code == ResourceType.NULL)
           return null;
       if (code == ResourceType.ACCOUNT)
        return "Account";
      if (code == ResourceType.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == ResourceType.ADVERSEEVENT)
        return "AdverseEvent";
      if (code == ResourceType.ALLERGYINTOLERANCE)
        return "AllergyIntolerance";
      if (code == ResourceType.APPOINTMENT)
        return "Appointment";
      if (code == ResourceType.APPOINTMENTRESPONSE)
        return "AppointmentResponse";
      if (code == ResourceType.AUDITEVENT)
        return "AuditEvent";
      if (code == ResourceType.BASIC)
        return "Basic";
      if (code == ResourceType.BINARY)
        return "Binary";
      if (code == ResourceType.BIOLOGICALLYDERIVEDPRODUCT)
        return "BiologicallyDerivedProduct";
      if (code == ResourceType.BODYSTRUCTURE)
        return "BodyStructure";
      if (code == ResourceType.BUNDLE)
        return "Bundle";
      if (code == ResourceType.CAPABILITYSTATEMENT)
        return "CapabilityStatement";
      if (code == ResourceType.CAREPLAN)
        return "CarePlan";
      if (code == ResourceType.CARETEAM)
        return "CareTeam";
      if (code == ResourceType.CATALOGENTRY)
        return "CatalogEntry";
      if (code == ResourceType.CHARGEITEM)
        return "ChargeItem";
      if (code == ResourceType.CHARGEITEMDEFINITION)
        return "ChargeItemDefinition";
      if (code == ResourceType.CLAIM)
        return "Claim";
      if (code == ResourceType.CLAIMRESPONSE)
        return "ClaimResponse";
      if (code == ResourceType.CLINICALIMPRESSION)
        return "ClinicalImpression";
      if (code == ResourceType.CODESYSTEM)
        return "CodeSystem";
      if (code == ResourceType.COMMUNICATION)
        return "Communication";
      if (code == ResourceType.COMMUNICATIONREQUEST)
        return "CommunicationRequest";
      if (code == ResourceType.COMPARTMENTDEFINITION)
        return "CompartmentDefinition";
      if (code == ResourceType.COMPOSITION)
        return "Composition";
      if (code == ResourceType.CONCEPTMAP)
        return "ConceptMap";
      if (code == ResourceType.CONDITION)
        return "Condition";
      if (code == ResourceType.CONSENT)
        return "Consent";
      if (code == ResourceType.CONTRACT)
        return "Contract";
      if (code == ResourceType.COVERAGE)
        return "Coverage";
      if (code == ResourceType.COVERAGEELIGIBILITYREQUEST)
        return "CoverageEligibilityRequest";
      if (code == ResourceType.COVERAGEELIGIBILITYRESPONSE)
        return "CoverageEligibilityResponse";
      if (code == ResourceType.DETECTEDISSUE)
        return "DetectedIssue";
      if (code == ResourceType.DEVICE)
        return "Device";
      if (code == ResourceType.DEVICEDEFINITION)
        return "DeviceDefinition";
      if (code == ResourceType.DEVICEMETRIC)
        return "DeviceMetric";
      if (code == ResourceType.DEVICEREQUEST)
        return "DeviceRequest";
      if (code == ResourceType.DEVICEUSESTATEMENT)
        return "DeviceUseStatement";
      if (code == ResourceType.DIAGNOSTICREPORT)
        return "DiagnosticReport";
      if (code == ResourceType.DOCUMENTMANIFEST)
        return "DocumentManifest";
      if (code == ResourceType.DOCUMENTREFERENCE)
        return "DocumentReference";
      if (code == ResourceType.DOMAINRESOURCE)
        return "DomainResource";
      if (code == ResourceType.EFFECTEVIDENCESYNTHESIS)
        return "EffectEvidenceSynthesis";
      if (code == ResourceType.ENCOUNTER)
        return "Encounter";
      if (code == ResourceType.ENDPOINT)
        return "Endpoint";
      if (code == ResourceType.ENROLLMENTREQUEST)
        return "EnrollmentRequest";
      if (code == ResourceType.ENROLLMENTRESPONSE)
        return "EnrollmentResponse";
      if (code == ResourceType.EPISODEOFCARE)
        return "EpisodeOfCare";
      if (code == ResourceType.EVENTDEFINITION)
        return "EventDefinition";
      if (code == ResourceType.EVIDENCE)
        return "Evidence";
      if (code == ResourceType.EVIDENCEVARIABLE)
        return "EvidenceVariable";
      if (code == ResourceType.EXAMPLESCENARIO)
        return "ExampleScenario";
      if (code == ResourceType.EXPLANATIONOFBENEFIT)
        return "ExplanationOfBenefit";
      if (code == ResourceType.FAMILYMEMBERHISTORY)
        return "FamilyMemberHistory";
      if (code == ResourceType.FLAG)
        return "Flag";
      if (code == ResourceType.GOAL)
        return "Goal";
      if (code == ResourceType.GRAPHDEFINITION)
        return "GraphDefinition";
      if (code == ResourceType.GROUP)
        return "Group";
      if (code == ResourceType.GUIDANCERESPONSE)
        return "GuidanceResponse";
      if (code == ResourceType.HEALTHCARESERVICE)
        return "HealthcareService";
      if (code == ResourceType.IMAGINGSTUDY)
        return "ImagingStudy";
      if (code == ResourceType.IMMUNIZATION)
        return "Immunization";
      if (code == ResourceType.IMMUNIZATIONEVALUATION)
        return "ImmunizationEvaluation";
      if (code == ResourceType.IMMUNIZATIONRECOMMENDATION)
        return "ImmunizationRecommendation";
      if (code == ResourceType.IMPLEMENTATIONGUIDE)
        return "ImplementationGuide";
      if (code == ResourceType.INSURANCEPLAN)
        return "InsurancePlan";
      if (code == ResourceType.INVOICE)
        return "Invoice";
      if (code == ResourceType.LIBRARY)
        return "Library";
      if (code == ResourceType.LINKAGE)
        return "Linkage";
      if (code == ResourceType.LIST)
        return "List";
      if (code == ResourceType.LOCATION)
        return "Location";
      if (code == ResourceType.MEASURE)
        return "Measure";
      if (code == ResourceType.MEASUREREPORT)
        return "MeasureReport";
      if (code == ResourceType.MEDIA)
        return "Media";
      if (code == ResourceType.MEDICATION)
        return "Medication";
      if (code == ResourceType.MEDICATIONADMINISTRATION)
        return "MedicationAdministration";
      if (code == ResourceType.MEDICATIONDISPENSE)
        return "MedicationDispense";
      if (code == ResourceType.MEDICATIONKNOWLEDGE)
        return "MedicationKnowledge";
      if (code == ResourceType.MEDICATIONREQUEST)
        return "MedicationRequest";
      if (code == ResourceType.MEDICATIONSTATEMENT)
        return "MedicationStatement";
      if (code == ResourceType.MEDICINALPRODUCT)
        return "MedicinalProduct";
      if (code == ResourceType.MEDICINALPRODUCTAUTHORIZATION)
        return "MedicinalProductAuthorization";
      if (code == ResourceType.MEDICINALPRODUCTCONTRAINDICATION)
        return "MedicinalProductContraindication";
      if (code == ResourceType.MEDICINALPRODUCTINDICATION)
        return "MedicinalProductIndication";
      if (code == ResourceType.MEDICINALPRODUCTINGREDIENT)
        return "MedicinalProductIngredient";
      if (code == ResourceType.MEDICINALPRODUCTINTERACTION)
        return "MedicinalProductInteraction";
      if (code == ResourceType.MEDICINALPRODUCTMANUFACTURED)
        return "MedicinalProductManufactured";
      if (code == ResourceType.MEDICINALPRODUCTPACKAGED)
        return "MedicinalProductPackaged";
      if (code == ResourceType.MEDICINALPRODUCTPHARMACEUTICAL)
        return "MedicinalProductPharmaceutical";
      if (code == ResourceType.MEDICINALPRODUCTUNDESIRABLEEFFECT)
        return "MedicinalProductUndesirableEffect";
      if (code == ResourceType.MESSAGEDEFINITION)
        return "MessageDefinition";
      if (code == ResourceType.MESSAGEHEADER)
        return "MessageHeader";
      if (code == ResourceType.MOLECULARSEQUENCE)
        return "MolecularSequence";
      if (code == ResourceType.NAMINGSYSTEM)
        return "NamingSystem";
      if (code == ResourceType.NUTRITIONORDER)
        return "NutritionOrder";
      if (code == ResourceType.OBSERVATION)
        return "Observation";
      if (code == ResourceType.OBSERVATIONDEFINITION)
        return "ObservationDefinition";
      if (code == ResourceType.OPERATIONDEFINITION)
        return "OperationDefinition";
      if (code == ResourceType.OPERATIONOUTCOME)
        return "OperationOutcome";
      if (code == ResourceType.ORGANIZATION)
        return "Organization";
      if (code == ResourceType.ORGANIZATIONAFFILIATION)
        return "OrganizationAffiliation";
      if (code == ResourceType.PARAMETERS)
        return "Parameters";
      if (code == ResourceType.PATIENT)
        return "Patient";
      if (code == ResourceType.PAYMENTNOTICE)
        return "PaymentNotice";
      if (code == ResourceType.PAYMENTRECONCILIATION)
        return "PaymentReconciliation";
      if (code == ResourceType.PERSON)
        return "Person";
      if (code == ResourceType.PLANDEFINITION)
        return "PlanDefinition";
      if (code == ResourceType.PRACTITIONER)
        return "Practitioner";
      if (code == ResourceType.PRACTITIONERROLE)
        return "PractitionerRole";
      if (code == ResourceType.PROCEDURE)
        return "Procedure";
      if (code == ResourceType.PROVENANCE)
        return "Provenance";
      if (code == ResourceType.QUESTIONNAIRE)
        return "Questionnaire";
      if (code == ResourceType.QUESTIONNAIRERESPONSE)
        return "QuestionnaireResponse";
      if (code == ResourceType.RELATEDPERSON)
        return "RelatedPerson";
      if (code == ResourceType.REQUESTGROUP)
        return "RequestGroup";
      if (code == ResourceType.RESEARCHDEFINITION)
        return "ResearchDefinition";
      if (code == ResourceType.RESEARCHELEMENTDEFINITION)
        return "ResearchElementDefinition";
      if (code == ResourceType.RESEARCHSTUDY)
        return "ResearchStudy";
      if (code == ResourceType.RESEARCHSUBJECT)
        return "ResearchSubject";
      if (code == ResourceType.RESOURCE)
        return "Resource";
      if (code == ResourceType.RISKASSESSMENT)
        return "RiskAssessment";
      if (code == ResourceType.RISKEVIDENCESYNTHESIS)
        return "RiskEvidenceSynthesis";
      if (code == ResourceType.SCHEDULE)
        return "Schedule";
      if (code == ResourceType.SEARCHPARAMETER)
        return "SearchParameter";
      if (code == ResourceType.SERVICEREQUEST)
        return "ServiceRequest";
      if (code == ResourceType.SLOT)
        return "Slot";
      if (code == ResourceType.SPECIMEN)
        return "Specimen";
      if (code == ResourceType.SPECIMENDEFINITION)
        return "SpecimenDefinition";
      if (code == ResourceType.STRUCTUREDEFINITION)
        return "StructureDefinition";
      if (code == ResourceType.STRUCTUREMAP)
        return "StructureMap";
      if (code == ResourceType.SUBSCRIPTION)
        return "Subscription";
      if (code == ResourceType.SUBSTANCE)
        return "Substance";
      if (code == ResourceType.SUBSTANCENUCLEICACID)
        return "SubstanceNucleicAcid";
      if (code == ResourceType.SUBSTANCEPOLYMER)
        return "SubstancePolymer";
      if (code == ResourceType.SUBSTANCEPROTEIN)
        return "SubstanceProtein";
      if (code == ResourceType.SUBSTANCEREFERENCEINFORMATION)
        return "SubstanceReferenceInformation";
      if (code == ResourceType.SUBSTANCESOURCEMATERIAL)
        return "SubstanceSourceMaterial";
      if (code == ResourceType.SUBSTANCESPECIFICATION)
        return "SubstanceSpecification";
      if (code == ResourceType.SUPPLYDELIVERY)
        return "SupplyDelivery";
      if (code == ResourceType.SUPPLYREQUEST)
        return "SupplyRequest";
      if (code == ResourceType.TASK)
        return "Task";
      if (code == ResourceType.TERMINOLOGYCAPABILITIES)
        return "TerminologyCapabilities";
      if (code == ResourceType.TESTREPORT)
        return "TestReport";
      if (code == ResourceType.TESTSCRIPT)
        return "TestScript";
      if (code == ResourceType.VALUESET)
        return "ValueSet";
      if (code == ResourceType.VERIFICATIONRESULT)
        return "VerificationResult";
      if (code == ResourceType.VISIONPRESCRIPTION)
        return "VisionPrescription";
      return "?";
   }

    public String toSystem(ResourceType code) {
      return code.getSystem();
    }
  }

  public enum SearchParamType {
    /**
     * Search parameter SHALL be a number (a whole number, or a decimal).
     */
    NUMBER,
    /**
     * Search parameter is on a date/time. The date format is the standard XML
     * format, though other formats may be supported.
     */
    DATE,
    /**
     * Search parameter is a simple string, like a name part. Search is
     * case-insensitive and accent-insensitive. May match just the start of a
     * string. String parameters may contain spaces.
     */
    STRING,
    /**
     * Search parameter on a coded element or identifier. May be used to search
     * through the text, display, code and code/codesystem (for codes) and label,
     * system and key (for identifier). Its value is either a string or a pair of
     * namespace and value, separated by a "|", depending on the modifier used.
     */
    TOKEN,
    /**
     * A reference to another resource (Reference or canonical).
     */
    REFERENCE,
    /**
     * A composite search parameter that combines a search on two values together.
     */
    COMPOSITE,
    /**
     * A search parameter that searches on a quantity.
     */
    QUANTITY,
    /**
     * A search parameter that searches on a URI (RFC 3986).
     */
    URI,
    /**
     * Special logic applies to this parameter per the description of the search
     * parameter.
     */
    SPECIAL,
    /**
     * added to help the parsers
     */
    NULL;

    public static SearchParamType fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("number".equals(codeString))
        return NUMBER;
      if ("date".equals(codeString))
        return DATE;
      if ("string".equals(codeString))
        return STRING;
      if ("token".equals(codeString))
        return TOKEN;
      if ("reference".equals(codeString))
        return REFERENCE;
      if ("composite".equals(codeString))
        return COMPOSITE;
      if ("quantity".equals(codeString))
        return QUANTITY;
      if ("uri".equals(codeString))
        return URI;
      if ("special".equals(codeString))
        return SPECIAL;
      throw new FHIRException("Unknown SearchParamType code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case NUMBER:
        return "number";
      case DATE:
        return "date";
      case STRING:
        return "string";
      case TOKEN:
        return "token";
      case REFERENCE:
        return "reference";
      case COMPOSITE:
        return "composite";
      case QUANTITY:
        return "quantity";
      case URI:
        return "uri";
      case SPECIAL:
        return "special";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case NUMBER:
        return "http://hl7.org/fhir/search-param-type";
      case DATE:
        return "http://hl7.org/fhir/search-param-type";
      case STRING:
        return "http://hl7.org/fhir/search-param-type";
      case TOKEN:
        return "http://hl7.org/fhir/search-param-type";
      case REFERENCE:
        return "http://hl7.org/fhir/search-param-type";
      case COMPOSITE:
        return "http://hl7.org/fhir/search-param-type";
      case QUANTITY:
        return "http://hl7.org/fhir/search-param-type";
      case URI:
        return "http://hl7.org/fhir/search-param-type";
      case SPECIAL:
        return "http://hl7.org/fhir/search-param-type";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case NUMBER:
        return "Search parameter SHALL be a number (a whole number, or a decimal).";
      case DATE:
        return "Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.";
      case STRING:
        return "Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.";
      case TOKEN:
        return "Search parameter on a coded element or identifier. May be used to search through the text, display, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a \"|\", depending on the modifier used.";
      case REFERENCE:
        return "A reference to another resource (Reference or canonical).";
      case COMPOSITE:
        return "A composite search parameter that combines a search on two values together.";
      case QUANTITY:
        return "A search parameter that searches on a quantity.";
      case URI:
        return "A search parameter that searches on a URI (RFC 3986).";
      case SPECIAL:
        return "Special logic applies to this parameter per the description of the search parameter.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case NUMBER:
        return "Number";
      case DATE:
        return "Date/DateTime";
      case STRING:
        return "String";
      case TOKEN:
        return "Token";
      case REFERENCE:
        return "Reference";
      case COMPOSITE:
        return "Composite";
      case QUANTITY:
        return "Quantity";
      case URI:
        return "URI";
      case SPECIAL:
        return "Special";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class SearchParamTypeEnumFactory implements EnumFactory<SearchParamType> {
    public SearchParamType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("number".equals(codeString))
        return SearchParamType.NUMBER;
      if ("date".equals(codeString))
        return SearchParamType.DATE;
      if ("string".equals(codeString))
        return SearchParamType.STRING;
      if ("token".equals(codeString))
        return SearchParamType.TOKEN;
      if ("reference".equals(codeString))
        return SearchParamType.REFERENCE;
      if ("composite".equals(codeString))
        return SearchParamType.COMPOSITE;
      if ("quantity".equals(codeString))
        return SearchParamType.QUANTITY;
      if ("uri".equals(codeString))
        return SearchParamType.URI;
      if ("special".equals(codeString))
        return SearchParamType.SPECIAL;
      throw new IllegalArgumentException("Unknown SearchParamType code '" + codeString + "'");
    }

    public Enumeration<SearchParamType> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<SearchParamType>(this, SearchParamType.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.NULL, code);
      if ("number".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.NUMBER, code);
      if ("date".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.DATE, code);
      if ("string".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.STRING, code);
      if ("token".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.TOKEN, code);
      if ("reference".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.REFERENCE, code);
      if ("composite".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.COMPOSITE, code);
      if ("quantity".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.QUANTITY, code);
      if ("uri".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.URI, code);
      if ("special".equals(codeString))
        return new Enumeration<SearchParamType>(this, SearchParamType.SPECIAL, code);
      throw new FHIRException("Unknown SearchParamType code '" + codeString + "'");
    }

    public String toCode(SearchParamType code) {
       if (code == SearchParamType.NULL)
           return null;
       if (code == SearchParamType.NUMBER)
        return "number";
      if (code == SearchParamType.DATE)
        return "date";
      if (code == SearchParamType.STRING)
        return "string";
      if (code == SearchParamType.TOKEN)
        return "token";
      if (code == SearchParamType.REFERENCE)
        return "reference";
      if (code == SearchParamType.COMPOSITE)
        return "composite";
      if (code == SearchParamType.QUANTITY)
        return "quantity";
      if (code == SearchParamType.URI)
        return "uri";
      if (code == SearchParamType.SPECIAL)
        return "special";
      return "?";
   }

    public String toSystem(SearchParamType code) {
      return code.getSystem();
    }
  }

  public enum SpecialValues {
    /**
     * Boolean true.
     */
    TRUE,
    /**
     * Boolean false.
     */
    FALSE,
    /**
     * The content is greater than zero, but too small to be quantified.
     */
    TRACE,
    /**
     * The specific quantity is not known, but is known to be non-zero and is not
     * specified because it makes up the bulk of the material.
     */
    SUFFICIENT,
    /**
     * The value is no longer available.
     */
    WITHDRAWN,
    /**
     * The are no known applicable values in this context.
     */
    NILKNOWN,
    /**
     * added to help the parsers
     */
    NULL;

    public static SpecialValues fromCode(String codeString) throws FHIRException {
      if (codeString == null || "".equals(codeString))
        return null;
      if ("true".equals(codeString))
        return TRUE;
      if ("false".equals(codeString))
        return FALSE;
      if ("trace".equals(codeString))
        return TRACE;
      if ("sufficient".equals(codeString))
        return SUFFICIENT;
      if ("withdrawn".equals(codeString))
        return WITHDRAWN;
      if ("nil-known".equals(codeString))
        return NILKNOWN;
      throw new FHIRException("Unknown SpecialValues code '" + codeString + "'");
    }

    public String toCode() {
      switch (this) {
      case TRUE:
        return "true";
      case FALSE:
        return "false";
      case TRACE:
        return "trace";
      case SUFFICIENT:
        return "sufficient";
      case WITHDRAWN:
        return "withdrawn";
      case NILKNOWN:
        return "nil-known";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getSystem() {
      switch (this) {
      case TRUE:
        return "http://terminology.hl7.org/CodeSystem/special-values";
      case FALSE:
        return "http://terminology.hl7.org/CodeSystem/special-values";
      case TRACE:
        return "http://terminology.hl7.org/CodeSystem/special-values";
      case SUFFICIENT:
        return "http://terminology.hl7.org/CodeSystem/special-values";
      case WITHDRAWN:
        return "http://terminology.hl7.org/CodeSystem/special-values";
      case NILKNOWN:
        return "http://terminology.hl7.org/CodeSystem/special-values";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDefinition() {
      switch (this) {
      case TRUE:
        return "Boolean true.";
      case FALSE:
        return "Boolean false.";
      case TRACE:
        return "The content is greater than zero, but too small to be quantified.";
      case SUFFICIENT:
        return "The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material.";
      case WITHDRAWN:
        return "The value is no longer available.";
      case NILKNOWN:
        return "The are no known applicable values in this context.";
      case NULL:
        return null;
      default:
        return "?";
      }
    }

    public String getDisplay() {
      switch (this) {
      case TRUE:
        return "true";
      case FALSE:
        return "false";
      case TRACE:
        return "Trace Amount Detected";
      case SUFFICIENT:
        return "Sufficient Quantity";
      case WITHDRAWN:
        return "Value Withdrawn";
      case NILKNOWN:
        return "Nil Known";
      case NULL:
        return null;
      default:
        return "?";
      }
    }
  }

  public static class SpecialValuesEnumFactory implements EnumFactory<SpecialValues> {
    public SpecialValues fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
        if (codeString == null || "".equals(codeString))
          return null;
      if ("true".equals(codeString))
        return SpecialValues.TRUE;
      if ("false".equals(codeString))
        return SpecialValues.FALSE;
      if ("trace".equals(codeString))
        return SpecialValues.TRACE;
      if ("sufficient".equals(codeString))
        return SpecialValues.SUFFICIENT;
      if ("withdrawn".equals(codeString))
        return SpecialValues.WITHDRAWN;
      if ("nil-known".equals(codeString))
        return SpecialValues.NILKNOWN;
      throw new IllegalArgumentException("Unknown SpecialValues code '" + codeString + "'");
    }

    public Enumeration<SpecialValues> fromType(PrimitiveType<?> code) throws FHIRException {
      if (code == null)
        return null;
      if (code.isEmpty())
        return new Enumeration<SpecialValues>(this, SpecialValues.NULL, code);
      String codeString = code.asStringValue();
      if (codeString == null || "".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.NULL, code);
      if ("true".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.TRUE, code);
      if ("false".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.FALSE, code);
      if ("trace".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.TRACE, code);
      if ("sufficient".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.SUFFICIENT, code);
      if ("withdrawn".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.WITHDRAWN, code);
      if ("nil-known".equals(codeString))
        return new Enumeration<SpecialValues>(this, SpecialValues.NILKNOWN, code);
      throw new FHIRException("Unknown SpecialValues code '" + codeString + "'");
    }

    public String toCode(SpecialValues code) {
       if (code == SpecialValues.NULL)
           return null;
       if (code == SpecialValues.TRUE)
        return "true";
      if (code == SpecialValues.FALSE)
        return "false";
      if (code == SpecialValues.TRACE)
        return "trace";
      if (code == SpecialValues.SUFFICIENT)
        return "sufficient";
      if (code == SpecialValues.WITHDRAWN)
        return "withdrawn";
      if (code == SpecialValues.NILKNOWN)
        return "nil-known";
      return "?";
   }

    public String toSystem(SpecialValues code) {
      return code.getSystem();
    }
  }

}

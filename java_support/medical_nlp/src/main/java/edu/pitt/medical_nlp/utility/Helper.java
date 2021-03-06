package edu.pitt.medical_nlp.utility;

public class Helper {
	public static PartOfSpeech mapPartOfSpeech(String postag) {
		PartOfSpeech partOfSpeech = PartOfSpeech.OTHER;
		switch (postag) {
		case "NN":
		case "NNS":
		case "NNP":
		case "NNPS":
			partOfSpeech = PartOfSpeech.NOUN;
			break;
		case "VB":
		case "VBD":
		case "VBG":
		case "VBN":
		case "VBP":
		case "VBZ":
			partOfSpeech = PartOfSpeech.VERB;
			break;
		case "JJ":
		case "JJR":
		case "JJS":
			partOfSpeech = PartOfSpeech.ADJECTIVE;
			break;
		case "RB":
		case "RBR":
		case "RBS":
			partOfSpeech = PartOfSpeech.ADVERB;
			break;
		default:
			partOfSpeech = PartOfSpeech.OTHER;
			break;
		}
		return partOfSpeech;
	}

	public static DependencyType mapRelationTypes(String dependencyShortName) {
		DependencyType mappedRelType = DependencyType.OtherLocalType;
		switch (dependencyShortName) {
		case "amod":
			mappedRelType = DependencyType.AdjectiveModifer;
			break;
		case "neg":
			mappedRelType = DependencyType.Negative;
			break;
		case "nsubj":
			mappedRelType = DependencyType.NominalSubject;
			break;
		case "nmod":
			mappedRelType = DependencyType.NounModifer;
			break;
		case "compound":
		case "conj":
			mappedRelType = DependencyType.Compound;
			break;
		default:
			mappedRelType = DependencyType.OtherLocalType;
			break;
		}
		return mappedRelType;
	}
	
	public static int setBit(int val, int pos, boolean flag) {
		if (flag) {
			val |= (1 << pos);
		}
		return val;
	}

	public static boolean getBit(int val, int pos) {
		return (val >> pos) % 2 > 0;
	}
}

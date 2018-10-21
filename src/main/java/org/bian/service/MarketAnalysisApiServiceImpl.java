/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketAnalysisApiServiceImpl implements MarketAnalysisApiService {

	public MarketAnalysisRecordResponse record(String crReferenceId, MarketAnalysisRecordRequest request){
		return JsonReader.read("record-MarketAnalysisRecordResponse.json",new TypeReference<MarketAnalysisRecordResponse>(){});
	}
	
	public MarketAnalysisBaseWithId requestPost(MarketAnalysisBase request){
		return JsonReader.read("requestPost-MarketAnalysisBaseWithId.json",new TypeReference<MarketAnalysisBaseWithId>(){});
	}
	
	public MarketAnalysisBaseWithId requestPut(String crReferenceId, MarketAnalysisBase request){
		return JsonReader.read("requestPut-MarketAnalysisBaseWithId.json",new TypeReference<MarketAnalysisBaseWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public MarketAnalysisBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-MarketAnalysisBaseWithId.json",new TypeReference<MarketAnalysisBaseWithId>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public MarketAnalysisAlgorithmBaseWithIdAndRoot retrieveAlgorithms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-MarketAnalysisAlgorithmBaseWithIdAndRoot.json",new TypeReference<MarketAnalysisAlgorithmBaseWithIdAndRoot>(){});
	}
	
}

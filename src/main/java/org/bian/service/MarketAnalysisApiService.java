/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketAnalysisApiService {

	MarketAnalysisRecordResponse record(String crReferenceId, MarketAnalysisRecordRequest request);
	
	MarketAnalysisBaseWithId requestPost(MarketAnalysisBase request);
	
	MarketAnalysisBaseWithId requestPut(String crReferenceId, MarketAnalysisBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	MarketAnalysisBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	MarketAnalysisAlgorithmBaseWithIdAndRoot retrieveAlgorithms(String crReferenceId, String bqReferenceId);
	
}

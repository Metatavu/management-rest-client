package fi.metatavu.management.client;

import java.util.Map;

public interface ApiClient {
  
  public <T> ApiResponse<T> doGETRequest(String url, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams);
  
  public <T> ApiResponse<T> doPOSTRequest(String url, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams);
  
  public <T> ApiResponse<T> doPUTRequest(String url, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams);
  
  public <T> ApiResponse<T> doDELETERequest(String url, ResultType<T> resultType, Map<String, Object> queryParams, Map<String, Object> postParams);
  
}
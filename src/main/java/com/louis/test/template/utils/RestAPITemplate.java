/**
 * 
 */
package com.louis.test.template.utils;

import java.util.List;

import lombok.Data;

/**
 * @author huanglu
 *
 */
@Data
public class RestAPITemplate {

	private String id;
	
	private String url;

    private String endpoint;

    private String method;

    private List<String> header;

    private String requestbody;

    private String filter;

    private String path;
    
}

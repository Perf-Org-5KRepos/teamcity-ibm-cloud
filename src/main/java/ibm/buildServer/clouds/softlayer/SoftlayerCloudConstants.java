package ibm.buildServer.clouds.softlayer;

import jetbrains.buildServer.clouds.CloudImageParameters;

public class SoftlayerCloudConstants {
	// SoftlayerCloudClientFactory.java file constants
	public static final String DISPLAY_NAME = "IBM SoftLayer";
	public static final String CLOUD_CODE = "IBMSL";

	// Settings page html/js file name constants
	public static final String SETTINGS_JSP_PAGE = "softlayer-cloud-settings.jsp";
	public static final String SETTINGS_HTML_PAGE = "softlayer-cloud-settings.html";
	public static final String CHECK_CONNECTION_HTML_PAGE = "softlayer-check-connection.html";
	public static final String DELETE_IMAGE_HTML_PAGE = "softlayer-delete-image.html";
	public static final String DELETE_IMAGE_JSP_PAGE = "softlayer-delete-image.jsp";
	

	// Settings page field name constants
	public static final String USER_NAME = "IBMSL_username";
	public static final String API_KEY = "IBMSL_apiKey";
	public static final String VSI_TEMPLATE_LIST = "IBMSL_vsiTemplate";
	public static final String DATACENTER_LIST = "IBMSL_datacenter";
	public static final String AGENT_NAME = "IBMSL_agentName";
	public static final String INSTANCE_NUMBER = "IBMSL_instanceNumber";
	public static final String MAX_MEMORY = "IBMSL_maxMemory";
	public static final String MAX_CORES = "IBMSL_maxCores";
	public static final String DISK_TYPE = "IBMSL_diskType";
	public static final String NETWORK = "IBMSL_network";
	public static final String DOMAIN_NAME = "IBMSL_domainName";
	
	public static final String PROFILE_ID = "profileId";
	public static final String SOURCE_ID = "source-id";
	
	public static final String SECURE_API_KEY = "secure:"+API_KEY;

	
	public String getUsername() {
		return USER_NAME;
	}

	public String getApiKey() {
		return API_KEY;
	}

	public String getVsiTemplateList() {
		return VSI_TEMPLATE_LIST;
	}

	public String getDatacenterList() {
		return DATACENTER_LIST;
	}

	public String getAgentName() {
		return AGENT_NAME;
	}

	public String getInstanceNumber() {
		return INSTANCE_NUMBER;
	}

	public String getMaxMemory() {
		return MAX_MEMORY;
	}

	public String getMaxCores() {
		return MAX_CORES;
	}

	public String getDiskType() {
		return DISK_TYPE;
	}

	public String getNetwork() {
		return NETWORK;
	}

	public String getDomainName() {
		return DOMAIN_NAME;
	}
	
	public String getAgentPoolIdField() {
		return CloudImageParameters.AGENT_POOL_ID_FIELD;
	}

}

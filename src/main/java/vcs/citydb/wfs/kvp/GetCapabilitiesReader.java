package vcs.citydb.wfs.kvp;

import java.util.Map;

import net.opengis.wfs._2.GetCapabilitiesType;
import vcs.citydb.wfs.config.WFSConfig;
import vcs.citydb.wfs.exception.KVPParseException;
import vcs.citydb.wfs.exception.WFSException;
import vcs.citydb.wfs.exception.WFSExceptionCode;
import vcs.citydb.wfs.kvp.parser.AcceptVersionsParser;
import vcs.citydb.wfs.kvp.parser.StringParser;

public class GetCapabilitiesReader extends KVPRequestReader {

	public GetCapabilitiesReader(Map<String, String> parameters, WFSConfig wfsConfig) {
		super(parameters, wfsConfig);
	}
	
	@Override
	public GetCapabilitiesType readRequest() throws WFSException {
		GetCapabilitiesType wfsRequest = new GetCapabilitiesType();

		try {
			if (parameters.containsKey(KVPConstants.SERVICE))
				wfsRequest.setService(new StringParser().parse(KVPConstants.SERVICE, parameters.get(KVPConstants.SERVICE)));

			if (parameters.containsKey(KVPConstants.ACCEPT_VERSIONS))
				wfsRequest.setAcceptVersions(new AcceptVersionsParser().parse(KVPConstants.ACCEPT_VERSIONS, parameters.get(KVPConstants.ACCEPT_VERSIONS)));

		} catch (KVPParseException e) {
			throw new WFSException(WFSExceptionCode.INVALID_PARAMETER_VALUE, e.getMessage(), e.getCause());
		}

		return wfsRequest;
	}

}
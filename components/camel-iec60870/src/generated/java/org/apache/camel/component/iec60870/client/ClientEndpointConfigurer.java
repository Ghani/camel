/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.iec60870.client;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ClientEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ClientEndpoint target = (ClientEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "datamoduleoptions":
        case "dataModuleOptions": target.getConnectionOptions().setDataModuleOptions(property(camelContext, org.eclipse.neoscada.protocol.iec60870.client.data.DataModuleOptions.class, value)); return true;
        case "protocoloptions":
        case "protocolOptions": target.getConnectionOptions().setProtocolOptions(property(camelContext, org.eclipse.neoscada.protocol.iec60870.ProtocolOptions.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "acknowledgewindow":
        case "acknowledgeWindow": target.getConnectionOptions().setAcknowledgeWindow(property(camelContext, short.class, value)); return true;
        case "adsuaddresstype":
        case "adsuAddressType": target.getConnectionOptions().setAdsuAddressType(property(camelContext, org.eclipse.neoscada.protocol.iec60870.ASDUAddressType.class, value)); return true;
        case "causeoftransmissiontype":
        case "causeOfTransmissionType": target.getConnectionOptions().setCauseOfTransmissionType(property(camelContext, org.eclipse.neoscada.protocol.iec60870.CauseOfTransmissionType.class, value)); return true;
        case "informationobjectaddresstype":
        case "informationObjectAddressType": target.getConnectionOptions().setInformationObjectAddressType(property(camelContext, org.eclipse.neoscada.protocol.iec60870.InformationObjectAddressType.class, value)); return true;
        case "maxunacknowledged":
        case "maxUnacknowledged": target.getConnectionOptions().setMaxUnacknowledged(property(camelContext, short.class, value)); return true;
        case "timeout1": target.getConnectionOptions().setTimeout1(property(camelContext, int.class, value)); return true;
        case "timeout2": target.getConnectionOptions().setTimeout2(property(camelContext, int.class, value)); return true;
        case "timeout3": target.getConnectionOptions().setTimeout3(property(camelContext, int.class, value)); return true;
        case "causesourceaddress":
        case "causeSourceAddress": target.getConnectionOptions().setCauseSourceAddress(property(camelContext, byte.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConnectionOptions().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "ignorebackgroundscan":
        case "ignoreBackgroundScan": target.getConnectionOptions().setIgnoreBackgroundScan(property(camelContext, boolean.class, value)); return true;
        case "ignoredaylightsavingtime":
        case "ignoreDaylightSavingTime": target.getConnectionOptions().setIgnoreDaylightSavingTime(property(camelContext, boolean.class, value)); return true;
        case "timezone":
        case "timeZone": target.getConnectionOptions().setTimeZone(property(camelContext, java.util.TimeZone.class, value)); return true;
        case "connectionid":
        case "connectionId": target.setConnectionId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}


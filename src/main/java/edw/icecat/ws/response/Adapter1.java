
package edw.icecat.ws.response;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return new String(value);
    }

    public String marshal(String value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}

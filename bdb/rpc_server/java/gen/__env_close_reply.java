/*
 * Automatically generated by jrpcgen 0.95.1 on 12/18/01 7:23 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __env_close_reply implements XdrAble {
    public int status;

    public __env_close_reply() {
    }

    public __env_close_reply(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(status);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        status = xdr.xdrDecodeInt();
    }

}
// End of __env_close_reply.java

package io.bitsquare.p2p.routing.messages;

import io.bitsquare.app.Version;

public final class PongMessage implements MaintenanceMessage {
    // That object is sent over the wire, so we need to take care of version compatibility.
    private static final long serialVersionUID = Version.NETWORK_PROTOCOL_VERSION;

    public final int nonce;

    public PongMessage(int nonce) {
        this.nonce = nonce;
    }

    @Override
    public String toString() {
        return "PongMessage{" +
                "nonce=" + nonce +
                '}';
    }
}
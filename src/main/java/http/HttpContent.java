package http;

import common.Writable;

public interface HttpContent extends Writable {
    String getMediaType();    
}

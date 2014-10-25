package com.vine.vinemars.net;

import com.android.volley.toolbox.JsonRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chengfei on 14-10-13.
 */
public abstract class BaseRequest<T> extends JsonRequest<T> {


    public static final String BASE_URL = "http://www.mobo123.com/static/api/app/";
    public BaseRequest(int method, String url, String requestBody, NetworkRequestListener<T> listener) {
        super(method, url, requestBody, listener, listener);
    }


    public static class UrlBuilder {
        String base;

        Map<String, String> params;


        public UrlBuilder() {
            this.base = BASE_URL;
        }
        public UrlBuilder(String base) {
            this.base = base;
            params = new HashMap<String, String>();
        }

        public UrlBuilder addParam(String key, String value) {
            params.put(key, value);
            return this;
        }

        public String create() {
            StringBuilder builder = new StringBuilder(base);
            builder.append("?");
            for (Map.Entry<String, String> entry : params.entrySet()) {
                builder.append(entry.getKey());
                builder.append(entry.getValue());
                builder.append("&");
            }
            builder.deleteCharAt(builder.length() - 1);
            return builder.toString();
        }
    }

}

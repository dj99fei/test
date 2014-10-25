package com.vine.vinemars.net;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.vine.vinemars.domain.Version;

import java.io.UnsupportedEncodingException;

/**
 * Created by chengfei on 14-10-21.
 */
public class CheckUpdateRequest extends BaseRequest<Version> {


    public static final String URL = BASE_URL + "version.php";
    public CheckUpdateRequest(NetworkRequestListener<Version> listener) {
        super(Method.GET, URL, null, listener);
    }

    @Override
    protected Response<Version> parseNetworkResponse(NetworkResponse response) {

        try {
            String jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            Gson gson = new Gson();
            Version result = gson.fromJson(jsonString, Version.class);
            return Response.success(result, HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }
    }


}

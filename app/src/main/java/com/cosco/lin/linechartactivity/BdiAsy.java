package com.cosco.lin.linechartactivity;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;

import java.net.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Administrator on 2015/9/17.
 */
public class BdiAsy extends AsyncTask<Void, Void, Void> {
    private JSONArray jsonArray;




    public BdiAsy() {
    }
    @Override
    protected Void doInBackground(Void...param) {
        String url=null;
        url = "http://www.cnss.com.cn/caches/task/exponent/bdi/year.json";

        HttpURLConnection..
        HttpClient httpClient = new DefaultHttpClient();
        //仿地址链接直接跟参数，如：http://127.0.0.1:8080/test/test.php?name=;
        HttpGet httpGet = new HttpGet(url);
        HttpResponse httpResponse;
        String result = null;

        try {
            httpResponse = httpClient.execute(httpGet);
            if(httpResponse.getStatusLine().getStatusCode()==200){
                result = EntityUtils.toString(httpResponse.getEntity());

            }
            jsonArray = new JSONArray(result);
            Log.e("jsonInAsy", jsonArray.toString());
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }
    @Override
    protected void onPostExecute(Void result) {
        return ;
    }


}

package one.aiouyang.community.provider;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import one.aiouyang.community.dto.AccessTokenDTO;
import one.aiouyang.community.dto.GithubUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * @Description:
 * @Author: Andy
 * @version: 1.0
 * @Date: 2022/11/23 15:36
 */
@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }
    public GithubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
        .url("https://api.github.com/user")
                .header("Authorization", "token" + accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string,GithubUser.class);
            return githubUser;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

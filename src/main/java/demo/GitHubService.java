package demo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

class Result {
  public PostBody json;
}

class PostBody {
  public String user;
  public String hello;

  public PostBody(String user, String hello) {
    this.user = user;
    this.hello = hello;
  }

  @Override
  public String toString() {
    return "PostBody{user='" + user + '\'' + ", hello='" + hello + '\'' + '}';
  }
}

public interface GitHubService {
  @POST("/post")
  Call<Result> testPost(@Body() PostBody params);
}
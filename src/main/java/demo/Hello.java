package demo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Hello {

  public static void main(String[] args) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://httpbin.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    GitHubService service = retrofit.create(GitHubService.class);
    var result = service.testPost(new PostBody("freewind", "hello!")).execute();
    assert result.body() != null;
    System.out.println(result.body().json);
  }

}

package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C05HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
////        외부에서 데이터를 받아 java의 객체로 변환
////        외부api요청을 하기 위한 라이브러리 : HttpClient-java 내장 클래스
////        RestTemplate, RestClient는 스프링에서 가장 많이 사용하는 클래스
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String data = response.body();
        System.out.println(data);

        ObjectMapper o1 = new ObjectMapper();
        Post myPost = o1.readValue(data, Post.class);
        System.out.println(myPost);

//       리스트형식의 객체로 피싱
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts")).GET().build();
//        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
//        String data2 = response2.body();
//
//        JsonNode jsonNode1 = o1.readTree(data2);
//        List<Post> myPost1 = new ArrayList<>();
//        for (JsonNode j : jsonNode1){
//            Post post = o1.readValue(j.toString(), Post.class);
//            myPost1.add(post);
//        }
//        System.out.println(myPost1);
    }
}
class Post {
    private long userId;
    private long id;
    private String title;
    private String body;


    public long getUserId() {
        return userId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "{" +
                "userId=" + userId +
                ", id=" + id +
                ", tille='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}



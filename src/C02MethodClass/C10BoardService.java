package C02MethodClass;

//        <게시판서비스>
//        1.계좌객체 : Author, Post
//        2.자료구조 : List(authorList, postList)
//        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
//            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//            3-2.회원 전체 목록 조회 : id, email
//            3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
//            3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
//            3-5.게시물 목록 조회 : id(post), title
//            3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C10BoardService {
    public static void main(String[] args) throws IOException {
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("1. 회원가입");
            System.out.println("2. 회원 목록 조회");
            System.out.println("3. 회원 상세 조회");
            System.out.println("4. 게시글 작성");
            System.out.println("5. 게시글 목록 조회");
            System.out.println("6. 게시글 상세 조회");
            System.out.print("번호 입력: ");
            int number = Integer.parseInt(br.readLine());

//            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
                if (number == 1) {
                    System.out.println("회원가입서비스입니다. ");
                    System.out.println("이름: ");
                    String name = br.readLine();
                    System.out.println("이메일: ");
                    String email = br.readLine();
                    System.out.println("비밀번호: ");
                    String password = br.readLine();
                    Author newAuthor = new Author(name, email, password);
                    authorList.add(newAuthor);
                    System.out.println(newAuthor);
//            3-2.회원 전체 목록 조회 : id, email
                } else if (number == 2) {
                    System.out.println("회원 전체 목록입니다.");
                    for (Author author : authorList) {
                        System.out.println("ID: " + author.getId() + "Email: " + author.getEmail());
                    }
//            3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
                } else if (number == 3) {
                    System.out.println("회원상세조회입니다.");
                    System.out.println("회원ID를 입력해주세요. ");
                    long id = Long.parseLong(br.readLine());
                    Author author = null;
                    for (Author a : authorList) {
                        if (a.getId() == id) {
                            author = a;
                            break;
                        }
                    }
                    if (author == null) {
                        System.out.println("해당 ID의 회원이 없습니다.");
                        continue;
                    }

                    int count = 0;
                    for (Post p : postList) {
                        if (p.getAuthor().getId() == id) {
                            count++;
                        }
                    }
                    System.out.println("ID: " + author.getId());
                    System.out.println("이름: " + author.getName());
                    System.out.println("이메일: " + author.getEmail());
                    System.out.println("비밀번호: " + author.getPassword());
                    System.out.println("작성글 수: " + count);


//            3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
                } else if (number == 4) {
                    System.out.println("게시글 작성입니다.");
                    System.out.println("제목: ");
                    String title = br.readLine();
                    System.out.println("내용: ");
                    String contents = br.readLine();
                    System.out.println("이메일: ");
                    String email = br.readLine();

                    Author writer = null;
                    for (Author a : authorList) {
                        if (a.getEmail().equals(email)) {
                            writer = a;
                            break;
                        }
                    }

                    if (writer == null) {
                        System.out.println("해당 이메일의 회원이 없습니다.");
                        continue;
                    }

                    Post post = new Post(title, contents, writer);
                    postList.add(post);
                    System.out.println("게시글 작성: " + post.getId());

//            3-5.게시물 목록 조회 : id(post), title
                } else if (number == 5) {
                    System.out.println("게시물 목록 조회입니다.");

                    if (postList.isEmpty()) {
                        System.out.println("게시글이 없습니다.");
                        continue;
                    }

                    for (Post post : postList) {
                        System.out.println("게시글 ID: " + post.getId() +
                                " | 제목: " + post.getTitle());
                    }
                } else if (number == 6) {
                    System.out.println("게시글 상세 조회입니다.");
                    System.out.print("게시글 ID 입력: ");
                    long postId = Long.parseLong(br.readLine());

                    Post foundPost = null;
                    for (Post p : postList) {
                        if (p.getId() == postId) {
                            foundPost = p;
                            break;
                        }
                    }

                    if (foundPost == null) {
                        System.out.println("해당 게시글이 없습니다.");
                        continue;
                    }

                    System.out.println("게시글 ID: " + foundPost.getId());
                    System.out.println("제목: " + foundPost.getTitle());
                    System.out.println("내용: " + foundPost.getContents());
                    System.out.println("작성자: " + foundPost.getAuthor().getName());
                }


            }

        }


    }

    class Author {
        private String name;
        private String email;
        private String password;
        private long id;
        private static long staticId;

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public long getId() {
            return id;
        }

        public Author(String name, String email, String password) {
            staticId++;
            this.name = name;
            this.email = email;
            this.password = password;
            this.id = staticId;

        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    class Post {
        private long id;
        private String title;
        private String contents;
        private Author author;
        private static long staticId;


        public Post(String title, String contents, Author author) {
            staticId++;
            this.title = title;
            this.contents = contents;
            this.author = author;
            this.id = staticId;
        }


        public long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getContents() {
            return contents;
        }

        public Author getAuthor() {
            return author;
        }

        public static long getStaticId() {
            return staticId;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", contents='" + contents + '\'' +
                    ", author=" + author +
                    '}';
        }
    }

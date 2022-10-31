package A3;
import lombok.Data;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class Blog {
    private List<BlogPost> posts;
    private List<Person> contributors;

    public List<String> getPostByAuthorAge(Integer age) {
        /**
         * returns all the BlogPost that have an author whose age is equal to input "age"
         */
        return posts.stream().filter(post -> contributors.stream().anyMatch
                (contributor -> Objects.equals(contributor.getAge(), age) &&
                        post.getAuthorId().equals(contributor.getId()))).map(BlogPost::getId).collect(Collectors.toList());
    }
}

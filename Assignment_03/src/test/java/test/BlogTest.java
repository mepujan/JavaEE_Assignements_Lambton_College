package test;
import A3.Blog;
import A3.BlogPost;
import A3.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BlogTest {
    @Test
    public void getPostByAuthorAgeTest() throws IOException {
        /**
         * function that checks whether the value returned by getPostByAuthor() function
         * matches the expected value or not
         */
        ObjectMapper mapper = new ObjectMapper();
        List<Person> personList;
        List<BlogPost> blogPosts;
        personList =  mapper.readValue(new File("persons.json"), new TypeReference<List<Person>>(){});
        blogPosts =  mapper.readValue(new File("blogPosts.json"), new TypeReference<List<BlogPost>>(){});
        Blog blog = new Blog();
        blog.setPosts(blogPosts);
        blog.setContributors(personList);
        String expectedId = "123";
        List<String> actualId = blog.getPostByAuthorAge(12);
        assertEquals(expectedId,actualId.get(0));
    }
}

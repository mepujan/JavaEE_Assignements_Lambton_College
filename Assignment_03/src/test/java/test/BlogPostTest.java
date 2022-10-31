package test;

import A3.BlogPost;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {

    @Test
    public void blogPostWithNullId(){
        /**
         * function that checks whether the thrown error message matches
         * the user defined message in the constructor when the id is null.
         */
        RuntimeException errorThrown = assertThrows(RuntimeException.class,()->{
            BlogPost.builder().id(null).authorId("c0842623").postContent("I love coding in Java").build();
        });
        assertEquals("Id Cannot be Null.",errorThrown.getMessage());
    }

    @Test
    public void blogPostWIthNullAuthorId(){
        /**
         * function that checks whether the thrown error message matches
         * the user defined message in the constructor when the authorId is null.
         */
        RuntimeException errorThrown = assertThrows(RuntimeException.class,()->{
            BlogPost.builder().id("124").authorId(null).postContent("I love coding in Java").build();
        });
        assertEquals("Author Id Cannot be Null.",errorThrown.getMessage());
    }

    @Test
    public void blogPostWithAllValidArguments(){
        /**
         * function that checks whether values created when instantiating the object
         * matches the values return by their getter method when called from that instance
         */
        BlogPost blogPost = BlogPost.builder()
                .id("123")
                .authorId("c0842623")
                .postContent("I love coding in Java")
                .build();
        assertEquals("123",blogPost.getId());
        assertEquals("c0842623",blogPost.getAuthorId());
        assertEquals("I love coding in Java",blogPost.getPostContent());
    }

}
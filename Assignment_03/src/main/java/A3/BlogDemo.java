/**
 * Name: Pujan Gautam
 * Student Id: c0842623
 * Assignment-03
 * Date of Submission: 10/28/2022
 */
package A3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BlogDemo {
    public static void main(String [] args) throws IOException {
        //creating instance of object mapper
        ObjectMapper mapper = new ObjectMapper();
        List<Person> personList;
        List<BlogPost> blogPosts;
        //reading value from json file and assigning it to variables
        personList =  mapper.readValue(new File("persons.json"), new TypeReference<List<Person>>(){});
        blogPosts =  mapper.readValue(new File("blogPosts.json"), new TypeReference<List<BlogPost>>(){});
        //instantiating blog object
        Blog blog = new Blog();

        //setting data into blog variables
        blog.setPosts(blogPosts);
        blog.setContributors(personList);

        //printing blog object
        System.out.println(blog.toString());

        //printing list returned by getPostByAuthorAge function
        System.out.println("Get Post By Author Age ::"+blog.getPostByAuthorAge(22));
    }
}

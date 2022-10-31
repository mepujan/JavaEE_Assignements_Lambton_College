package A3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BlogPost {
    private final String id;
    private final String authorId;
    private final String postContent;

    @Jacksonized
    @Builder
    private static BlogPost of(
            @JsonProperty("id") String id,
            @JsonProperty("authorId") String authorId,
            @JsonProperty("postContent") String postContent){
        if(id == null){
            throw new RuntimeException("Id Cannot be Null.");
        }
        if(authorId == null){
            throw new RuntimeException("Author Id Cannot be Null.");
        }
        return new BlogPost(id,authorId,postContent);
    }
}


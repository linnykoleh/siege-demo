package siege.siegedemo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final MongoTemplate mongoTemplate;

    public String createUser(String name, String lastName) {
        var user = new User();
        user.setName(name);
        user.setLastName(lastName);
        return mongoTemplate.save(user).getId();
    }

    public User getUser(String name) {
        return mongoTemplate.find(query(where("name").is(name)), User.class).get(0);
    }

    public void deleteUser(String name) {
        mongoTemplate.remove(query(where("name").is(name)), User.class);
    }
}

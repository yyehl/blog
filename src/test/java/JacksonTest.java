import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
    class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private User user;

    public User getUser() {
        return user;
    }

    public JacksonTest(int id, String name) {
       this.user = new User(id, name);
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void main(String[] args) throws Exception {
        JacksonTest jacksonTest = new JacksonTest(1,"dasdsad");
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(jacksonTest);
        System.out.println(res);
    }
}

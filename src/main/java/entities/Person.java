package entities;
import jakarta.persistence.*;


//J'ai ajouté cette classe pour aider à l'heritage
//cette classe ne doit pas augementer à la base de données

@MappedSuperclass
public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
        private String username;
        private String email;
        private String password;

        public Person() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}


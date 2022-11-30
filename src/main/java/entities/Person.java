package entities;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

//J'ai ajouté cette classe pour aider à l'heritage
//cette classe ne doit pas augementer à la base de données

@MappedSuperclass
public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long idPerson;
        private String username;
        private String email;
        private String password;

        public Long getIdPerson() {
            return idPerson;
        }

        public void setIdPerson(Long idPerson) {
            this.idPerson = idPerson;
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


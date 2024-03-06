
package ENCAPSULATION;

public class FINAL {
  
        private String firstName;
        private String lastName;
        private int age;
      
        public FINAL(){
        }
        public FINAL(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            updateAge();
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

         public String getName()
    {
        return lastName + ", " + firstName;
    }
    
    private Boolean isMinor;

    public Boolean getIsMinor() {
        return isMinor;
    }
    
    public Boolean isMinor()
    {
        return isMinor;
    }

    public void updateAge()
    {
        isMinor = age < 18;
    }
    
    public void increaseAge()
    {
        age++;
        updateAge();  
    }
   
    @Override
    public String toString()
    {
        String ageDetector = isMinor ? "minor" : "adult";
        return getName() + " - " +  age + " - " + ageDetector;
    }
     }





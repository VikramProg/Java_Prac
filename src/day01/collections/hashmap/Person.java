package day01.collections.hashmap;

public class Person {
        private final long number;
        private final String name;
        private final String mailId;

        public Person( String name, long number, String mailId) {
            this.number = number;
            this.name = name;
            this.mailId = mailId;
        }

        public long getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getMailId() {
            return mailId;
        }

        @Override
        public String toString() {
            return "Name: " + this.name + ", Number: " + this.number + ", Mail ID: " + this.mailId;
        }

    }



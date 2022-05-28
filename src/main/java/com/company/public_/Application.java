package com.company.public_;

public class Application {
    public static void main(String[] args) {
        Public_Application app = new Public_ApplicationBuilder()
                .withUsername("postgres")
                .withPassword("1234")
                .build();
    }
}

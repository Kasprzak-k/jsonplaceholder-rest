package com.example.jsonplaceholder.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.example.jsonplaceholder.dto.UserResponseDTO;
import java.util.Scanner;

@Service
public class MyService implements CommandLineRunner {
    private final EventService eventService;
    Scanner scanner = new Scanner(System.in);

    public MyService(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public void run(String... args) throws Exception {
        execute();
    }

    public void execute() {
        System.out.println("Digite o ID do usuário: ");
        Long id = scanner.nextLong();
        System.out.println(
                "qual dado voce deseja saber ? (name, username, email, address, phone, website, company)");
        String escolha = scanner.next();

        UserResponseDTO user = eventService.getEvent(id);
        switch (escolha) {
            case "name":
                System.out.println(">>> NAME OBTIDO NO STARTUP: " + user.name());
                break;
            case "username":
                System.out.println(">>> USERNAME OBTIDO NO STARTUP: " + user.username());
                break;
            case "email":
                System.out.println(">>> EMAIL OBTIDO NO STARTUP: " + user.email());
                break;
            case "address":
                System.out.println(">>> ADDRESS OBTIDO NO STARTUP: " + user.address());
                break;
            case "phone":
                System.out.println(">>> PHONE OBTIDO NO STARTUP: " + user.phone());
                break;
            case "website":
                System.out.println(">>> WEBSITE OBTIDO NO STARTUP: " + user.website());
                break;
            case "company":
                System.out.println(">>> COMPANY OBTIDO NO STARTUP: " + user.company());
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}

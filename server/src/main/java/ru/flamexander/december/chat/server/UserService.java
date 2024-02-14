package ru.flamexander.december.chat.server;

public interface UserService {
    String getUsernameByLoginAndPassword(String login, String password);
    void createNewUser(String login, String password, String username, String role);
    boolean isLoginAlreadyExist(String login);
    boolean isUsernameAlreadyExist(String username);

    //Проверка админ ли юзер
    boolean isUserAdmin(String username);
}
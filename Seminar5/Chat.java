package Seminar5;

interface Chat {
    void sendMessage(String msg, Client user);
    void appendClient(Client user);
    void delClient(Client who, Client whom);
  }
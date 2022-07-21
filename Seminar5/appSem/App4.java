package Seminar5.appSem;

import java.util.ArrayList;
import java.util.List;

public class App4 {
  public static void main(String[] args) {

  }
}

class Msg {
  String text;
}

class Document {

}

class AudioMsg extends Document {
}

class VideoMsg extends Document {
}

class ContentMsg extends Msg {
  ArrayList<Document> content = new ArrayList<>();
}
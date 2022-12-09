public class WordTool {


public int wordCount(String s) {
  int count = 0;
if (!(s == null|| s.isEmpty())) {
  String[]w = s.split("\\s+");
  count = w.length;
} return count;
}

public int symbolCount(String s, boolean withSpaces) {
  int count =0;
  if (!(s == null || s.isEmpty())){
if (withSpaces) {
  count = s.length();
} else {
  count = s.replace(" ", "").length();
}
  } return count;
}

  
}
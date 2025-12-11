public class LogLevels {
    
    public static String message(String logLine) {
      //  throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        int index = logLine.indexOf(':');
        String mainMessage = logLine.substring(index+1);
        mainMessage = mainMessage.trim();
        return mainMessage;
    }

    public static String logLevel(String logLine) {
    //    throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        int indexStart = logLine.indexOf('[');
        int indexEnd = logLine.indexOf(']');
        String log = logLine.substring(indexStart+1,indexEnd);
        log = log.toLowerCase();
        return log;
    }

    public static String reformat(String logLine) {
     //   throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        String newLog = logLevel(logLine);
        newLog = message(logLine) +" (" + newLog + ")";
        return newLog;
    }
}

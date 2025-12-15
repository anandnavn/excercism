class Badge {
    public String print(Integer id, String name, String department) {
    //    throw new UnsupportedOperationException("Please implement the Badge.print() method");

        String printStr = null;
        if(id==null && department!=null){
            printStr = name + " - " + department.toUpperCase();
        }
        else if(id==null && department==null){
            printStr = name + " - " + "OWNER";
        }
        else if(department==null && id!=null){
            printStr = "[" +id+ "] - " + name + " - " + "OWNER";
        }
        else{
        printStr = "[" +id+ "] - " + name + " - " + department.toUpperCase();
        }
        return printStr;
    }
}

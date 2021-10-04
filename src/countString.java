public  class countString {
    public static void printString(String [] strings){
        for (int i = 0; i< strings.length; i++){
            int sch = 1;
            boolean b = true;
            for (int j = 0; j< i; j++){
                if(strings[i].equals(strings[j]) || i==0){
                    b=false;
                    break;
                }
            }

            if(b) {
                for (int z = i+1; z< strings.length; z++){
                    if(strings[i].equals(strings[z])){
                        sch++;
                    }
                }
                System.out.println(strings[i] + " " + sch);
            }
        }
    }
}

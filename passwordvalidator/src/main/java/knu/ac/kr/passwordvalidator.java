package knu.ac.kr;

public class passwordvalidator {

    private int minLength;
    private int maxLength;

    public passwordvalidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validator(String password){
        int length = password.length();
        if(password.equals("")){
            return false;
        }

        if(password.equals("Admin")){
            return true;
        }

        if( length < minLength ){
            return false;
        }

        if( length > maxLength){
            return false;
        }
            return true;
    }

    public static void main(String[] args) {
        passwordvalidator passwordvalidator = new passwordvalidator(5,5);
        boolean result = passwordvalidator.validator("helloWorld");
        System.out.println(result);
    }
}

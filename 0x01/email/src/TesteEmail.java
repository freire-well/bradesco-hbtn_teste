class TesteEmail{

    public static boolean emailValid(String email){
        if(!email.contains("@"){
            return false;
        }
        if(email.length > 49){
            return false;
        }
        return true;
    }
}

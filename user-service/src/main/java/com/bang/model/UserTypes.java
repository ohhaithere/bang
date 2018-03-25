package com.bang.model;

public class UserTypes {

    public enum Sex {
        MALE, FEMALE;

        public String toString(){
            switch(this){
                case MALE :
                    return "Male";
                case FEMALE :
                    return "Female";
            }
            return null;
        }
    }

    public enum Role {
        Giver, Taker
    }

}

package com.bang.model;

public class UserTypes {

    public enum Sex {
        MALE, FEMALE;

        @Override
        public String toString(){
            if(this == MALE) {
                return "Male";
            }
            if(this == FEMALE){
                return "Female";
            }
            return "";
        }
    }

    public enum Role {
        GIVER, TAKER
    }

}

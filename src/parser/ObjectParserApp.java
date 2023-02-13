package parser;

import com.google.gson.Gson;

public class ObjectParserApp {
    public static void main(String[] args) {
        String json = "{\"id\":6,\"gubun\":\"입금\",\"sender\":\"ATM\",\"receiver\":\"1111\",\"amount\":100}";
        Gson gson = new Gson();
        Transaction transaction = gson.fromJson(json, Transaction.class);
        System.out.println("id : " + transaction.getId());
        System.out.println("gubun : " + transaction.getGubun());
        System.out.println("sender : " + transaction.getSender());
        System.out.println("receiver : " + transaction.getReceiver());
        System.out.println("amount : " + transaction.getAmount());
    }
}

package Model;

public final class AccountBuilder {
    private Long id;
    private String name;
    private String description;

    private AccountBuilder(){}

    public static AccountBuilder anAccount(){
        return new AccountBuilder();
    }

    public  AccountBuilder withId(Long id){
        this.id=id;
        return this;
    }

    public  AccountBuilder withName(String name){
        this.name=name;
        return this;
    }

    public  AccountBuilder withDescription(String description){
        this.description=description;
        return this;
    }

    public Account build(){

        Account account= new Account();
        account.setId(id);
        account.setDescription(description);
        account.setName(name);
        return account;
    }

}

## An average Developer's code

#### Description
This sample code will show some examples of bad coding practices.

1. No good naming conventions for class and fields. 
    e.g. - `Person` . It should be PersonEntity.
    
2. Classes are not kept in separate **Package**.
 
3. Not used advance features provided by framework.
    i.e - used getters and setters. lombok's `@Data` can be used.
4. Unnecessary variable declaration. e.g:

    `List<Person> list = persondao.getAllPersonList();
    return list;`
    
    It can be replaced in one line :
    
    `return persondao.getAllPersonList();`
    
5. Putting comments on variable declaration. No need to put comments while declaring any variable.
    
    e.g. `//DAO to get and set Person detail`
    
    `private PersonDAO  persondao = new PersonDAO();`

6. Initializing variable while defining.

    e.g. `private PersonDAO  persondao = new PersonDAO();` 
    
    Tight coupling with the implementation of repository provider, which we can resolve by DependencyInjection.
    
    Even not a good field name `persondao`, it must be `personDAO`
    
 7. Committed unnecessary file on git.
 
    e.g. `dev.impl` file.   

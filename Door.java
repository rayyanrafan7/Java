/*Rayyan Rafan, B00787787, CSCI 1101
This program will implement Door class and then TestDoor the  class.*/

//Source: This is entirely my own work. Obtained some help from the Teaching Assistant (TA), Class notes, Slides and the Book as well. The sources are provided where applicable in the output.  

public class Door {

    private String inscription;
    private boolean locked;
    private boolean closed;

    //constructors
    
    public Door () {
    }

    public Door (String inscription, boolean closed, boolean locked) {
        this.inscription = inscription;
        this.locked = locked;
        this.closed = closed;
    }

    public void getInscription(){
        System.out.println( "Door: "+inscription);
    }

    //boolean checks
    
    public boolean isClosed (){
        return closed;
    }

    public boolean isLocked (){
        return locked;
    }

    // door action methods
    
    public void open(){
        if(!locked)
            closed = false;
        else
            System.out.print("Can't open, door is locked.");
    }

    public void close(){
        closed = true;
    }

    //door locking methods
    
    public void lock(){
        if (!locked&&closed)
            locked = true;
        else if (!closed)
            System.out.print("Can't lock while door is open.");
        else
            System.out.print("Door is already locked");
    }

    public void unlock(){
        if(locked)
            locked = false;
        else
            System.out.print("Door is already unlocked");
    }

    public String toString(){
        return "Inscription: "+inscription+"\tClosed:"+closed+"\tLocked:"+locked;
    }
}



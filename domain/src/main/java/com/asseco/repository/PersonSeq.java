package com.asseco.repository;
public class PersonSeq {
    private static PersonSeq instance = new PersonSeq();

    private volatile Long next = 1L;

    private PersonSeq() {
        // prevent external instantiation of a singleton.
    }

    public static PersonSeq getInstance() {
        
        if(instance==null)
        {
        synchronized(PersonSeq.class)
          {
          if(instance==null) instance=new PersonSeq();
          }
        }
     return instance;        
        
    }

    public synchronized Long getNextSequence() {
        return next++;
    }
}


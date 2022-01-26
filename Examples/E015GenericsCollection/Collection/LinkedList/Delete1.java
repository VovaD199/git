package Examples.E015GenericsCollection.Collection.LinkedList;

import java.util.Objects;

public class Delete1 {
    public static void main(String[] args) {

    }
}

class Name{
    int n=1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return n == name.n;
    }


}

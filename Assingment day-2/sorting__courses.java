import java.util.*;

class CrsItem {
    int cid;
    String cname;
    int cfee;

    CrsItem(int cid, String cname, int cfee) {
    this.cid = cid;
        this.cname = cname;
    this.cfee = cfee;
    }

public String toString() {
return cid + " " + cname + " " + cfee;
}
}

public class sorting__courses {
public static void main(String[] args) {
List<CrsItem> batchList = new ArrayList<>();
batchList.add(new CrsItem(101, "Java", 15000));
batchList.add(new CrsItem(102, "Python", 12000));
batchList.add(new CrsItem(103, "React", 15000));
batchList.add(new CrsItem(104, "SQL", 8000));
batchList.add(new CrsItem(105, "Angular", 12000));

Collections.sort(batchList, new Comparator<CrsItem>() {
public int compare(CrsItem x1, CrsItem x2) {
return x1.cfee - x2.cfee;
}
});
System.out.println("Fee low to high:");
for (CrsItem item : batchList) System.out.println(item);

Collections.sort(batchList, new Comparator<CrsItem>() {
public int compare(CrsItem x1, CrsItem x2) {
return x2.cfee - x1.cfee;
}
});
System.out.println("\nFee high to low:");
for (CrsItem item : batchList) System.out.println(item);

Collections.sort(batchList, new Comparator<CrsItem>() {
public int compare(CrsItem x1, CrsItem x2) {
return x1.cname.compareTo(x2.cname);
}
});
System.out.println("\nName A to Z:");
for (CrsItem item : batchList) System.out.println(item);
}
}
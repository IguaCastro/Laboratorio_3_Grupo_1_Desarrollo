import java.util.ArrayList;

public class Guild {
    private ArrayList<String> memberName;
    private ArrayList<Integer> memberRank;

    public Guild() {
        this.memberName = new ArrayList<>();
        this.memberRank = new ArrayList<>();
    }

    public ArrayList<String> getMemberName() {
        return this.memberName;
    }

    public void setMemberName(ArrayList<String> memberName) {
        this.memberName = memberName;
    }

    public ArrayList<Integer> getMemberRank() {
        return this.memberRank;
    }

    public void setMemberRank(ArrayList<Integer> memberRank) {
        this.memberRank = memberRank;
    }

    public void addMember(String name, int rank) {
        memberName.add(name);
        memberRank.add(rank);
    }

    public void listMember() {
        if (memberName.size() == 0) {
            System.out.println("No quedan miembros");
        } else {
            for (int i = 0; i < memberName.size(); i++) {
                System.out.println("Nombre del miembro: " + memberName + " // " + "Rango del miembro: " + memberRank);
            }
        }
    }

    public void findMember(String name) {
        boolean found = false;
        for (int i = 0; i < memberName.size(); i++) {
            if (memberName.get(i).equalsIgnoreCase(name)) {
                System.out.println("Miembro encontrado: " + memberName.get(i) + "// Rango: " + memberRank.get(i));

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Miembro no encontrado");
        }
    }
}

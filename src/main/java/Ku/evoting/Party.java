package Ku.evoting;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Party {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVoteCount() {
        return voteCount;
    }

    @Override
    public String toString() {
        return "Party{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", voteCount=" + voteCount +
                ", electedMemberCount=" + electedMemberCount +
                ", partylistCount=" + partylistCount +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public void setElectedMemberCount(int electedMemberCount) {
        this.electedMemberCount = electedMemberCount;
    }

    public void setPartylistCount(int partylistCount) {
        this.partylistCount = partylistCount;
    }

    public int getElectedMemberCount() {
        return electedMemberCount;
    }

    public int getPartylistCount() {
        return partylistCount;
    }

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;
    private int voteCount;
    private int electedMemberCount;
    private int partylistCount;

}

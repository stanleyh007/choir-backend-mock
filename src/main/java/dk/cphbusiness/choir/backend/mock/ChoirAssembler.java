package dk.cphbusiness.choir.backend.mock;

import dk.cphbusiness.choir.backend.mock.model.Member;
import static dk.cphbusiness.choir.contract.ChoirManager.*;
import java.util.ArrayList;
import java.util.Collection;

public class ChoirAssembler {
  
  public static MemberSummary createMemberSummary(Member member) {
    return new MemberSummary(
        member.getId(),
        member.getFirstName(),
        member.getLastName(),
        member.getVoiceName()
        );
    }
  
  public static Collection<MemberSummary> createMemberSummaries(Collection<Member> members) {
    Collection<MemberSummary> summaries = new ArrayList<>();
    for (Member member : members) summaries.add(createMemberSummary(member));
    return summaries;
    }


  }

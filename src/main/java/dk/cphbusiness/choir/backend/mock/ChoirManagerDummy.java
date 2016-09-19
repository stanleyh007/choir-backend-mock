package dk.cphbusiness.choir.backend.mock;

import dk.cphbusiness.choir.backend.mock.model.Member;
import dk.cphbusiness.choir.contract.ChoirManager;
import java.util.Collection;
import static dk.cphbusiness.choir.contract.ChoirManager.*;
import java.util.ArrayList;

public class ChoirManagerDummy implements ChoirManager {

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

  public ChoirManagerDummy() {
    new Member("Anders", "Kalhauge", "anders@kalhauge.dk", "21724411", "tenor");
    new Member("Kurt", "Hansen", "kurt@mail.dk", "12345678", "tenor");
    }
  
  
  
  @Override
  public Collection<MemberSummary> listMembers() {
    return createMemberSummaries(Member.list());
    }

  @Override
  public MemberDetail findMember(MemberIdentifier id) {
    throw new UnsupportedOperationException("No support for dk.cphbusiness.choir.backend.mock.ChoirManagerDummy#findMember");
    }

  @Override
  public void saveMember(MemberDetail member) {
    throw new UnsupportedOperationException("No support for dk.cphbusiness.choir.backend.mock.ChoirManagerDummy#saveMember");
    }

  }

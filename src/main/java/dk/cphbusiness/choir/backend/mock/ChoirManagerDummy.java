package dk.cphbusiness.choir.backend.mock;

import dk.cphbusiness.choir.backend.mock.model.Member;
import dk.cphbusiness.choir.contract.ChoirManager;
import java.util.Collection;
import static dk.cphbusiness.choir.contract.ChoirManager.*;
import static dk.cphbusiness.choir.backend.mock.ChoirAssembler.*;

public class ChoirManagerDummy implements ChoirManager {

  public ChoirManagerDummy() {
    new Member("Anders", "Kalhauge", "anders@kalhauge.dk", "21724411", "tenor");
    new Member("Kurt", "Hansen", "kurt@mail.dk", "12345678", "tenor");
    new Member("Sonja", "Hansen", "sonja@mail.dk", "12345678", "tenor");
    }
  
  @Override
  public Collection<MemberSummary> listMembers() {
//    if (Member.list().size() % 2 == 1) { 
//      System.out.println("Tjuhej"); 
//      return null; 
//      }
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

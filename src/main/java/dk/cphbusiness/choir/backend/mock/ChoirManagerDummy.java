package dk.cphbusiness.choir.backend.mock;

import dk.cphbusiness.choir.contract.ChoirManager;
import java.util.Collection;

public class ChoirManagerDummy implements ChoirManager {

  @Override
  public Collection<MemberSummary> listMembers() {
    throw new UnsupportedOperationException("No support for dk.cphbusiness.choir.backend.mock.ChoirManagerDummy#listMembers");
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

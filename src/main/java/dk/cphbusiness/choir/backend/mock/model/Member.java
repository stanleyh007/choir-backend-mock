package dk.cphbusiness.choir.backend.mock.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Member {
  private static Map<Long,Member> items = new HashMap<>();
  private static long nextId = 0;

  public static Collection<Member> list() {
    return items.values();
    }
  
  public static Member find(long id) {
    return items.get(id);
    }
  
  private final long id;
  private String firstName;
  private String lastName;
  private String phone;
  private String email;
  private String voiceName;
  
  public Member(
      String firstName,
      String lastName,
      String phone,
      String email,
      String voiceName
      ) {
    id = ++nextId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.email = email;
    this.voiceName = voiceName;
    items.put(id, this);
    }

  public long getId() {
    return id;
    }

  public String getFirstName() {
    return firstName;
    }

  public String getLastName() {
    return lastName;
    }

  public String getPhone() {
    return phone;
    }

  public String getEmail() {
    return email;
    }

  public String getVoiceName() {
    return voiceName;
    }

  }

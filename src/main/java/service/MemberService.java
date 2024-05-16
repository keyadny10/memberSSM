package service;

import java.util.List;

import vo.Member;

public interface MemberService {
    //create
	void addMember(Member m);
	//read
	String showAll();
}

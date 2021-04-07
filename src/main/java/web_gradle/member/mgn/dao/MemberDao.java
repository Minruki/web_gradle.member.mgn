package web_gradle.member.mgn.dao;

import java.util.List;

import web_gradle.member.mgn.dto.Member;

public interface MemberDao {
	Member selectMemberById(Member member);
	int insertMember(Member member);
	List<Member> selectMemberByAll();
	void deleteMember(Member member);
	Member selectMember(Member member);
	void updateMember(Member member);
}

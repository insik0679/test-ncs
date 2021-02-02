package com.greedy.ncs.member.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.greedy.ncs.member.model.dto.MemberDTO;

public class Application {

	public static void main(String[] args) {

		List<MemberDTO> memberList = new ArrayList<>();

		memberList.add(new MemberDTO("ab12", "123", "홍길동", "20210202", 178, 66.5, true, 382944));
		memberList.add(new MemberDTO("cd34", "4546", "유관순", "20210123", 157, 51.6, false, 199384));
		memberList.add(new MemberDTO("ef56", "789", "이순신", "20210104", 169, 78.3, true, 829404));

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("원하시는 메뉴의 번호를 입력하세요 \n 1.전체 회원정보 조회  2.입력 회원 정보 조회 \n --> ");

			int num = sc.nextInt();

			switch (num) {

			case 1:

				System.out.println(memberList);
				break;

			case 2:

				System.out.print("회원 이름을 입력하세요 : ");

				String name = sc.next();

				for (int i = 0; i < memberList.size(); i++) {

					if (memberList.get(i).getName().equals(name)) {

						System.out.println("회원님의 정보는 다음과 같습니다." + "\n" + memberList.get(i));

						break;

					} else {

						System.out.println("입력하신 정보는 존재하지않습니다.");
						break;

					}

				}

			}

		}
	}

}

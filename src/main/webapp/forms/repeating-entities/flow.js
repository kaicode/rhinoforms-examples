{
	docBase: "/team",
	formLists: {
		main: [
			{ id: "overview", url: "overview.html",
				actions: [
					"addTeamMember:memberForms.editMember(index=next)",
					"editTeamMember:memberForms.editMember(index=?)",
					"removeTeamMember:delete(xpath=members/member[index], index=?)",
					"finish"
				] }
		],
		memberForms: [
			{ id: "editMember", docBase: "members/member[index]", url: "member.html", actions: [ "cancel", "next" ] }
		]
	}
}
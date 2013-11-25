{
	docBase: "/myData",
	formLists: {
		main: [
				{ id: "load-commits", url: "load-commits.html",
					actions: [
						{
							name: "load",
							submission: {
								url: "https://api.github.com/repos/kaicode/rhinoforms/commits?per_page=5",
								method: "get",
								resultInsertPoint: "/myData/rhinoforms/commits"
							},
							type: "next"
						}
					]
				},
				{ id: "list-commits", url: "list-commits.html" }
			]
	}
}
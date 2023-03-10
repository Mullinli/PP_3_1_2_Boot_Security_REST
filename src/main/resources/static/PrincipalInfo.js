fillInPrincipal();

function fillInPrincipal() {
    fetch("http://localhost:8080/user/userAuth")
        .then(res => res.json())
        .then(data => {
            $('#headerUserName').append(data.username);
            let roles = data.roles.map(role => " " + role.role.toString());
            $('#headerRole').append(roles);
            let user = `$(
                <tr>
                    <td>${data.id}</td>
                    <td>${data.username}</td>
                    <td>${data.password}</td>
                    <td>${roles}</td>
                </tr>)`;
            $('#userTable').append(user);
        })
}
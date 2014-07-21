import sample.domain.*

class BootStrap {

    def init = { servletContext ->
      def role = new Role(name: "Admin")
      role.addToPermissions("*:*")
      role.save(failOnError: true)

      def user = new User(username: "iamedu", password: "iamedu")
      user.addToPermissions("otro:permiso")
      user.addToRoles(role)
      user.save(failOnError: true)
    }
    def destroy = {
    }
}

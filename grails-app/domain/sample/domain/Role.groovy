package sample.domain

class Role {
  static hasMany = [permissions: String]
  String name

  static constraints = {
    name unique: true
  }
}

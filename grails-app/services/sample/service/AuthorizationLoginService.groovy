package sample.service

import grails.transaction.Transactional
import iamedu.raml.http.RamlResponse

import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.UsernamePasswordToken

@Transactional
class AuthorizationLoginService {

    def post(Map params) {
      def subject = SecurityUtils.subject

      subject.login(new UsernamePasswordToken(params.username, params.password))

      RamlResponse.create().body([
        token: subject.session.id
      ])
    }
}

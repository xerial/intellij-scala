object SCL5180 {
  object ErrorHighlightingBug extends App
  {
    val subscribersByType = Map("One" -> new OneWorker,
      "Two" -> new TwoWorker)
    /*start*/subscribersByType/*end*/.values foreach (println(_))
  }

  abstract class Worker[A <: Auth, S <: AuthService[A]]
  class OneWorker extends Worker[OneAuth, OneAuthService]
  class TwoWorker extends Worker[TwoAuth, TwoAuthService]


  class AuthService[T <: Auth]
  class OneAuthService extends AuthService[OneAuth]
  class TwoAuthService extends AuthService[TwoAuth]


  class OneAuth extends Auth
  class TwoAuth extends Auth
  class Auth
}
//Map[String, SCL5180.Worker[_ >: SCL5180.OneAuth with SCL5180.TwoAuth <: SCL5180.Auth, _ >: SCL5180.OneAuthService with SCL5180.TwoAuthService <: SCL5180.AuthService[_ >: SCL5180.OneAuth with SCL5180.TwoAuth]]]
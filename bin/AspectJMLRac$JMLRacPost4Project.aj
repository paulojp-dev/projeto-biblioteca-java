import org.aspectjml.ajmlrac.runtime.*;
public privileged aspect AspectJMLRac$JMLRacPost4Project {

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final model.Cliente object$rac): (execution( * model.Cliente..*+.*(..))
          || execution(model.Cliente..*+.new(..))
          || execution( * model.Cliente+.*(..))
          || execution(model.Cliente+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * model.Cliente..*+.*(..))
          || execution(model.Cliente..*+.new(..))
          || execution( * model.Cliente+.*(..))
          || execution(model.Cliente+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final model.Emprestimo object$rac): (execution( * model.Emprestimo..*+.*(..))
          || execution(model.Emprestimo..*+.new(..))
          || execution( * model.Emprestimo+.*(..))
          || execution(model.Emprestimo+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * model.Emprestimo..*+.*(..))
          || execution(model.Emprestimo..*+.new(..))
          || execution( * model.Emprestimo+.*(..))
          || execution(model.Emprestimo+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final model.JMLTestes object$rac): (execution( * model.JMLTestes..*+.*(..))
          || execution(model.JMLTestes..*+.new(..))
          || execution( * model.JMLTestes+.*(..))
          || execution(model.JMLTestes+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * model.JMLTestes..*+.*(..))
          || execution(model.JMLTestes..*+.new(..))
          || execution( * model.JMLTestes+.*(..))
          || execution(model.JMLTestes+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final model.Livro object$rac): (execution( * model.Livro..*+.*(..))
          || execution(model.Livro..*+.new(..))
          || execution( * model.Livro+.*(..))
          || execution(model.Livro+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * model.Livro..*+.*(..))
          || execution(model.Livro..*+.new(..))
          || execution( * model.Livro+.*(..))
          || execution(model.Livro+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final model.Multa object$rac): (execution( * model.Multa..*+.*(..))
          || execution(model.Multa..*+.new(..))
          || execution( * model.Multa+.*(..))
          || execution(model.Multa+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * model.Multa..*+.*(..))
          || execution(model.Multa..*+.new(..))
          || execution( * model.Multa+.*(..))
          || execution(model.Multa+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final utils.BdCliente object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* utils.BdCliente..*+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdCliente..*+.new(..) throws java.sql.SQLException) ||
execution(* utils.BdCliente+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdCliente+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final utils.BdCliente object$rac): (execution( * utils.BdCliente..*+.*(..))
          || execution(utils.BdCliente..*+.new(..))
          || execution( * utils.BdCliente+.*(..))
          || execution(utils.BdCliente+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * utils.BdCliente..*+.*(..))
          || execution(utils.BdCliente..*+.new(..))
          || execution( * utils.BdCliente+.*(..))
          || execution(utils.BdCliente+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final utils.BdEmprestimo object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* utils.BdEmprestimo..*+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdEmprestimo..*+.new(..) throws java.sql.SQLException) ||
execution(* utils.BdEmprestimo+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdEmprestimo+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final utils.BdEmprestimo object$rac): (execution( * utils.BdEmprestimo..*+.*(..))
          || execution(utils.BdEmprestimo..*+.new(..))
          || execution( * utils.BdEmprestimo+.*(..))
          || execution(utils.BdEmprestimo+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * utils.BdEmprestimo..*+.*(..))
          || execution(utils.BdEmprestimo..*+.new(..))
          || execution( * utils.BdEmprestimo+.*(..))
          || execution(utils.BdEmprestimo+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final utils.BdLivro object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* utils.BdLivro..*+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdLivro..*+.new(..) throws java.sql.SQLException) ||
execution(* utils.BdLivro+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdLivro+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final utils.BdLivro object$rac): (execution( * utils.BdLivro..*+.*(..))
          || execution(utils.BdLivro..*+.new(..))
          || execution( * utils.BdLivro+.*(..))
          || execution(utils.BdLivro+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * utils.BdLivro..*+.*(..))
          || execution(utils.BdLivro..*+.new(..))
          || execution( * utils.BdLivro+.*(..))
          || execution(utils.BdLivro+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final utils.BdMulta object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* utils.BdMulta..*+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdMulta..*+.new(..) throws java.sql.SQLException) ||
execution(* utils.BdMulta+.*(..) throws java.sql.SQLException) ||
    execution(utils.BdMulta+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final utils.BdMulta object$rac): (execution( * utils.BdMulta..*+.*(..))
          || execution(utils.BdMulta..*+.new(..))
          || execution( * utils.BdMulta+.*(..))
          || execution(utils.BdMulta+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * utils.BdMulta..*+.*(..))
          || execution(utils.BdMulta..*+.new(..))
          || execution( * utils.BdMulta+.*(..))
          || execution(utils.BdMulta+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final utils.CriaConexao object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* utils.CriaConexao..*+.*(..) throws java.sql.SQLException) ||
    execution(utils.CriaConexao..*+.new(..) throws java.sql.SQLException) ||
execution(* utils.CriaConexao+.*(..) throws java.sql.SQLException) ||
    execution(utils.CriaConexao+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final utils.CriaConexao object$rac): (execution( * utils.CriaConexao..*+.*(..))
          || execution(utils.CriaConexao..*+.new(..))
          || execution( * utils.CriaConexao+.*(..))
          || execution(utils.CriaConexao+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * utils.CriaConexao..*+.*(..))
          || execution(utils.CriaConexao..*+.new(..))
          || execution( * utils.CriaConexao+.*(..))
          || execution(utils.CriaConexao+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final view.Biblioteca object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* view.Biblioteca..*+.*(..) throws java.sql.SQLException) ||
    execution(view.Biblioteca..*+.new(..) throws java.sql.SQLException) ||
execution(* view.Biblioteca+.*(..) throws java.sql.SQLException) ||
    execution(view.Biblioteca+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }
  after(final view.Biblioteca object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.text.ParseException : (execution(* view.Biblioteca..*+.*(..) throws java.text.ParseException) ||
    execution(view.Biblioteca..*+.new(..) throws java.text.ParseException) ||
execution(* view.Biblioteca+.*(..) throws java.text.ParseException) ||
    execution(view.Biblioteca+.new(..) throws java.text.ParseException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.text.ParseException) {
      throw (java.text.ParseException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final view.Biblioteca object$rac): (execution( * view.Biblioteca..*+.*(..))
          || execution(view.Biblioteca..*+.new(..))
          || execution( * view.Biblioteca+.*(..))
          || execution(view.Biblioteca+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * view.Biblioteca..*+.*(..))
          || execution(view.Biblioteca..*+.new(..))
          || execution( * view.Biblioteca+.*(..))
          || execution(view.Biblioteca+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final view.JFCliente object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* view.JFCliente..*+.*(..) throws java.sql.SQLException) ||
    execution(view.JFCliente..*+.new(..) throws java.sql.SQLException) ||
execution(* view.JFCliente+.*(..) throws java.sql.SQLException) ||
    execution(view.JFCliente+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final view.JFCliente object$rac): (execution( * view.JFCliente..*+.*(..))
          || execution(view.JFCliente..*+.new(..))
          || execution( * view.JFCliente+.*(..))
          || execution(view.JFCliente+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * view.JFCliente..*+.*(..))
          || execution(view.JFCliente..*+.new(..))
          || execution( * view.JFCliente+.*(..))
          || execution(view.JFCliente+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final view.JFEmprestimo object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* view.JFEmprestimo..*+.*(..) throws java.sql.SQLException) ||
    execution(view.JFEmprestimo..*+.new(..) throws java.sql.SQLException) ||
execution(* view.JFEmprestimo+.*(..) throws java.sql.SQLException) ||
    execution(view.JFEmprestimo+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }
  after(final view.JFEmprestimo object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.text.ParseException : (execution(* view.JFEmprestimo..*+.*(..) throws java.text.ParseException) ||
    execution(view.JFEmprestimo..*+.new(..) throws java.text.ParseException) ||
execution(* view.JFEmprestimo+.*(..) throws java.text.ParseException) ||
    execution(view.JFEmprestimo+.new(..) throws java.text.ParseException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.text.ParseException) {
      throw (java.text.ParseException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final view.JFEmprestimo object$rac): (execution( * view.JFEmprestimo..*+.*(..))
          || execution(view.JFEmprestimo..*+.new(..))
          || execution( * view.JFEmprestimo+.*(..))
          || execution(view.JFEmprestimo+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * view.JFEmprestimo..*+.*(..))
          || execution(view.JFEmprestimo..*+.new(..))
          || execution( * view.JFEmprestimo+.*(..))
          || execution(view.JFEmprestimo+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final view.JFLivro object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* view.JFLivro..*+.*(..) throws java.sql.SQLException) ||
    execution(view.JFLivro..*+.new(..) throws java.sql.SQLException) ||
execution(* view.JFLivro+.*(..) throws java.sql.SQLException) ||
    execution(view.JFLivro+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final view.JFLivro object$rac): (execution( * view.JFLivro..*+.*(..))
          || execution(view.JFLivro..*+.new(..))
          || execution( * view.JFLivro+.*(..))
          || execution(view.JFLivro+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * view.JFLivro..*+.*(..))
          || execution(view.JFLivro..*+.new(..))
          || execution( * view.JFLivro+.*(..))
          || execution(view.JFLivro+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to recover checked exceptions. *
  *  This is based on the exception introduction pattern by Laddad. */
  after(final view.JFMulta object$rac) throwing(JMLInternalRuntimeException rac$e)
    throws java.sql.SQLException : (execution(* view.JFMulta..*+.*(..) throws java.sql.SQLException) ||
    execution(view.JFMulta..*+.new(..) throws java.sql.SQLException) ||
execution(* view.JFMulta+.*(..) throws java.sql.SQLException) ||
    execution(view.JFMulta+.new(..) throws java.sql.SQLException)) && 
   target(object$rac) {
    Throwable cause = rac$e.getCause();
    if(cause instanceof java.sql.SQLException) {
      throw (java.sql.SQLException)cause;
    }
    JMLChecker.rethrowUncheckedException(cause);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final view.JFMulta object$rac): (execution( * view.JFMulta..*+.*(..))
          || execution(view.JFMulta..*+.new(..))
          || execution( * view.JFMulta+.*(..))
          || execution(view.JFMulta+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * view.JFMulta..*+.*(..))
          || execution(view.JFMulta..*+.new(..))
          || execution( * view.JFMulta+.*(..))
          || execution(view.JFMulta+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final view.JFPrincipal object$rac): (execution( * view.JFPrincipal..*+.*(..))
          || execution(view.JFPrincipal..*+.new(..))
          || execution( * view.JFPrincipal+.*(..))
          || execution(view.JFPrincipal+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * view.JFPrincipal..*+.*(..))
          || execution(view.JFPrincipal..*+.new(..))
          || execution( * view.JFPrincipal+.*(..))
          || execution(view.JFPrincipal+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

}
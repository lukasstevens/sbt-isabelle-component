package mwe

import isabelle._

/* This enables SBT entry point. */
object Tools extends App

/* This enables Isabelle entry point. */
class Tools extends Isabelle_Scala_Tools(My_Component.isabelle_tool)
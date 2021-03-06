/*
 KOTLIN PSI SPEC TEST (POSITIVE)

 SECTIONS: constant-literals, boolean-literals
 PARAGRAPH: 1
 SENTENCE: [2] These are strong keywords which cannot be used as identifiers unless escaped.
 NUMBER: 9
 DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the unescapedAnnotation.
 NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

class A {
    @field:`true`
    val a: Int = ""

    @setparam:`false`(`true`)
    val b: Int = ""

    @receiver:org.jetbrains.`false`<A<B, C>>(`true`)
    val c: Int = ""

    @org.jetbrains.`false`
    val c: Int = ""

    @`true`<A<B>, C>(`false`, `true`, `false`)
    val c: Int = ""

    @`true`
    val c: Int = ""

    @`false`.`true`.`false`<A<B>, C>(`true`, `false`, `true`)
    val c: Int = ""
}

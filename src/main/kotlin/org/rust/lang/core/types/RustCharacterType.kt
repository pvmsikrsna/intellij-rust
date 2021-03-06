package org.rust.lang.core.types

import org.rust.lang.core.types.visitors.RustTypeVisitor
import org.rust.lang.core.types.visitors.RustUnresolvedTypeVisitor

object RustCharacterType : RustPrimitiveTypeBase() {

    override fun <T> accept(visitor: RustTypeVisitor<T>): T = visitor.visitChar(this)

    override fun <T> accept(visitor: RustUnresolvedTypeVisitor<T>): T = visitor.visitChar(this)

    override fun toString(): String = "char"
}

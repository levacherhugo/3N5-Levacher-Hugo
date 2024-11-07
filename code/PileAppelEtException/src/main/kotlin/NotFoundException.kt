package org.levacher

class NotFoundException:Exception() {
    override val message: String
        get() = "L'élément recherché n'a pas été trouvé. :("
}

object SizeHandlers {

  def bytesRequired(fields: Int, fieldsPerByte: Int): Int = {
    val x = fields/fieldsPerByte
    val extra = (fields-(x-1)*fieldsPerByte -1)/fieldsPerByte
    x + extra
  }


}

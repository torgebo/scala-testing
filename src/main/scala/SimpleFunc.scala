
object SizeHandlers {

  def bytesRequired(fields: Int, fieldsPerByte: Int): Int = {
    // Rounds up correctly. Potiential overflow though
    //(fields+(fieldsPerByte-1)) / fieldsPerByte //overflowed version
    // if f = xB+y then we want xB plus one extra byte if needed
    val x = fields/fieldsPerByte
    val extra = (fields-(x-1)*fieldsPerByte -1)/fieldsPerByte
    x + extra
  }


}

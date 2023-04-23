// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexico.flex

package ve.edu.unet;

import java_cup.runtime.*;
import java.io.Reader;
//import otros.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\4\0\1\6\1\0\1\7\1\10\1\11\1\12\1\0"+
    "\1\13\1\0\1\14\12\15\1\16\1\17\1\20\1\21"+
    "\1\22\2\0\32\23\1\24\1\0\1\25\3\0\1\26"+
    "\2\23\1\27\1\30\1\31\1\23\1\32\1\33\2\23"+
    "\1\34\1\23\1\35\1\23\1\36\1\23\1\37\1\40"+
    "\1\41\1\42\1\23\1\43\1\23\1\44\1\23\1\45"+
    "\1\46\1\47\7\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\0\2\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\1\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\7\17\2\1\1\3"+
    "\1\22\1\23\1\24\1\25\1\26\3\17\1\27\4\17"+
    "\1\0\1\30\2\17\1\31\5\17\1\32\1\17\1\33"+
    "\1\34\1\17\1\35\2\17\1\36\1\17\1\37\1\40"+
    "\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\50"+
    "\0\50\0\50\0\50\0\50\0\50\0\u0118\0\u0140\0\50"+
    "\0\u0168\0\50\0\u0190\0\u01b8\0\50\0\50\0\u01e0\0\u0208"+
    "\0\u0230\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320\0\50"+
    "\0\50\0\50\0\50\0\50\0\50\0\u0348\0\u0370\0\u0398"+
    "\0\u01b8\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460\0\50\0\u0488"+
    "\0\u04b0\0\u01b8\0\u04d8\0\u0500\0\u0528\0\u0550\0\u0578\0\50"+
    "\0\u05a0\0\u01b8\0\u01b8\0\u05c8\0\u01b8\0\u05f0\0\u0618\0\u01b8"+
    "\0\u0640\0\u01b8\0\u01b8\0\u01b8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\24"+
    "\1\30\2\24\1\31\3\24\1\32\1\24\1\33\1\34"+
    "\1\35\1\24\1\36\1\37\1\2\51\0\1\3\52\0"+
    "\1\40\45\0\1\40\66\0\1\41\34\0\1\42\56\0"+
    "\1\16\53\0\1\43\47\0\1\44\47\0\1\45\51\0"+
    "\1\24\2\0\17\24\26\0\1\24\2\0\11\24\1\46"+
    "\5\24\26\0\1\24\2\0\6\24\1\47\1\50\7\24"+
    "\26\0\1\24\2\0\3\24\1\51\13\24\26\0\1\24"+
    "\2\0\2\24\1\52\14\24\26\0\1\24\2\0\4\24"+
    "\1\53\12\24\26\0\1\24\2\0\7\24\1\54\7\24"+
    "\26\0\1\24\2\0\11\24\1\55\5\24\3\0\47\56"+
    "\47\0\1\57\24\0\1\24\2\0\11\24\1\60\5\24"+
    "\26\0\1\24\2\0\12\24\1\61\4\24\26\0\1\24"+
    "\2\0\1\24\1\62\15\24\26\0\1\24\2\0\1\63"+
    "\7\24\1\64\6\24\26\0\1\24\2\0\2\24\1\65"+
    "\14\24\26\0\1\24\2\0\13\24\1\66\3\24\26\0"+
    "\1\24\2\0\5\24\1\67\11\24\3\0\47\56\1\70"+
    "\23\0\1\24\2\0\1\71\16\24\26\0\1\24\2\0"+
    "\2\24\1\72\14\24\26\0\1\24\2\0\1\24\1\73"+
    "\15\24\26\0\1\24\2\0\2\24\1\74\14\24\26\0"+
    "\1\24\2\0\7\24\1\75\7\24\26\0\1\24\2\0"+
    "\5\24\1\76\11\24\26\0\1\24\2\0\13\24\1\77"+
    "\3\24\26\0\1\24\2\0\16\24\1\100\26\0\1\24"+
    "\2\0\1\101\16\24\26\0\1\24\2\0\6\24\1\102"+
    "\10\24\26\0\1\24\2\0\2\24\1\103\14\24\26\0"+
    "\1\24\2\0\13\24\1\104\3\24\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1640];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\0\2\1\6\11\2\1\1\11"+
    "\1\1\1\11\2\1\2\11\11\1\6\11\10\1\1\0"+
    "\1\11\10\1\1\11\14\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[68];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
	public Lexico(Reader r, SymbolFactory sf){
        this(r);
		this.sf=sf;
		lineanum=0;
		debug=true;
	}
	private SymbolFactory sf;
	private int lineanum;
	private boolean debug;
    private int integerN;
    private char varChar;


/******************************************************************
BORRAR SI NO SE NECESITA
	//TODO: Cambiar la SF por esto o ver que se hace
	//Crear un nuevo objeto java_cup.runtime.Symbol con informaci�n sobre el token actual sin valor
 	  private Symbol symbol(int type){
    		return new Symbol(type,yyline,yycolumn);
	  }
	//Crear un nuevo objeto java_cup.runtime.Symbol con informaci�n sobre el token actual con valor
	  private Symbol symbol(int type,Object value){
    		return new Symbol(type,yyline,yycolumn,value);
	  }
******************************************************************/


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return sf.newSymbol("EOF",sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.err.println("Caracter Ilegal encontrado en analisis lexico: " + yytext() + "\n");
            }
            // fall through
          case 34: break;
          case 2:
            { /* saltos espacios en blanco*/
            }
            // fall through
          case 35: break;
          case 3:
            { lineanum++;
            }
            // fall through
          case 36: break;
          case 4:
            { if(debug) System.out.println("token LPAREN");
			return sf.newSymbol("LPAREN",sym.LPAREN);
            }
            // fall through
          case 37: break;
          case 5:
            { if(debug) System.out.println("token RPAREN");
			return sf.newSymbol("RPAREN",sym.RPAREN);
            }
            // fall through
          case 38: break;
          case 6:
            { if(debug) System.out.println("token TIMES");
			return sf.newSymbol("TIMES",sym.TIMES);
            }
            // fall through
          case 39: break;
          case 7:
            { if(debug) System.out.println("token PLUS");
			return sf.newSymbol("PLUS",sym.PLUS);
            }
            // fall through
          case 40: break;
          case 8:
            { if(debug) System.out.println("token MINUS");
			return sf.newSymbol("MINUS",sym.MINUS);
            }
            // fall through
          case 41: break;
          case 9:
            { if(debug) System.out.println("token OVER");
			return sf.newSymbol("OVER",sym.OVER);
            }
            // fall through
          case 42: break;
          case 10:
            { if(debug) System.out.println("token NUM");
			return sf.newSymbol("NUM",sym.NUM,new String(yytext()));
            }
            // fall through
          case 43: break;
          case 11:
            { if(debug) System.out.println("token SEMI");
			return sf.newSymbol("SEMI",sym.SEMI);
            }
            // fall through
          case 44: break;
          case 12:
            { if(debug) System.out.println("token LT");
			return sf.newSymbol("LT",sym.LT);
            }
            // fall through
          case 45: break;
          case 13:
            { if(debug) System.out.println("token EQ");
			return sf.newSymbol("EQ",sym.EQ);
            }
            // fall through
          case 46: break;
          case 14:
            { if(debug) System.out.println("token GRT");
			return sf.newSymbol("GRT",sym.GRT);
            }
            // fall through
          case 47: break;
          case 15:
            { if(debug) System.out.println("token ID");
				return sf.newSymbol("ID",sym.ID,new String(yytext()));
            }
            // fall through
          case 48: break;
          case 16:
            { if(debug) System.out.println("token LBRACKET");
			return sf.newSymbol("LBRACKET",sym.LBRACKET);
            }
            // fall through
          case 49: break;
          case 17:
            { if(debug) System.out.println("token RBRACKET");
			return sf.newSymbol("RBRACKET",sym.RBRACKET);
            }
            // fall through
          case 50: break;
          case 18:
            { if(debug) System.out.println("token DIFFERENT");
            return sf.newSymbol("DIFFERENT",sym.DIFFERENT);
            }
            // fall through
          case 51: break;
          case 19:
            { if(debug) System.out.println("token AND");
            return sf.newSymbol("AND",sym.AND);
            }
            // fall through
          case 52: break;
          case 20:
            { if(debug) System.out.println("token ASSIGN");
			return sf.newSymbol("ASSIGN",sym.ASSIGN);
            }
            // fall through
          case 53: break;
          case 21:
            { if(debug) System.out.println("token LESS_EQUAL");
            return sf.newSymbol("LESS_EQUAL",sym.LESS_EQUAL);
            }
            // fall through
          case 54: break;
          case 22:
            { if(debug) System.out.println("token GREATER_EQUAL");
            return sf.newSymbol("GREATER_EQUAL",sym.GREATER_EQUAL);
            }
            // fall through
          case 55: break;
          case 23:
            { if(debug) System.out.println("token IF");
			return sf.newSymbol("IF",sym.IF);
            }
            // fall through
          case 56: break;
          case 24:
            { if(debug) System.out.println("token OR");
          return sf.newSymbol("OR",sym.OR);
            }
            // fall through
          case 57: break;
          case 25:
            { if(debug) System.out.println("token END");
			return sf.newSymbol("END",sym.END);
            }
            // fall through
          case 58: break;
          case 26:
            { /* salto comentarios */ if(debug) System.out.println("token COMENTARIO");
            }
            // fall through
          case 59: break;
          case 27:
            { if(debug) System.out.println("token ELSE");
			return sf.newSymbol("ELSE",sym.ELSE);
            }
            // fall through
          case 60: break;
          case 28:
            { if(debug) System.out.println("token READ");
			return sf.newSymbol("READ",sym.READ);
            }
            // fall through
          case 61: break;
          case 29:
            { if(debug) System.out.println("token THEN");
			return sf.newSymbol("THEN",sym.THEN);
            }
            // fall through
          case 62: break;
          case 30:
            { if(debug) System.out.println("token ARRAY");
			return sf.newSymbol("ARRAY",sym.ARRAY);
            }
            // fall through
          case 63: break;
          case 31:
            { if(debug) System.out.println("token UNTIL");
			return sf.newSymbol("UNTIL",sym.UNTIL);
            }
            // fall through
          case 64: break;
          case 32:
            { if(debug) System.out.println("token WRITE");
			return sf.newSymbol("WRITE",sym.WRITE);
            }
            // fall through
          case 65: break;
          case 33:
            { if(debug) System.out.println("token REPEAT");
			return sf.newSymbol("REPEAT",sym.REPEAT);
            }
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

/**************************************************************************
**
** Module Name:   LOCTest.c
**
** Module Description:
**  LOCTest.c is intended to test the functionality of LOC Counting programs
**   for C, C++ and Java.
**
***************************************************************************
**
** Author:          Benjamin D. Sweet
** Revision:        1.3
** Creation Date:   23-May-2005
** Edit Date:       21-Aug-2016
**
***************************************************************************
**
** Revision History:
**
** Revision: 1.3    21-Aug-2016   B.Sweet
** * In function1() added a '/' character inside the C block comment and
**   a '*' character in the body of the if() statement.
**   Some incorrect logic may count these as a LOC.
**
** Revision: 1.2    02-Feb-2016   B.Sweet
** * Added some tab characters in the white-space lines, and also some "blank"
**   lines with containing spaces and tabs.
**
** Revision: 1.1    05-Feb-2012   B.Sweet
** * Added Header Comment block.
** * In function2(), moved the beginning of one multi-line C Block Comment
**   from an otherwise blank line to begin after text.
** * Placed "Total Program LOC: 25" AFTER the end of a C Block Comment.
**   (BAD programming style!!  But technically a valid test case.)
**
** Revision: 1.0    23-May-2005   B.Sweet
** * Original version.
**  
**************************************************************************/

// line comment
/* Block Comment */
/*
** Multi-line block comment;
*/

#include <something>
int long prototype1(argument);
int long prototype2 ( argument ) ;

int long function1 (int arg1, char arg2)
{
    // line comment in function
    /* Block Comment in Function  /  */
				
    if (condition)
    {
        *
    }
    Function1 LOC: 8
    
	/*
    **  Multi-line block comment in function;
    */

}

void function2 ( void )
{
    // line comment in function
    /* Block Comment in Function    */

    for (init ; condition ; increment )
    {
        if (condition)
        {
                statement;  // In-Line comment
        } else {
                statement;  /* In-Line comment  */
        }
    }
    Function2 LOC: 13       /*
                            **  In-Line multi-line block comment in function;
                            */

}

/* Text after the end of Block Comment SHOULD be counted as LOC - but BAD programming style!! */    Total Program LOC: 25

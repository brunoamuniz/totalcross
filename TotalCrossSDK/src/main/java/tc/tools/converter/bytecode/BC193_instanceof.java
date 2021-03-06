/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  Copyright (C) 2012-2020 TotalCross Global Mobile Platform Ltda.              *
 *  All Rights Reserved                                                          *
 *                                                                               *
 *  This library and virtual machine is distributed in the hope that it will     *
 *  be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                         *
 *                                                                               *
 *  This file is covered by the GNU LESSER GENERAL PUBLIC LICENSE VERSION 2.1    *
 *  A copy of this license is located in file license.txt at the root of this    *
 *  SDK or can be downloaded here:                                               *
 *  http://www.gnu.org/licenses/lgpl-2.1.txt                                     *
 *                                                                               *
 *********************************************************************************/

package tc.tools.converter.bytecode;

public class BC193_instanceof extends ByteCode {
  public String targetClass, srcClass;

  public BC193_instanceof() {
    stackInc = 1;
    pcInc = 3;
    targetClass = cp.getString1(readUInt16(pc + 1));
  }

  @Override
  public void exec() {
    srcClass = (String) stack[stackPtr - 1].asObj;
    if (srcClass == null) {
      stack[stackPtr - 1].asInt = 0;
      pcInc = 3;
    } else {
      // check the instance
    }
  }
}

/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  Copyright (C) 2017-2020 TotalCross Global Mobile Platform Ltda.              *
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

package totalcross.game;

import totalcross.sys.Vm;
import totalcross.ui.event.Event;

/**
 * Events posted by an animation control.
 */
@Deprecated
public class AnimationEvent extends Event<AnimationHandler> {
  /** 
   * The event type when the animation loops. 
   */
  public static final int LOOP = 1401;

  /** 
   * The event type when a new frame is displayed. 
   */
  public static final int FRAME = 1402;

  /** 
   * The event type when the animation ends. 
   */
  public static final int FINISH = 1403;

  /** 
   * Constructs a new animation event, setting the type and target to the given parameters. 
   *
   * @param type The event type.
   * @param target The object which is the target of the event.
   */
  public AnimationEvent(int type, Object target) {
    super(type, target, Vm.getTimeStamp());
  }

  @Override
  public void dispatch(AnimationHandler listener) {
    // TODO Auto-generated method stub
    
  }
}

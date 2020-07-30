package com.wangzhen.jvm.instructions.comparisons.dcmp;

import com.wangzhen.jvm.instructions.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.ZFrame;

public class DCMPG extends NoOperandsInstruction {

    @Override
    public void execute(ZFrame frame) throws NoSuchMethodException {
        DCMP._dcmp(frame,true);
    }
}

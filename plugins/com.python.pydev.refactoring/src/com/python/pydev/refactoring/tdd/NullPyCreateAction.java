/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.python.pydev.refactoring.tdd;

import java.util.List;

import org.python.pydev.refactoring.core.base.RefactoringInfo;
import org.python.pydev.shared_core.code_completion.ICompletionProposalHandle;

public class NullPyCreateAction extends AbstractPyCreateAction {

    @Override
    public void execute(RefactoringInfo refactoringInfo, int locationStrategyBeforeCurrent) {

    }

    @Override
    public ICompletionProposalHandle createProposal(RefactoringInfo refactoringInfo, String actTok,
            int locationStrategy,
            List<String> parametersAfterCall) {
        return null;
    }

}

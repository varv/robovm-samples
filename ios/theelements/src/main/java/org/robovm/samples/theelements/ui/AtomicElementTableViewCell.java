/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 * Portions of this code is based on Apple Inc's TheElements sample (v1.12)
 * which is copyright (C) 2008-2013 Apple Inc.
 */

package org.robovm.samples.theelements.ui;

import org.robovm.apple.uikit.UILabel;
import org.robovm.apple.uikit.UITableViewCell;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.samples.theelements.model.AtomicElement;

@CustomClass("AtomicElementTableViewCell")
public class AtomicElementTableViewCell extends UITableViewCell {
    private AtomicElement element;

    public void setElement(AtomicElement element) {
        this.element = element;

        AtomicElementTileView elementTileView = (AtomicElementTileView) getContentView().getViewWithTag(1);
        elementTileView.setElement(element);

        UILabel labelView = (UILabel) getContentView().getViewWithTag(2);
        labelView.setText(element.getName());

        elementTileView.setNeedsDisplay();
        labelView.setNeedsDisplay();
    }

    public AtomicElement getElement() {
        return element;
    }
}
